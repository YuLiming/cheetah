package rpc.demo.rpc.provider;

/**
 * @Author:Roy
 * @Date: Created in 17:10 2017/12/3 0003
 */
public interface HelloRpcService {

    public void sayHello(String message, int tt);

    public void addMessage (String message);

    public String getHello();
    
    public int callException(boolean exception);

    public void printList ();

    public void printListSize();
}
