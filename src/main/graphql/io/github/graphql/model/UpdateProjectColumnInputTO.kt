package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateProjectColumnInputTO(
    val clientMutationId: String?,
    val name: String,
    val projectColumnId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("projectColumnId: " + GraphQLRequestSerializer.getEntry(projectColumnId))
        return joiner.toString()
    }
}
