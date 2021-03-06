package viewsControllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import models.Book;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ViewsController {
    private static ViewsController ourInstance;

    static {
        try {
            ourInstance = new ViewsController();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ViewsController getInstance() {
        return ourInstance;
    }

    private Stage primaryStage;

    private Scene loginScreenScene;
    private Scene signUpScreenScene;
    private Scene controlPanelScene;
    private Scene addBookScene;
    private Scene addPublisherScene;
    private Scene searchForBooksScene;
    private Scene checOutScene;
    private Scene userHomeScene;
    private Scene confirmOrdersScene;
    private Scene shoppingCartScene;

    private URL loginScreenUrl;
    private URL signUpScreenUrl;
    private URL controlPanelScreenUrl;
    private URL addBookPanelScreenUrl;
    private URL addPublisherScreenUrl;
    private URL searchForBooksScreenUrl;
    private URL checOutScreenUrl;
    private URL userHomeScreenUrl;
    private URL confirmOrdersScreenUrl;
    private URL shoppingCartScreenUrl;

    private Parent controlPanelScreenParent;
    private Parent signUpScreenParent;
    private Parent loginScreenParent;
    private Parent addBookScreenParent;
    private Parent addPublisherScreenParent;
    private Parent searchForBooksScreenParent;
    private Parent checOutScreenParent;
    private Parent userHomeScreenParent;
    private Parent confirmOrdersScreenParent;
    private Parent shoppingCartScreenParent;

    private SignUp signUpController;
    private AddBook addBookController;
    private SearchForBooks searchForBooksController;
    private ConfirmOrders confirmOrdersController;

    public void setShoppingCartController(ShoppingCart shoppingCartController) {
        this.shoppingCartController = shoppingCartController;
    }

    private ShoppingCart shoppingCartController;

    public void setConfirmOrdersController(ConfirmOrders confirmOrdersController) {
        this.confirmOrdersController = confirmOrdersController;
    }

    public void setAddBookController(AddBook addBookController) {
        this.addBookController = addBookController;
    }

    public void setSignUpController(SignUp signUpController) {
        this.signUpController = signUpController;
    }

    public void setSearchForBooksController(SearchForBooks searchForBooksController) {
        this.searchForBooksController = searchForBooksController;
    }

    private ViewsController() throws IOException {
        File loginScreenFile = new File("src/views/login.fxml");
        loginScreenUrl = loginScreenFile.toURI().toURL();

        File signUpScreenFile = new File("src/views/signUp.fxml");
        signUpScreenUrl = signUpScreenFile.toURI().toURL();

        File controlPanelScreenFile = new File("src/views/controlPanel.fxml");
        controlPanelScreenUrl = controlPanelScreenFile.toURI().toURL();

        File addBookScreenFile = new File("src/views/addBook.fxml");
        addBookPanelScreenUrl = addBookScreenFile.toURI().toURL();

        File addPublisherScreenFile = new File("src/views/addPublisher.fxml");
        addPublisherScreenUrl = addPublisherScreenFile.toURI().toURL();

        File searchForBooksScreenFile = new File("src/views/searchForBooks.fxml");
        searchForBooksScreenUrl = searchForBooksScreenFile.toURI().toURL();

        File checkOutScreenFile = new File("src/views/checkOut.fxml");
        checOutScreenUrl = checkOutScreenFile.toURI().toURL();

        File userHomeScreenFile = new File("src/views/userHome.fxml");
        userHomeScreenUrl = userHomeScreenFile.toURI().toURL();

        File confirmOrdersScreenFile = new File("src/views/confirmOrders.fxml");
        confirmOrdersScreenUrl = confirmOrdersScreenFile.toURI().toURL();

        File shoppingCartScreenFile = new File("src/views/shoppingCart.fxml");
        shoppingCartScreenUrl = shoppingCartScreenFile.toURI().toURL();
    }

    public void openLoginScreen() throws IOException {
        if(loginScreenParent == null) {
            loginScreenParent = FXMLLoader.load(loginScreenUrl);
            loginScreenScene = new Scene(loginScreenParent);
        }
        primaryStage.setScene(loginScreenScene);
    }

    public void openConfirmOrdersScreen() throws IOException {
        if(confirmOrdersScreenParent == null) {
            confirmOrdersScreenParent = FXMLLoader.load(confirmOrdersScreenUrl);
            confirmOrdersScene = new Scene(confirmOrdersScreenParent);
        }
        confirmOrdersController.onSceneShow();
        primaryStage.setScene(confirmOrdersScene);
    }

    public void openShoppingCartScreen() throws IOException {
        if(shoppingCartScreenParent == null) {
            shoppingCartScreenParent = FXMLLoader.load(shoppingCartScreenUrl);
            shoppingCartScene = new Scene(shoppingCartScreenParent);
        }
        shoppingCartController.onSceneShow();
        primaryStage.setScene(shoppingCartScene);
    }

    public void openUserHomeScreen() throws IOException {
        if(userHomeScreenParent == null) {
            userHomeScreenParent = FXMLLoader.load(userHomeScreenUrl);
            userHomeScene = new Scene(userHomeScreenParent);
        }
        primaryStage.setScene(userHomeScene);
    }

    public void openCheckOutScreen() throws IOException {
        if(checOutScreenParent == null) {
            checOutScreenParent = FXMLLoader.load(checOutScreenUrl);
            checOutScene = new Scene(checOutScreenParent);
        }
        primaryStage.setScene(checOutScene);
    }

    public void openSignUpScreen() throws IOException {
        if(signUpScreenScene == null) {
            signUpScreenParent = FXMLLoader.load(signUpScreenUrl);
            signUpScreenScene = new Scene(signUpScreenParent);
        }
        signUpController.onSceneShow();
        primaryStage.setScene(signUpScreenScene);
    }

    public void openControlPanelScreen() throws IOException {
        if(controlPanelScreenParent == null) {
            controlPanelScreenParent = FXMLLoader.load(controlPanelScreenUrl);
            controlPanelScene = new Scene(controlPanelScreenParent);
        }
        primaryStage.setScene(controlPanelScene);
    }

    public void openAddBookScreen() throws IOException {
        if(addBookScreenParent == null) {
            addBookScreenParent = FXMLLoader.load(addBookPanelScreenUrl);
            addBookScene = new Scene(addBookScreenParent);
        }
        addBookController.onSceneShow(null);
        primaryStage.setScene(addBookScene);
    }

    public void openEditBookScreen(Book book) throws IOException {
        if(addBookScreenParent == null) {
            addBookScreenParent = FXMLLoader.load(addBookPanelScreenUrl);
            addBookScene = new Scene(addBookScreenParent);
        }
        addBookController.onSceneShow(book);
        primaryStage.setScene(addBookScene);
    }

    public void openSearchForBooksScreen() throws IOException {
        if(searchForBooksScreenParent == null) {
            searchForBooksScreenParent = FXMLLoader.load(searchForBooksScreenUrl);
            searchForBooksScene = new Scene(searchForBooksScreenParent);
        }
        searchForBooksController.onSceneShow();
        primaryStage.setScene(searchForBooksScene);
    }

    public void openAddPublisherScreen() throws IOException {
        if(addPublisherScreenParent == null) {
            addPublisherScreenParent = FXMLLoader.load(addPublisherScreenUrl);
            addPublisherScene = new Scene(addPublisherScreenParent);
        }
        primaryStage.setScene(addPublisherScene);
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

}
