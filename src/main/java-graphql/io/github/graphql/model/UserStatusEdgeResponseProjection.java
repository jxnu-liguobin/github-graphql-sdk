package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserStatusEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UserStatusEdgeResponseProjection extends GraphQLResponseProjection {

    public UserStatusEdgeResponseProjection() {
    }

    @Override
    public UserStatusEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserStatusEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0) + 1);
            this.node(new UserStatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusEdgeResponseProjection.UserStatusResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public UserStatusEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public UserStatusEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public UserStatusEdgeResponseProjection node(UserStatusResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public UserStatusEdgeResponseProjection node(String alias, UserStatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public UserStatusEdgeResponseProjection typename() {
        return typename(null);
    }

    public UserStatusEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}