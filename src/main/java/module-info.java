module pl.com.a2ya.area3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.com.a2ya.area3 to javafx.fxml;
    exports pl.com.a2ya.area3;
}