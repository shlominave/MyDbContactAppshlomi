package com.example.mydbcontactappshlomi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_IMAGE = 100;
    byte[] contactArray;

    EditText nameEditText;
    EditText phoneEditText;
    EditText emailEditText;
    EditText streetEditText;
    EditText cityEditText;
    ImageView contactImgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        streetEditText = findViewById(R.id.streetEditText);
        cityEditText = findViewById(R.id.cityEditText);
        contactImgView = findViewById(R.id.contactImgView);

    }
    public void buttonSaveWithImageListener(View view) {
        Dal dal = new Dal(MainActivity.this);
        dal.addContact_withimg(nameEditText.getText().toString(),
                emailEditText.getText().toString(),
                phoneEditText.getText().toString(),
                streetEditText.getText().toString(),
                cityEditText.getText().toString(),
                contactArray);

    }

    public void imgClickHandler(View view) {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i, REQUEST_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE && resultCode == Activity.RESULT_OK) {
            Bitmap userBitmap = (Bitmap) data.getExtras().get("data");
            contactImgView.setImageBitmap(userBitmap);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            userBitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            contactArray = baos.toByteArray();
        }
    }
}