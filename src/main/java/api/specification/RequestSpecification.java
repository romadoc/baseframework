package api.specification;

import io.restassured.builder.RequestSpecBuilder;

public class RequestSpecification {
    public synchronized io.restassured.specification.RequestSpecification getAdminRegSpecification(String authorization) {
        io.restassured.specification.RequestSpecification requestAdminSpecification = new RequestSpecBuilder()
                .addHeader("accept", "*/*")
                .addHeader("Authorization", authorization)
                .addHeader("Content-Type", "application/json")
                .build();
        return requestAdminSpecification;
    }
}
