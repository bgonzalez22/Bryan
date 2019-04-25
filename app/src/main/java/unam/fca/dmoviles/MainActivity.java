package unam.fca.dmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Se requiere que sea public para hacer referencia a esta variable en otra actividad
    public static final String  EXTRA_MESSAGE = "EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Actividad 3 Introduccion a Intents
        //https://developer.android.com/training/basics/firstapp/starting-activity
        //Intent es un mecanismo que puede ser usado para iniciar otras actividades

        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml
        setContentView(R.layout.activity_main);


        //Para hacer referencia a un componente del layout, utilizamos el metodo findViewById
        //y le pasamos como parametro el id correspondiente.
        final Button btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SegundaActividad.class);
                intent.putExtra(EXTRA_MESSAGE, "Mensaje ");
                startActivity(intent);

            }
        });


        //Actividades
        //a) Ejecuta la aplicacion
        //b) Revisa la referencia y agrega el codigo en el archivo SegundaActividad para que el textview muestre el mensaje que se manda en EXTRA_MESSAGE
        //c) Que otros tipos de datos se pueden mandar?
        //d) Revisa el archivo AdroidManifest.xml, que cambios presenta el archivo respecto al de la actividad 2?
        //e) Anota tus respuestas en un documento en Word
        //f) Sube tu codigo al repositorio.
        //g) Sube el documento en word a la plataforma Moodle con las capturas de pantalla de tu actividad. Incluye la liga a tu repositorio

    }
}
