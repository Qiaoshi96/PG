package test.bawei.com.pg;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private PopupWindow popupWindow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.pop);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showPop(view);

        }
        });
    }





    private  void  showPop(View view){

        // 获取自定义布局文件activity_popupwindow_left.xml的视图
        View popupWindow_view = getLayoutInflater().inflate(R.layout.pop_item, null,false);
//        获取里面的布局的点击事件
        TextView one = popupWindow_view.findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"diai",Toast.LENGTH_SHORT).show();
                if (popupWindow != null && popupWindow.isShowing()) {
                    popupWindow.dismiss();
                    popupWindow = null;
                }
            }
        });

        // 创建PopupWindow实例,200,LayoutParams.MATCH_PARENT分别是宽度和高度
        popupWindow = new PopupWindow(popupWindow_view,ActionBar.LayoutParams.MATCH_PARENT , ActionBar.LayoutParams.WRAP_CONTENT, true);
        // 设置PopupWindow的背景
        popupWindow.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff6677")));
        // 设置动画效果
//                popupWindow.setAnimationStyle(R.style.AnimationFade);
        // 这里是位置显示方式,在屏幕的左侧
        popupWindow.showAtLocation(view,Gravity.NO_GRAVITY, 0, 210);





        // 点击其他地方消失
//        popupWindow_view.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                // TODO Auto-generated method stub
//                if (popupWindow != null && popupWindow.isShowing()) {
//                    popupWindow.dismiss();
//                    popupWindow = null;
//                }
//                return false;
//            }
//        });




    }

}
