package org.example.model;

import org.example.model.buildings.Building;
import org.example.model.people.Unit;

import java.util.ArrayList;
import java.util.HashMap;

public class MapCell {
    private Texture texture = Texture.BASE_GROUND;

    private final ArrayList<Unit> units = new ArrayList<>();

    private final ArrayList<Building> buildings = new ArrayList<>();

    private char cellState;

    private final HashMap<Resources, Integer> resources = new HashMap<>();

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void setCellState(char cellState) {
        this.cellState = cellState;
    }

    public char getCellState() {
        return cellState;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

    public HashMap<Resources, Integer> getResources() {
        return resources;
    }
    private Boolean hasTunnel;
    private Boolean isBurning;

    public Boolean getHasTunnel() {
        return hasTunnel;
    }

    public void setHasTunnel(Boolean hasTunnel) {
        this.hasTunnel = hasTunnel;
    }

    public Boolean getBurning() {
        return isBurning;
    }

    public void setBurning(Boolean burning) {
        isBurning = burning;
    }

    public boolean isBlocked(){
        if (texture == Texture.ROCK || texture == Texture.IRON || buildings.size() != 0 || isBurning == true ){
            return true;
        }
        return false;
    }
}
