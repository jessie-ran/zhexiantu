package swufe.com.zhexiantu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LineChart line;

        List<Entry> list=new ArrayList<>();          //实例化一个 List  用来保存你的数据
        line = (LineChart) findViewById(R.id.line);

        list.add(new Entry(0,7));     //其中两个数字对应的分别是   X轴   Y轴
        list.add(new Entry(1,10));
        list.add(new Entry(2,12));
        list.add(new Entry(3,6));
        list.add(new Entry(4,3));

        //list是你这条线的数据  "语文" 是你对这条线的描述（也就是图例上的文字）
        LineDataSet lineDataSet=new LineDataSet(list,"语文");
        LineData lineData=new LineData(lineDataSet);
        line.setData(lineData);

        //简单美化

        //   X轴所在位置   默认为上面
        line.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        //隐藏右边的Y轴
        line.getAxisRight().setEnabled(false);

    }
}
