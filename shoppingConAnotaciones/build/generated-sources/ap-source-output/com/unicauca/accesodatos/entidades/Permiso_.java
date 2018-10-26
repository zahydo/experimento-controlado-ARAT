package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.PermisoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Permiso.class)
public class Permiso_ { 

    public static volatile SingularAttribute<Permiso, String> descripcion;
    public static volatile ListAttribute<Permiso, PermisoUsuario> tblPermisoUsuarioList;
    public static volatile SingularAttribute<Permiso, Long> idPermiso;
    public static volatile SingularAttribute<Permiso, String> nombre;

}