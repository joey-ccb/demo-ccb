package org.ccb.demo.DesignPattern.Factory.abstractFactory.demo;

/**
 * Created by cuicb on 2019/12/20.
 */
public class Product {
    private String BrandName;
    private String productType;

    public Product(String brandName, String productType) {
        BrandName = brandName;
        this.productType = productType;
    }

    public String getBrandName() {
        return BrandName;
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{\"Product\":{");
        sb.append("\"BrandName\":\"")
                .append(BrandName).append('\"');
        sb.append(",\"productType\":\"")
                .append(productType).append('\"');
        sb.append("}}");
        return sb.toString();
    }
}
