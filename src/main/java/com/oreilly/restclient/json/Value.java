package com.oreilly.restclient.json;

import java.util.List;

public class Value {

    private int id;
    private String joke;
    private List<String> categories;

    public int getId() {
        return id;
    }

    public String getJoke() {
        return joke;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}
