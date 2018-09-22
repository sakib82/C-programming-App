package com.example.kyaching.cprogrammingquiz;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.provider.MediaStore;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class Camera extends AppCompatActivity {
    private Button camerabutton;
    private ImageView pic_image;

    int REQ = 111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        camerabutton = (Button) findViewById(R.id.camerabutton);
        pic_image = (ImageView) findViewById(R.id.pic_imagetextview);

        camerabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, REQ);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        pic_image.setImageBitmap(bitmap);

    }
}
