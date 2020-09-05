package models;

public class BOOK {
		private String bkid;//bkid=book_id 
        private int bkqoh,bkprice;//bkqoh=book_quantity,bkprice=book_price 
        private String bkname,bksubject,bkauthor,bkref;//bkname=book_name, bksubject=book_subject, bkauthor=book_author,bkref=book_reference
          public BOOK() {
        	  this("B0001","C","C","Dennis","-",200,100);
          }
          public BOOK(String bid,String bn,String bs,String ba,String br,int bp,int bq){
        	  bkid=bid;
        	  bkname=bn;
        	  bksubject=bs;
        	  bkauthor=ba;
        	  bkref=br;
        	  bkprice=bp;
        	  bkqoh=bq;
          }
		public String getBkid() {
			return bkid;
		}
		public void setBkid(String bkid) {
			this.bkid = bkid;
		}
		public int getBkprice() {
			return bkprice;
		}
		public void setBkprice(int bkprice) {
			this.bkprice = bkprice;
		}
		public int getBkqoh() {
			return bkqoh;
		}
		public void setBkqoh(int bkqoh) {
			this.bkqoh = bkqoh;
		}
		public String getBkname() {
			return bkname;
		}
		public void setBkname(String bkname) {
			this.bkname = bkname;
		}
		public String getBksubject() {
			return bksubject;
		}
		public void setBksubject(String bksubject) {
			this.bksubject = bksubject;
		}
		public String getBkauthor() {
			return bkauthor;
		}
		public void setBkauthor(String bkauthor) {
			this.bkauthor = bkauthor;
		}
		public String getBkref() {
			return bkref;
		}
		public void setBkref(String bkref) {
			this.bkref = bkref;
		}
	  
}
