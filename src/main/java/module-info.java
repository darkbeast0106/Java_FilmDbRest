module hu.petrik.filmdb {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens hu.petrik.filmdb to com.google.gson;
    exports hu.petrik.filmdb;
    opens hu.petrik.filmdb.controllers;
}