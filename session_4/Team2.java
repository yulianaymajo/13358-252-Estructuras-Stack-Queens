public class Team2 {

    private String name;
    private int stars;
    private int intlParticipations;
    private int intlFinals;
    private int localFinals;
    private long fans;
    private double marketValue;
    private double payroll;

    public Team2() {}

    public Team2(String name, int stars, int intlParticipations, 
        int intlFinals, int localFinals, long fans, 
        double marketValue, double payroll) {

        this.name = name;
        this.stars = stars;
        this.intlParticipations = intlParticipations;
        this.intlFinals = intlFinals;
        this.localFinals = localFinals;
        this.fans = fans;
        this.marketValue = marketValue;
        this.payroll = payroll;
    }

    //INSERTION
    public final static void sortByStars(Team2[] teams) {
        int N = teams.length;
        int i = 1;

        while (i < N) {
            Team2 current = teams[i];
            int currentKey = teams[i].stars;
            int j = i - 1;

            while (j >= 0 && teams[j].stars > currentKey) {
                teams[j + 1] = teams[j];
                j = j - 1;
            }
            teams[j + 1] = current;
            i = i + 1;
        }
    }

    //INSERTION
    public final static void sortByintlParticipations(Team2[] teams) {
        int N = teams.length;
        for (int i = 1; i < N; i++) {
            Team2 current = teams[i];
            int key = current.intlParticipations;
            int j = i - 1;
            while (j >= 0 && teams[j].intlParticipations > key) {
                teams[j + 1] = teams[j];
                j--;
            }
            teams[j + 1] = current;
        }
    }

    //INSERTION
    public final static void sortByintlFinals(Team2[] teams) {
        int N = teams.length;
        for (int i = 1; i < N; i++) {
            Team2 current = teams[i];
            int key = current.intlFinals;
            int j = i - 1;
            while (j >= 0 && teams[j].intlFinals > key) {
                teams[j + 1] = teams[j];
                j--;
            }
            teams[j + 1] = current;
        }
    }

    //BUBBLE
    public final static void sortBylocalFinals(Team2[] teams) {
        int N = teams.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (teams[j].localFinals > teams[j + 1].localFinals) {
                    Team2 temp = teams[j];
                    teams[j] = teams[j + 1];
                    teams[j + 1] = temp;
                }
            }
        }
    }

    //BUBBLE
    public final static void sortByFans(Team2[] teams) {
        int N = teams.length;
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (teams[j].fans > teams[j + 1].fans) {
                    Team2 temp = teams[j];
                    teams[j] = teams[j + 1];
                    teams[j + 1] = temp;
                }
            }
        }
    }

    //SELECTION
    public final static void sortByMarketValue(Team2[] teams) {
        int N = teams.length;
        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (teams[j].marketValue < teams[minIndex].marketValue) {
                    minIndex = j;
                }
            }
            Team2 temp = teams[i];
            teams[i] = teams[minIndex];
            teams[minIndex] = temp;
        }
    }

    //SELECTION
    public final static void sortByPayroll(Team2[] teams) {
        int N = teams.length;
        for (int i = 0; i < N - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (teams[j].payroll < teams[minIndex].payroll) {
                    minIndex = j;
                }
            }
            Team2 temp = teams[i];
            teams[i] = teams[minIndex];
            teams[minIndex] = temp;
        }
    }

    // MAIN
    public final static void main(String[] args) {

        Team2 t1 = new Team2("Once Caldas",         4, 3, 3,  6, 1_800_000L, 11.5,  4.5);
        Team2 t2 = new Team2("Atlético Nacional",  18, 7,13, 30,11_591_000L, 25.3, 12.0);
        Team2 t3 = new Team2("Millonarios",        16, 4, 2, 26, 8_996_000L, 15.8, 10.0);

        Team2[] teams = {t1, t2, t3};
        
        System.out.println("=== Ordenado por Stars (Insertion) ===");
        sortByStars(teams);
        printer(teams);

        System.out.println("=== Ordenado por Intl Participations (Insertion) ===");
        sortByintlParticipations(teams);
        printer(teams);

        System.out.println("=== Ordenado por Intl Finals (Insertion) ===");
        sortByintlFinals(teams);
        printer(teams);

        System.out.println("=== Ordenado por Local Finals (Bubble) ===");
        sortBylocalFinals(teams);
        printer(teams);

        System.out.println("=== Ordenado por Fans (Bubble) ===");
        sortByFans(teams);
        printer(teams);

        System.out.println("=== Ordenado por Market Value (Selection) ===");
        sortByMarketValue(teams);
        printer(teams);

        System.out.println("=== Ordenado por Payroll (Selection) ===");
        sortByPayroll(teams);
        printer(teams);
    }

    public static final void printer(Team2[] teams) {
        String header = String.format(
                "%-22s %6s %6s %8s %9s %12s %14s %12s",
                "Team","Stars","Intl","IntlFin","LocalFin","Fans","MarketValue","Payroll"
        );
        String sep = "-".repeat(header.length());
        System.out.println(header);
        System.out.println(sep);

        for (Team2 t : teams) {
            String fansStr = java.text.NumberFormat
                    .getInstance(java.util.Locale.US)
                    .format(t.fans); // 1,234,567
            System.out.printf("%-22s %6d %6d %8d %9d %12s %14s %12s%n",
                    t.name,
                    t.stars,
                    t.intlParticipations,
                    t.intlFinals,
                    t.localFinals,
                    fansStr,
                    String.format("%.2fM", t.marketValue),
                    String.format("%.2fM", t.payroll)
            );
        }
        System.out.println(sep);
    }
}
