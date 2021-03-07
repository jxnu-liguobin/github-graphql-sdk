package io.github.graphql.resolver

import io.github.graphql.model.*

/**
 * Resolver for Release
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
interface ReleaseResolver {

    @Throws(Exception::class)
    fun releaseAssets(releaseTO: ReleaseTO, after: String?, before: String?, first: Int?, last: Int?, name: String?): ReleaseAssetConnectionTO

}