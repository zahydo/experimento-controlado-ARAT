package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.ProductoTienda;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Tienda.class)
public class Tienda_ { 

    public static volatile SingularAttribute<Tienda, String> descripcion;
    public static volatile ListAttribute<Tienda, ProductoTienda> tblProductoTiendaList;
    public static volatile SingularAttribute<Tienda, String> nombre;
    public static volatile SingularAttribute<Tienda, Long> idTienda;

}