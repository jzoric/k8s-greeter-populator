package com.jovicazoric.populator.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "people")
@Data
@Builder
public class Person {
    @Id
    private String id;

    private String name;
}
