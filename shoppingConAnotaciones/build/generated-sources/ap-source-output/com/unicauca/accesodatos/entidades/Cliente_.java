package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Long> idCliente;
    public static volatile ListAttribute<Cliente, Pedido> tblPedidoList;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> identificacion;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> email;

}