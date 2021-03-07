package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ExternalIdentityEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ExternalIdentityEdgeResponseProjection extends GraphQLResponseProjection {

    public ExternalIdentityEdgeResponseProjection() {
    }

    @Override
    public ExternalIdentityEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ExternalIdentityEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0) + 1);
            this.node(new ExternalIdentityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public ExternalIdentityEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public ExternalIdentityEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public ExternalIdentityEdgeResponseProjection node(ExternalIdentityResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public ExternalIdentityEdgeResponseProjection node(String alias, ExternalIdentityResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public ExternalIdentityEdgeResponseProjection typename() {
        return typename(null);
    }

    public ExternalIdentityEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}