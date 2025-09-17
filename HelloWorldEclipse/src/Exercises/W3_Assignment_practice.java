//package Exercises;
//
//import java.util.*;
//
//
//class InternetPlans{
//	private String ispName;
//	private String  networkGen;
//	private String dailyLimit;
//	private String  speed;
//	private int price;
//	private int validity;
//	
//	InternetPlans(String ispName, String networkGen, String dailyLimit,String speed,  int price, int validity ){
//		this.ispName = ispName;
//		this.networkGen = networkGen;
//		this.dailyLimit = dailyLimit;
//		this.price = price;
//		this.speed = speed;
//		this.validity = validity;
//		
//	}
//	
//	public int getprice() {
//		return price;
//	}
//	
//	public String getspeed() {
//		return speed;
//	}
//	
//	public int getvalidity() {
//		return validity;
//	}
//	
//	public String getnetworkGen() {
//		return networkGen;
//	}
//
//	@Override
//	public String toString() {
//		return "InternetPlans [ispName=" + ispName + ", networkGen=" + networkGen + ", dailyLimit=" + dailyLimit
//				+ ", speed=" + speed + ", price= Rupees " + price + ", validity=" + validity + "Days" + "]";
//	}
//	
//}
//
//
//public class W3_Assignment_practice {
//
//	public static void main(String[] args) {
//		ArrayList<InternetPlans> isp = new ArrayList<>();
//		isp.add(new InternetPlans("Airtel", "4G", "1.5 GB/Day","10Mbps", 349, 28));
//		isp.add(new InternetPlans("Airtel", "4G","1.5 GB/Day", "10Mbps", 699, 56));
//		isp.add(new InternetPlans("Airtel", "4G","1.5 GB/Day", "10Mbps", 899, 84));
//		isp.add(new InternetPlans("Airtel", "5G","2 GB/Day", "100Mbps", 399, 28));
//		isp.add(new InternetPlans("Airtel", "5G","2 GB/Day", "100Mbps", 799, 56));
//		isp.add(new InternetPlans("Airtel", "5G","2 GB/Day", "100Mbps", 999, 84));
//		isp.add(new InternetPlans("Airtel", "6G","Unlimited", "500Mbps", 499, 28));
//		isp.add(new InternetPlans("Airtel", "6G","Unlimited", "500Mbps", 949, 56));
//		isp.add(new InternetPlans("Airtel", "6G","Unlimited", "500Mbps", 1399, 84));
//		
//		isp.add(new InternetPlans("Jio", "4G","Unlimited", "10Mbps", 849, 84));
//		isp.add(new InternetPlans("Jio", "5G","Unlimited", "500Mbps", 1299, 84));
//		
//		
//		
//		
//		int n = isp.size();
//	   Scanner sc = new Scanner(System.in);
//		int num ;
//		int p;
//		
//        Comparator<InternetPlans> priceCustomComp1 = Comparator.comparing(InternetPlans :: getprice);
//        Comparator<InternetPlans> priceCustomComp2 = Comparator.comparing(InternetPlans :: getprice).reversed();
//        Comparator<InternetPlans> speedCustomComp1 = Comparator.comparing(InternetPlans :: getspeed);
//        Comparator<InternetPlans> speedCustomComp2 = Comparator.comparing(InternetPlans :: getspeed).reversed();
//        Comparator<InternetPlans> validityCustomComp = Comparator.comparing(InternetPlans :: getvalidity);
//        Comparator<InternetPlans> networkGenCustomComp = Comparator.comparing(InternetPlans :: getnetworkGen);
//        
//	
////		
////		   System.out.println("Plans are : ");
////	        for (InternetPlans k : isp)
////	        System.out.println(k);
////	        
//        
//        System.out.println("In this App, User can do filtering and searching : ");
//        
//	        while(true) {
//	        	System.out.println("For filtering according to price low to high press 1 : ");
//	        	System.out.println("For filtering according to  price high to low press 2 : ");
//	        	System.out.println("For filtering according to speed low to high, press 3 : ");
//	        	System.out.println("For filtering according to speed high to low, press 4 : ");
//	        	System.out.println("For filtering according to validity, press 5 : ");
//	        	System.out.println("For filtering according to networkGen, press 6 : ");
//	         	System.out.println("For exiting the filtering process press 7 : ");
//	         	
//	         	num = sc.nextInt();
//	        	
//	        	if(num ==1) {
//	    			isp.sort(priceCustomComp1);
//	    	        
//	    	        System.out.println("Plans are : ");
//	    	        for (InternetPlans k : isp) {
//	    	        	 System.out.println(k);
//	    	        }
//	        	}
//	    	   else if(num ==2) {
//		    			isp.sort(priceCustomComp2);
//		    			   System.out.println("Plans are : ");
//			    	        for (InternetPlans k : isp) {
//			    	        	 System.out.println(k);
//			    	        }
//	    	        }
//	        	
//	    	        else if(num ==3) {
//	    	        	isp.sort(speedCustomComp1);
//		    			   System.out.println("Plans are : ");
//			    	        for (InternetPlans k : isp) {
//			    	        	 System.out.println(k);
//			    	        }
//	    	        }
//	    	        
//	        	
//	    	        else if(num ==4) {    
//		    			isp.sort(speedCustomComp2);
//		    			   System.out.println("Plans are : ");
//			    	        for (InternetPlans k : isp) {
//			    	        	 System.out.println(k);
//			    	        }
//	    	        }
//	        	
//	    	        else if(num ==5) {
//		    			isp.sort(validityCustomComp);
//		    			   System.out.println("Plans are : ");
//			    	        for (InternetPlans k : isp) {
//			    	        	 System.out.println(k);
//			    	        }
//	    	        }
//	        	
//	    	        else if(num ==6) {
//		    	          
//		    			isp.sort(networkGenCustomComp);
//		    			   System.out.println("Plans are : ");
//			    	        for (InternetPlans k : isp) {
//			    	        	 System.out.println(k);
//			    	        }
//	    	        }
//	    	        else if(num ==7) {
//	    	        	 System.out.println("Exiting the filtering proccess... ");
//	    	        	break;
//	        	}
//	    	        else {
//	                    System.out.println("Invalid choice, try again!");
//	                    continue;
//	    	        }
//	        }
//	        
//	
//	      //***********************************************************************************
//	        	
//	      while(true) {
//	    	  System.out.println("For Searching according to price press 1 : ");
//		      System.out.println("For searching according to speed press 2 : ");
//		       System.out.println("For searching according to validity press 3 : ");
//		       System.out.println("For exiting the process press 4 : ");
//		        	
//		        p = sc.nextInt();
//		        	
//	        	if(p == 1) {   
//	        				
//	        		while(true) {
//	        			System.out.println("Enter searching price press Y : ");
//	    	        	System.out.println("For exiting press N : ");
//	    	        	char pp;
//	    	        	pp= sc.next().charAt(0);
//	        			if(pp == 'Y') {
//	        				int x = sc.nextInt();
//	        				isp.sort(priceCustomComp1);
//
//		        			int index1 = Collections.binarySearch(isp, new InternetPlans("", "", "", "", x, 0), priceCustomComp1);
//		        			if(index1 >= 0 && index1 <n) {
//		        				   System.out.println("Binary search index: " + index1);
//				        	        System.out.println("Plan found: " + isp.get(index1));
//		        			}
//
//		        			else {
//		        				System.out.println("Not Found");
//		        				if(index1<0) {
//		        					int insertionpt = -(index1)-1;
//		        					int onebiggerindex = insertionpt;
//		        					int onesmallerindex = insertionpt - 1;
//		        					
//		        					if(onebiggerindex <n) 
//		        						 System.out.println("Possible are : " + isp.get(onebiggerindex));
//		        					
//		        					
//		        					if(onesmallerindex>=0) 
//		        						 System.out.println("Possible are : " + isp.get( onesmallerindex));
//		        					        					        					
//		        				}
//		        			} 
//	        			}
//	        			else if(pp == 'N') {
//	        				 System.out.println("Exiting price searching");
//	        				break;
//	        			}
//	        	
//	        		}
//	        	}
//	
//	        		else if(p ==2) {
//	        			
//	        			while(true) {
//		        			System.out.println("For searching speed press Y : ");
//		    	        	System.out.println("For exiting press N : ");
//		    	        	char pp;
//		    	        	pp= sc.next().charAt(0);
//		    	        	sc.nextLine();  
//		        			if(pp == 'Y') {
//		        				String x = sc.nextLine();
//		        				isp.sort(speedCustomComp1);
//			        			int index1 = Collections.binarySearch(isp, new InternetPlans("", "", "", x, 0,0 ), speedCustomComp1);
//			        			if(index1 >= 0 && index1 <n) {
//			        				   System.out.println("Binary search index: " + index1);
//					        	        System.out.println("Plan found: " + isp.get(index1));
//			        			}
//
//			        			else {
//			        				System.out.println("Not Found");
//			        				if(index1<0) {
//			        					int insertionpt = -(index1)-1;
//			        					int onebiggerindex = insertionpt;
//			        					int onesmallerindex = insertionpt - 1;
//			        					
//			        					if(onebiggerindex <n) 
//			        						 System.out.println("Possible are : " + isp.get(onebiggerindex));
//			        					
//			        					
//			        					if(onesmallerindex>=0) 
//			        						 System.out.println("Possible are : " + isp.get( onesmallerindex));
//			        					        					        					
//			        				}
//			        			} 
//		        			}
//		        			else if(pp == 'N') {
//		        				 System.out.println("Exiting speed searching");
//		        				break;
//		        			}
//		        	
//		        		}
//	        			
//	        		}
//	        		else if(p ==3) {
//	        			
//	        			while(true) {
//		        			System.out.println("For searching validity press Y : ");
//		    	        	System.out.println("For exiting press N : ");
//		    	        	char pp;
//		    	        	pp= sc.next().charAt(0);
//		        			if(pp == 'Y') {
//		        			  int x =  sc.nextInt();
//		        				isp.sort(validityCustomComp);
//			        			int index1 = Collections.binarySearch(isp, new InternetPlans("", "", "", "", 0, x ), validityCustomComp );
//			        			if(index1 >= 0 && index1 <n) {
//			        				   System.out.println("Binary search index: " + index1);
//					        	        System.out.println("Plan found: " + isp.get(index1));
//			        			}
//
//			        			else {
//			        				System.out.println("Not Found");
//			        				if(index1<0) {
//			        					int insertionpt = -(index1)-1;
//			        					int onebiggerindex = insertionpt;
//			        					int onesmallerindex = insertionpt - 1;
//			        					
//			        					if(onebiggerindex <n) 
//			        						 System.out.println("Possible are : " + isp.get(onebiggerindex));
//			        					
//			        					
//			        					if(onesmallerindex>=0) 
//			        						 System.out.println("Possible are : " + isp.get( onesmallerindex));
//			        					        					        					
//			        				}
//			        			} 
//		        			}
//		        			else if(pp == 'N') {
//		        				 System.out.println("Exiting validity searching");
//		        				break;
//		        			}
//		        	
//		        		}
//	        			
//	        		}
//	        		
//	        		else if(p ==4) {
//	        			 System.out.println("Exiting the searching proccess... ");
//		    	        	break;
//	        		}
//
//	        }
//
//	}
//	}
//
//
//
//
//
//
//
//
//
////while(true) {
////	  System.out.println("For searching according to price press 1 : ");
////      System.out.println("For searching according to speed press 2 : ");
////       System.out.println("For searching according to validity press 3 : ");
////       System.out.println("For exiting the process press 4 : ");
////        	
////        p = sc.nextInt();
////        	
////    	if(p == 1) {   
////    				
////    		while(true) {
////    			
////    			System.out.println("For searching price press 11 : ");
////	        	System.out.println("For exiting press 10 : ");
////	        	int pp;
////	        	pp= sc.nextInt();
////    			if(pp == 11) {
////    				int x = sc.nextInt();
////        			int index1 = Collections.binarySearch(isp, new InternetPlans("", "", "", "", x, 0), priceCustomComp1);
////        			if(index1 >= 0 && index1 <=n) {
////        				   System.out.println("Binary search index: " + index1);
////		        	        System.out.println("Student found: " + isp.get(index1));
////        			}
////        			else {
////        				if(index1<0) {
////        					int insertionpt = -(index1)-1;
////        					int onebiggerindex = insertionpt;
////        					int onesmallerindex = insertionpt - 1;
////        					
////        					if(onebiggerindex <n) 
////        						 System.out.println("Possible are : " + isp.get(onebiggerindex));
////        					
////        					
////        					if(onesmallerindex>=0) 
////        						 System.out.println("Possible are : " + isp.get( onesmallerindex));
////        					        					        					
////        				}
////        			} 
////    			}
////    			else if(pp == 10) {
////    				 System.out.println("Exiting price searching");
////    				break;
////    			}
////    	
////    		}
////    		
////    	}
////    	
////    	
////    		
////    		
////    		else if(num ==2) {
////    			
////    		}
////    		else if(num ==3) {
////    			
////    		}
////    		
////    		else if(num ==4) {
////    			 System.out.println("Exiting the searching proccess... ");
////    	        	break;
////    		}
////    		else {
////                System.out.println("Invalid choice, try again!");
////                continue;
////    	}
////    }
//
