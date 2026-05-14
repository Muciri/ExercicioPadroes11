import api.SMSSender;
import api.SMSSenderFactory;
import java.util.Scanner;
import model.SMS;

public class AppSMSNotification {
    public static boolean validar(String numero) {
        // Regex:
        // 2 dígitos CSP
        // 2 dígitos DDD
        // 9 + 4 dígitos
        // 4 dígitos finais
        String regex = "^(15|31|41)\\d{2}9\\d{4}\\d{4}$";
        return numero.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String telefoneOrigem = "1583999999999";

        System.out.print("Digite o telefone destino: ");
        String telefoneDestino = scanner.nextLine();

        // valida telefone
        if (!validar(telefoneDestino)) {
            System.out.println("Telefone inválido!");
            System.out.println("Formato esperado:");
            System.out.println("CSP + DDD + 9XXXX + XXXX");

            scanner.close();
            return;
        }

        System.out.print("Digite a mensagem: ");
        String textoMensagem = scanner.nextLine();

        SMS message = new SMS(
                telefoneOrigem,
                telefoneDestino,
                textoMensagem
        );

        SMSSenderFactory factory = new SMSSenderFactory();
        SMSSender sender = factory.criarServico(telefoneDestino);
        sender.sendSMS(message);
        scanner.close();
    }
}
