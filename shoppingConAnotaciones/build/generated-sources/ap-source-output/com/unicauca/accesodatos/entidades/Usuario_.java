package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.PedidoUsuario;
import com.unicauca.accesodatos.entidades.PermisoUsuario;
import com.unicauca.accesodatos.entidades.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, PermisoUsuario> tblPermisoUsuarioList;
    public static volatile SingularAttribute<Usuario, Rol> idRol;
    public static volatile SingularAttribute<Usuario, Long> idUsuario;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile ListAttribute<Usuario, PedidoUsuario> tblPedidoUsuarioList;

}