package R15;
// R15Room Assignment
// Author: Bogdan A Vasilchenko
//   Date: Apr 10, 2019
//  Class: CS164
//  Email: vba@cs.colostate.edu
public class R15Room implements R15Interface {
	protected int roomBeds;
	protected boolean roomMonitor;
	/**
	 * 
    An int called roomBeds to hold the number of beds
    A boolean called roomMonitor that describes whether the room has a heart monitor 
     **/
	/*
	 * Method - R15Init
	 * precondition - 0 <= roomType <= 2
	 * postcondition - room initialized with the correct attributes.
	 * 		Type 0 - has 1 bed and a heart monitor
	 * 		Type 1 - has 2 beds and a heart monitor
	 * 		Type 2 - has 1 bed and no heart monitor
	 */
	
	public R15Room() {
		
		
	}
	public void R15Init(int roomType) 
	{
		switch(roomType) {
		case 0:
			this.roomBeds = 1;
			this.roomMonitor = true;
			break;
		case 1:
			this.roomBeds = 2;
			this.roomMonitor = true;
			break;
		case 2:
			this.roomBeds = 1;
			this.roomMonitor = false;
			break;
	
	
		
		}
	}

	/*
	 * Method - checkRoom
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Precondition - needsMonitor is set to t/f based on the need for a heart monitor
	 * Precondition - needsSingle is set to t/f based on the need for a Single Room
	 * Postcondition - returns true if the necessary equipment is available.  
	 * 			Note, if the patient does not need a heart monitor, we want to save 
	 * 			it for someone that does need it - same with the single bed.  This
	 * 			means the requirements should directly match the room.
	 */
	public boolean checkRoom(boolean needsMonitor, boolean needsSingle) {
		boolean everythingOk = true;
		if ((needsMonitor && !roomMonitor) || (needsSingle && roomBeds != 1) ||
				(!needsMonitor && roomMonitor) || (!needsSingle && roomBeds == 1)) {
			everythingOk = false;
		}
		return everythingOk;
	}

	/*
	 * Method - getRoomBeds()
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Postcondition - returns the number of beds in the room.
	 */
	public int getRoomBeds() {
		return this.roomBeds;
	}

	/*
	 * Method - setRoomBeds(int numBeds)
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Postcondition - sets the number of beds in the room to numBeds. 
	 */
	public void setRoomBeds(int numBeds) {
		this.roomBeds = numBeds;
	}


	/*
	 * Method - getRoomMonitor()
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Postcondition - returns true if the room has a heart monitor, false if not.
	 */
	public boolean getRoomMonitor() {
		return this.roomMonitor;
	}

	/*
	 * Method - setRoomMonitor(boolean hasMonitor)
	 * Precondition - this room has been initialized to its appropriate attributes
	 * Postcondition - sets value of whether the room has a heart monitor appropriately.
	 */
	public void setRoomMonitor(boolean hasMonitor) {
		this.roomMonitor = hasMonitor;
	}



}
