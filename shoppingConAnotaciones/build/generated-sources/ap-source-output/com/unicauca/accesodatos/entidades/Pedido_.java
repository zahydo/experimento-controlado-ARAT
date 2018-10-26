package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Cliente;
import com.unicauca.accesodatos.entidades.CrcPedidoProducto;
import com.unicauca.accesodatos.entidades.Estado;
import com.unicauca.accesodatos.entidades.PedidoUsuario;
import com.unicauca.accesodatos.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile ListAttribute<Pedido, CrcPedidoProducto> crcPedidoProductoList;
    public static volatile SingularAttribute<Pedido, Estado> idEstado;
    public static volatile SingularAttribute<Pedido, String> domicilio;
    public static volatile SingularAttribute<Pedido, Cliente> idCliente;
    public static volatile SingularAttribute<Pedido, Long> valorTotal;
    public static volatile SingularAttribute<Pedido, Long> cantidad;
    public static volatile SingularAttribute<Pedido, Producto> idProducto;
    public static volatile SingularAttribute<Pedido, Long> idPedido;
    public static volatile ListAttribute<Pedido, PedidoUsuario> tblPedidoUsuarioList;

}