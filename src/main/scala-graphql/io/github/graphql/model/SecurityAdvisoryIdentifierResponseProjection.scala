package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryIdentifier
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SecurityAdvisoryIdentifierResponseProjection extends GraphQLResponseProjection {

    override def all$(): SecurityAdvisoryIdentifierResponseProjection = all$(3)

    override def all$(maxDepth: Int): SecurityAdvisoryIdentifierResponseProjection = {
        this.`type`()
        this.value()
        this.typename()
        this
    }

    def `type`(): SecurityAdvisoryIdentifierResponseProjection = {
        `type`(null.asInstanceOf[String])
    }

    def `type`(alias: String): SecurityAdvisoryIdentifierResponseProjection = {
        fields.add(new GraphQLResponseField("type").alias(alias))
        this
    }

    def value(): SecurityAdvisoryIdentifierResponseProjection = {
        value(null.asInstanceOf[String])
    }

    def value(alias: String): SecurityAdvisoryIdentifierResponseProjection = {
        fields.add(new GraphQLResponseField("value").alias(alias))
        this
    }

    def typename(): SecurityAdvisoryIdentifierResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SecurityAdvisoryIdentifierResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}