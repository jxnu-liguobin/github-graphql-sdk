package io.github.graphql.model

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
enum class CommentCannotUpdateReasonTO(val graphqlName: String) {

    DENIED("DENIED"),
    INSUFFICIENT_ACCESS("INSUFFICIENT_ACCESS"),
    LOCKED("LOCKED"),
    LOGIN_REQUIRED("LOGIN_REQUIRED"),
    MAINTENANCE("MAINTENANCE"),
    VERIFIED_EMAIL_REQUIRED("VERIFIED_EMAIL_REQUIRED")
}