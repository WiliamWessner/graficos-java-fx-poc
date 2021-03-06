package org.toncarvalho.graficos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * Created by ton on 5/20/14.
 */
public class GraficoBarras {

    public BarChart montaGrafico() {

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart barChart = new BarChart(xAxis, yAxis);
        barChart.setData(getChartData());
        barChart.setTitle("speculations");

        return barChart;
    }

    private ObservableList<XYChart.Series<String, Double>> getChartData() {
        double javaValue = 17.56;
        double cValue = 17.06;
        double cppValue = 8.25;

        ObservableList<XYChart.Series<String, Double>> answer = FXCollections.observableArrayList();
        XYChart.Series<String, Double> java = new XYChart.Series<String, Double>();
        XYChart.Series<String, Double> c = new XYChart.Series<String, Double>();
        XYChart.Series<String, Double> cpp = new XYChart.Series<String, Double>();

        java.setName("java");
        c.setName("C");
        cpp.setName("C++");

        for (int i = 2011; i < 2021; i++) {
            java.getData().add(new XYChart.Data(Integer.toString(i), javaValue));
            javaValue = javaValue + 4 * Math.random() - .2;
            c.getData().add(new XYChart.Data(Integer.toString(i), cValue));
            cValue = cValue + 4 * Math.random() - 2;
            cpp.getData().add(new XYChart.Data(Integer.toString(i), cppValue));
            cppValue = cppValue + 4 * Math.random() - 2;
        }
        answer.addAll(java, c, cpp);
        return answer;
    }
}
