package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdatePullRequestReviewCommentPayloadTO(
    clientMutationId: String,
    pullRequestReviewComment: PullRequestReviewCommentTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (pullRequestReviewComment != null) "pullRequestReviewComment: " + GraphQLRequestSerializer.getEntry(pullRequestReviewComment) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UpdatePullRequestReviewCommentPayloadTO {

    def builder(): UpdatePullRequestReviewCommentPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var pullRequestReviewComment: PullRequestReviewCommentTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setPullRequestReviewComment(pullRequestReviewComment: PullRequestReviewCommentTO): Builder = {
            this.pullRequestReviewComment = pullRequestReviewComment
            this
        }

        def build(): UpdatePullRequestReviewCommentPayloadTO = new UpdatePullRequestReviewCommentPayloadTO(clientMutationId, pullRequestReviewComment)

    }
}