package com.unicauca.presentacion.controlador.productos;

import com.unicauca.accesodatos.entidades.IngredienteProducto;
import com.unicauca.presentacion.util.JsfUtil;
import com.unicauca.presentacion.util.JsfUtil.PersistAction;
import com.unicauca.modelo.ejbs.productos.TblIngredienteProductoFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("tblIngredienteProductoController")
@ApplicationScoped
public class TblIngredienteProductoController implements Serializable {

    @EJB
    private com.unicauca.modelo.ejbs.productos.TblIngredienteProductoFacade ejbFacade;
    private List<IngredienteProducto> items = null;
    private IngredienteProducto selected;

    public TblIngredienteProductoController() {
    }

    public IngredienteProducto getSelected() {
        return selected;
    }

    public void setSelected(IngredienteProducto selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private TblIngredienteProductoFacade getFacade() {
        return ejbFacade;
    }

    public IngredienteProducto prepareCreate() {
        selected = new IngredienteProducto();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/BundleIngredientesProductos").getString("TblIngredienteProductoCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/BundleIngredientesProductos").getString("TblIngredienteProductoUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/BundleIngredientesProductos").getString("TblIngredienteProductoDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<IngredienteProducto> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/BundleIngredientesProductos").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/BundleIngredientesProductos").getString("PersistenceErrorOccured"));
            }
        }
    }

    public IngredienteProducto getTblIngredienteProducto(Long id) {
        return getFacade().find(id);
    }

    public List<IngredienteProducto> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<IngredienteProducto> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = IngredienteProducto.class)
    public static class TblIngredienteProductoControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            TblIngredienteProductoController controller = (TblIngredienteProductoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "tblIngredienteProductoController");
            return controller.getTblIngredienteProducto(getKey(value));
        }

        Long getKey(String value) {
            Long key;
            key = new Long(value);
            return key;
        }

        String getStringKey(Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof IngredienteProducto) {
                IngredienteProducto o = (IngredienteProducto) object;
                return getStringKey(o.getIdIngredienteProducto());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), IngredienteProducto.class.getName()});
                return null;
            }
        }

    }

}
