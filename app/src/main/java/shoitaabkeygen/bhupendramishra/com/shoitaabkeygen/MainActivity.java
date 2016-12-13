package shoitaabkeygen.bhupendramishra.com.shoitaabkeygen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity {
    EditText ref;
    TextView key_generated,aboutus;
    Button keygen;
    long max=4294967295L,max1=16777215L;
    long codice;
    String separator = System.getProperty("line.separator");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ref=(EditText)findViewById(R.id.ref_key);
        key_generated=(TextView)findViewById(R.id.key);

        aboutus=(TextView)findViewById(R.id.aboutus);
        keygen=(Button)findViewById(R.id.keygen);
        aboutus.setText("Designed by : "+separator+"Bhupendra Mishra"+separator+"Sr. Engineer(EMX)"+separator+"BHEL BHOPAL"+separator+separator+"Rakesh Dalal"+separator+"Sr.Engineer(EMX)"+separator+"BHEL BHOPAL");
        keygen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                codice=Long.parseLong(ref.getText().toString()) & max;
                for (int i=0;i<3;i++)
                {
                    codice = (codice * 1621) + 2377;
                }
                codice=codice & max1;
                key_generated.setText("Key is : "+String.valueOf(codice));

            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
