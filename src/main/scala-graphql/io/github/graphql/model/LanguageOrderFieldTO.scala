package io.github.graphql.model

import com.fasterxml.jackson.core.`type`.TypeReference

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
object LanguageOrderFieldTO extends Enumeration {

    type LanguageOrderFieldTO = Value

    val SIZE: Value = Value("SIZE")

}

class LanguageOrderFieldTOTypeRefer extends TypeReference[LanguageOrderFieldTO.type]