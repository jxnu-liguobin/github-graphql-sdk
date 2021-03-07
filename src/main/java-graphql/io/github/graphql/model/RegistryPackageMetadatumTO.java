package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RegistryPackageMetadatumTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String name;
    private Boolean update;
    @javax.validation.constraints.NotNull
    private String value;

    public RegistryPackageMetadatumTO() {
    }

    public RegistryPackageMetadatumTO(String name, Boolean update, String value) {
        this.name = name;
        this.update = update;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Boolean getUpdate() {
        return update;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        if (update != null) {
            joiner.add("update: " + GraphQLRequestSerializer.getEntry(update));
        }
        if (value != null) {
            joiner.add("value: " + GraphQLRequestSerializer.getEntry(value));
        }
        return joiner.toString();
    }

    public static RegistryPackageMetadatumTO.Builder builder() {
        return new RegistryPackageMetadatumTO.Builder();
    }

    public static class Builder {

        private String name;
        private Boolean update;
        private String value;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setUpdate(Boolean update) {
            this.update = update;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public RegistryPackageMetadatumTO build() {
            return new RegistryPackageMetadatumTO(name, update, value);
        }

    }
}