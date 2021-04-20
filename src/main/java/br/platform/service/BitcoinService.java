package br.platform.service;

import br.platform.model.Bitcoin;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

public interface BitcoinService {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Bitcoin> listAll();
}
