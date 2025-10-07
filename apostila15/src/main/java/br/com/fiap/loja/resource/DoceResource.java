package br.com.fiap.loja.resource;

import br.com.fiap.loja.dao.DoceDao;
import br.com.fiap.loja.model.Doce;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

import java.net.URI;
import java.sql.SQLException;
import java.util.List;

@Path("/doces")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DoceResource {

    @Inject
    private DoceDao doceDao;

    @GET
    public List<Doce> listar() throws SQLException {
        return doceDao.listar();
    }

    @POST
    public Response criar(Doce doce, @Context UriInfo uriInfo) throws SQLException {
        doceDao.cadastrar(doce);
        //Criar a URI para acessar o doce criado
        URI uri = uriInfo.getAbsolutePathBuilder()
                .path(String.valueOf(doce.getCodigo())).build();

        return Response.created(uri).entity(doce).build(); //201
    }

}
