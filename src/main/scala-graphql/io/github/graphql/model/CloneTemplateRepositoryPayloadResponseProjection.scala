package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CloneTemplateRepositoryPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CloneTemplateRepositoryPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): CloneTemplateRepositoryPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): CloneTemplateRepositoryPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CloneTemplateRepositoryPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): CloneTemplateRepositoryPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): CloneTemplateRepositoryPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): CloneTemplateRepositoryPayloadResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): CloneTemplateRepositoryPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): CloneTemplateRepositoryPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CloneTemplateRepositoryPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}