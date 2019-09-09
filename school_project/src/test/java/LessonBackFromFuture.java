import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LessonBackFromFuture {
    private static RequestSpecification spec;

    @BeforeAll
    public static void init() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setProxy("gate.swissre.com", 9443)
                .setBaseUri("https://jsonplaceholder.typicode.com")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    @Test
    public void getUser() {
        User[] users = given()
                .spec(spec)
                .when()
                .get("users")
                .then()
                .statusCode(200)
                .extract().as(User[].class);

        assertEquals("Hobba", users[0].getName());
    }

    @Test
    public void getPosts() {

        User[] users = given()
                .spec(spec)
                .when()
                .get("users")
                .then()
                .statusCode(200)
                .extract().as(User[].class);

        Post[] posts = given()
                .spec(spec)
                .when()
                .get("posts")
                .then()
                .statusCode(200)
                .extract().as(Post[].class);

        int userId = 0;
        for (Post post : posts) {
            if (post.getBody().startsWith("odio fugit voluptatum ducimus earum autem est incidunt")) {
                userId = post.getUserId();
            }
        }
        int userId2 = 1;
        for (User user : users) {
            if (user.getName().equals("Chelsey Dietrich")) {
                userId2 = user.getId();
            }
        }
        assertEquals(userId, userId2);
    }
}
