package nl.bldn.example.dropwizard.helloworld;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

@ToString
public class AppConfiguration extends Configuration {
    @NotEmpty
    private String message;

    @JsonProperty
    public String getMessage() {
        return message;
    }

    @JsonProperty
    public void setMessage(String message) {
        this.message = message;
    }
}
