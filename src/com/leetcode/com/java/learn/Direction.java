package com.leetcode.com.java.learn;

import java.util.HashMap;
import java.util.Map;

public enum Direction
{
    // enum fields
    EAST {
        @Override
        public String printDirection() {
            String message = "You are moving in east. You will face sun in morning time.";
            return message;
        }
    },
    WEST {
        @Override
        public String printDirection() {
            String message = "You are moving in west. You will face sun in evening time.";
            return message;
        }
    },
    NORTH {
        @Override
        public String printDirection() {
            String message = "You are moving in north. You will face head in daytime.";
            return message;
        }
    },
    SOUTH {
        @Override
        public String printDirection() {
            String message = "You are moving in south. Sea ahead.";
            return message;
        }
    };

    public abstract String printDirection();

    public static void main(String[] args) {
        System.out.println(Direction.valueOf("SOUTH"));
    }
}
