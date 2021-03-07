package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdatePullRequestReviewCommentInputTO implements java.io.Serializable {

    @javax.validation.constraints.NotNull
    private String body;
    private String clientMutationId;
    @javax.validation.constraints.NotNull
    private String pullRequestReviewCommentId;

    public UpdatePullRequestReviewCommentInputTO() {
    }

    public UpdatePullRequestReviewCommentInputTO(String body, String clientMutationId, String pullRequestReviewCommentId) {
        this.body = body;
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewCommentId = pullRequestReviewCommentId;
    }

    public String getBody() {
        return body;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public String getPullRequestReviewCommentId() {
        return pullRequestReviewCommentId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequestReviewCommentId != null) {
            joiner.add("pullRequestReviewCommentId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewCommentId));
        }
        return joiner.toString();
    }

    public static UpdatePullRequestReviewCommentInputTO.Builder builder() {
        return new UpdatePullRequestReviewCommentInputTO.Builder();
    }

    public static class Builder {

        private String body;
        private String clientMutationId;
        private String pullRequestReviewCommentId;

        public Builder() {
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequestReviewCommentId(String pullRequestReviewCommentId) {
            this.pullRequestReviewCommentId = pullRequestReviewCommentId;
            return this;
        }


        public UpdatePullRequestReviewCommentInputTO build() {
            return new UpdatePullRequestReviewCommentInputTO(body, clientMutationId, pullRequestReviewCommentId);
        }

    }
}