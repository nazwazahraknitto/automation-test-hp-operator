
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject



def static "reusablesteps.ReusableStep.LoginApps"(
    	String username	
     , 	String password	) {
    (new reusablesteps.ReusableStep()).LoginApps(
        	username
         , 	password)
}


def static "reusablesteps.ReusableStep.checkDataOrderisOpened"() {
    (new reusablesteps.ReusableStep()).checkDataOrderisOpened()
}

 /**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */ 
def static "helper.GlobalFunction.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new helper.GlobalFunction()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

 /**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */ 
def static "helper.GlobalFunction.getCurrentSessionMobileDriver"() {
    (new helper.GlobalFunction()).getCurrentSessionMobileDriver()
}


def static "helper.GlobalFunction.findTextUntilfound"(
    	String targetText	
     , 	int maxSwipe	) {
    (new helper.GlobalFunction()).findTextUntilfound(
        	targetText
         , 	maxSwipe)
}


def static "helper.GlobalFunction.tapContainText"(
    	String textToSearch	) {
    (new helper.GlobalFunction()).tapContainText(
        	textToSearch)
}
