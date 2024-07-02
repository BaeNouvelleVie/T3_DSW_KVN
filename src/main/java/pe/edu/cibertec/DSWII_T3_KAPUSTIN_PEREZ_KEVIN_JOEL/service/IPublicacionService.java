package pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.service;

import pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.model.bd.Publicacion;
import java.util.List;

public interface IPublicacionService {
    List<Publicacion> obtenerPublicaciones();
}
