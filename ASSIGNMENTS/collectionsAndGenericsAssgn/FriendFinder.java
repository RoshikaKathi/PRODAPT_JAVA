package collectionsAndGenericAssgn;

class FriendFinder {
    public static void main(String[] args) {
        // Usage with String (name) and Integer (age)        
    	FriendshipCriteria<String, Integer> frnd1 = new FriendshipCriteria<>("Roshika", 21);
        FriendshipCriteria<String, Integer> frnd2 = new FriendshipCriteria<>("Joseph", 23);

        // Compare friends based on age
        if (frnd1.getVariable().compareTo(frnd2.getVariable()) > 0) {
            System.out.println(frnd1.getName() + " is older than " + frnd2.getName());
        } else {
            System.out.println(frnd1.getName() + " is younger than " + frnd2.getName());
        }
    }
}