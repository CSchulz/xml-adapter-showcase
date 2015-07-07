package de.cschulz.jackson.xmlshowcase;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/v1")
@Api
public class PackageResource {

    @PUT
    @Path("/items/{packageNumber}")
    @ApiOperation(value = "op1")
    public Response op1(@ApiParam(value = "PackageNumber", required = true)
                             @PathParam("packageNumber") PackageNumber number) {

        Package pkg = new Package();
        pkg.assignPackageNumber(number);

        return Response.ok().entity(pkg).build();
    }

    @POST
    @Consumes("application/xml")
    @Path("/items")
    @ApiOperation(value = "op2")
    public Response op2(Package pkg) {

        return Response.ok().entity(pkg).build();
    }
}
