
package com.example.randUserReader;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gender",
    "name",
    "location",
    "email",
    "login",
    "dob",
    "registered",
    "phone",
    "cell",
    "id",
    "picture",
    "nat"
})
@Generated("jsonschema2pojo")
public class MyUser {

    @JsonProperty("gender")
    private String gender;
    @JsonProperty("name")
    private UserName name;

    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }



    @JsonProperty("name")
    public UserName getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(UserName name) {
        this.name = name;
    }



    //@JsonAnyGetter
    //public Map<String, Object> getAdditionalProperties() {
    //    return this.additionalProperties;
    //}

    //@JsonAnySetter
    //public void setAdditionalProperty(String name, Object value) {
    //    this.additionalProperties.put(name, value);
    //}

}
