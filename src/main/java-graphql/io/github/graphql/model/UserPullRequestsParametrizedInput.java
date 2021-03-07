package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLParametrizedInput;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Parametrized input for field pullRequests in type User
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UserPullRequestsParametrizedInput implements GraphQLParametrizedInput {

    private String after;
    private String baseRefName;
    private String before;
    private Integer first;
    private String headRefName;
    @javax.validation.constraints.NotNull
    private java.util.List<String> labels;
    private Integer last;
    private IssueOrderTO orderBy;
    @javax.validation.constraints.NotNull
    private java.util.List<PullRequestStateTO> states;

    public UserPullRequestsParametrizedInput() {
    }

    public UserPullRequestsParametrizedInput(String after, String baseRefName, String before, Integer first, String headRefName, java.util.List<String> labels, Integer last, IssueOrderTO orderBy, java.util.List<PullRequestStateTO> states) {
        this.after = after;
        this.baseRefName = baseRefName;
        this.before = before;
        this.first = first;
        this.headRefName = headRefName;
        this.labels = labels;
        this.last = last;
        this.orderBy = orderBy;
        this.states = states;
    }

    public UserPullRequestsParametrizedInput after(String after) {
        this.after = after;
        return this;
    }

    public UserPullRequestsParametrizedInput baseRefName(String baseRefName) {
        this.baseRefName = baseRefName;
        return this;
    }

    public UserPullRequestsParametrizedInput before(String before) {
        this.before = before;
        return this;
    }

    public UserPullRequestsParametrizedInput first(Integer first) {
        this.first = first;
        return this;
    }

    public UserPullRequestsParametrizedInput headRefName(String headRefName) {
        this.headRefName = headRefName;
        return this;
    }

    public UserPullRequestsParametrizedInput labels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }

    public UserPullRequestsParametrizedInput last(Integer last) {
        this.last = last;
        return this;
    }

    public UserPullRequestsParametrizedInput orderBy(IssueOrderTO orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public UserPullRequestsParametrizedInput states(java.util.List<PullRequestStateTO> states) {
        this.states = states;
        return this;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "(", ")");
        if (after != null) {
            joiner.add("after: " + GraphQLRequestSerializer.getEntry(after));
        }
        if (baseRefName != null) {
            joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName));
        }
        if (before != null) {
            joiner.add("before: " + GraphQLRequestSerializer.getEntry(before));
        }
        if (first != null) {
            joiner.add("first: " + GraphQLRequestSerializer.getEntry(first));
        }
        if (headRefName != null) {
            joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName));
        }
        if (labels != null) {
            joiner.add("labels: " + GraphQLRequestSerializer.getEntry(labels));
        }
        if (last != null) {
            joiner.add("last: " + GraphQLRequestSerializer.getEntry(last));
        }
        if (orderBy != null) {
            joiner.add("orderBy: " + GraphQLRequestSerializer.getEntry(orderBy));
        }
        if (states != null) {
            joiner.add("states: " + GraphQLRequestSerializer.getEntry(states));
        }
        return joiner.toString();
    }

}