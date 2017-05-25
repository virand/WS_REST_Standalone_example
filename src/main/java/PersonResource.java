import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * Created by artemsolonin on 25.05.2017.
 */
@Path("/persons")
@Produces({MediaType.APPLICATION_JSON})
public class PersonResource {
    @GET
    public List<Person> getPersons(@QueryParam("name") String name){
        List<Person> persons = new PostgreSQLDAO().getPersons();
        return persons;
    }
}
