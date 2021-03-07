package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdatePullRequestReviewCommentPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdatePullRequestReviewCommentPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdatePullRequestReviewCommentPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdatePullRequestReviewCommentPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0) <= maxDepth) {
            projectionDepthOnFields.put("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0) + 1)
            this.pullRequestReviewComment(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UpdatePullRequestReviewCommentPayloadResponseProjection.PullRequestReviewCommentResponseProjection.pullRequestReviewComment", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): UpdatePullRequestReviewCommentPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): UpdatePullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def pullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): UpdatePullRequestReviewCommentPayloadResponseProjection = {
        pullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): UpdatePullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdatePullRequestReviewCommentPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdatePullRequestReviewCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}