package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    private final static String TEXT_VIEW_KEY = "TEXT_VIEW_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Actividad 4 Manejo de rotacion del dispositivo
        //https://developer.android.com/guide/components/activities/activity-lifecycle
        // Al rotar el dispositivo, Android vuelve a crear la actividad.
        // Esto tiene varias implicaciones, en este ejemplo al rotar el dispositivo, se pierde el valor asignado al TextView tv.

        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml
        setContentView(R.layout.activity_main);


        //Para hacer referencia a un componente del layout, utilizamos el metodo findViewById
        //y le pasamos como parametro el id correspondiente.
        final TextView tv = findViewById(R.id.tv);

        final Button btn = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText(LocalDateTime.now().toString());
            }
        });


        //Actividades
        //a) Ejecuta la aplicacion en el emulador y verifica que la opcion de autorotar este seleccionada
        //b) Haz click en el boton y rota la pantalla. Verifica que el valor que se la habia asignado a
        //c) Descomenta los metodos que aparecen aqui abajo, onRestoreInstanceState y onSaveInstanceState
        //d) Coloca un breakpoint en cada metodo: onCreate,  onRestoreInstanceState y onSaveInstanceState.
        //e) Ejecuta la aplicacion en modo depuracion
        //f) En que orden se ejecutan los metodos?
        //g) Cual es el objetivo de savedInstanceState? En que metodo se guardo el valor del textview?
        //h) Anota tus respuestas en un documento en Word
        //e) Sube tu codigo al repositorio.
        //f) Sube el documento Word con tus respuestas y las capturas de pantalla  a la plataforma Moodle. Incluye la liga a tu repositorio

    }


    //Descomentar para realizar la axtividad

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        final TextView tv = findViewById(R.id.tv);
        tv.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        final TextView tv = findViewById(R.id.tv);
        outState.putString(TEXT_VIEW_KEY, tv.getText().toString());
        super.onSaveInstanceState(outState);
    }


}