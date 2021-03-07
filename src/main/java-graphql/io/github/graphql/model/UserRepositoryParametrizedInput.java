package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field repository in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UserRepositoryParametrizedInput implements GraphQLParametrizedInput {

    @javax.validation.constraints.NotNull
    private String name;

    public UserRepositoryParametrizedInput() {
    }

    public UserRepositoryParametrizedInput(String name) {
        this.name = name;
    }

    public UserRepositoryParametrizedInput name(String name) {
        this.name = name;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        return joiner.toString();
    }

}