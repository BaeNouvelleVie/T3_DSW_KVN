package pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.service;

import pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.model.bd.Usuario;

public interface IUsuarioService {

    Usuario obtenerUsuarioPorNomUsuario(String nomusuario);
}
