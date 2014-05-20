package org.toncarvalho.graficos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * Created by ton on 5/19/14.
 */
public class GraficoLinhas {

    private ObservableList<String> anos = FXCollections.observableArrayList();

    public LineChart montaGrafico() {

        final CategoryAxis x = new CategoryAxis();
        x.setCategories(anos);
        x.setTickLabelsVisible(true);

        x.setGapStartAndEnd(true);
        x.setTickMarkVisible(true);

        //final NumberAxis x = new NumberAxis();

        x.setAutoRanging(false);
        /*x.setLowerBound(1996);
        x.setUpperBound(2010);*/
        x.setLabel("Anos");
        x.setTickLabelsVisible(true);

        final NumberAxis y = new NumberAxis();

        y.setAutoRanging(true);
        /*y.setLowerBound(4767.7000);
        y.setUpperBound(5584.7000);*/
        y.setTickLabelsVisible(true);
        //y.setTickUnit();
        //y.setTickMarkVisible();
        //.setTickLabelFill();
        //y.setTickLabelRotation();

        //creating the chart

        final LineChart<String, Number> lineChart = new LineChart<String, Number>(x, y);

        lineChart.setTitle("Previsão de demanda");

        lineChart.getData().addAll(configSeries(), configSeriesB(), configSeriesC());

        lineChart.setLegendSide(Side.TOP);
        lineChart.setLegendVisible(true);

        lineChart.setCreateSymbols(false);

        lineChart.setHorizontalGridLinesVisible(true);
        lineChart.setVerticalGridLinesVisible(false);

        lineChart.setAlternativeRowFillVisible(true);
        lineChart.setAlternativeColumnFillVisible(true);

        lineChart.setHorizontalZeroLineVisible(true);
        lineChart.setVerticalZeroLineVisible(true);

        return lineChart;
    }

    private XYChart.Series<String, Number> configSeries() {

        //defining a series
        XYChart.Series series = new XYChart.Series();

        series.setName("Real");
        //populating the series with data

        MyTimeSeriesA[] dados = MyTimeSeriesA.getTimeSeries();

        for (int i = 0; i < dados.length; i++) {
            // a primeira linha passa também o Extravalue, ainda não deu pra enterder bem como funciona
            //series.getData().add(new XYChart.Data(dados[i].ano.toString(), dados[i].demanda , 5.0));
            series.getData().add(new XYChart.Data(dados[i].ano.toString(), dados[i].demanda));
            anos.add(dados[i].ano.toString());
        }

        return series;
    }

    private XYChart.Series<String, Number> configSeriesB() {

        //defining a series
        XYChart.Series series = new XYChart.Series();

        series.setName("Projetada ");
        //populating the series with data

        MyTimeSeriesA[] dados = MyTimeSeriesA.getTimeSeries();

        for (int i = 0; i < dados.length; i++) {

            series.getData().add(new XYChart.Data(dados[i].ano.toString(), (dados[i].demanda * 1.2)));
        }

        return series;
    }

    private XYChart.Series<String, Number> configSeriesC() {

        //defining a series
        XYChart.Series series = new XYChart.Series();

        series.setName("Projetada II");
        //populating the series with data

        MyTimeSeriesA[] dados = MyTimeSeriesA.getTimeSeries();

        for (int i = 0; i < dados.length; i++) {
            if (i % 2 == 0) {
                series.getData().add(new XYChart.Data(dados[i].ano.toString(), (dados[i].demanda * 0.9)));
            } else {
                series.getData().add(new XYChart.Data(dados[i].ano.toString(), (dados[i].demanda * 0.8)));
            }

            //        anos.add(dados[i].ano.toString());
        }

        return series;
    }
}

