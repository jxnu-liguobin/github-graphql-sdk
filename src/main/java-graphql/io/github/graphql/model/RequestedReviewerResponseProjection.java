package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RequestedReviewer
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RequestedReviewerResponseProjection extends GraphQLResponseProjection {

    public RequestedReviewerResponseProjection() {
    }

    @Override
    public RequestedReviewerResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RequestedReviewerResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public RequestedReviewerResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public RequestedReviewerResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public RequestedReviewerResponseProjection onMannequin(MannequinResponseProjection subProjection) {
        return onMannequin(null, subProjection);
    }

    public RequestedReviewerResponseProjection onMannequin(String alias, MannequinResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Mannequin").alias(alias).projection(subProjection));
        return this;
    }

    public RequestedReviewerResponseProjection onTeam(TeamResponseProjection subProjection) {
        return onTeam(null, subProjection);
    }

    public RequestedReviewerResponseProjection onTeam(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection));
        return this;
    }

    public RequestedReviewerResponseProjection typename() {
        return typename(null);
    }

    public RequestedReviewerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}