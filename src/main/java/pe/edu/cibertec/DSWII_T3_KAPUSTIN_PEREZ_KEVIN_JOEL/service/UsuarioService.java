package pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.model.bd.Usuario;
import pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.repository.UsuarioRepository;

@AllArgsConstructor
@Service
public class UsuarioService implements IUsuarioService {

    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorNomUsuario(
            String nomusuario) {
        return usuarioRepository.findByNomusuario(nomusuario);
    }
}
