/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@Rationale(
        id = "1.1.2",
        quality_attributes = {Rationale.QualityAtribute.MAINTENANCE},
        causes = {"Los módulos de software se pretenden utilizar en un futuro a través microservicios a nivel de entidad"},
        tactics = {"Cambios anticipados esperados", 
            "Generalizacion de módulos", 
            "Abstracción de servicios comunes"},
        patterns = {"Capas","Modelo Vista Controlador (Controlador)"},
        decisions_record = {"Se organizan los componentes de acuerdo a la organización de los paquetes de ejbs", 
            "Se organizan los elementos de vista .xhtml con la misma jerarquía de directorios que los controladores de presentacion"},
        reasons = {"Cada Interface de los módulos debe corresponder con la organización de las interfaces gráficas de usuario."}
)
package com.unicauca.presentacion;

import arat.business.model.rationale.Rationale;

