package diaries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiaryTest {

    private Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary(
                "Marvel",
                "1234"
        );
    }


    @Test
    void diaryIsLockedByDefaultTest() {
        assertTrue(
                diary.isLocked()
        );
    }

    @Test
    void unlockDiaryTest() {
        diary.unlockDiary("1234");

        assertFalse(
                diary.isLocked()
        );
    }

    @Test
    void wrongPasswordThrowsExceptionTest() {

        assertThrows(
                IllegalArgumentException.class,
                () -> diary.unlockDiary("wrong")
        );
    }
}

//    @Test
//    void findEntryByIdTest() {
//        diary.unlockDiary("1234");

  //      diary.createEntry(
//                "Morning",
//                "Study Java"
//        );
//
//        Entry entry = diary.findEntryById(1);
//
//        assertEquals(
//                "Morning",
//                entry.getTitle()
//        );
//    }

//    }
