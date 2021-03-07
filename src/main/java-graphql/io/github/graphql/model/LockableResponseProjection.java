package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Lockable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class LockableResponseProjection extends GraphQLResponseProjection {

    public LockableResponseProjection() {
    }

    @Override
    public LockableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LockableResponseProjection all$(int maxDepth) {
        this.activeLockReason();
        this.locked();
        this.typename();
        return this;
    }

    public LockableResponseProjection activeLockReason() {
        return activeLockReason(null);
    }

    public LockableResponseProjection activeLockReason(String alias) {
        fields.add(new GraphQLResponseField("activeLockReason").alias(alias));
        return this;
    }

    public LockableResponseProjection locked() {
        return locked(null);
    }

    public LockableResponseProjection locked(String alias) {
        fields.add(new GraphQLResponseField("locked").alias(alias));
        return this;
    }

    public LockableResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public LockableResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public LockableResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public LockableResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public LockableResponseProjection typename() {
        return typename(null);
    }

    public LockableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}