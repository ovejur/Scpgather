package zhujj.com.scpgather;

import android.database.sqlite.SQLiteDatabase;

import zhujj.baselibrary.BaseApplication;
import zhujj.com.scpgather.db.bean.DaoMaster;
import zhujj.com.scpgather.db.bean.DaoSession;

/**
 * 作者：朱建晶 on 2018/1/22 10:31
 * 邮箱：344951059@qq.com
 */

public class MyApplication extends BaseApplication {

    private static DaoSession daoSession;


    @Override
    public void onCreate() {
        super.onCreate();
        setupDatabase();
    }

    /**
     * 配置数据库
     */
    private void setupDatabase() {
        //创建数据库zm.db"
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "scp.db", null);
        //获取可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取Dao对象管理者
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoInstant() {
        return daoSession;
    }

}
