module pl.com.a2ya.area3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.com.a2ya.area3 to javafx.fxml;
    exports pl.com.a2ya.area3;
    exports pl.com.a2ya.area3.controller;
    opens pl.com.a2ya.area3.controller to javafx.fxml;
}