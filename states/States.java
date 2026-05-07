public enum States {
    NORTHCENTRAL(new String[]{"Benue", "FCT", "Kogi", "Kwara", "Nassarawa", "Niger", "Plateau"}),
    SOUTHWEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo"}),
    NORTHWEST(new String[]{"Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo", "Kaduna", "Katsina", "Kano", "Kebbi", "Sokoto", "Jigawa"}),
    NORTHEAST(new String[]{"Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"}),
    SOUTHEAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTHSOUTH(new String[]{"Akwa-ibom", "Bayelsa", "Cross-River", "Delta", "Edo", "Rivers"});

    private String[] states;


    States(String[] states) {
        this.states = states;

    }

    public String[] getStates() {
        return states;
    }

    public static States findZoneByState(String userInput) {
        for (States zone : States.values()) {
            for (String state : zone.getStates()) {
                if (state.equalsIgnoreCase(userInput)) {
                    return zone;
                }
            }

        }
        return null;
    }
}
