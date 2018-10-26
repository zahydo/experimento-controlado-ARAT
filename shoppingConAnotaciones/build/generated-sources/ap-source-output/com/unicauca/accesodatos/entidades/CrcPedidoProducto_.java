package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Pedido;
import com.unicauca.accesodatos.entidades.Producto;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(CrcPedidoProducto.class)
public class CrcPedidoProducto_ { 

    public static volatile SingularAttribute<CrcPedidoProducto, BigInteger> totalPedido;
    public static volatile SingularAttribute<CrcPedidoProducto, Producto> idProducto;
    public static volatile SingularAttribute<CrcPedidoProducto, Pedido> idPedido;
    public static volatile SingularAttribute<CrcPedidoProducto, BigDecimal> idPedidoProducto;

}