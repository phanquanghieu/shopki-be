package com.laptrinhweb.shopkibe.responses;

import com.laptrinhweb.shopkibe.dtos.WareHouseDTO;

import java.util.List;

public class WareHouseResponse {
    public List<WareHouseDTO> getWareHouses() {
        return wareHouses;
    }

    public WareHouseResponse(List<WareHouseDTO> wareHouses) {
        this.wareHouses = wareHouses;
    }

    public void setWareHouses(List<WareHouseDTO> wareHouses) {
        this.wareHouses = wareHouses;
    }

    private List<WareHouseDTO> wareHouses;

}
