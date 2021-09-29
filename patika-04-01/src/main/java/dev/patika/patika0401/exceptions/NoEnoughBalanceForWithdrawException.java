package dev.patika.patika0401.exceptions;

public class NoEnoughBalanceForWithdrawException extends RuntimeException{
    public NoEnoughBalanceForWithdrawException(String message){
        super(message);
    }
}
