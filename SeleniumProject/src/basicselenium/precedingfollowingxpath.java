package basicselenium;

public class precedingfollowingxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		https://www.flipkart.com/
			
			//following : /*//span[text()='Men']//following::a[text()='Shirts']*/
/* //preceding :  //a[text()='Suits & Blazers']//preceding::a[text()='Shirts'] */  

			//Note parent keyword ://a[text()='Suits & Blazers']//parent::* or use 
/*			//a[text()='Suits & Blazers']/..   */
			
			
/*			//a[text()='Suits & Blazers']/..//preceding-sibling::li/a[text()='Shirts'] */
			// here .. indicates parent.
			
			/* //a[text()='Shirts']//preceding::span[text()='Men'] */
			
			
			/* //a[text()='Top wear']/..//following-sibling::li/a[text()='Shirts'] */
			
/*			//a[text()='Shirts']/ancestor::*    */

			
			/* //a[text()='Shirts']/ancestor::li/span[text()='Men'] */
			
			
			/* //span[text()='Men']/../descendant::a[text()='Shirts'] */
			
	}

}
