package br.platform.resource;

import br.platform.model.Usuario;
import br.platform.repository.UsuarioRepository;

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
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void insert(Usuario usuario) {
        usuarioRepository.persist(usuario);
    }
}
