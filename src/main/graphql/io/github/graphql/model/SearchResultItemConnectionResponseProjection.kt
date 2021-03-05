package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SearchResultItemConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SearchResultItemConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SearchResultItemConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SearchResultItemConnectionResponseProjection {
        this.codeCount()
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0) + 1
            this.edges(SearchResultItemEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemEdgeResponseProjection.edges", 0)))
        }
        this.issueCount()
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0) + 1
            this.nodes(SearchResultItemResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.SearchResultItemResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SearchResultItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.repositoryCount()
        this.userCount()
        this.wikiCount()
        this.typename()
        return this
    }

    fun codeCount(): SearchResultItemConnectionResponseProjection = codeCount(null)

    fun codeCount(alias: String?): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("codeCount").alias(alias))
        return this
    }

    fun edges(subProjection: SearchResultItemEdgeResponseProjection): SearchResultItemConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: SearchResultItemEdgeResponseProjection): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun issueCount(): SearchResultItemConnectionResponseProjection = issueCount(null)

    fun issueCount(alias: String?): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("issueCount").alias(alias))
        return this
    }

    fun nodes(subProjection: SearchResultItemResponseProjection): SearchResultItemConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: SearchResultItemResponseProjection): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): SearchResultItemConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun repositoryCount(): SearchResultItemConnectionResponseProjection = repositoryCount(null)

    fun repositoryCount(alias: String?): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("repositoryCount").alias(alias))
        return this
    }

    fun userCount(): SearchResultItemConnectionResponseProjection = userCount(null)

    fun userCount(alias: String?): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("userCount").alias(alias))
        return this
    }

    fun wikiCount(): SearchResultItemConnectionResponseProjection = wikiCount(null)

    fun wikiCount(alias: String?): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("wikiCount").alias(alias))
        return this
    }

    fun typename(): SearchResultItemConnectionResponseProjection = typename(null)

    fun typename(alias: String?): SearchResultItemConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
