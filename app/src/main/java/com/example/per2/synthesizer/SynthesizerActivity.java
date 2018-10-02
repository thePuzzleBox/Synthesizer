package com.example.per2.synthesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

public class SynthesizerActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonA1;
    private Button buttonB1;
    private Button buttonF1;
    private Button buttonG1;

    private Button buttonA2;
    private Button buttonB2;
    private Button buttonC2;
    private Button buttonD2;
    private Button buttonE2;
    private Button buttonF2;
    private Button buttonG2;

    private Button buttonA3;
    private Button buttonB3;
    private Button buttonC3;
    private Button buttonD3;
    private Button buttonE3;
    private Button buttonF3;
    private Button buttonG3;

    private Button buttonA4;
    private Button buttonB4;
    private Button buttonC4;
    private Button buttonD4;
    private Button buttonE4;
    private Button buttonF4;
    private Button buttonG4;


    private Button buttonA5;
    private Button buttonB5;
    private Button buttonC5;
    private Button buttonD5;
    private Button buttonE5;
    private Button buttonF5;
    private Button buttonG5;

    private Button buttonC6;
    private Button buttonD6;
    private Button buttonE6;

    private Button buttonPlay;
    private Button buttonPlay2;

    private SoundPool soundPool;

    private int noteA1;
    private int noteB1;
    private int noteF1;
    private int noteG1;

    private int noteA2;
    private int noteB2;
    private int noteC2;
    private int noteD2;
    private int noteE2;
    private int noteF2;
    private int noteG2;

    private int noteA3;
    private int noteB3;
    private int noteC3;
    private int noteD3;
    private int noteE3;
    private int noteF3;
    private int noteG3;

    private int noteA4;
    private int noteB4;
    private int noteC4;
    private int noteD4;
    private int noteE4;
    private int noteF4;
    private int noteG4;

    private int noteA5;
    private int noteB5;
    private int noteC5;
    private int noteD5;
    private int noteE5;
    private int noteF5;
    private int noteG5;

    private int noteC6;
    private int noteD6;
    private int noteE6;

    private Map<Integer, Integer> noteMap;

    public static final float DEFAULT_VOLUME = 1.0f;
    public static final float DEFAULT_RATE = 1.0f;
    public static final int DEFAULT_PRIORITY = 1;
    public static final int WHOLE_NOTE = 250; // in ms


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        wireWidgets();
        setListeners();
        initializeSoundPool();
        initializeNoteMap();
    }


    private void initializeNoteMap() {
        noteMap = new HashMap<>();
        //  in a map you store a key: value pair
        //  the key is the button Id, the value is the noteId

        noteMap.put(R.id.a1, noteA1);
        noteMap.put(R.id.b1, noteB1);
        noteMap.put(R.id.f1, noteF1);
        noteMap.put(R.id.g1, noteG1);

        noteMap.put(R.id.a2, noteA2);
        noteMap.put(R.id.b2, noteB2);
        noteMap.put(R.id.c2, noteC2);
        noteMap.put(R.id.d2, noteD2);
        noteMap.put(R.id.e2, noteE2);
        noteMap.put(R.id.f2, noteF2);
        noteMap.put(R.id.g2, noteG2);

        noteMap.put(R.id.a3, noteA3);
        noteMap.put(R.id.b3, noteB3);
        noteMap.put(R.id.c3, noteC3);
        noteMap.put(R.id.d3, noteD3);
        noteMap.put(R.id.e3, noteE3);
        noteMap.put(R.id.f3, noteF3);
        noteMap.put(R.id.g3, noteG3);

        noteMap.put(R.id.a4, noteA4);
        noteMap.put(R.id.b4, noteB4);
        noteMap.put(R.id.c4, noteC4);
        noteMap.put(R.id.d4, noteD4);
        noteMap.put(R.id.e4, noteE4);
        noteMap.put(R.id.f4, noteF4);
        noteMap.put(R.id.g4, noteG4);

        noteMap.put(R.id.a5, noteA5);
        noteMap.put(R.id.b5, noteB5);
        noteMap.put(R.id.c5, noteC5);
        noteMap.put(R.id.d5, noteD5);
        noteMap.put(R.id.e5, noteE5);
        noteMap.put(R.id.f5, noteF5);
        noteMap.put(R.id.g5, noteG5);

        noteMap.put(R.id.c6, noteC6);
        noteMap.put(R.id.d6, noteD6);
        noteMap.put(R.id.e6, noteE6);


        //  repeat for all your notes you want a button for

    }

    private void initializeSoundPool() {
        soundPool = new SoundPool( 10, AudioManager.STREAM_MUSIC, 0);

        noteA1 = soundPool.load(this, R.raw.a1, 1);
        noteB1 = soundPool.load(this, R.raw.b1, 1);
        noteF1 = soundPool.load(this, R.raw.f1, 1);
        noteG1 = soundPool.load(this, R.raw.g1, 1);

        noteA2 = soundPool.load(this, R.raw.a2, 1);
        noteB2 = soundPool.load(this, R.raw.b2, 1);
        noteC2 = soundPool.load(this, R.raw.c2, 1);
        noteD2 = soundPool.load(this, R.raw.d2, 1);
        noteE2 = soundPool.load(this, R.raw.e2, 1);
        noteF2 = soundPool.load(this, R.raw.f2, 1);
        noteG2 = soundPool.load(this, R.raw.g2, 1);

        noteA3 = soundPool.load(this, R.raw.a3, 1);
        noteB3 = soundPool.load(this, R.raw.b3, 1);
        noteC3 = soundPool.load(this, R.raw.c3, 1);
        noteD3 = soundPool.load(this, R.raw.d3, 1);
        noteE3 = soundPool.load(this, R.raw.e3, 1);
        noteF3 = soundPool.load(this, R.raw.f3, 1);
        noteG3 = soundPool.load(this, R.raw.g3, 1);

        noteA4 = soundPool.load(this, R.raw.a4, 1);
        noteB4 = soundPool.load(this, R.raw.b4, 1);
        noteC4 = soundPool.load(this, R.raw.c4, 1);
        noteD4 = soundPool.load(this, R.raw.d4, 1);
        noteE4 = soundPool.load(this, R.raw.e4, 1);
        noteF4 = soundPool.load(this, R.raw.f4, 1);
        noteG4 = soundPool.load(this, R.raw.g4, 1);

        noteA5 = soundPool.load(this, R.raw.a5, 1);
        noteB5 = soundPool.load(this, R.raw.b5, 1);
        noteC5 = soundPool.load(this, R.raw.c5, 1);
        noteD5 = soundPool.load(this, R.raw.d5, 1);
        noteE5 = soundPool.load(this, R.raw.e5, 1);
        noteF5 = soundPool.load(this, R.raw.f5, 1);
        noteG5 = soundPool.load(this, R.raw.g5, 1);

        noteC6 = soundPool.load(this, R.raw.c6, 1);
        noteD6 = soundPool.load(this, R.raw.d6, 1);
        noteE6 = soundPool.load(this, R.raw.e6, 1);

    }

    private void setListeners() {
        KeyboardNoteListener noteListener = new KeyboardNoteListener();

        buttonA1.setOnClickListener(noteListener);
        buttonB1.setOnClickListener(noteListener);
        buttonF1.setOnClickListener(noteListener);
        buttonG1.setOnClickListener(noteListener);

        buttonA2.setOnClickListener(noteListener);
        buttonB2.setOnClickListener(noteListener);
        buttonC2.setOnClickListener(noteListener);
        buttonD2.setOnClickListener(noteListener);
        buttonE2.setOnClickListener(noteListener);
        buttonF2.setOnClickListener(noteListener);
        buttonG2.setOnClickListener(noteListener);

        buttonA3.setOnClickListener(noteListener);
        buttonB3.setOnClickListener(noteListener);
        buttonC3.setOnClickListener(noteListener);
        buttonD3.setOnClickListener(noteListener);
        buttonE3.setOnClickListener(noteListener);
        buttonF3.setOnClickListener(noteListener);
        buttonG3.setOnClickListener(noteListener);

        buttonA4.setOnClickListener(noteListener);
        buttonB4.setOnClickListener(noteListener);
        buttonC4.setOnClickListener(noteListener);
        buttonD4.setOnClickListener(noteListener);
        buttonE4.setOnClickListener(noteListener);
        buttonF4.setOnClickListener(noteListener);
        buttonG4.setOnClickListener(noteListener);

        buttonA5.setOnClickListener(noteListener);
        buttonB5.setOnClickListener(noteListener);
        buttonC5.setOnClickListener(noteListener);
        buttonD5.setOnClickListener(noteListener);
        buttonE5.setOnClickListener(noteListener);
        buttonF5.setOnClickListener(noteListener);
        buttonG5.setOnClickListener(noteListener);

        buttonC6.setOnClickListener(noteListener);
        buttonD6.setOnClickListener(noteListener);
        buttonE6.setOnClickListener(noteListener);

        //  challenge buttons still use the Activity's implementation;

        buttonPlay.setOnClickListener(this);
        buttonPlay2.setOnClickListener(this);
    }

    private void wireWidgets() {

        buttonA1 = findViewById(R.id.a1);
        buttonB1 = findViewById(R.id.b1);
        buttonF1 = findViewById(R.id.f1);
        buttonG1 = findViewById(R.id.g1);

        buttonA2 = findViewById(R.id.a2);
        buttonB2 = findViewById(R.id.b2);
        buttonC2 = findViewById(R.id.c2);
        buttonD2 = findViewById(R.id.d2);
        buttonE2 = findViewById(R.id.e2);
        buttonF2 = findViewById(R.id.f2);
        buttonG2 = findViewById(R.id.g2);

        buttonA3 = findViewById(R.id.a3);
        buttonB3 = findViewById(R.id.b3);
        buttonC3 = findViewById(R.id.c3);
        buttonD3 = findViewById(R.id.d3);
        buttonE3 = findViewById(R.id.e3);
        buttonF3 = findViewById(R.id.f3);
        buttonG3 = findViewById(R.id.g3);

        buttonA4 = findViewById(R.id.a4);
        buttonB4 = findViewById(R.id.b4);
        buttonC4 = findViewById(R.id.c4);
        buttonD4 = findViewById(R.id.d4);
        buttonE4 = findViewById(R.id.e4);
        buttonF4 = findViewById(R.id.f4);
        buttonG4 = findViewById(R.id.g4);

        buttonA5 = findViewById(R.id.a5);
        buttonB5 = findViewById(R.id.b5);
        buttonC5 = findViewById(R.id.c5);
        buttonD5 = findViewById(R.id.d5);
        buttonE5 = findViewById(R.id.e5);
        buttonF5 = findViewById(R.id.f5);
        buttonG5 = findViewById(R.id.g5);

        buttonC6 = findViewById(R.id.c6);
        buttonD6 = findViewById(R.id.d6);
        buttonE6 = findViewById(R.id.e6);

        buttonPlay = findViewById(R.id.play);
        buttonPlay2 = findViewById(R.id.play2);
    }


    @Override
    public void onClick(View view) {
        // one method to handle the clicks of all the buttons
        // but don't forget to tell the buttons who is doing
        // the listening.

        switch (view.getId()) {
            case R.id.play:
                Toast.makeText(this, "Detroit: Become Human Opening Theme", Toast.LENGTH_SHORT).show();
                playSong();
                break;
            case R.id.play2:
                Toast.makeText(this, "Westworld Main Theme", Toast.LENGTH_SHORT).show();
                playSong2();
                break;

        }
    }

    private void playSong(){
        playNote(noteE2);
        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteD2);
        playNote(noteD4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteD4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteC2);
        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);





        playNote(noteE2);
        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteD2);
        playNote(noteD4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteD4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteC2);
        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);







        playNote(noteE6);
        playNote(noteE5);
        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteD6);
        playNote(noteD5);
        playNote(noteD4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteD4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteC6);
        playNote(noteC5);
        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        playNote(noteB4);
        playNote(noteB5);
        delay(WHOLE_NOTE);

        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        playNote(noteA4);
        playNote(noteA5);

        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);






        playNote(noteE4);
        playNote(noteB4);
        playNote(noteB5);
        delay(WHOLE_NOTE);


        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteD4);
        playNote(noteA4);
        playNote(noteA5);
        delay(WHOLE_NOTE);


        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);


        playNote(noteD4);
        playNote(noteB4);
        playNote(noteB5);


        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteC4);
        playNote(noteE4);
        playNote(noteE5);
        delay(WHOLE_NOTE);

        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);

        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteB3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteG3);
    }

    private void playSong2(){
        playNote(noteA1);
        playNote(noteA2);
        delay(WHOLE_NOTE * 3);

        playNote(noteA1);
        playNote(noteA2);
        delay(WHOLE_NOTE);

        playNote(noteG1);
        playNote(noteG2);
        delay(WHOLE_NOTE);

        playNote(noteF1);
        playNote(noteF2);
        delay(WHOLE_NOTE * 3);

        playNote(noteF1);
        playNote(noteF2);
        delay(WHOLE_NOTE * 2);

        playNote(noteA1);
        playNote(noteA2);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);

        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);

        playNote(noteD4);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);

        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);

        playNote(noteF1);
        playNote(noteF2);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);





        playNote(noteA1);
        playNote(noteA2);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);

        playNote(noteE4);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);

        playNote(noteD4);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);

        playNote(noteC4);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);

        playNote(noteF1);
        playNote(noteF2);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE);
        playNote(noteA3);
        delay(WHOLE_NOTE);
        playNote(noteE3);
        delay(WHOLE_NOTE);
        playNote(noteC3);
        delay(WHOLE_NOTE * 2);

        playNote(noteA3);
        playNote(noteA4);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteC6);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteD6);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteE6);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteF3);
        playNote(noteF4);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteA3);
        playNote(noteA4);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteE6);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteD6);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteC6);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);

        playNote(noteF3);
        playNote(noteF4);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);
        playNote(noteA5);
        delay(WHOLE_NOTE);
        playNote(noteE5);
        delay(WHOLE_NOTE);
        playNote(noteC5);
        delay(WHOLE_NOTE);


    }

    private void delay(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void playNote(int note, int loop) {
        soundPool.play(note, DEFAULT_VOLUME, DEFAULT_VOLUME, DEFAULT_PRIORITY,
                loop, DEFAULT_RATE);
    }

    private void playNote(int note){
        playNote(note, 0);
    }

    private void playNote(Note note){
        playNote(note.getNoteId(), 0);
    }

    //  make an inner class to handle the button clicks
    //  for the individual notes
    private class KeyboardNoteListener implements View.OnClickListener
    {
        @Override
        public void onClick(View view){
            //  get the id of the button that was clicked
            int id = view.getId();
            //  use the map to figure out what note to play
            int note = noteMap.get(id);
            //  play the note
            playNote(note);
        }
    }
}