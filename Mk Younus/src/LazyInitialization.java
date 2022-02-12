import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

enum CarType {
	none, Audi, BMW
}

class Car {
	private static Map<CarType, Car> types = new HashMap<>();

	private Car(CarType type) {

	}

	public static Car getCarByTypeName(CarType type) {
		Car Car;
		if (!types.containsKey(type)) {

			// Lazy initialization
			Car = new Car(type);
			types.put(type, Car);
		} else {
			Car = types.get(type);
		}
		return Car;
	}

	public static Car getCarByTypeNameHCV(CarType type) {
		if (!types.containsKey(type)) {
			synchronized (types) {
				// check again after having acquird the lock to make sure
				// the instance was not created meanwhile by another thread
				if (!types.containsKey(type)) {
					// lazy initialization
					types.put(type, new Car(type));
				}
			}
		}
		return types.get(type);
	}

	public static void showAll() {
		if (types.size() > 0) {
			System.out.println("Numbr of instance made = " + types.size());

			for (Entry<CarType, Car> entry : types.entrySet()) {
				String Car = entry.getKey().toString();
				Car = Character.toUpperCase(Car.charAt(0)) + Car.substring(1);
				System.out.println(Car);
			}
			System.out.println();
		}
	}
}

public class LazyInitialization {

	public static void main(String[] args) {
		Car.getCarByTypeName(CarType.Audi);
		Car.showAll();

		Car.getCarByTypeNameHCV(CarType.BMW);
		Car.showAll();
		Car.getCarByTypeName(CarType.none);
		Car.showAll();

	}

}
