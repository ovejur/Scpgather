package zhujj.com.scpgather.activity;

import android.content.Intent;

import zhujj.baselibrary.activity.BaseActivity;

/**
 * 作者：朱建晶 on 2018/4/16 16:04
 * 邮箱：344951059@qq.com
 */

public class StartActivity extends BaseActivity {

    @Override
    protected void findViews() {

    }

    @Override
    protected void addAction() {

    }

    @Override
    protected void initData() {

        // 初始化相关的数据  如：  和后台同步时间   加载数据库中的设置数据（桩号等）   初始化定位信息
        // 如果root的话，获取到后台的时间后将系统的时间刷新和后台同步

        handleGoMain();

    }


    private void handleGoMain() {
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {
                gotoMainActivity();
            }
        }, 1000);
    }

    private void gotoMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
