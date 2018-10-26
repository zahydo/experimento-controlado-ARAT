package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.IngredienteProducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Ingrediente.class)
public class Ingrediente_ { 

    public static volatile SingularAttribute<Ingrediente, String> descripcion;
    public static volatile ListAttribute<Ingrediente, IngredienteProducto> tblIngredienteProductoList;
    public static volatile SingularAttribute<Ingrediente, String> nombre;
    public static volatile SingularAttribute<Ingrediente, Long> idIngrediente;

}