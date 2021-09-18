package com.Forest;

import java.util.List;

public abstract class Tree  implements Leaf,Branch,Trunk,Root{
    private Integer nutrient;
    private List<Object> leaves;
    private List<Object> branches;

    protected Tree() {
    }

    abstract public void growTree();

    public Integer getNutrient() {
        return nutrient;
    }

    protected void setNutrient(Integer nutrient) {
        this.nutrient = nutrient;
    }

    public List<Object> getLeaves() {
        return leaves;
    }

    protected void setLeaves(List<Object> leaves) {
        this.leaves = leaves;
    }


    public List<Object> getBranches() {
        return branches;
    }

    protected void setBranches(List<Object> branches) {
        this.branches = branches;
    }
}
