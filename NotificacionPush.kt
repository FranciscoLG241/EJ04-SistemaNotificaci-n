class NotificacionPush(val titulo: String, val mensaje: String): Notificable {

    override fun enviarNotificacion(){
        return println("Ha llegado una notificación de $titulo que dice $mensaje ")
    }
}