import java.util.*;
abstract class Piece{
    private int x;
    private int y;
    abstract boolean isLegalMove();
}

class Rook extends Piece{
    private int i1;
    private int j1;
    private int i2;
    private int j2;
    Rook(){
    }
    Rook(int i1, int j1, int i2, int j2){
        this.i1 = i1;
        this.i2 = i2;
        this.j1 = j1;
        this.j2 = j2;
    }
    public void setPosition(int newI1, int newJ1, int newI2, int newJ2){
        this.i1 = newI1;
        this.i2 = newI2;
        this.j1 = newJ1;
        this.j2 = newJ2;
    }

    @Override
    boolean isLegalMove() {
        if((this.i1 == this.i2 && this.j1 != this.j2) || (this.i1 != this.i2 && this.j1 == this.j2)) return true;
        return false;
    }
}

class King extends Piece{
    private int i1;
    private int j1;
    private int i2;
    private int j2;
    King(){
    }
    King(int i1, int j1, int i2, int j2){
        this.i1 = i1;
        this.i2 = i2;
        this.j1 = j1;
        this.j2 = j2;
    }
    public void setPosition(int newI1, int newJ1, int newI2, int newJ2){
        this.i1 = newI1;
        this.i2 = newI2;
        this.j1 = newJ1;
        this.j2 = newJ2;
    }

    @Override
    boolean isLegalMove() {
        if(this.i1 == this.i2){
            if((this.j1 == this.j2 - 1) || (this.j1 == this.j2 + 1)) return true;
        }
        else if(this.j1 == this.j2){
            if ((this.i1 == this.i2 - 1) || (this.i1 == this.i2 + 1)) return true;
        }
        return false;
    }
}

class Pawn extends Piece{
    private int i1;
    private int j1;
    private int i2;
    private int j2;
    Pawn(){
    }
    Pawn(int i1, int j1, int i2, int j2){
        this.i1 = i1;
        this.i2 = i2;
        this.j1 = j1;
        this.j2 = j2;
    }
    public void setPosition(int newI1, int newJ1, int newI2, int newJ2){
        this.i1 = newI1;
        this.i2 = newI2;
        this.j1 = newJ1;
        this.j2 = newJ2;
    }

    @Override
    boolean isLegalMove() {
        if(this.i1 == this.i2 && this.j1 == this.j2 - 1) return true;
        return false;
    }
}

class Knight extends Piece{
    private int i1;
    private int j1;
    private int i2;
    private int j2;
    Knight(){
    }
    Knight(int i1, int j1, int i2, int j2){
        this.i1 = i1;
        this.i2 = i2;
        this.j1 = j1;
        this.j2 = j2;
    }
    public void setPosition(int newI1, int newJ1, int newI2, int newJ2){
        this.i1 = newI1;
        this.i2 = newI2;
        this.j1 = newJ1;
        this.j2 = newJ2;
    }

    @Override
    boolean isLegalMove() {

        return false;
    }
}

class Bishop extends Piece{
    private int i1;
    private int j1;
    private int i2;
    private int j2;
    Bishop(){
    }
    Bishop(int i1, int j1, int i2, int j2){
        this.i1 = i1;
        this.i2 = i2;
        this.j1 = j1;
        this.j2 = j2;
    }
    public void setPosition(int newI1, int newJ1, int newI2, int newJ2){
        this.i1 = newI1;
        this.i2 = newI2;
        this.j1 = newJ1;
        this.j2 = newJ2;
    }

    @Override
    boolean isLegalMove() {

        return false;
    }
}

class Queen extends Piece{
    private int i1;
    private int j1;
    private int i2;
    private int j2;
    Queen(){
    }
    Queen(int i1, int j1, int i2, int j2){
        this.i1 = i1;
        this.i2 = i2;
        this.j1 = j1;
        this.j2 = j2;
    }
    public void setPosition(int newI1, int newJ1, int newI2, int newJ2){
        this.i1 = newI1;
        this.i2 = newI2;
        this.j1 = newJ1;
        this.j2 = newJ2;
    }

    @Override
    boolean isLegalMove() {

        return false;
    }
}