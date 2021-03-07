package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitAuthorTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private java.util.List<String> emails;
    private String id;

    public CommitAuthorTO() {
    }

    public CommitAuthorTO(java.util.List<String> emails, String id) {
        this.emails = emails;
        this.id = id;
    }

    public java.util.List<String> getEmails() {
        return emails;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (emails != null) {
            joiner.add("emails: " + GraphQLRequestSerializer.getEntry(emails));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        return joiner.toString();
    }

    public static CommitAuthorTO.Builder builder() {
        return new CommitAuthorTO.Builder();
    }

    public static class Builder {

        private java.util.List<String> emails;
        private String id;

        public Builder() {
        }

        public Builder setEmails(java.util.List<String> emails) {
            this.emails = emails;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }


        public CommitAuthorTO build() {
            return new CommitAuthorTO(emails, id);
        }

    }
}