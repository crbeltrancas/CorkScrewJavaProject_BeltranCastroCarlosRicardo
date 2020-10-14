/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_corkscrew_homework;

/**
 *Smart Corkscrew Homework. 
 * Methodology of Programming 2
 * @author Beltran Castro Carlos Ricardo
 * Neptun code: VY6V8S
 */
class newCorkscrew {
    trystatic static {
            // 1
                 LocalDevice localDevice = LocalDevice.getLocalDevice(); // find the local divice though bluetooth
 
            // 2
                 DiscoveryAgent agent = localDevice.getDiscoveryAgent(); // Discover new device 
             
            // 3
                 agent.startInquiry(DiscoveryAgent.GIAC, new Smart_Corkscrew_Homework.MyDiscoveryCorkScrew()); // try to stablish connection to device
 
             // start location to connect to device 
                try { 
                     Object lock = null;
                     synchronized(lock){ 
                        lock.wait();
                    }
                }
                catch (InterruptedException lockDevice) {
                }
                System.out.println("Device Inquiry Completed. ");
            }
            catch (Exception e) static {
            }

    private static class trystatic {

        public trystatic() {
        }
    }
}
