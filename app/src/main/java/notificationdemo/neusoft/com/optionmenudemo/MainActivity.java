package notificationdemo.neusoft.com.optionmenudemo;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.menu_main, menu); // 通过xml菜单设置
       MenuItem item =menu.add(1, 100, 1, "菜单一");//三个参数：groupId(用来分组id)    itemId (菜单项id用来区分第一个参数的)  order（菜单项排序的）      title（菜单项文字描述）
        item.setTitle("aaa");
        item.setIcon(R.mipmap.ic_launcher);  // zai Api>=11时 不会显示图标
        menu.add(1,101,1,"菜单二");
        menu.add(1,102,1,"菜单三");
        menu.add(1,103,1,"菜单四");
        menu.add(1,104,1,"菜单五");
        menu.add(1,105,1,"菜单六");
        menu.add(1,106,1,"菜单七");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case 100:
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                item.setIntent(intent);
               // Toast.makeText(MainActivity.this,"点击了菜单一",Toast.LENGTH_SHORT).show();
                break;
            case 101:
                Toast.makeText(MainActivity.this, "点击了菜单二", Toast.LENGTH_SHORT).show();
                break;
            case 102:
                Toast.makeText(MainActivity.this,"点击了菜单3",Toast.LENGTH_SHORT).show();
                break;
            case 103:
                Toast.makeText(MainActivity.this,"点击了菜单4",Toast.LENGTH_SHORT).show();
                break;
            case 104:
                Toast.makeText(MainActivity.this,"点击了菜单5",Toast.LENGTH_SHORT).show();
                break;
            case 105:
                Toast.makeText(MainActivity.this,"点击了菜单6",Toast.LENGTH_SHORT).show();
                break;
            case 106:
                Toast.makeText(MainActivity.this,"点击了菜单7",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
