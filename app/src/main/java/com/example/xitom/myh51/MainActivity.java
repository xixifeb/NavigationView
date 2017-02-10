package com.example.xitom.myh51;


import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnMode, btnFan, btnTurbo, btnCool, btnDry, btnAuto, btnFanOnly;
    private PopupWindow popupWindowMode, popupWindowFan, popupWindowTurbo;
    private View popViewMode;
    private int[] popLocation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initPopupWindowMode();
    }

    private void initView(){
        popLocation = new int[2];



        btnMode = (Button)findViewById(R.id.btnMode);
        btnFan = (Button)findViewById(R.id.btnFan);
        btnTurbo = (Button)findViewById(R.id.btnTurbo);

        btnMode.setOnClickListener(this);
        btnFan.setOnClickListener(this);
        btnTurbo.setOnClickListener(this);



    }

    private void initPopupWindowMode(){
        popViewMode = getLayoutInflater().inflate(R.layout.popview_mode, null);
        popupWindowMode = new PopupWindow(popViewMode,
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                true);
        popupWindowMode.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        popupWindowMode.setOutsideTouchable(true);
        popupWindowMode.setFocusable(true);

        btnCool = (Button)popViewMode.findViewById(R.id.btnCool);
        btnDry = (Button)popViewMode.findViewById(R.id.btnDry);
        btnFanOnly = (Button)popViewMode.findViewById(R.id.btnFanOnly);
        btnAuto = (Button)popViewMode.findViewById(R.id.btnAuto);

        btnCool.setOnClickListener(this);
        btnDry.setOnClickListener(this);
        btnFanOnly.setOnClickListener(this);
        btnAuto.setOnClickListener(this);



    }



    @Override
    public void onClick(View v) {
        v.getLocationOnScreen(popLocation);
        popupWindowMode.getContentView().measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);
        int h = popupWindowMode.getContentView().getMeasuredHeight();
        int w = v.getMeasuredWidth();
        switch (v.getId()){
            case R.id.btnMode:
                //popupWindowMode.showAsDropDown(v);
                //popupWindowMode.showAtLocation(v, Gravity.NO_GRAVITY, -1000,100);
                popupWindowMode.showAsDropDown(v, 0, h);
                break;
            case R.id.btnFan:
                break;
            case R.id.btnTurbo:
                break;
            case R.id.btnCool:
                Toast.makeText(getApplicationContext(), "cool", Toast.LENGTH_SHORT).show();
                btnMode.setText("Cool");
                popupWindowMode.dismiss();
                break;
            case R.id.btnDry:
                Toast.makeText(getApplicationContext(), "dry", Toast.LENGTH_SHORT).show();
                btnMode.setText("Dry");
                popupWindowMode.dismiss();
                break;
            case R.id.btnFanOnly:
                Toast.makeText(getApplicationContext(), "fan only", Toast.LENGTH_SHORT).show();
                btnMode.setText("Fan Only");
                popupWindowMode.dismiss();
                break;
            case R.id.btnAuto:
                Toast.makeText(getApplicationContext(), "auto", Toast.LENGTH_SHORT).show();
                btnMode.setText("Auto");
                popupWindowMode.dismiss();
                break;
            default:
                break;
        }
    }
}
