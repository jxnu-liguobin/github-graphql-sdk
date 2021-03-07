package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MergeBranchPayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MergeBranchPayloadResponseProjection extends GraphQLResponseProjection {

    public MergeBranchPayloadResponseProjection() {
    }

    @Override
    public MergeBranchPayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MergeBranchPayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0) + 1);
            this.mergeCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MergeBranchPayloadResponseProjection.CommitResponseProjection.mergeCommit", 0)));
        }
        this.typename();
        return this;
    }

    public MergeBranchPayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public MergeBranchPayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public MergeBranchPayloadResponseProjection mergeCommit(CommitResponseProjection subProjection) {
        return mergeCommit(null, subProjection);
    }

    public MergeBranchPayloadResponseProjection mergeCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("mergeCommit").alias(alias).projection(subProjection));
        return this;
    }

    public MergeBranchPayloadResponseProjection typename() {
        return typename(null);
    }

    public MergeBranchPayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}