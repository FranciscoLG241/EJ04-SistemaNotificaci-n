class MensajeTexto(val numTelef: Int, val mensaje: String): Notificable {

    override fun enviarNotificacion(){
        return println("Ha llegado un mensaje del número $numTelef diciéndole $mensaje")
    }
}