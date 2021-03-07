package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ContributionCalendarWeek
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ContributionCalendarWeekResponseProjection extends GraphQLResponseProjection {

    public ContributionCalendarWeekResponseProjection() {
    }

    @Override
    public ContributionCalendarWeekResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ContributionCalendarWeekResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0) <= maxDepth) {
            projectionDepthOnFields.put("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0) + 1);
            this.contributionDays(new ContributionCalendarDayResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ContributionCalendarWeekResponseProjection.ContributionCalendarDayResponseProjection.contributionDays", 0)));
        }
        this.firstDay();
        this.typename();
        return this;
    }

    public ContributionCalendarWeekResponseProjection contributionDays(ContributionCalendarDayResponseProjection subProjection) {
        return contributionDays(null, subProjection);
    }

    public ContributionCalendarWeekResponseProjection contributionDays(String alias, ContributionCalendarDayResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contributionDays").alias(alias).projection(subProjection));
        return this;
    }

    public ContributionCalendarWeekResponseProjection firstDay() {
        return firstDay(null);
    }

    public ContributionCalendarWeekResponseProjection firstDay(String alias) {
        fields.add(new GraphQLResponseField("firstDay").alias(alias));
        return this;
    }

    public ContributionCalendarWeekResponseProjection typename() {
        return typename(null);
    }

    public ContributionCalendarWeekResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}