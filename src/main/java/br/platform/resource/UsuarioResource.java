package br.platform.resource;

import br.platform.model.Usuario;
import br.platform.repository.UsuarioRepository;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/usuarios")
public class UsuarioResource {

    @Inject
    UsuarioRepository usuarioRepository;

    @POST
    @PermitAll
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)@GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listAll() {
        return Usuario.listAll();
    }
    public void insert(Usuario usuario) {
        usuarioRepository.persist(Usuario.adicionar(usuario));
    }


}
