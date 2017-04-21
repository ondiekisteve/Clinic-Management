package com.webservices;

import com.Interfaces.ServicePersonI;
import com.beans.beanImplementations.ServicePerson;
import com.beans.pojo.MessageResponse;
import com.beans.pojo.Patient;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by steve 2013 on 4/10/2017.
 */
@Path("/myClinic")
public class resource {
    MessageResponse response=new MessageResponse();
    @EJB
    ServicePersonI person;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/myMethod")
    public Response getDetails()
    {
    return Response.status(200).entity(person.getPatientRecords()).build();
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/register")
    public Response register(Patient patient)
    {

        return Response.status(200).entity(person.registerPatient(patient)).build();
    }
    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)

    @Path("/deletePatient")
    public Response delete(Patient patient)
    {
        //return Response.status(200).entity(person.deletePatient(patient)).build();
        return null;
    }
}
