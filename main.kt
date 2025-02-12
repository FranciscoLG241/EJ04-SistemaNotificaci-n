

fun main() {

    val notificaciones = mutableListOf<Notificable>()

    val correoElectronico1 = CorreoElectronico("Juan", "Compra", "Amazon")
    val mensajeTexto1 = MensajeTexto(54535467, "Hacer la compra")
    val notificacionPush1 = NotificacionPush("Compra", " Tienes que hacer la compra")


    notificaciones.add(correoElectronico1)
    notificaciones.add(mensajeTexto1)
    notificaciones.add(notificacionPush1)

    println("\n **NOTIFICACIONES**")
    for (notificacion in notificaciones) {
        notificacion.enviarNotificacion()
        println()
    }


}