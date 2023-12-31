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
public class GuruModel {

    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String direccion;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    private String pais;
    private String usuario;
    private String contrasena;


    private static GuruModel instancia;

    public static synchronized GuruModel getInstancia() {
        if (instancia != null) {
            return instancia;
        }
        instancia = setDataCliente();
        return instancia;
    }

    public static GuruModel setDataCliente() {
        return GuruModel.builder()
                .nombre("")
                .apellido("")
                .telefono("")
                .correo("")
                .direccion("")
                .ciudad("")
                .provincia("")
                .codigoPostal("")
                .pais("")
                .usuario("")
                .contrasena("")
                .build();
    }

    public void setIngresarDatos(List<String> datosFormulario) {
        instancia.setNombre(datosFormulario.get(0).trim());
        instancia.setApellido(datosFormulario.get(1).trim());
        instancia.setTelefono(datosFormulario.get(2).trim());
        instancia.setCorreo(datosFormulario.get(3).trim());
        instancia.setDireccion(datosFormulario.get(4).trim());
        instancia.setCiudad(datosFormulario.get(5).trim());
        instancia.setProvincia(datosFormulario.get(6).trim());
        instancia.setCodigoPostal(datosFormulario.get(7).trim());
        instancia.setPais(datosFormulario.get(8).trim());
        instancia.setUsuario(datosFormulario.get(9).trim());
        instancia.setContrasena(datosFormulario.get(10).trim());
    }
}