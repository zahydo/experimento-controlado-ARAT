/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@Rationale(
        id = "1.1",
        quality_attributes = {Rationale.QualityAtribute.MAINTENANCE},
        causes = {"El proyecto se pretende modularizar a futuro a través de microservicios"},
        tactics = {"Cambios anticipados esperados", 
            "Generalizacion de módulos", 
            "Abstracción de servicios comunes"},
        patterns = {"Capas"},
        decisions_record = {"Se separan las responsabilidades a nivel funcional en 3 capas: Ejbs, Implementaciones e Interfaces"},
        reasons = {"La definición de los servicios a través de interfaces permiten tener mayor facilidad al cambiar de componentes",
            "El acceso a las funcionalidades definidas por las interfaces es transparente para los componentes Cliente gracias a las diferentes implementaciones",
            "Las implementaciones de las interfaces utilizan directamente los Ebjs para reaizar la interacción con las entidades"}
)
package com.unicauca.modelo;

import arat.business.model.rationale.Rationale;

