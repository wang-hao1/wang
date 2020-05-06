package com.wh.Demo;


/**
 * 
 * @author wh
 * @date   2020年5月6日
 */
public class TicketPrice {

	public static void main(String[] args) {
		Ticket ticket=new Ticket("G207","二等座","无锡");
		String psite=ticket.getPassengerSite();
		String[] site={"南京","镇江","丹阳","常州","无锡","苏州","上海"};
		String[] seat={"一等座","二等座"};
		
		if (ticket.getPassengerSeat()==seat[0]){
			double ticketPrice1=firstClassSeat(site,psite);
			System.out.println("车票信息");
			System.out.println("高铁车次:"+ticket.getHighSpeedRailNum());
			System.out.println("目的地:"+ticket.getPassengerSite());
			System.out.println("座位"+ticket.getPassengerSeat()+"价格:"+ticketPrice1);
		}else if(ticket.getPassengerSeat()==seat[1]){
			double ticketPrice2=secondClassSeat(site,psite);
			System.out.println("车票信息");
			System.out.println("高铁车次:"+ticket.getHighSpeedRailNum());
			System.out.println("目的地:"+ticket.getPassengerSite());
			System.out.println("座位"+ticket.getPassengerSeat()+"价格:"+ticketPrice2);
		}
	}
	
	public static double firstClassSeat(String[] site,String psite){
		double ticketPrice=0;
		double[] firstClassSeat={0,44.5,64.5,99.5,129.5,159.5,219.5};
		for(int i=0;i<firstClassSeat.length-1;i++){
			if(psite.equals(site[i])){
				ticketPrice=firstClassSeat[i];
			}
		}
		return ticketPrice;
	}
	
	public static double secondClassSeat(String[] site,String psite){
		double ticketPrice=0;
		double[] secondClassSeat={0,29.5,39.5,64.5,79.5,99.5,139.5};
		for(int i=0;i<secondClassSeat.length-1;i++){
			if(psite.equals(site[i])){
				ticketPrice=secondClassSeat[i];
			}
		}
		return ticketPrice;
	}

}
