package dev.patika.patika0401.exceptions;

public class WalletAlreadyExistsException extends RuntimeException {
    public WalletAlreadyExistsException(String msg){
        super(msg);
    }

}
