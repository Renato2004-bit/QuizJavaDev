import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int acertos = 0;
        int erros = 0;
        int totalq = 15;

        // Cabeçalho
        System.out.println("-----------------------------------------");
        System.out.println("Unifan - Centro Universitário Alfredo Nasser.");
        System.out.println("Professor: Brenno Pimenta.");
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println(" Renato Pereira Martins ");
        System.out.println("**");
        System.out.println("* Quiz de 15 perguntas sobre o filme De Volta Para o Futuro! *");
        System.out.println("**");
        System.out.println("Opa, bem-vindo ao Quiz sobre o filme De Volta Para o Futuro!, espero que se divirta!");

        // Array de perguntas
        Questao[] perguntas = new Questao[15];

        // Pergunta 1
        perguntas[0] = new Questao();
        perguntas[0].pergunta = "Pergunta 1: Qual é o nome do cientista excêntrico que cria a máquina do tempo?";
        perguntas[0].opcaoA = "A) Emmett Brown";
        perguntas[0].opcaoB = "B) Marty McFly";
        perguntas[0].opcaoC = "C) Biff Tannen";
        perguntas[0].opcaoD = "D) George McFly";
        perguntas[0].correta = "A";

        // Pergunta 2
        perguntas[1] = new Questao();
        perguntas[1].pergunta = "Pergunta 2: Qual é o modelo do carro que é transformado em máquina do tempo?";
        perguntas[1].opcaoA = "A) Ford Mustang";
        perguntas[1].opcaoB = "B) Chevrolet Corvette";
        perguntas[1].opcaoC = "C) DeLorean DMC-12";
        perguntas[1].opcaoD = "D) Pontiac Firebird";
        perguntas[1].correta = "C";

        // Pergunta 3
        perguntas[2] = new Questao();
        perguntas[2].pergunta = "Pergunta 3: Para qual ano Marty viaja acidentalmente?";
        perguntas[2].opcaoA = "A) 1965";
        perguntas[2].opcaoB = "B) 1975";
        perguntas[2].opcaoC = "C) 1955";
        perguntas[2].opcaoD = "D) 1985";
        perguntas[2].correta = "C";

        // Pergunta 4
        perguntas[3] = new Questao();
        perguntas[3].pergunta = "Pergunta 4: Qual é o nome da namorada de Marty no filme?";
        perguntas[3].opcaoA = "A) Lorraine Baines";
        perguntas[3].opcaoB = "B) Jennifer Parker";
        perguntas[3].opcaoC = "C) Linda McFly";
        perguntas[3].opcaoD = "D) Clara Clayton";
        perguntas[3].correta = "B";

        // Pergunta 5
        perguntas[4] = new Questao();
        perguntas[4].pergunta = "Pergunta 5: O que o Doc Brown usa para gerar a energia necessária para a viagem no tempo?";
        perguntas[4].opcaoA = "A) Energia solar";
        perguntas[4].opcaoB = "B) Plutônio";
        perguntas[4].opcaoC = "C) Eletricidade";
        perguntas[4].opcaoD = "D) Gasolina";
        perguntas[4].correta = "B";

        // Pergunta 6
        perguntas[5] = new Questao();
        perguntas[5].pergunta = "Pergunta 6: Qual banda toca no baile de formatura em 1955?";
        perguntas[5].opcaoA = "A) The Starlighters";
        perguntas[5].opcaoB = "B) The Pinheads";
        perguntas[5].opcaoC = "C) Marvin Berry and The Starlighters";
        perguntas[5].opcaoD = "D) The McFly Band";
        perguntas[5].correta = "C";

        // Pergunta 7
        perguntas[6] = new Questao();
        perguntas[6].pergunta = "Pergunta 7: O que acontece se Marty não conseguir fazer seus pais se beijarem no baile?";
        perguntas[6].opcaoA = "A) Ele fica preso no passado";
        perguntas[6].opcaoB = "B) Ele desaparece da existência";
        perguntas[6].opcaoC = "C) O Doc Brown nunca inventa a máquina do tempo";
        perguntas[6].opcaoD = "D) Nada, ele pode voltar normalmente";
        perguntas[6].correta = "B";

        // Pergunta 8
        perguntas[7] = new Questao();
        perguntas[7].pergunta = "Pergunta 8: Qual é o nome do vilão que persegue Marty no passado e no futuro?";
        perguntas[7].opcaoA = "A) Griff Tannen";
        perguntas[7].opcaoB = "B) Biff Tannen";
        perguntas[7].opcaoC = "C) Douglas Needles";
        perguntas[7].opcaoD = "D) Goldie Wilson";
        perguntas[7].correta = "B";

        // Pergunta 9
        perguntas[8] = new Questao();
        perguntas[8].pergunta = "Pergunta 9: Qual é o nome do cachorro do Doc Brown?";
        perguntas[8].opcaoA = "A) Rex";
        perguntas[8].opcaoB = "B) Einstein";
        perguntas[8].opcaoC = "C) Copérnico";
        perguntas[8].opcaoD = "D) Marley";
        perguntas[8].correta = "B";

        // Pergunta 10
        perguntas[9] = new Questao();
        perguntas[9].pergunta = "Pergunta 10: Qual música Marty toca no baile que surpreende a todos?";
        perguntas[9].opcaoA = "A) Johnny B. Goode";
        perguntas[9].opcaoB = "B) Back to the Future";
        perguntas[9].opcaoC = "C) The Power of Love";
        perguntas[9].opcaoD = "D) Earth Angel";
        perguntas[9].correta = "A";

        // Pergunta 11
        perguntas[10] = new Questao();
        perguntas[10].pergunta = "Pergunta 11: O que Marty usa para substituir o plutônio na máquina do tempo no final?";
        perguntas[10].opcaoA = "A) Gasolina";
        perguntas[10].opcaoB = "B) Um raio";
        perguntas[10].opcaoC = "C) Energia nuclear";
        perguntas[10].opcaoD = "D) Eletricidade estática";
        perguntas[10].correta = "B";

        // Pergunta 12
        perguntas[11] = new Questao();
        perguntas[11].pergunta = "Pergunta 12: Qual é o slogan da loja de Doc Brown no shopping?";
        perguntas[11].opcaoA = "A) 'Tudo para o seu futuro!'";
        perguntas[11].opcaoB = "B) 'Tecnologia do Amanhã, Hoje!'";
        perguntas[11].opcaoC = "C) 'Doc's Fantásticas Invenções'";
        perguntas[11].opcaoD = "D) 'Fiável desde 1985'";
        perguntas[11].correta = "B";

        // Pergunta 13
        perguntas[12] = new Questao();
        perguntas[12].pergunta = "Pergunta 13: O que Marty diz para o Doc Brown quando ele pergunta se ele é um covarde?";
        perguntas[12].opcaoA = "A) 'Eu não sou covarde, só sou cuidadoso!'";
        perguntas[12].opcaoB = "B) 'Você que é louco!'";
        perguntas[12].opcaoC = "C) 'Ninguém me chama de covarde!'";
        perguntas[12].opcaoD = "D) 'Eu não tenho medo de nada!'";
        perguntas[12].correta = "A";

        // Pergunta 14
        perguntas[13] = new Questao();
        perguntas[13].pergunta = "Pergunta 14: Qual é a profissão de George McFly no futuro (1985)?";
        perguntas[13].opcaoA = "A) Mecânico";
        perguntas[13].opcaoB = "B) Escritor de ficção científica";
        perguntas[13].opcaoC = "C) Vendedor de carros";
        perguntas[13].opcaoD = "D) Professor";
        perguntas[13].correta = "B";

        // Pergunta 15
        perguntas[14] = new Questao();
        perguntas[14].pergunta = "Pergunta 15: Qual é a frase icônica que Marty repete várias vezes no filme?";
        perguntas[14].opcaoA = "A) 'Isso é pesado!'";
        perguntas[14].opcaoB = "B) 'Você é muito estranho, Doc!'";
        perguntas[14].opcaoC = "C) 'Estamos ficando sem tempo!'";
        perguntas[14].opcaoD = "D) 'Ninguém pode saber do futuro!'";
        perguntas[14].correta = "A";

        // Loop através de todas as perguntas
        for (int i = 0; i < perguntas.length; i++) {
            perguntas[i].escrevaQuestao();
            String resposta = perguntas[i].leiaResposta();
            if (perguntas[i].isCorreta(resposta)) {
                acertos++;
            } else {
                erros++;
            }
        }

        // Resultado final
        System.out.println("-----------------------------------------");
        System.out.println("Quiz concluído!");
        System.out.println("Acertos: " + acertos + "/" + totalq);
        System.out.println("Erros: " + erros);
        System.out.println("-----------------------------------------");
    }
}