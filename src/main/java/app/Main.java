package app;

import app.config.HibernateConfig;
import jakarta.persistence.EntityManagerFactory;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory("persons");
        Javalin app = Javalin.create().start(7070);
        app.get("/", ctx -> ctx.result("Hello World"));


    }
}