package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReopenPullRequestPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReopenPullRequestPayloadResponseProjection extends GraphQLResponseProjection {

    public ReopenPullRequestPayloadResponseProjection() {
    }

    @Override
    public ReopenPullRequestPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReopenPullRequestPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("ReopenPullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReopenPullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReopenPullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReopenPullRequestPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        this.typename();
        return this;
    }

    public ReopenPullRequestPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public ReopenPullRequestPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public ReopenPullRequestPayloadResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public ReopenPullRequestPayloadResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ReopenPullRequestPayloadResponseProjection typename() {
        return typename(null);
    }

    public ReopenPullRequestPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}