/******************************************************************************
PARKING LOT
*******************************************************************************/

public class ParkingLot
{
    private int[] slots;
    
    public Main(int big, int medium, int small)
    {
        slots = new int[]{big, medium, small};
    }
    
    public String addCar(int carType)
    {
        if(slots[carType-1]>0)
        {
            slots[carType-1]--;
            return "Added";
        }
        return "No Space Available";
    }
    
	public static void main(String[] args) {
	    
		ParkingLot park = new ParkingLot(1,1,0);
		System.out.println("Add Car at Big Car Slot : " + park.addCar(1));
		System.out.println("Add Car at Medium Car Slot : " + park.addCar(2));
		System.out.println("Add Car at Small Car Slot : " + park.addCar(3));
		System.out.println("Add Car at Big Car Slot : " + park.addCar(1));
		System.out.println("Add Car at Medium Car Slot : " + park.addCar(2));
	}
}
