package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConvertUrlResponse {

    @JsonProperty("shortUrl")
    private String shortUrl;

    @JsonProperty("longUrl")
    private String longUrl;

}
