package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Assignee
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class AssigneeResponseProjection extends GraphQLResponseProjection {

    override def all$(): AssigneeResponseProjection = all$(3)

    override def all$(maxDepth: Int): AssigneeResponseProjection = {
        this.typename()
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): AssigneeResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): AssigneeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): AssigneeResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): AssigneeResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def onMannequin(subProjection: MannequinResponseProjection): AssigneeResponseProjection = {
        onMannequin(null.asInstanceOf[String], subProjection)
    }

    def onMannequin(alias: String, subProjection: MannequinResponseProjection): AssigneeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection))
        this
    }

    def onBot(subProjection: BotResponseProjection): AssigneeResponseProjection = {
        onBot(null.asInstanceOf[String], subProjection)
    }

    def onBot(alias: String, subProjection: BotResponseProjection): AssigneeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Bot").alias(alias).projection(subProjection))
        this
    }

    def typename(): AssigneeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AssigneeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}