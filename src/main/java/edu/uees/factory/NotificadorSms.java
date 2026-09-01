package edu.uees.factory;

public class NotificadorSms implements Notificador {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("    📱 TIPO: SMS");
        System.out.println("    ☎️  TELÉFONO: " + destino);
        System.out.println("    💬 MENSAJE: " + mensaje);
        System.out.println("    ✅ ESTADO: SMS enviado");
    }
}
