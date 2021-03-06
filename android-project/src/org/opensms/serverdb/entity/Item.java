/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensms.serverdb.entity;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * @author dewmal
 */
public class Item implements Serializable, EntityInterface<String> {


    private static final long serialVersionUID = 1L;
    private String itemId;
    private String name;
    private List<PreOrderHasItem> preOrderHasItemList;
    private List<Batch> batchList;
    private Profit defaultProfit;
    private Unit unit;
    private Category category;

    public Item() {
    }

    public Item(String itemId) {
        this.itemId = itemId;
    }

    public Item(String itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PreOrderHasItem> getPreOrderHasItemList() {
        return preOrderHasItemList;
    }

    public void setPreOrderHasItemList(List<PreOrderHasItem> preOrderHasItemList) {
        this.preOrderHasItemList = preOrderHasItemList;
    }

   public List<Batch> getBatchList() {
        return batchList;
    }

    public void setBatchList(List<Batch> batchList) {
        this.batchList = batchList;
    }

    public Profit getDefaultProfit() {
        return defaultProfit;
    }

    public void setDefaultProfit(Profit defaultProfit) {
        this.defaultProfit = defaultProfit;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.opensms.app.db.entity.Item[ itemId=" + itemId + " ]";
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String getId() {
        return this.itemId;
    }
}
