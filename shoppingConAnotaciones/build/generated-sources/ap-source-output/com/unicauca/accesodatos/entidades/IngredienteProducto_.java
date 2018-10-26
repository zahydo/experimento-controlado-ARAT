package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Ingrediente;
import com.unicauca.accesodatos.entidades.Producto;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(IngredienteProducto.class)
public class IngredienteProducto_ { 

    public static volatile SingularAttribute<IngredienteProducto, Long> idIngredienteProducto;
    public static volatile SingularAttribute<IngredienteProducto, Producto> idProducto;
    public static volatile SingularAttribute<IngredienteProducto, BigInteger> gramos;
    public static volatile SingularAttribute<IngredienteProducto, Ingrediente> idIngrediente;

}