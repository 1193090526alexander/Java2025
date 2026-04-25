package gm.tareas.controlador;

import gm.tareas.modelo.Tarea;
import gm.tareas.servicio.TareasServicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.scene.control.*;


import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;
@Component
public class IndexControlador implements Initializable {

    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    private TareasServicio tareasServicio;

    @FXML
    private TableView<Tarea> tareaTabla;

    @FXML
    private TableColumn<Tarea, Integer> idTareaColumna;

    @FXML
    private TableColumn<Tarea, String> TareaColumna;

    @FXML
    private TableColumn<Tarea, String> ResponsableColumna;

    @FXML
    private TableColumn<Tarea, String> EstatusColumna;

    private final ObservableList<Tarea> tareas = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        configurarColumnas();
        listarTareas();
    }

    private void configurarColumnas() {
        idTareaColumna.setCellValueFactory(new PropertyValueFactory<>("id"));
        TareaColumna.setCellValueFactory(new PropertyValueFactory<>("nombreTarea"));
        ResponsableColumna.setCellValueFactory(new PropertyValueFactory<>("responsable"));
        EstatusColumna.setCellValueFactory(new PropertyValueFactory<>("estatus"));
    }
    private void listarTareas() {
        tareas.clear();
        tareas.addAll(tareasServicio.listarTareas());
        tareaTabla.setItems(tareas);
    }
}
