package Exemplo01;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Paciente p = new Paciente("Jocemar", "1998-02-28");

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Helena", "2000-12-12"));
        pacientes.add(new Paciente("Joao", "1987-11-12"));
        pacientes.add(new Paciente("Tereza", "2000-03-02"));

        Paciente p2 = new Paciente();
        p2.cadastrar(scan);
        pacientes.add(p2);
        pacientes.add(new Paciente().cadastrar(scan));

        for (var paciente : pacientes){
            paciente.mostrar();
            System.out.println();
        }



        Medico m = new Medico("Heinz Xucrute", "187MM", "Cirurgiao");
        Consulta c = new Consulta("25-07-2-25", "Sintomas de triza", p,m);
        c.getMedico().getNome();
        c.getPaciente().getNome();


    }
}