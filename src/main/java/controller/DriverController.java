package controller;

import entity.Driver;
import service.DriverService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/drivers")
public class DriverController {

    DriverService driverService = new DriverService();

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Driver> getListDriver() {
        return driverService.getListStudent();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Driver getDriver(@PathParam("id") int id) {
        return driverService.findID(id);
    }

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addNewDriver(Driver student) {
        return driverService.insert(student) ? "Thêm mới thành công" : "Thêm mới thất bại";
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String removeDriver(@PathParam("id") int id) {
        return driverService.removeStudent(id) ? "Xóa thành công" : "Xóa thất bại";
    }

}

