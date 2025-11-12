/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iHungryBurgerShop;

/**
 *
 * @author Shameel Shajaad
 */
public class BurgerOrder {

    private String BurgerID;
    private String customerID;
    private String customerName;
    private int burgerQty;
    private double total;
    private int status;

    /**
     * @return the BurgerID
     */
    public String getBurgerID() {
        return BurgerID;
    }

    /**
     * @param BurgerID the BurgerID to set
     */
    public void setBurgerID(String BurgerID) {
        this.BurgerID = BurgerID;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the burgerQty
     */
    public int getBurgerQty() {
        return burgerQty;
    }

    /**
     * @param burgerQty the burgerQty to set
     */
    public void setBurgerQty(int burgerQty) {
        this.burgerQty = burgerQty;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

}
