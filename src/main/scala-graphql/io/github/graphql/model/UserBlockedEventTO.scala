package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import UserBlockDurationTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UserBlockedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    blockDuration: UserBlockDurationTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    subject: UserTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (blockDuration != null) "blockDuration: " + GraphQLRequestSerializer.getEntry(blockDuration) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (subject != null) "subject: " + GraphQLRequestSerializer.getEntry(subject) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object UserBlockedEventTO {

    def builder(): UserBlockedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var blockDuration: UserBlockDurationTO = _
        private var createdAt: String = _
        private var id: String = _
        private var subject: UserTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setBlockDuration(blockDuration: UserBlockDurationTO): Builder = {
            this.blockDuration = blockDuration
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setSubject(subject: UserTO): Builder = {
            this.subject = subject
            this
        }

        def build(): UserBlockedEventTO = new UserBlockedEventTO(actor, blockDuration, createdAt, id, subject)

    }
}