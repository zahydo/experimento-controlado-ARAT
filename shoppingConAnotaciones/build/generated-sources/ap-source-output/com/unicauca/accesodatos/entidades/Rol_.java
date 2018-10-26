package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> descripcion;
    public static volatile SingularAttribute<Rol, Long> idRol;
    public static volatile SingularAttribute<Rol, String> nombre;
    public static volatile ListAttribute<Rol, Usuario> tblUsuarioList;

}