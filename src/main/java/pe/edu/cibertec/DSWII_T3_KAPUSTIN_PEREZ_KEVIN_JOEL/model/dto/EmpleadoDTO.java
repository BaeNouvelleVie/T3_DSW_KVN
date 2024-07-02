package pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.model.dto;

import lombok.Data;

@Data
public class EmpleadoDTO {
    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String fechaContrat;
    private DomicilioDTO domicilio;
}
