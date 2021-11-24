package com.xworkz.java.bird;

public class BusRouteImplimentation implements BusRouteDAO {

	BusRouteDTO[] busRoute = new BusRouteDTO[5];
	private int count = 0;

	@Override
	public boolean saveDetails(BusRouteDTO dto) {
		System.out.println("invoked save method1");
		if (dto != null) {

			busRoute[count++] = dto;
			return true;
		} else {
			System.out.println("dto is null");
		}

		return false;
	}

	@Override
	public BusRouteDTO findDriverName(String name) {
		System.out.println("invoked find by name method");
		if (busRoute != null) {
			for (int i = 0; i < busRoute.length; i++) {
				BusRouteDTO ref = busRoute[i];
				if (ref != null) {
					String driverName = ref.getDrivername();

					if (name.equals(driverName)) {
						System.out.println(name + " is found");
						System.out.println("````````````````````````````");
					} else {
						System.out.println(name + " is not is found");
					}
				}
			}
		}
		return null;
	}

	@Override
	public BusRouteDTO deleteStartingPoint(String startingPoint) {
		System.out.println("invoked delete stating point method");
		if (busRoute != null) {
			for (int i = 0; i < busRoute.length; i++) {
				BusRouteDTO ref = busRoute[i];
				if (ref != null) {

					String point = ref.getStartPoint();
					if (point.equalsIgnoreCase(startingPoint)) {
						startingPoint = null;
						System.err.println(startingPoint);
					} else {
						System.out.println("no such starting point");
					}
				}

			}

		}
		System.out.println("bus route is null");
		return null;
	}

	@Override
	public void display() {
		System.out.println("``````````````````````````");

		System.out.println("invoked display method");

		if (busRoute != null) {

			for (int i = 0; i < busRoute.length; i++) {

				BusRouteDTO bus = busRoute[i];
				if (bus != null) {
					System.out.println(bus.getId());
					System.out.println(bus.getDrivername());
					System.out.println(bus.getStartPoint());
					System.out.println(bus.getDestination());
				}
			}
		}
		System.out.println("bus rooute dto is null");
	}

}
