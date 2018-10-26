package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Categoria;
import com.unicauca.accesodatos.entidades.CrcPedidoProducto;
import com.unicauca.accesodatos.entidades.IngredienteProducto;
import com.unicauca.accesodatos.entidades.Pedido;
import com.unicauca.accesodatos.entidades.ProductoTienda;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile ListAttribute<Producto, CrcPedidoProducto> crcPedidoProductoList;
    public static volatile ListAttribute<Producto, ProductoTienda> tblProductoTiendaList;
    public static volatile ListAttribute<Producto, IngredienteProducto> tblIngredienteProductoList;
    public static volatile SingularAttribute<Producto, Long> disponibles;
    public static volatile ListAttribute<Producto, Pedido> tblPedidoList;
    public static volatile SingularAttribute<Producto, Long> valor;
    public static volatile SingularAttribute<Producto, Long> idProducto;
    public static volatile SingularAttribute<Producto, Categoria> idCategoria;
    public static volatile SingularAttribute<Producto, String> nombre;

}