package io.github.graphql.model


@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
interface ProfileOwnerTO {

    val email: String?

    val id: String

    val itemShowcase: ProfileItemShowcaseTO

    val location: String?

    val login: String

    val name: String?

    val pinnedItemsRemaining: Int

    val viewerCanChangePinnedItems: Boolean

    val websiteUrl: String?

}