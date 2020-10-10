package com.example.appxando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button  re;
    Button[] b=new Button[9];
    TextView t;
    int i = 1,z=1;
    int[] a = new int[9];

    void reset() {
        for (int g=0;g<9;g++)
        {
            b[g].setClickable(true);
            b[g].setText("");
        }
        t.setText("Playing");
        for (int j = 0; j < 9; j++) {
            a[j] = j + 5;
        }
        i=1;
        z=1;
    }

    void check(char x) {
        for (int i = 0; i < 3; i++) {
            if (a[i] == a[i + 3] && a[i] == a[i + 6]) {
                t.setText(x + " wins");
                for (int g=0;g<9;g++)
                {
                    b[g].setClickable(false);
                }
                return;
            }

        }
        for (int i = 0; i < 9; i += 3) {
            if (a[i] == a[i + 1] && a[i] == a[i + 2]) {
                t.setText(x + " wins");
                for (int g=0;g<9;g++)
                {
                    b[g].setClickable(false);
                }
                return;
            }

        }
        if(a[0]==a[4]&&a[0]==a[8]||a[2]==a[4]&&a[2]==a[6])
        {
            t.setText(x + " wins");
            for (int g=0;g<9;g++)
            {
                b[g].setClickable(false);
            }
            return;
        }
        if(z==9)
        {
            t.setText("Draw");
        }
    }

    void every(Button s, int v) {
        if (i == 1) {
            a[v] = 1;
            s.setText("X");
            check('X');
        } else {
            a[v] = 2;
            s.setText("O");
            check('O');
        }
        s.setClickable(false);
        i *= -1;
        z++;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int j = 0; j < 9; j++) {
            a[j] = j + 5;
        }

        b[0] = findViewById(R.id.button);
        b[1] = findViewById(R.id.button2);
        b[2]= findViewById(R.id.button3);
        b[3] = findViewById(R.id.button4);
        b[4] = findViewById(R.id.button5);
        b[5]= findViewById(R.id.button6);
        b[6]= findViewById(R.id.button7);
        b[7] = findViewById(R.id.button8);
        b[8]= findViewById(R.id.button9);
        t = findViewById(R.id.textView2);
        re = findViewById(R.id.button10);


            b[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[0], 0);
                }


            });

            b[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[1], 1);
                }
            });
            b[2].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[2], 2);
                }
            });
            b[3].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[3], 3);
                }


            });
            b[4].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[4], 4);
                }


            });
            b[5].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[5], 5);
                }


            });
            b[6].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[6], 6);
                }


            });
            b[7].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[7], 7);
                }


            });
            b[8].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    every(b[8], 8);
                }


            });
            re.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    reset();
                }
            });

    }
}