package org.toncarvalho.graficos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.chart.PieChart;

/**
 * Exemplo de gŕafico de pizza, ou torta.
 * <p/>
 * A api de gráficos do javafx é bastante transparente, veja que somente podemos escolher o lado que as legendas serão exibidas e o próprio
 * componente do gráfico faz o resto. Observações, podemos alterar muitas outras propriedades do gŕafico, cores fontes e outras coisas
 * alterando o css padrão do componente.
 */
public class GraficoPizza {



    public PieChart montaGrafico() {

        PieChart pieChart = new PieChart();

        pieChart.setTitle("Gráfico 1");

        pieChart.setData(getPieData());

        /**
         * A propriedade "Animated" é interessante quando mudamos os dados que alimentam o gŕafico em tempo de execuçao,
         * pelo que parece o gráfico se atualiza, animado ou não.
         *
         */
        pieChart.setAnimated(Boolean.TRUE);

        /**
         * COnfigura o lado da tela em que será exibida a legenda.
         */
        pieChart.setLegendSide(Side.BOTTOM);

        /**
         *Exibe as partes  da pizza do menor valor para o maior valor , no sentido horário.
         */
        pieChart.setClockwise(false);

        /**
         * exibe ou não as lengendas também nas partes da pizza.
         */
        pieChart.setLabelsVisible(true);

        /**
         *define o ângulo inicial para exibição do primeiro pedaço da pizza.
         */
        pieChart.setStartAngle(90);



        return pieChart;
    }

    private ObservableList<PieChart.Data> getPieData() {

        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList();
        pieData.addAll(new PieChart.Data("java", 17.56),
                       new PieChart.Data("C", 17.06),
                       new PieChart.Data("C++", 8.25),
                       new PieChart.Data("C#", 8.20),
                       new PieChart.Data("ObjectiveC", 6.8),
                       new PieChart.Data("PHP", 6.0),
                       new PieChart.Data("(Visual)Basic", 4.76),
                       new PieChart.Data("Other", 31.37));
        return pieData;
    }
}
