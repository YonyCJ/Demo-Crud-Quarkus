package com.academic.expose;

import com.academic.business.PeriodService;
import com.academic.dto.PeriodDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.util.ArrayList;
import java.util.List;

@Path("/api/period")
@Tag(name = "Period", description = "Period API")
public class PeriodResource {

    @Inject
    PeriodService periodService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Listar Periodo",
            description = "Listar Periodos activos"
    )
    @APIResponse(
            responseCode = "200",
            description = "Listar Periodos activos",
            content = @Content(mediaType = MediaType.APPLICATION_JSON)
    )
    public Response getAllPeriods(){

        return Response.ok(periodService.getAllPeriods()).build();
    }



    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
            summary = "Guardar Periodo",
            description = "Guardar Periodos activos"
    )
    @APIResponse(
            responseCode = "201",
            description = "Guardar Periodos",
            content = @Content(mediaType = MediaType.APPLICATION_JSON)
    )
    public Response savePeriod(@RequestBody PeriodDto.Request request){

        return Response.ok(periodService.savePeriod(request)).build();
    }
}
