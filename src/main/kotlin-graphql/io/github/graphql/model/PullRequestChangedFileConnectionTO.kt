package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestChangedFileConnectionTO(
    val edges: List<PullRequestChangedFileEdgeTO?>?,
    val nodes: List<PullRequestChangedFileTO?>?,
    val pageInfo: PageInfoTO,
    val totalCount: Int
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (edges != null) {
            joiner.add("edges: " + GraphQLRequestSerializer.getEntry(edges))
        }
        if (nodes != null) {
            joiner.add("nodes: " + GraphQLRequestSerializer.getEntry(nodes))
        }
        joiner.add("pageInfo: " + GraphQLRequestSerializer.getEntry(pageInfo))
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount))
        return joiner.toString()
    }

    class Builder {

        private var edges: List<PullRequestChangedFileEdgeTO?>? = null
        private var nodes: List<PullRequestChangedFileTO?>? = null
        private lateinit var pageInfo: PageInfoTO
        private var totalCount: Int = 0

        fun setEdges(edges: List<PullRequestChangedFileEdgeTO?>?): Builder {
            this.edges = edges
            return this
        }

        fun setNodes(nodes: List<PullRequestChangedFileTO?>?): Builder {
            this.nodes = nodes
            return this
        }

        fun setPageInfo(pageInfo: PageInfoTO): Builder {
            this.pageInfo = pageInfo
            return this
        }

        fun setTotalCount(totalCount: Int): Builder {
            this.totalCount = totalCount
            return this
        }

        fun build(): PullRequestChangedFileConnectionTO {
            return PullRequestChangedFileConnectionTO(edges, nodes, pageInfo, totalCount)
        }
    }
}