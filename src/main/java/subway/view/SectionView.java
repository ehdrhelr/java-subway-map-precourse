package subway.view;

import subway.domain.Line;
import subway.domain.Section;
import subway.domain.SectionRepository;
import subway.domain.Station;
import subway.enums.SectionInfo;
import subway.enums.SectionMenu;

import java.util.Arrays;
import java.util.List;

public class SectionView {

    public static void printSectionMenu() {
        SectionMenu[] sectionMenu = SectionMenu.values();
        List<SectionMenu> menu = Arrays.asList(sectionMenu);
        menu.stream().map(SectionMenu::getTitle).forEach(System.out::println);
        System.out.println();
    }

    public static void printAskLineToEnrollStationOn() {
        System.out.println(SectionInfo.ASK_LINE_TO_ENROLL_STATION_ON.getInfo());
    }

    public static void printAskStationToEnrollOnLine() {
        System.out.println(SectionInfo.ASK_STATION_TO_ENROLL_ON_LINE.getInfo());
    }

    public static void printAskPosionToEnrollStation() {
        System.out.println(SectionInfo.ASK_POSITION_TO_ENROLL_STATION.getInfo());
    }

    public static void informSectionEnrolled() {
        System.out.println(SectionInfo.INFO_SECTION_ENROLLED.getInfo());
    }

    public static void printSectionList() {
        List<Section> sections = SectionRepository.sections();
        for (Section section : sections) {
            Line line = section.getLine();
            System.out.println(SectionInfo.INFO.getInfo() + line.getName());
            System.out.println(SectionInfo.INFO.getInfo() + "---");
            section.getStations().stream()
                    .map(Station::getName)
                    .forEach(name -> System.out.println(SectionInfo.INFO.getInfo() + name));
        }
    }
}
