package edu.uees.factory;

public class NotificadorEmail implements Notificador {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("    📧 TIPO: Email");
        System.out.println("    📬 DESTINO: " + destino);
        System.out.println("    💬 MENSAJE: " + mensaje);
        System.out.println("    ✅ ESTADO: Enviado exitosamente");
    }
}
