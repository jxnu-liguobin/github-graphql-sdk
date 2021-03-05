package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SecurityAdvisoryEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SecurityAdvisoryEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SecurityAdvisoryEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node"] = projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0) + 1
            this.node(SecurityAdvisoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): SecurityAdvisoryEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): SecurityAdvisoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: SecurityAdvisoryResponseProjection): SecurityAdvisoryEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: SecurityAdvisoryResponseProjection): SecurityAdvisoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): SecurityAdvisoryEdgeResponseProjection = typename(null)

    fun typename(alias: String?): SecurityAdvisoryEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
