/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.modelo.interfaces;

import com.unicauca.accesodatos.entidades.Producto;
import java.util.List;


/**
 *
 * @author sahydo
 */
public interface ProductosFacadeLocal {
    boolean hayUnidadesDisponiblesDe(Long idProducto);
    Producto buscarProducto(Long idProducto);
    Producto editarProducto(Producto producto);
    List<Producto> buscarTodosProductos();
    Producto crearProducto(Producto producto);
    void eliminarProducto(Producto producto);
}
