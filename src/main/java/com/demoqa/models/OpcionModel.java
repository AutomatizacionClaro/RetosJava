package com.demoqa.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OpcionModel {

    private String opcion;

    private static OpcionModel instancia;

    public static synchronized OpcionModel getInstancia() {
        if (instancia != null) {
            return instancia;
        }
        instancia = setDataCliente();
        return instancia;
    }

    public static OpcionModel setDataCliente() {
        return OpcionModel.builder()
                .opcion("")
                .build();
    }

    public void setSeleccionRadiobutton(List<String> datosOpcion) {
        instancia.setOpcion(datosOpcion.get(0).trim());

    }


}
