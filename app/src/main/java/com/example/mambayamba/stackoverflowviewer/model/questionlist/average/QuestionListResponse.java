package com.example.mambayamba.stackoverflowviewer.model.questionlist.average;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by mambayamba on 05.11.2016.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(suppressConstructorProperties = true)
public class QuestionListResponse {
    private List<Item> items;
}
