/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.modelo.ejbs.pedidos;

import com.unicauca.modelo.ejbs.AbstractFacade;
import com.unicauca.accesodatos.entidades.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author sahydo
 */
@Stateless
public class TblClienteFacade extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "shoppingPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblClienteFacade() {
        super(Cliente.class);
    }
    
}
