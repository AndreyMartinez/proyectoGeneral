package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/service")
public class serviceLoginJr {
    
	@GET
	@Path("")
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public VoUsuario validausuario() {
		VoUsuario v = new VoUsuario();
		v.setPassword("name");
		v.setUsuario("test");
		v.setUser(true);
		return v;
	}
}
