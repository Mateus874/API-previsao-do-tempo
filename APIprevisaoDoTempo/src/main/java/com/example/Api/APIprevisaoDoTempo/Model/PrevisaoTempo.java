package com.example.Api.APIprevisaoDoTempo.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PrevisaoTempo(
        @JsonAlias("results") Results results) {
    }

