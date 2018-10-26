package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, String> descripcion;
    public static volatile ListAttribute<Categoria, Producto> tblProductoList;
    public static volatile SingularAttribute<Categoria, Long> idCategoria;
    public static volatile SingularAttribute<Categoria, String> nombre;

}