package pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.model.dto;

import lombok.Data;

@Data
public class PublicacionDTO {
    private String titulo;
    private String resumen;
    private String fechPublicacion;
    private AutorDTO autor;
}
