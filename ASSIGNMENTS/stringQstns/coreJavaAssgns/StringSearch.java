package coreJavaAssgns;

public class StringSearch extends AbstractSearch {

	  @Override
	    public boolean search(Object[] obj_list, Object obj) {
	        if (obj instanceof String) {
	            String target = (String) obj;
	            for (Object item : obj_list) {
	                if (item instanceof String && item.equals(target)) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	}