package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RemoveLabelsFromLabelablePayload
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class RemoveLabelsFromLabelablePayloadResponseProjection extends GraphQLResponseProjection {

    public RemoveLabelsFromLabelablePayloadResponseProjection() {
    }

    @Override
    public RemoveLabelsFromLabelablePayloadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RemoveLabelsFromLabelablePayloadResponseProjection all$(int maxDepth) {
        this.clientMutationId();
        if (projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0) + 1);
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RemoveLabelsFromLabelablePayloadResponseProjection.LabelableResponseProjection.labelable", 0)));
        }
        this.typename();
        return this;
    }

    public RemoveLabelsFromLabelablePayloadResponseProjection clientMutationId() {
        return clientMutationId(null);
    }

    public RemoveLabelsFromLabelablePayloadResponseProjection clientMutationId(String alias) {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias));
        return this;
    }

    public RemoveLabelsFromLabelablePayloadResponseProjection labelable(LabelableResponseProjection subProjection) {
        return labelable(null, subProjection);
    }

    public RemoveLabelsFromLabelablePayloadResponseProjection labelable(String alias, LabelableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection));
        return this;
    }

    public RemoveLabelsFromLabelablePayloadResponseProjection typename() {
        return typename(null);
    }

    public RemoveLabelsFromLabelablePayloadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}