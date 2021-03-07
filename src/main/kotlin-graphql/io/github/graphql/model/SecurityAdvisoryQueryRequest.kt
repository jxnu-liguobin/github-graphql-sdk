package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SecurityAdvisoryQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "securityAdvisory"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setGhsaId(ghsaId: String) {
        this.input["ghsaId"] = ghsaId
    }

    override fun getOperationType(): GraphQLOperation = OPERATION_TYPE

    override fun getOperationName(): String = OPERATION_NAME

    override fun getAlias(): String? = alias ?: OPERATION_NAME

    override fun getInput(): MutableMap<String, Any?> = input

    override fun getUseObjectMapperForInputSerialization(): MutableSet<String> = useObjectMapperForInputSerialization

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private lateinit var ghsaId: String

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setGhsaId(ghsaId: String): Builder {
            this.ghsaId = ghsaId
            return this
        }

        fun build(): SecurityAdvisoryQueryRequest {
            val obj = SecurityAdvisoryQueryRequest(`$alias`)
            obj.setGhsaId(ghsaId)
            return obj
        }

    }
}