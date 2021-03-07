package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class MoveProjectColumnPayloadTO(
    val clientMutationId: String?,
    val columnEdge: ProjectColumnEdgeTO?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (columnEdge != null) {
            joiner.add("columnEdge: " + GraphQLRequestSerializer.getEntry(columnEdge))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var columnEdge: ProjectColumnEdgeTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setColumnEdge(columnEdge: ProjectColumnEdgeTO?): Builder {
            this.columnEdge = columnEdge
            return this
        }

        fun build(): MoveProjectColumnPayloadTO {
            return MoveProjectColumnPayloadTO(clientMutationId, columnEdge)
        }
    }
}