package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for TeamEdge
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class TeamEdgeResponseProjection extends GraphQLResponseProjection {

    public TeamEdgeResponseProjection() {
    }

    @Override
    public TeamEdgeResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TeamEdgeResponseProjection all$(int maxDepth) {
        this.cursor();
        if (projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TeamEdgeResponseProjection.TeamResponseProjection.node", projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0) + 1);
            this.node(new TeamResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TeamEdgeResponseProjection.TeamResponseProjection.node", 0)));
        }
        this.typename();
        return this;
    }

    public TeamEdgeResponseProjection cursor() {
        return cursor(null);
    }

    public TeamEdgeResponseProjection cursor(String alias) {
        fields.add(new GraphQLResponseField("cursor").alias(alias));
        return this;
    }

    public TeamEdgeResponseProjection node(TeamResponseProjection subProjection) {
        return node(null, subProjection);
    }

    public TeamEdgeResponseProjection node(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection));
        return this;
    }

    public TeamEdgeResponseProjection typename() {
        return typename(null);
    }

    public TeamEdgeResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}