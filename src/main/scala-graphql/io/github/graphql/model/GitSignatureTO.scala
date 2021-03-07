package io.github.graphql.model

import GitSignatureStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
trait GitSignatureTO {

    @javax.validation.constraints.NotNull
    val email: String

    val isValid: Boolean

    @javax.validation.constraints.NotNull
    val payload: String

    @javax.validation.constraints.NotNull
    val signature: String

    val signer: UserTO

    @javax.validation.constraints.NotNull
    val state: GitSignatureStateTO

    val wasSignedByGitHub: Boolean

}