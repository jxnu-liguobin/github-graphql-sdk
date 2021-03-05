package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CommitAuthorTO(
    val emails: List<String>?,
    val id: String?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (emails != null) {
            joiner.add("emails: " + GraphQLRequestSerializer.getEntry(emails))
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        }
        return joiner.toString()
    }
}
