package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdateTopicsPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class UpdateTopicsPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdateTopicsPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdateTopicsPayloadResponseProjection = {
        this.clientMutationId()
        this.invalidTopicNames()
        if (projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdateTopicsPayloadResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdateTopicsPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdateTopicsPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def invalidTopicNames(): UpdateTopicsPayloadResponseProjection = {
        invalidTopicNames(null.asInstanceOf[String])
    }

    def invalidTopicNames(alias: String): UpdateTopicsPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("invalidTopicNames").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): UpdateTopicsPayloadResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): UpdateTopicsPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdateTopicsPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdateTopicsPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}