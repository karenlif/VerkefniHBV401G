package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button addButton;
    @FXML
    private ListView userListView;
    @FXML
    private ListView reservationsListView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField emailTextField;
    private DataFactory dataFactory = new DataFactory();
    private ObservableList<Passenger> passengers = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        passengers = dataFactory.getPassenger();
        userListView.setItems(passengers);
    }
    public void listViewMouseClicked(MouseEvent mouseEvent){
        Passenger selectedItem = (Passenger) userListView.getSelectionModel();
        usernameTextField.setText(selectedItem.getName());
        emailTextField.setText(selectedItem.getEmail());

        reservationsListView.setItems(getReservedTrips(selectedItem));
    }
    private ObservableList<Trip> getReservedTrips(Passenger passenger){
        ObservableList<Trip> reservedTrips = FXCollections.observableArrayList();
        ArrayList<Reservation> reservations = passenger.getReservations();
        for(Reservation reservation: reservations){
            reservedTrips.add(reservation.getTrip()); //getTrip?
        }
        return reservedTrips;
    }
}
