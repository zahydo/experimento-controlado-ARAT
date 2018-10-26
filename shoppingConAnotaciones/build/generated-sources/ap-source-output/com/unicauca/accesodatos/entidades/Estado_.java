package com.unicauca.accesodatos.entidades;

import com.unicauca.accesodatos.entidades.Pedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-14T22:17:51")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> descripcion;
    public static volatile SingularAttribute<Estado, Long> idEstado;
    public static volatile ListAttribute<Estado, Pedido> tblPedidoList;
    public static volatile SingularAttribute<Estado, String> nombre;

}