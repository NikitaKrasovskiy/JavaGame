package com.cherigra.piece;

import com.cherigra.Color;
import com.cherigra.Coordinates;

abstract public class Piece {
    public final Color color;

    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
    }
}
