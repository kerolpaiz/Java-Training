public class MindstickModem implements modem {
                    
                	public boolean open() {

                             // implementation
                        System.out.println("Open");
                			return true;

                     }

                     public boolean close() {

                             // implementation
                        System.out.println("Close");
                			return true;
                     }

                     public int read() {

                             // implementation
                        System.out.println("Read");
                			return 2;
                     }

                     public int write() {

                             // implementation
                        System.out.println("Write");
                			return 1;
                     }
                


    public static void main (String args[]){
    modem modem = new MindstickModem();
    modem.open();
    modem.write();
    modem.read();
    modem.close();
    }
}
