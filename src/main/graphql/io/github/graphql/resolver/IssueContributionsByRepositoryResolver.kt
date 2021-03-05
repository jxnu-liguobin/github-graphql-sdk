package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for IssueContributionsByRepository
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
interface IssueContributionsByRepositoryResolver {

    @Throws(Exception::class)
    fun contributions(issueContributionsByRepositoryTO: IssueContributionsByRepositoryTO, after: String?, before: String?, first: Int?, last: Int?, orderBy: ContributionOrderTO?): CreatedIssueContributionConnectionTO

}
