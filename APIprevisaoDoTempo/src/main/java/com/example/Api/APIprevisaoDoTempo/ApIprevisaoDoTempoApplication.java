package com.example.Api.APIprevisaoDoTempo;

import com.example.Api.APIprevisaoDoTempo.Principal.Metodos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Objects;
import java.util.Scanner;

@SpringBootApplication
public class ApIprevisaoDoTempoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ApIprevisaoDoTempoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Scanner input = new Scanner(System.in);
        Metodos metodo = new Metodos();


        System.out.println("Qual opção você deseja ver, digite o número: ");
        System.out.println("1 para pocurar as informações da cidade");
        System.out.println("2 para pocurar as informações dos próximos dias");
        System.out.println("Sair");


        String opcao;

                while (!Objects.equals(opcao = input.nextLine(), "Sair")) {
                    System.out.println("Qual opção você deseja ver, digite o número: ");
                    System.out.println("1 para pocurar as informações da cidade");
                    System.out.println("2 para pocurar as informações dos próximos dias");

                    System.out.println("Sair");
                    if (opcao.equals("1")) {
                        metodo.procurarCidade();
                    }else if(opcao.equals("2")){
                        System.out.println("Tempo próximos dias");
                        metodo.TempoDiasSeguintes();
                    } else{
                        System.out.println("Invalido");
                    }

                }

        }

    }


