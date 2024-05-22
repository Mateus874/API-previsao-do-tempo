package com.example.Api.APIprevisaoDoTempo.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Results(
        int temp,
        String date,
        String time,
        String condition_code,
        String description,
        String currently,
        String cid,
        String city,
        String img_id,
        int humidity,
        double cloudiness,
        double rain,
        String wind_speedy,
        int wind_direction,
        String wind_cardinal,
        String sunrise,
        String sunset,
        String moon_phase,
        String condition_slug,
        String city_name,
        String timezone,
        List<PrevisaoProximosDias> forecast) {}
