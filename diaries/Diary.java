package diaries;
import java.util.ArrayList;
import java.util.List;



    public class Diary {

        private String userName;
        private String passWord;
        private boolean isLocked = true;
        private List<Entry> entries = new ArrayList<>();
        private int idCounter = 1;


        public Diary(String userName, String passWord) {
            this.userName = userName;
            this.passWord = passWord;
        }

        public String getUserName() {
            return userName;
        }
        public void unlockDiary(String passWord) {
            if(!this.passWord.equals(passWord)) {
                throw new IllegalArgumentException("Incorrect Password");
            }
            isLocked = false;
        }
        public void lockDiary() {
            isLocked = true;
        }

        public boolean isLocked() {
            return isLocked;
        }

        public Entry findEntryById(int id) {
            for(Entry entry : entries) {
                if(entry.getId() == id) {
                    return entry;
                }
            }
            return null;
        }
}
