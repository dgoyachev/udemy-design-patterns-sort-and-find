package com.calltouch.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ColorObjectFactory {
    Map<String, IColor> colors = new HashMap<>();

    public int total() {
        return colors.size();
    }

    public IColor getColor(String name) {
        if(colors.containsKey(name)) {
            return colors.get(name);
        }
        else {
            switch (name) {
                case "Red":
                    colors.put("Red", new Red());
                    return colors.get("Red");
                case "Blue":
                    colors.put("Blue", new Blue());
                    return colors.get("Blue");
                case "Green":
                    colors.put("Green", new Green());
                    return colors.get("Green");
            }
        }

        return null;
    }
}
