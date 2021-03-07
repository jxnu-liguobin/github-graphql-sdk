package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UpdateIssueCommentPayloadTO implements java.io.Serializable {

    private String clientMutationId;
    private IssueCommentTO issueComment;

    public UpdateIssueCommentPayloadTO() {
    }

    public UpdateIssueCommentPayloadTO(String clientMutationId, IssueCommentTO issueComment) {
        this.clientMutationId = clientMutationId;
        this.issueComment = issueComment;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public IssueCommentTO getIssueComment() {
        return issueComment;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId));
        }
        if (issueComment != null) {
            joiner.add("issueComment: " + GraphQLRequestSerializer.getEntry(issueComment));
        }
        return joiner.toString();
    }

    public static UpdateIssueCommentPayloadTO.Builder builder() {
        return new UpdateIssueCommentPayloadTO.Builder();
    }

    public static class Builder {

        private String clientMutationId;
        private IssueCommentTO issueComment;

        public Builder() {
        }

        public Builder setClientMutationId(String clientMutationId) {
            this.clientMutationId = clientMutationId;
            return this;
        }

        public Builder setIssueComment(IssueCommentTO issueComment) {
            this.issueComment = issueComment;
            return this;
        }


        public UpdateIssueCommentPayloadTO build() {
            return new UpdateIssueCommentPayloadTO(clientMutationId, issueComment);
        }

    }
}