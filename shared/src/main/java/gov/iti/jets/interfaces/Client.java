package gov.iti.jets.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

import gov.iti.jets.dto.ContactDto;
import gov.iti.jets.dto.MessageDto;
import gov.iti.jets.dto.UserDto;

public interface Client extends Remote{
    void helloBack() throws RemoteException;
    String getPhoneNumber() throws RemoteException;
    void reciveMessage(MessageDto Message) throws RemoteException;
    void userOnlineNotify(ContactDto contact) throws RemoteException;
    void userOfflineNotify(ContactDto contact) throws RemoteException;
    void userNotifyRequest(UserDto user) throws RemoteException;
    void userNotifyAcceptRequest(UserDto user) throws RemoteException;
    void recieveFile(String fileName, byte[] data) throws RemoteException;
    void userNotifyChangeHisProfile(UserDto contactDto) throws RemoteException;
}
