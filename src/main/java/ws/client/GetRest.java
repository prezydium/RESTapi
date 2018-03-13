package ws.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class GetRest {

    public State[] getStatesFromWeb() {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://services.groupkt.com/state/get/USA/all");
        Response response = target.request().accept(MediaType.APPLICATION_JSON).get();
        SeventhExercise value = response.readEntity(SeventhExercise.class);
        response.close();
        return value.getRestResponse().getResult();
    }
}
