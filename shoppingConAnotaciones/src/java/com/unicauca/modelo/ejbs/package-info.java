/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@Rationale(
        id = "1.1.1",
        quality_attributes = {Rationale.QualityAtribute.PERFORMANCE},
        causes = {"Los módulos de software se pretenden utilizar en un futuro a través microservicios a nivel de entidad"},
        tactics = {"Reducir la carga computacional", 
            "Gestionar la tasa de eventos", 
            "Introducir concurrencia", 
            "Incrementar los recursos disponibles"},
        patterns = {"Capas","Modelo Vista Controlador (Modelo)"},
        decisions_record = {"Se organizan los componentes de acuerdo a su responsabilidad a nivel de negocio."},
        reasons = {"Cada interfaz debe corresponder con la organización de los Ejb a nivel semántico."}
)
package com.unicauca.modelo.ejbs;

import arat.business.model.rationale.Rationale;

