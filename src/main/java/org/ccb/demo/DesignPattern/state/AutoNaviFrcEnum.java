package org.ccb.demo.DesignPattern.state;

import java.util.Arrays;

/**
 * Created by cuicb on 2017/9/5.
 */
public enum AutoNaviFrcEnum {
    /**
     * 高速路(41000)
     */
    HIGH_SPEED_WAY(1),
    /**
     * 国道(42000)
     */
    NATIONAL_WAY(2),
    /**
     * 城市快速路(43000)
     */
    CITY_FAST_WAY(3),
    /**
     * 主要道路(44000)
     */
    MAIN_ROAD(4),
    /**
     * 次要道路(45000)
     */
    SECONDARY_ROAD(5),
    /**
     * 普通道路(47000)
     */
    ORDINARY_ROAD(6),
    /**
     * 省道(51000)
     */
    PROVINCE_ROAD(7),
    /**
     * 县道(52000)
     */
    COUNTY_ROAD(8),
    /**
     * 乡公路(53000)
     */
    RURAL_ROAD(9),
    /**
     * 县乡村内部道路(54000)
     */
    COUNTRY_INNER_ROAD(10),
    /**
     * 小路(49)
     */
    PATHWAYS(11);

    private int value;

    AutoNaviFrcEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    /**
     * Transform nds frc enum.
     *
     * @param autoNaviFrc the auto navi frc
     * @return the nds frc enum
     */
    public static AutoNaviFrcEnum getName(int autoNaviFrc) {
        return Arrays.stream(AutoNaviFrcEnum.values())
                .filter(values -> values.getValue() == autoNaviFrc)
                .findFirst().get();
    }

    public static void main(String[] args) {
        System.out.println(AutoNaviFrcEnum.getName(1));
    }
}
