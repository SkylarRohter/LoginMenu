module com.srohter.loginmenu {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.srohter.loginmenu to javafx.fxml;
    exports com.srohter.loginmenu;
}