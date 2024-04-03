package collectionsAndGenericAssgn;

public class FriendFinderLoc {
	public static void main(String[] args) {
		// Usage with String (name) and String (location)        
		FriendshipCriteria<String, String> locFrnd1 = new FriendshipCriteria<>("Roshika", "Nuzvid");
        FriendshipCriteria<String, String> locFrnd2 = new FriendshipCriteria<>("Joseph", "Chennai");
        
        //Compare friends based on location
        if (locFrnd1.getVariable().compareTo(locFrnd2.getVariable()) == 0) {
        	System.out.println(locFrnd1.getName() + " and " + locFrnd2.getName() + " are in the same location.");
	    } else {
	        System.out.println(locFrnd1.getName() + " and " + locFrnd2.getName() + " are in different locations.");
	    }
	}
}
