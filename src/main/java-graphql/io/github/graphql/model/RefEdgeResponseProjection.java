package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RefEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RefEdgeResponseProjection extends GraphQLResponseProjection {

    public RefEdgeResponseProjection() {
    }

    @Override
    public RefEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RefEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefEdgeResponseProjection.RefResponseProjection.node", projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0) + 1);
            this.node(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public RefEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public RefEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public RefEdgeResponseProjection node(RefResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public RefEdgeResponseProjection node(String alias, RefResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public RefEdgeResponseProjection typename() {
        return typename(null);
    }

    public RefEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}