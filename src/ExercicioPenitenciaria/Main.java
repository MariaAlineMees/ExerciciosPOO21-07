
package ExercicioPenitenciaria;

import java.util.ArrayList;

        public class Main {
            public static void main(String[] args) {


                Cela cela1 = new Cela(5, 101, "sul", true, "");

                ArrayList<Cela> celas = new ArrayList<>();
                celas.add(cela1);

                ArrayList<Carcereiro> carcereiros = new ArrayList<>();
                carcereiros.add(new Carcereiro("João Silva", "1987-01-07", "Noturno", "99999-1234"));
                carcereiros.add(new Carcereiro("Pedro Santos", "1979-03-15", "Matutino", "97777-4321"));

                ArrayList<Detento> detentos = new ArrayList<>();
                detentos.add(new Detento("1985-02-02", "Carlos Da Silva", "Assassinato", "25 anos", cela1));
                detentos.add(new Detento("1978-11-30", "João Pereira", "Roubo a mão armada", "8 anos", cela1));

                for (Detento d : detentos) {
                    cela1.addDetento(d);
                }


                System.out.println("=== Informação da Cela ===");
                System.out.println("Número: " + cela1.getNumero());
                System.out.println("Bloco: " + cela1.getBloco());
                System.out.println("Capacidade: " + cela1.getCapacidade());
                System.out.println("Ocupada: " + cela1.isOcupada());

                System.out.println("\n=== Informação dos Carcereiros ===");
                for (Carcereiro c : carcereiros) {
                    System.out.println("Nome: " + c.getNome());
                    System.out.println("Turno: " + c.getTurno());
                    System.out.println("Telefone: " + c.getTelefone());
                    System.out.println("---------------------------");
                }

                System.out.println("\n=== Informação dos Detentos ===");
                for (Detento d : detentos) {
                    System.out.println("Nome: " + d.getNome());
                    System.out.println("Crime: " + d.getCrime());
                    System.out.println("Tempo de sentença: " + d.getTempoSentenca());
                    System.out.println("Cela Atual: " + d.getCela().getNumero());
                    System.out.println("---------------------------");
                }
            }
        }
