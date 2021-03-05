package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for PullRequestReviewThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface PullRequestReviewThreadResolver {

    @Throws(Exception::class)
    fun comments(pullRequestReviewThreadTO: PullRequestReviewThreadTO, after: String?, before: String?, first: Int?, last: Int?): PullRequestReviewCommentConnectionTO

}
