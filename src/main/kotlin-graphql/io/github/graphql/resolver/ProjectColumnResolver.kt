package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for ProjectColumn
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface ProjectColumnResolver {

    @Throws(Exception::class)
    fun cards(projectColumnTO: ProjectColumnTO, after: String?, archivedStates: List<ProjectCardArchivedStateTO?>?, before: String?, first: Int?, last: Int?): ProjectCardConnectionTO

}