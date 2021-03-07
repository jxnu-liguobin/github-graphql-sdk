package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class TextMatchHighlightTO implements java.io.Serializable {

    private int beginIndice;
    private int endIndice;
    @javax.validation.constraints.NotNull
    private String text;

    public TextMatchHighlightTO() {
    }

    public TextMatchHighlightTO(int beginIndice, int endIndice, String text) {
        this.beginIndice = beginIndice;
        this.endIndice = endIndice;
        this.text = text;
    }

    public int getBeginIndice() {
        return beginIndice;
    }

    public int getEndIndice() {
        return endIndice;
    }

    public String getText() {
        return text;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("beginIndice: " + GraphQLRequestSerializer.getEntry(beginIndice));
        joiner.add("endIndice: " + GraphQLRequestSerializer.getEntry(endIndice));
        if (text != null) {
            joiner.add("text: " + GraphQLRequestSerializer.getEntry(text));
        }
        return joiner.toString();
    }

    public static TextMatchHighlightTO.Builder builder() {
        return new TextMatchHighlightTO.Builder();
    }

    public static class Builder {

        private int beginIndice;
        private int endIndice;
        private String text;

        public Builder() {
        }

        public Builder setBeginIndice(int beginIndice) {
            this.beginIndice = beginIndice;
            return this;
        }

        public Builder setEndIndice(int endIndice) {
            this.endIndice = endIndice;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }


        public TextMatchHighlightTO build() {
            return new TextMatchHighlightTO(beginIndice, endIndice, text);
        }

    }
}