package week5;

public class StarDatabase {

    public static void main(String[] args) {
        String[] names = new String[] { "Sirius", "Alpha Centauri", "Rigel",
                "Almaaz", "Luhman 16" };
        String[] ids = new String[] { "TYC 5949-2777-1", "TYC 9007-5849-1",
                "TYC 5331-1752-1", "TYC 2907-1275-1",
                "WISE J1049-5319A" };
        double[] distances = new double[] { 8.6, 4.37, 860, 2000, 6.589 };
        double[] apparentMagnitudes = new double[] { -1.46, -0.27, 0.13,
                2.92, 14.94 };
        String[] types = new String[] { "Main sequence", "Main sequence",
                "Blue supergiant", "Yellow supergiant",
                "Brown dwarf" };



        StarDatabase starDB = new StarDatabase();

        int databaseSize = starDB.databaseSize(ids);
        int rigelIndex = starDB.getIndexByID("TYC 5331-1752-1", ids);
        String displayNameRigel = starDB.getDisplayNameByID(2, names, types);
        int[] indexesCloser5 = starDB.getIndexesForDistance(5, distances);
        types = starDB.changeTypeAt(5, "Main Sequence", types);

    }

    public int databaseSize(String[] ids) {
        return ids.length;
    }

    public int getIndexByID(String id, String[] ids) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(id)) {
                return i;
            }
        }

        return -1;
    }

    public String getDisplayNameByID(int index, String[] names, String[] types) {
        String name = "Not Found";
        String type = "Not Found";

        if (names.length >= index - 1) {
            name = names[index];
        }

        if (types.length >= index - 1) {
            type = types[index];
        }

        return name + " (" + type + ")";
    }

    public int[] getIndexesForDistance(double distance, double[] distances) {
        /*Lässt vermutlich platz im Array, da nicht alle Sterne näher sind.
         Die Alternative wäre zuerst über das Array zu iterieren und überprüfen,
         wie viele Einträge auf das Kriterium passen und dann ein Array mit der perfekten Länge erstellen
         und erneut über alle Einträge iterieren und erneut prüfen,
         ob sie das Kriterium erfüllen und deren Index in dem Array speichern.*/
        int[] indexes = new int[distances.length];
        int index = 0;

        for (int i = 0; i < distances.length; i++) {
            if (distances[i] > distance) {
                indexes[index] = i;
                index++;
            }
        }

        return indexes;
    }

    public String[] changeTypeAt(int index, String newType, String[] types) {
        if (index >= types.length) {
            return types;
        }

        types[index] = newType;
        return types;
    }

}
