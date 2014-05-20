package org.toncarvalho.graficos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 */
public class MainApp extends Application {

    private Stage stage;

    private Scene lastScene;

    private final Label caption = new Label("");

    @Override
    public void start(final Stage stage) throws Exception {

        this.stage = stage;

        AnchorPane root = new AnchorPane();

        ToolBar toolBar = configToolBar();

        root.getChildren().add(toolBar);

        stage.setTitle("Estudo com gráficos");

        stage.setScene(new Scene(root));

        stage.show();
        stage.setMaximized(Boolean.TRUE);
    }

    private ToolBar configToolBar() {

        Button btn = new Button();
        btn.setText("Sair");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                System.out.println("clicou no sair");
                stage.close();
                System.exit(0);
            }
        });

        Button btnFullscreenOn = new Button("Exibir em Tela cheia");
        btnFullscreenOn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {
                System.out.println("clicou no FullScreen ON");
                stage.setFullScreen(Boolean.TRUE);
            }
        });

        Button btnFullscreenOff = new Button("Exibição normal");
        btnFullscreenOff.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {

                System.out.println("clicou no FullScreen OFF");
                stage.setFullScreen(Boolean.FALSE);
            }
        });

        Button btnPizza = new Button("Pizza");
        btnPizza.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {
                buildGrafico1();
            }
        });

        Button btnLinhas = new Button("Linhas");
        btnLinhas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {
                buildGraficoLinhas();
            }
        });

        Button btnDispersao = new Button(("Dispersão"));
        btnDispersao.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {
                buildGraficoDispersao();
            }
        });

        Button btnBarras = new Button(("Barras"));
        btnBarras.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {
                buildGraficoBarras();
            }
        });

        Button btnArea = new Button(("Área"));
        btnArea.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {
                buildGraficoArea();
            }
        });


        Button btnAreaEmpilhada = new Button(("Área Empilhada"));
        btnAreaEmpilhada.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {
                buildGraficoAreaEmpilhada();
            }
        });

        ToolBar toolBar = new ToolBar();
        toolBar.getItems()
               .addAll(btnAreaEmpilhada, btnArea, btnBarras, btnDispersao, btnLinhas, btnPizza, btn);
        toolBar.setOrientation(Orientation.VERTICAL);

        return toolBar;
    }

    private void buildGraficoAreaEmpilhada() {
        GraficoAreaEmpilhada grafico = new GraficoAreaEmpilhada();

        StackedAreaChart myChart = grafico.montaGrafico();
        myChart.setTitle("Exemplo de gráfico de Area Empilhada");
        myChart.setMinSize(1280, 720);

        AnchorPane pane = new AnchorPane();
        pane.setMinSize(1280, 720);
        pane.getChildren().add(myChart);
        pane.getChildren().add(getBbtnVoltar());

        Scene chartScene = new Scene(pane);

        this.lastScene = this.stage.getScene();
        this.stage.setScene(chartScene);
        this.stage.setMaximized(true);
    }

    private void buildGraficoArea() {

        GraficoArea grafico = new GraficoArea();

        AreaChart myChart = grafico.montaGrafico();
        myChart.setTitle("Exemplo de gráfico de área");
        myChart.setMinSize(1280, 720);

        AnchorPane pane = new AnchorPane();
        pane.setMinSize(1280, 720);
        pane.getChildren().add(myChart);
        pane.getChildren().add(getBbtnVoltar());

        Scene chartScene = new Scene(pane);

        this.lastScene = this.stage.getScene();
        this.stage.setScene(chartScene);
        this.stage.setMaximized(true);
    }

    private void buildGraficoBarras() {
        GraficoBarras grafico = new GraficoBarras();

        BarChart sc = grafico.montaGrafico();
        sc.setMinSize(1280, 720);

        AnchorPane pane = new AnchorPane();
        pane.setMinSize(1280, 720);
        pane.getChildren().add(sc);
        pane.getChildren().add(getBbtnVoltar());

        Scene grafico1Scene = new Scene(pane);

        this.lastScene = this.stage.getScene();
        this.stage.setScene(grafico1Scene);
        this.stage.setMaximized(true);
    }

    private void buildGraficoDispersao() {
        GraficoDispersao grafico = new GraficoDispersao();

        ScatterChart sc = grafico.montaGrafico();
        sc.setMinSize(1280, 720);

        AnchorPane pane = new AnchorPane();
        pane.setMinSize(1280, 720);
        pane.getChildren().add(sc);
        pane.getChildren().add(getBbtnVoltar());

        Scene grafico1Scene = new Scene(pane);

        this.lastScene = this.stage.getScene();
        this.stage.setScene(grafico1Scene);
        this.stage.setMaximized(true);
    }

    private void buildGraficoLinhas() {
        GraficoLinhas grafico = new GraficoLinhas();

        LineChart lineChart = grafico.montaGrafico();
        lineChart.setMinSize(1280, 720);

        AnchorPane pane = new AnchorPane();
        pane.setMinSize(1280, 720);
        pane.getChildren().add(lineChart);
        pane.getChildren().add(getBbtnVoltar());

        Scene grafico1Scene = new Scene(pane);

        this.lastScene = this.stage.getScene();
        this.stage.setScene(grafico1Scene);
        this.stage.setMaximized(true);
    }

    private void buildGrafico1() {

        GraficoPizza grafico1 = new GraficoPizza();

        PieChart pizza = grafico1.montaGrafico();

        /** trabalhando a cada click do mouse, sobre uma parte da pizza, é possivel adicionar eventos e fazer várias coisas,
         * no momento estou exibindo uma label sobre os dados e nele o percentual correspondente */
        for (final PieChart.Data data : pizza.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_PRESSED,
                                           new EventHandler<MouseEvent>() {
                                               @Override
                                               public void handle(MouseEvent e) {
                                                   caption.setTranslateX(e.getSceneX());
                                                   caption.setTranslateY(e.getSceneY());
                                                   caption.setText(String.valueOf(data.getPieValue()) + "%");
                                               }
                                           }
            );
        }

        AnchorPane pane = new AnchorPane();
        pizza.setMinSize(1280, 720);
        pane.getChildren().add(pizza);
        pane.setMinSize(1280, 720);
        pane.getChildren().add(caption);
        pane.getChildren().add(getBbtnVoltar());

        Scene grafico1Scene = new Scene(pane);

        this.lastScene = this.stage.getScene();
        this.stage.setScene(grafico1Scene);
    }

    private Button getBbtnVoltar() {

        Button btnVoltar = new Button("voltar");

        btnVoltar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent actionEvent) {
                stage.setScene(lastScene);
            }
        });
        return btnVoltar;
    }
}
