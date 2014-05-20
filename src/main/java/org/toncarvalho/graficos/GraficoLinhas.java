package org.toncarvalho.graficos;

import javafx.geometry.Side;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * Created by ton on 5/19/14.
 */
public class GraficoLinhas {

    public LineChart montaGrafico() {

        final NumberAxis x = new NumberAxis();

        x.setAutoRanging(false);
        x.setLowerBound(1996);
        x.setUpperBound(2010);

        final NumberAxis y = new NumberAxis();

        y.setAutoRanging(true);
        /*y.setLowerBound(4767.7000);
        y.setUpperBound(5584.7000);*/

        x.setLabel("Número de anos");

        //creating the chart
        final LineChart<Number, Number> lineChart = new LineChart<Number, Number>(x, y);

        lineChart.setTitle("Previsão de demanda");

        lineChart.getData().add(configSeries());

        lineChart.setCreateSymbols(true);
        lineChart.setHorizontalGridLinesVisible(true);
        lineChart.setAlternativeRowFillVisible(true);
        lineChart.setLegendSide(Side.BOTTOM);
        lineChart.setVerticalGridLinesVisible(true);
        lineChart.setVerticalZeroLineVisible(true);
        lineChart.setLegendVisible(true);

        return lineChart;
    }

    private XYChart.Series<Number, Number> configSeries() {

        //defining a series
        XYChart.Series series = new XYChart.Series();

        series.setName("Anos");
        //populating the series with data

        MyTimeSeriesA[] dados = MyTimeSeriesA.getTimeSeries();

        for (int i = 0; i < dados.length; i++) {
            series.getData().add(new XYChart.Data(dados[i].ano, dados[i].demanda));
        }


    /*    series.getData().add(new XYChart.Data(1997, 14));
        series.getData().add(new XYChart.Data(1998, 15));
        series.getData().add(new XYChart.Data(1999, 24));
        series.getData().add(new XYChart.Data(2000, 34));
        series.getData().add(new XYChart.Data(2001, 36));
        series.getData().add(new XYChart.Data(2002, 22));
        series.getData().add(new XYChart.Data(2003, 45));
        series.getData().add(new XYChart.Data(2004, 43));
        series.getData().add(new XYChart.Data(2005, 17));
        series.getData().add(new XYChart.Data(2006, 29));
        series.getData().add(new XYChart.Data(2007, 25));
        series.getData().add(new XYChart.Data(2008, 25));
        series.getData().add(new XYChart.Data(2009, 25));
        series.getData().add(new XYChart.Data(2010, 25));*/

        return series;
    }
}
