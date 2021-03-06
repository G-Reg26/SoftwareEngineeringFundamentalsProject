/**
 * The TeamsFollowedController class is the controller for the TeamsFollowed fxml file. This
 * controller handles all the nodes and behaviors in the JavaFX scene. This class sets the list
 * items as the teams the current user is following, and gives them an on action function that, when
 * clicked, the user will be taken to that team's page.
 *
 * @author Jordan Sasek
 * @version 1.0
 * @since 10/24/2018
 */

package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class TeamsFollowedController extends Controller {

  private ObservableList list = FXCollections.observableArrayList();

  @FXML
  private ListView<Team> listView;

  /**
   * Show list of teams that the current user follows
   */
  @FXML
  private void initialize() {
    // Add all teams in current users following list to the observable list
    list.addAll(Account.currentUser.getTeamsFollowed());
    // Set items in list view to the items in the observable list
    listView.setItems(list);
    // When an item in the list is clicked
    listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Team>() {
      @Override
      public void changed(ObservableValue<? extends Team> observable, Team oldValue,
          Team newValue) {
        // Set current team to the
        Team.currentTeam = newValue;

        changeScene("TeamPage");

        // Close stage
        Stage stage = (Stage) listView.getScene().getWindow();
        stage.close();
      }
    });
  }
}
