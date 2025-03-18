package pcd.lab04.monitors.ex_barrier;

/*
 * Barrier - to be implemented
 */
public class BarrierWorking implements Barrier {

	private int waiting=0;
	private int max;

	public BarrierWorking(int nParticipants) {
		this.max=nParticipants;
	}
	
	@Override
	synchronized public void hitAndWaitAll() throws InterruptedException {
		waiting++;
		while(waiting!=max){
			this.wait();
		}
		this.notifyAll();
	}

	
}
