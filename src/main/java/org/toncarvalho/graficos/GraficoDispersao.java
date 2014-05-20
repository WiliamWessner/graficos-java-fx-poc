package org.toncarvalho.graficos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;

/**
 * Gráfico de dispersão ( ScatterChart )
 * <p/>
 * Os Diagramas de dispersão são representações de duas ou mais variáveis que são organizadas em um gráfico, uma em função da outra. A
 * figura abaixo mostra um gráfico de variáveis que representam uma medida experimental de um determinado produto, sendo que os dados do
 * eixo Y representam a medição feita no laboratório “A” e os dados do eixo X, as medições feitas no laboratório “B”. Este tipo de Diagrama
 * é muito mais utilizado para correlacionar dados, como as influências de um fator em uma propriedade, dados obtidos em diferentes
 * laboratórios ou de diversas maneiras (predição X medição, por exemplo). Quando uma variável tem o seu valor diminuído com o aumento da
 * outra, diz-se que elas são negativamente correlacionadas. Por exemplo, a venda de carros é negativamente correlacionada com o aumento de
 * desemprego. Quanto maior o índice de desemprego, menor a venda de carros. Este gráfico permite que façamos uma regressão linear e
 * determinemos uma reta, que mostra o relacionamento médio linear entre as duas variáveis. Com essa reta, acha-se a função que nos dá o
 * "comportamento" da relação entre as duas variáveis. Dentre vários benefícios da utilização de diagramas de dispersão como ferramenta da
 * qualidade, um de particular importância é a possibilidade de inferirmos uma relação causal entre váriáveis, ajudando na determinação da
 * causa raiz de problemas. O diagrama de dispersão é também utilizado como ferramenta de qualidade .Um método gráfico de análise que
 * permite verificar a existência ou não de relação entre duas variáveis de natureza quantitativa, ou seja, variáveis que podem ser medidas
 * ou contadas, tais como: sinergia, horas de treinamento, intenções, número de horas em ação, jornada, intensidades, velocidade, tamanho do
 * lote, pressão, temperatura, etc… Nesta − forma, o diagrama de dispersão é usado para se verificar uma possível relação de causa e
 * efeito.Isto não prova que uma variável afeta a outra, mas torna claro se a relação existe e em que intensidade Na pratica muitas vezes
 * temos a necessidade de estudar a relação de correspondência entre duas variáveis.
 */
public class GraficoDispersao {

    public ScatterChart montaGrafico() {

        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        ScatterChart scatterChart = new ScatterChart(xAxis, yAxis);
        scatterChart.setData(getChartData());
        scatterChart.setTitle("speculations");

        return scatterChart;
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
