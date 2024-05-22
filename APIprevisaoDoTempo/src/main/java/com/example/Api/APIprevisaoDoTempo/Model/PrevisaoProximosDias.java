package com.example.Api.APIprevisaoDoTempo.Model;

public record PrevisaoProximosDias(
                                                                           String date,
                                                                           String  weekday,
                                                                           int  max,
                                                                           int  min,
                                                                           int  cloudiness,
                                                                           float rain,
                                                                           int rain_probability,
                                                                           String wind_speedy,
                                                                           String description,
                                                                           String  condition)
      {
}
