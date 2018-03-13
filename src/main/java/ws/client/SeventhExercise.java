package ws.client;

import org.codehaus.jackson.annotate.JsonProperty;

public class SeventhExercise {

    @JsonProperty("RestResponse")
    private RestResponse restResponse;

    public RestResponse getRestResponse() {
        return restResponse;
    }

    public void setRestResponse(RestResponse RestResponse) {
        this.restResponse = RestResponse;
    }
}
