package com.toc.piedemo.view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.toc.mylibrary.org.xclcharts.chart.PieData;
import com.toc.piedemo.R;

import java.util.LinkedList;

/**
 * Created by yuanfei on 2015/7/27.
 */
public class MainActivity extends Activity {
    PieChart02View pieChart02View;
    private LinkedList<PieData> chartData = new LinkedList<PieData>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieChart02View = (PieChart02View) findViewById(R.id.qwer);
        //设置图表数据源
        PieData pieData = new PieData("","芝麻:20%",20, Color.rgb(77, 83, 97)) ;
//		pieData.setCustLabelStyle(XEnum.SliceLabelStyle.INSIDE,Color.WHITE);
        chartData.add(pieData);

//        chartData.add(new PieData("","白糖(5%)",5,Color.rgb(75, 132, 1)));

        //将此比例块突出显示
        PieData pd = new PieData("","花生:35%",35,Color.rgb(180, 205, 230));
        pd.setItemLabelRotateAngle(45.f);
        chartData.add(pd);

        PieData pdOther = new PieData("","其它(炒米，炒花生之类)",15,Color.rgb(148, 159, 181));
//		pdOther.setCustLabelStyle(XEnum.SliceLabelStyle.INSIDE,Color.BLACK);
        chartData.add(pdOther);

        PieData pdTea = new PieData("","茶叶(30%)",30,Color.rgb(253, 180, 90),true);
//		pdTea.setCustLabelStyle(XEnum.SliceLabelStyle.OUTSIDE,Color.rgb(253, 180, 90));
        chartData.add(pdTea);
        pieChart02View.setChart(chartData);
        pieChart02View.start();
    }
}
