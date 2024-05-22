package com.example.Api.APIprevisaoDoTempo.Servico;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverte {
    /**
     * Method to convert JSON string to an object of the specified class type.
     *
     * @param <T> the type of the desired object
     * @param json the JSON string to be converted
     * @param classe the class of T
     * @return the converted object of type T
     * @throws JsonProcessingException if there is an error processing the JSON
     */
    public <T> T obterDados(String json, Class<T> classe) throws JsonProcessingException;
}
