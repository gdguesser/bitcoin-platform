package br.platform.resource;

import br.platform.model.Usuario;
import br.platform.repository.UsuarioRepository;
import javax.annotation.security.PermitAll;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/usuarios")
public class UsuarioResource {

    @Inject
    UsuarioRepository usuarioRepository;

    @POST
    @PermitAll
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(Usuario usuario) {
        usuarioRepository.persist(Usuario.adicionar(usuario));
    }
}
