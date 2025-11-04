package br.com.fiap.loja.mapper;

import br.com.fiap.loja.dto.exception.ErroResponseDto;
import br.com.fiap.loja.exception.EntidadeNaoEncontradaException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.jboss.resteasy.reactive.RestResponse;

@Provider
public class ApiExceptionMapper implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception e) {
        if (e instanceof EntidadeNaoEncontradaException){
            return Response.status(RestResponse.Status.NOT_FOUND)
                    .entity(new ErroResponseDto("Entidade não encontrada", e.getMessage())).build();
        }
        return Response.serverError().entity(new ErroResponseDto("Deu ruim", e.getMessage())).build();
    }
}
