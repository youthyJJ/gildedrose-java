package com.gildedrose;

public class Sulfuras extends Item {

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS_HAND_OF_RAGNAROS, sellIn, quality);
    }

    @Override
    public boolean isSulfuras() {
        return true;
    }

    @Override
    public void updateSellIn() {

    }

    @Override
    public void udpateQuality() {

    }

    @Override
    public void updateQualityAfterExpiration() {

    }
}
