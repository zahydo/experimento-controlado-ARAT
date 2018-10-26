/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@Rationale(
        id = "1",
        quality_attributes = {QualityAtribute.MAINTENANCE},
        causes = {"El proyecto se desarrolla con un enfoque ágil, lo cual permite gran flexibilidad a los cambios.", 
            "El software se encuentra en desarrollo continuo."},
        tactics = {"Coherencia semántica", 
            "Cambios anticipados esperados", 
            "Generalizacion de módulos", 
            "Abstracción de servicios comunes"},
        patterns = {"Model View Controller", "Capas"},
        decisions_record = {"Se separan las responsabilidades a nivel funcional en 3 capas: Datos, Modelo y Presentación", 
            "La interacción del usuario y la GUI la realizan los componentes que representan el Modelo, las Vistas y los Controladores"},
        reasons = {"La separación en estas 3 capas brinda mayor coherencia a nivel semantico, permitiendo ubicar los cambios con mayor facilidad",
            "El sistema hasta el momento no tiene alguna funcionalidad que esté por fuera de la definición de estas 3 capas",
            "El alcance en el contexto del negocio es pequeño por lo cual no requiere más capas de organización"}
)
package com.unicauca;

import arat.business.model.rationale.Rationale;
import arat.business.model.rationale.Rationale.QualityAtribute;

