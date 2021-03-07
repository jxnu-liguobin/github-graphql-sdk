package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreateIssuePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreateIssuePayloadResponseProjection extends GraphQLResponseProjection {

    public CreateIssuePayloadResponseProjection() {
    }

    @Override
    public CreateIssuePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreateIssuePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreateIssuePayloadResponseProjection.IssueResponseProjection.issue", 0)));
        }
        this.typename();
        return this;
    }

    public CreateIssuePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public CreateIssuePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public CreateIssuePayloadResponseProjection issue(IssueResponseProjection subProjection) {
        return issue(null, subProjection);
    }

    public CreateIssuePayloadResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public CreateIssuePayloadResponseProjection typename() {
        return typename(null);
    }

    public CreateIssuePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}