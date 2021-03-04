package br.com.rededor.resources;

import br.com.rededor.entidades.Sistema;
import org.bson.types.ObjectId;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/sistemas")
@Produces(MediaType.APPLICATION_JSON)
public class SistemaResource {

    @POST
    @Path("adicionar")
    @Consumes(MediaType.APPLICATION_JSON)
    public void adicionar(Sistema sistemaParam){
        sistemaParam.persist();
    }

    @PATCH
    @Path("alterar")
    @Consumes(MediaType.APPLICATION_JSON)
    public void alterar(Sistema sistemaParam){
        sistemaParam.update();
    }

    @GET
    @Path("listar")
    public List<Sistema> exiteTodos(){
        return Sistema.listAll();
    }

    @DELETE
    @Path("deleta")
    public void deletar(
            @QueryParam("idParam") String idParam
    ){
        ObjectId id = new ObjectId(idParam);
        Sistema.deleteById(id);
    }
}
