package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReactingUserEdgeTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String cursor;
    @javax.validation.constraints.NotNull
    private UserTO node;
    @javax.validation.constraints.NotNull
    private String reactedAt;

    public ReactingUserEdgeTO() {
    }

    public ReactingUserEdgeTO(String cursor, UserTO node, String reactedAt) {
        this.cursor = cursor;
        this.node = node;
        this.reactedAt = reactedAt;
    }

    public String getCursor() {
        return cursor;
    }

    public UserTO getNode() {
        return node;
    }

    public String getReactedAt() {
        return reactedAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (cursor != null) {
            joiner.add("cursor: " + GraphQLRequestSerializer.getEntry(cursor));
        }
        if (node != null) {
            joiner.add("node: " + GraphQLRequestSerializer.getEntry(node));
        }
        if (reactedAt != null) {
            joiner.add("reactedAt: " + GraphQLRequestSerializer.getEntry(reactedAt));
        }
        return joiner.toString();
    }

    public static ReactingUserEdgeTO.Builder builder() {
        return new ReactingUserEdgeTO.Builder();
    }

    public static class Builder {

        private String cursor;
        private UserTO node;
        private String reactedAt;

        public Builder() {
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder setNode(UserTO node) {
            this.node = node;
            return this;
        }

        public Builder setReactedAt(String reactedAt) {
            this.reactedAt = reactedAt;
            return this;
        }


        public ReactingUserEdgeTO build() {
            return new ReactingUserEdgeTO(cursor, node, reactedAt);
        }

    }
}