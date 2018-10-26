package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.PedidoUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Terminal.class)
public class Terminal_ { 

    public static volatile SingularAttribute<Terminal, String> descripcion;
    public static volatile SingularAttribute<Terminal, Long> idTerminal;
    public static volatile SingularAttribute<Terminal, String> nombre;
    public static volatile ListAttribute<Terminal, PedidoUsuario> tblPedidoUsuarioList;

}