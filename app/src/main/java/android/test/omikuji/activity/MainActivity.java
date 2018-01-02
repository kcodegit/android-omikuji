package android.test.omikuji.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.omikuji.model.box.Box;
import android.test.omikuji.R;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView msg = (TextView) findViewById(R.id.msg);
        Button btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String res = Box.pick();
                msg.setText(res);
            }
        });

    }
}

