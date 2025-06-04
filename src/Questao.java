import java.util.Scanner;

public class Questao {
    public String pergunta;
    public String opcaoA;
    public String opcaoB;
    public String opcaoC;
    public String opcaoD;
    public String correta;

    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println();
    }

    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns! Resposta correta! - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("Resposta errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println();
            return false;
        }
    }

    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite a resposta (A/B/C/D): ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp.toUpperCase();
    }

    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") ||
                resp.equalsIgnoreCase("C") || resp.equalsIgnoreCase("D")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite A, B, C ou D.");
        System.out.println();
        return false;
    }
}
