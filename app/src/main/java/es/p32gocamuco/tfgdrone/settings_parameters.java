package es.p32gocamuco.tfgdrone;

/*La clase Settings_Parameters se utilizará como raíz para las clases de rutas de vuelo.
    Los parámetros configurables serán los siguientes:
        -Velocidad máxima de vuelo: Determinada por las características del drone, se obtendrá del manual de instrucciones
        -Velocidad definida de vuelo: Se aplicará un multiplicador a la velocidad máxima, 0.3, 0.6 y 0.9 para baja media y alta respectivamente.
        -Acción en caso de batería baja. 1 = Retorno a home, 2 = Aterrizar inmediatamente, 3 = Control manual
            Es posible que, en distintos puntos de la ruta, se busque una acción distinta. El valor por defecto será retorno a casa.
        -Acción en caso de batería crítica
        -Acción en caso de perdida de señal
            Estas dos opciones no cuentan con control manual como respuesta
 */

public class settings_parameters {
    //Esta clase se utiliza para almacenar en memoria los valores de los ajustes.
    private float altura = (float) 20.0;
    private float velocidad_maxima = (float) 10.0;
    private int LP_comportamiento;
    private int LS_comportamiento;
    private int CP_comportamiento;
}
