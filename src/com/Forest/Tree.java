package com.Forest;

import java.util.List;

public abstract class Tree {
    private Integer nutrient;
    private Trunk trunk;
    private List<Leaf> leaves;
    private List<Branch> branches;

    protected Tree() {
    }

    abstract public void growTree();

    public Integer getNutrient() {
        return nutrient;
    }

    protected void setNutrient(Integer nutrient) {
        this.nutrient = nutrient;
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    protected void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    protected void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public Trunk getTrunk() {
        return trunk;
    }

    public void setTrunk(Trunk trunk) {
        this.trunk = trunk;
    }
}
