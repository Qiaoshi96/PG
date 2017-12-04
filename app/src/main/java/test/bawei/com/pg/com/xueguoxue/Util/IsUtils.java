package test.bawei.com.pg.com.xueguoxue.Util;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/12/4.
 */
//创建吐司的工具类
public class IsUtils {
    //吐司
    public static void showShort(Context context, String s){
        Toast.makeText(context,s, Toast.LENGTH_SHORT).show();
    }

    public static void showLong(Context context, String s){
        Toast.makeText(context,s, Toast.LENGTH_LONG).show();
    }

//    创建设置透明窗口的工具类
        public static  void noStatus(AppCompatActivity appCompatActivity){
            if (Build.VERSION.SDK_INT >= 21) {
                View decorView = appCompatActivity.getWindow().getDecorView();
                int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView.setSystemUiVisibility(option);
                appCompatActivity.getWindow().setStatusBarColor(Color.TRANSPARENT);
            }
        }

    /**
     * 封装一个OK网络请求的工具类
     */


}
