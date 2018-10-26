package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Pedido;
import com.unicauca.accesodatos.entidades.Terminal;
import com.unicauca.accesodatos.entidades.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(PedidoUsuario.class)
public class PedidoUsuario_ { 

    public static volatile SingularAttribute<PedidoUsuario, Long> idPedidoUsuario;
    public static volatile SingularAttribute<PedidoUsuario, Usuario> idUsuario;
    public static volatile SingularAttribute<PedidoUsuario, Terminal> idTerminal;
    public static volatile SingularAttribute<PedidoUsuario, Pedido> idPedido;

}