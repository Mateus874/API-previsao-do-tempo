package com.example.Api.APIprevisaoDoTempo.Principal;

import com.example.Api.APIprevisaoDoTempo.Model.PrevisaoTempo;
import com.example.Api.APIprevisaoDoTempo.Servico.ConsumoApi;
import com.example.Api.APIprevisaoDoTempo.Servico.ConverterApi;

import java.io.IOException;
import java.util.Scanner;

public class Metodos {
    private final ConsumoApi consumirApi = new ConsumoApi();
    private final Scanner input = new Scanner(System.in);
    private final ConverterApi converter = new ConverterApi() {

        @Override
        public String convert(Object o) {
            return "";
        }
    };
    private static final String URL = "https://api.hgbrasil.com/weather?key=SUA-CHAVE&city_name=";

    public void procurarCidade() throws IOException, InterruptedException {
        System.out.println("Digite a cidade que você quer pesquisar");
        System.out.println("Primeiro digite a Cidade, e depois a sigla do Estado em maiúsculo, assim: Campinas,SP");

        String cidade = input.nextLine();

        // Montagem do endereço
        System.out.println("A cidade e estado que você escolheu foi: " + cidade);
        String endereco = URL + cidade;

        // Consumo da API e seu resultado JSON
        String json = consumirApi.consumirDados(endereco);
        System.out.println(json);

        // Converter para classe através do record
        PrevisaoTempo convertido = converter.obterDados(json, PrevisaoTempo.class);
        System.out.println("-------------------------------------------------");
        System.out.println("Segue as informações da cidade que você escolheu");
        System.out.println("-------------------------------------------------");
        //Dentro do result
        System.out.println(convertido);
        //Mostrar os atributos do result
        System.out.println("-------------------------------------------------");
        System.out.println("Mais seguimentadas");
        System.out.println("-------------------------------------------------");
        System.out.println("A cidade escolhida foi: " + convertido.results().city());
        System.out.println("Hora da ultima atualização: " + convertido.results().time());
        System.out.println("A time zone: " + convertido.results().timezone());
        System.out.println("Temperatura:  " + convertido.results().condition_code());
        System.out.println("Descrição do tempo:  " + convertido.results().description());
        System.out.println("Humidade:  " + convertido.results().humidity());
    }
        //Previsao para os proxímos dias

        public void TempoDiasSeguintes() throws IOException, InterruptedException {
            System.out.println("Digite a cidade que você quer pesquisar");
            System.out.println("Primeiro digite a Cidade, e depois a sigla do Estado em maiúsculo, assim: Campinas,SP");

            String cidade = input.nextLine();

            // Montagem do endereço
            System.out.println("A cidade e estado que você escolheu foi: " + cidade);
            String endereco = URL + cidade;

            // Consumo da API e seu resultado JSON
            String json = consumirApi.consumirDados(endereco);
            System.out.println(json);

            // Converter para classe através do record
            PrevisaoTempo convertido = converter.obterDados(json, PrevisaoTempo.class);

            System.out.println(convertido.results().forecast());

        }




    }

