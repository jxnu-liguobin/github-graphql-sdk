package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UpdatePullRequestReviewCommentPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private PullRequestReviewCommentTO pullRequestReviewComment;

    public UpdatePullRequestReviewCommentPayloadTO() {
    }

    public UpdatePullRequestReviewCommentPayloadTO(String clientMutationId, PullRequestReviewCommentTO pullRequestReviewComment) {
        this.clientMutationId = clientMutationId;
        this.pullRequestReviewComment = pullRequestReviewComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public PullRequestReviewCommentTO getPullRequestReviewComment() {
        return pullRequestReviewComment;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (pullRequestReviewComment != null) {
            joiner.add("pullRequestReviewComment: " + GraphQLRequestSerializer.getEntry(pullRequestReviewComment));
        }
        return joiner.toString();
    }

    public static UpdatePullRequestReviewCommentPayloadTO.Builder builder() {
        return new UpdatePullRequestReviewCommentPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private PullRequestReviewCommentTO pullRequestReviewComment;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setPullRequestReviewComment(PullRequestReviewCommentTO pullRequestReviewComment) {
            this.pullRequestReviewComment = pullRequestReviewComment;
            return this;
        }


        public UpdatePullRequestReviewCommentPayloadTO build() {
            return new UpdatePullRequestReviewCommentPayloadTO(clientMutationId, pullRequestReviewComment);
        }

    }
}