package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput
import java.util.StringJoiner
/**
 * Parametrized input for field vulnerabilities in type SecurityAdvisory
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
data class SecurityAdvisoryVulnerabilitiesParametrizedInput(
    val after: String?,
    val before: String?,
    val ecosystem: SecurityAdvisoryEcosystemTO?,
    val first: Int?,
    val last: Int?,
    val orderBy: SecurityVulnerabilityOrderTO?,
    val `package`: String?,
    val severities: List<SecurityAdvisorySeverityTO>?
) : GraphQLParametrizedInput {

    override fun toString(): String {
        val joiner = StringJoiner(", ", "( ", " )")
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after))
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before))
        }
        if (ecosystem != null) {
            joiner.add("ecosystem: " + GraphQLRequestSerializer.getEntry(ecosystem))
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first))
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last))
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy))
        }
        if (`package` != null) {
            joiner.add("package: " + GraphQLRequestSerializer.getEntry(`package`))
        }
        if (severities != null) {
            joiner.add("severities: " + GraphQLRequestSerializer.getEntry(severities))
        }
        return joiner.toString()
    }
}
