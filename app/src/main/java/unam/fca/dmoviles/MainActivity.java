package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Actividad 1 Introduccion a TextView.
        //https://developer.android.com/reference/android/widget/TextView
        //TextView es un componente de Android que permite desplegar texto.

        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml
        setContentView(R.layout.activity_main);


        //Para hacer referencia a un componente del layout, utilizamos el metodo findViewById
        //y le pasamos como parametro el id correspondiente.
        //Para hacer referencia al Textview con id tv
        TextView tv = findViewById(R.id.tv);


        //Para cambiar el texto de tv
        tv.setText(R.string.NumeroDeCuenta);

        //Actividades
        //a) Modifica el texto "Hola mundo", pon tu nombre y ejecuta la aplicacion
        //b) Crea una entrada en la carpeta res/values/strings.xml con tu numero de cuenta
        //c) modifica setText para que lea esta entrada de texto (Tip, puedes hacer referencia al texto con R.string.<id entrada>)
        //d) Ejecuta la aplicacion
        //e) Sube tu codigo al repositorio.
        //f) Sube un documento en word a la plataforma Moodle con las capturas de pantalla de tu actividad. Incluye la liga a tu repositorio

    }
}
