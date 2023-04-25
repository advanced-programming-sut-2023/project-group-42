package org.example.model.buildings;

import org.example.model.Government;

public class FoodProcessBuilding extends Building{
    private final FoodProcessBuildingTypes type;
    public FoodProcessBuilding(FoodProcessBuildingTypes type, Government government, int HP) {
        super(government, HP);
        this.type = type;
    }

    public FoodProcessBuildingTypes getType() {
        return type;
    }
}
