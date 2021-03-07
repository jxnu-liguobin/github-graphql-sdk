package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueTimelineItemEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class IssueTimelineItemEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueTimelineItemEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueTimelineItemEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0) + 1)
            this.node(new IssueTimelineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemEdgeResponseProjection.IssueTimelineItemResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): IssueTimelineItemEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): IssueTimelineItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: IssueTimelineItemResponseProjection): IssueTimelineItemEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: IssueTimelineItemResponseProjection): IssueTimelineItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueTimelineItemEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueTimelineItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}