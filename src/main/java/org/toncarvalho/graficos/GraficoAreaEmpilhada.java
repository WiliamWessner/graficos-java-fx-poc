package org.toncarvalho.graficos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;

/**
 * Gráfico de área EMPILHADA
 */
public class GraficoAreaEmpilhada {

    public StackedAreaChart montaGrafico() {

        CategoryAxis x = new CategoryAxis();

        NumberAxis y = new NumberAxis();

        StackedAreaChart areaChart = new StackedAreaChart(x, y);
        areaChart.setLegendVisible(true);
        areaChart.setCreateSymbols(true);

        areaChart.setData(getChartData());
        areaChart.setTitle("speculations");

        return areaChart;
    }

    private ObservableList<XYChart.Series<String, Double>> getChartData() {
        double javaValue = 17.56;
        double cValue = 17.06;
        double cppValue = 8.25;

        ObservableList<StackedAreaChart.Series<String, Double>> answer = FXCollections.observableArrayList();
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
