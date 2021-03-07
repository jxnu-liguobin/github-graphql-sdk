package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for PullRequestCommitCommentThread
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface PullRequestCommitCommentThreadResolver {

    @Throws(Exception::class)
    fun comments(pullRequestCommitCommentThreadTO: PullRequestCommitCommentThreadTO, after: String?, before: String?, first: Int?, last: Int?): CommitCommentConnectionTO

}