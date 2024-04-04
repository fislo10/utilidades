package com.ecodeup.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejecutor {
    public static void main(String[] args) {

       // ICalculadora calculora=(n)-> System.out.println(n+"Bienvenido a las expresiones Lambda " );
    //    calculora.mensaje("Juan: ");
        ICalculadora calculora=(n1, n2)->{
            double resultado=n1+n2;
            System.out.println("la suma es :  = " + resultado);
        };
        calculora.operacion(5, 8);

        ICalculadora calculora1=(n1, n2)->{
            double resultado=n1-n2;
            System.out.println("la resta es :  = " + resultado);
        };
        calculora1.operacion(15, 9);

        //other ejemplo con comparteTo Listas
        List<String>  lista=new ArrayList<>();
        lista.add("Patricia");
        lista.add("Juan");
        lista.add("Paula");
        lista.add("Gloria");
        lista.add("Jhonson");

        Collections.sort(lista,(String p1, String p2)->p1.compareTo(p2));

        for (String elemento : lista){
            System.out.println(elemento);
        }


    }
}
