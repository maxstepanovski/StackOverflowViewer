package com.example.mambayamba.stackoverflowviewer.viewinterface;

import com.example.mambayamba.stackoverflowviewer.model.question.featured.Item;

import java.util.List;

/**
 * Created by mambayamba on 19.11.2016.
 */
public interface FeaturedFragmentView {
    public void showLoading();
    public void hideLoading();
    public void showError();
    public void showList(List<Item> questions);
}