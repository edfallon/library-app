package controllers;

import db.DBHelper;
import models.Book;
import models.Seed;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class LibraryController {

    public static void main(String[] args) {

        Seed.seedData();

        staticFileLocation("/public");

        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/books", (req, res) -> {
            List<Book> books = DBHelper.getAll(Book.class);
            HashMap<String, Object> model = new HashMap<>();
            model.put("books", books);
            model.put("template", "templates/books/index.vtl");

            return new ModelAndView(model, "templates/layout.vtl");
        }, velocityTemplateEngine);
    }
}
