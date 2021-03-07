package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdatePullRequestInputTO(
    val baseRefName: String?,
    val body: String?,
    val clientMutationId: String?,
    val maintainerCanModify: Boolean?,
    val pullRequestId: String,
    val title: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (baseRefName != null) {
            joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName))
        }
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (maintainerCanModify != null) {
            joiner.add("maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify))
        }
        joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId))
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        }
        return joiner.toString()
    }

    class Builder {

        private var baseRefName: String? = null
        private var body: String? = null
        private var clientMutationId: String? = null
        private var maintainerCanModify: Boolean? = null
        private lateinit var pullRequestId: String
        private var title: String? = null

        fun setBaseRefName(baseRefName: String?): Builder {
            this.baseRefName = baseRefName
            return this
        }

        fun setBody(body: String?): Builder {
            this.body = body
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setMaintainerCanModify(maintainerCanModify: Boolean?): Builder {
            this.maintainerCanModify = maintainerCanModify
            return this
        }

        fun setPullRequestId(pullRequestId: String): Builder {
            this.pullRequestId = pullRequestId
            return this
        }

        fun setTitle(title: String?): Builder {
            this.title = title
            return this
        }

        fun build(): UpdatePullRequestInputTO {
            return UpdatePullRequestInputTO(baseRefName, body, clientMutationId, maintainerCanModify, pullRequestId, title)
        }
    }
}