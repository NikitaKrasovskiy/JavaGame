package com.cherigra;

import com.cherigra.piece.Pawn;
import com.cherigra.piece.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Piece> pieces = new HashMap<>();

    public void setPieces(Coordinates coordinates, Piece piece) {
        piece.coordinates = coordinates; // обновляем кординаты
        pieces.put(coordinates, piece); // жобавление фигуры по кординате
    }

    public void setupDefaultPiecesPositions() {
         for (File file : File.values()) {
             setPieces(new Coordinates(file, 2), new Pawn(Color.WHITE,new Coordinates(file, 2)));
             setPieces(new Coordinates(file, 7), new Pawn(Color.BLACK,new Coordinates(file, 7)));
         }
    }
}
