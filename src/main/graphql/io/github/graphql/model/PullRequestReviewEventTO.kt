package io.github.graphql.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:08:59+0800"
)
enum class PullRequestReviewEventTO(val graphqlName: String) {

    APPROVE("APPROVE"),
    COMMENT("COMMENT"),
    DISMISS("DISMISS"),
    REQUEST_CHANGES("REQUEST_CHANGES")
}
