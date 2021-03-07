package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestChangedFileTO(
    additions: Int,
    deletions: Int,
    @javax.validation.constraints.NotNull
    path: String
) {

    override def toString(): String = {
        Seq(
            "additions: " + GraphQLRequestSerializer.getEntry(additions),
            "deletions: " + GraphQLRequestSerializer.getEntry(deletions),
            if (path != null) "path: " + GraphQLRequestSerializer.getEntry(path) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object PullRequestChangedFileTO {

    def builder(): PullRequestChangedFileTO.Builder = new Builder()

    class Builder {

        private var additions: Int = _
        private var deletions: Int = _
        private var path: String = _

        def setAdditions(additions: Int): Builder = {
            this.additions = additions
            this
        }

        def setDeletions(deletions: Int): Builder = {
            this.deletions = deletions
            this
        }

        def setPath(path: String): Builder = {
            this.path = path
            this
        }

        def build(): PullRequestChangedFileTO = new PullRequestChangedFileTO(additions, deletions, path)

    }
}