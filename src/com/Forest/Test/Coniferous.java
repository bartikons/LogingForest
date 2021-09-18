package com.Forest.Test;

import com.Forest.ConiferousTree;

class Coniferous extends ConiferousTree {

    @Override
    public void growLeaf() {

    }

    @Override
    public Object produceOxygen(Object light, Object Carbon) {
        return null;
    }

    @Override
    public void flowering() {

    }

    @Override
    public void TakingNutrientsFromTheSoil(Object soil) {
        setNutrient((Integer) soil);

    }

    @Override
    public void growRoot() {

    }

    @Override
    public void growTree() {

    }

    @Override
    public void growBranch() {

    }
}