package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LinkRepositoryToProjectPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class LinkRepositoryToProjectPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LinkRepositoryToProjectPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LinkRepositoryToProjectPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LinkRepositoryToProjectPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): LinkRepositoryToProjectPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): LinkRepositoryToProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): LinkRepositoryToProjectPayloadResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): LinkRepositoryToProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): LinkRepositoryToProjectPayloadResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): LinkRepositoryToProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): LinkRepositoryToProjectPayloadResponseProjection = typename(null)

    fun typename(alias: String?): LinkRepositoryToProjectPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
