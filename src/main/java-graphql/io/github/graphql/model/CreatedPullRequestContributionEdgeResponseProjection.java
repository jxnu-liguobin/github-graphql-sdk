package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CreatedPullRequestContributionEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CreatedPullRequestContributionEdgeResponseProjection extends GraphQLResponseProjection {

    public CreatedPullRequestContributionEdgeResponseProjection() {
    }

    @Override
    public CreatedPullRequestContributionEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CreatedPullRequestContributionEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0) + 1);
            this.node(new CreatedPullRequestContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public CreatedPullRequestContributionEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public CreatedPullRequestContributionEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public CreatedPullRequestContributionEdgeResponseProjection node(CreatedPullRequestContributionResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public CreatedPullRequestContributionEdgeResponseProjection node(String alias, CreatedPullRequestContributionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public CreatedPullRequestContributionEdgeResponseProjection typename() {
        return typename(null);
    }

    public CreatedPullRequestContributionEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}