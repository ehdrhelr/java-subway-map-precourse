package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        stations.add(station);
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    public static boolean isNameDuplication(String name) {
        return stations.stream()
                .map(Station::getName)
                .anyMatch(station -> station.equals(name));
    }

    public static boolean isNameLengthUnder2(String name) {
        return name.trim().length() < 2;
    }

    public static Station getStationByName(String name) {
        return stations.stream()
                .filter(station -> station.getName().equals(name))
                .findFirst()
                .get();
    }
}
