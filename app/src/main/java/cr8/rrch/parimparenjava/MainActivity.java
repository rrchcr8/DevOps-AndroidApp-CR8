package cr8.rrch.parimparenjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    int ContadorIncorrectos = 0;
    int ContadorCorrectos = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv_Incorrectos);
        tv2 = (TextView) findViewById(R.id.tv_Correctos);
        tv3 = (TextView) findViewById(R.id.tv_Aleatorio);

    }

//este metodo genera el numero aleatorio

    public void Impar(View view) {

        int numeroAleatorio = (int) (Math.random() * 10 + 1);
        String result = String.valueOf(numeroAleatorio);
        tv3.setText(result);

        if ((numeroAleatorio % 2) > 0) {
            ContadorCorrectos = ContadorCorrectos  + 1;
            String correctos = String.valueOf(ContadorCorrectos);
            tv2.setText(correctos);
        } else{
            ContadorIncorrectos = ContadorIncorrectos  + 1;
            String incorrectos = String.valueOf(ContadorIncorrectos);
            tv1.setText(incorrectos);
        }


    }

    public void Par(View view) {

        int numeroAleatorio = (int) (Math.random() * 10 + 1);
        String result = String.valueOf(numeroAleatorio);
        tv3.setText(result);

        if ((numeroAleatorio % 2) == 0) {
            ContadorCorrectos = ContadorCorrectos  + 1;
            String correctos = String.valueOf(ContadorCorrectos);
            tv2.setText(correctos);
            //tv2.setText(ContadorCorrectos);   esta forma de hacer correr simplemente no jala
        } else{
            ContadorIncorrectos = ContadorIncorrectos  + 1;
            String incorrectos = String.valueOf(ContadorIncorrectos);
            tv1.setText(incorrectos);
        }

    }
}