package ws.client;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class State {

    @JsonProperty("id")
    Integer id;
    @JsonProperty("country")
    String country;
    @JsonProperty("name")
    String name;
    @JsonProperty("abbr")
    String abbr;
    @JsonProperty("area")
    String area;

    @JsonProperty("largest_city")
    String largestCity;
    @JsonProperty("capital")
    String capital;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("State{");
        sb.append("id='").append(id).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", abbr='").append(abbr).append('\'');
        sb.append(", area='").append(area).append('\'');
        sb.append(", largestCity='").append(largestCity).append('\'');
        sb.append(", capital='").append(capital).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
