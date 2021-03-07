package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RenamedTitleSubject
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RenamedTitleSubjectResponseProjection extends GraphQLResponseProjection {

    public RenamedTitleSubjectResponseProjection() {
    }

    @Override
    public RenamedTitleSubjectResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RenamedTitleSubjectResponseProjection all$(int maxDepth) {
        this.typename();
        return this;
    }

    public RenamedTitleSubjectResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public RenamedTitleSubjectResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public RenamedTitleSubjectResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public RenamedTitleSubjectResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public RenamedTitleSubjectResponseProjection typename() {
        return typename(null);
    }

    public RenamedTitleSubjectResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}