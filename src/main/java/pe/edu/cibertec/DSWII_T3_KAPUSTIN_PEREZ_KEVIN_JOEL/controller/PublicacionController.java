package pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.model.bd.Publicacion;
import pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.model.dto.PublicacionDTO;
import pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.service.IPublicacionService;
import pe.edu.cibertec.DSWII_T3_KAPUSTIN_PEREZ_KEVIN_JOEL.util.DtoUtil;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("/pubs-dto")
public class PublicacionController {
    private final IPublicacionService publicacionService;

    @GetMapping("")
    public ResponseEntity<List<Publicacion>> listarPublicaciones() {
        List<Publicacion> publicacionList = publicacionService.obtenerPublicaciones();
        if (publicacionList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(publicacionList, HttpStatus.OK);
    }

    @GetMapping("/dto")
    public ResponseEntity<List<PublicacionDTO>> listarPublicacionesDto() {
        List<PublicacionDTO> publicacionDtoList = publicacionService.obtenerPublicaciones()
                .stream()
                .map(publicacion -> (PublicacionDTO) new DtoUtil().convertirADto(publicacion, new PublicacionDTO()))
                .collect(Collectors.toList());
        if (publicacionDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(publicacionDtoList, HttpStatus.OK);
    }
}
