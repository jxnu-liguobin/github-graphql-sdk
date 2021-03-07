package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object StatusStateTO extends Enumeration {

    type StatusStateTO = Value

    val ERROR: Value = Value("ERROR")
    val EXPECTED: Value = Value("EXPECTED")
    val FAILURE: Value = Value("FAILURE")
    val PENDING: Value = Value("PENDING")
    val SUCCESS: Value = Value("SUCCESS")

}

class StatusStateTOTypeRefer extends TypeReference[StatusStateTO.type]