package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Permiso;
import com.unicauca.accesodatos.entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(PermisoUsuario.class)
public class PermisoUsuario_ { 

    public static volatile SingularAttribute<PermisoUsuario, Permiso> idPermiso;
    public static volatile SingularAttribute<PermisoUsuario, Long> idPermisoUsuario;
    public static volatile SingularAttribute<PermisoUsuario, Usuario> idUsuario;
    public static volatile SingularAttribute<PermisoUsuario, String> nombreUsuario;

}