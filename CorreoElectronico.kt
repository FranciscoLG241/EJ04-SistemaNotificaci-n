class CorreoElectronico(val destinatario: String, val asunto: String, val enviado: String): Notificable {

    override fun enviarNotificacion(){
        return println("Ha llegado un correo de $enviado sobre $asunto al destinatario $destinatario ")
    }

}