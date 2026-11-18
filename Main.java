void main() {

    String[] months = {"JAN", "FEB", "MAR"};
    String[] movies = {"Napoleon", "Oppenheimer"};
    int[][] tickets = {{3000, 1500, 1700},
                       {3500, 1200, 1600}};

    int[] totalSales = new int[movies.length];

    System.out.println("MOVIE TICKET SALES REPORT - 2024");
    System.out.println("");

    System.out.printf("%-20s", "");
    for (int i = 0; i < months.length; i++) {
        System.out.printf("%-15s", months[i]);
    }
    System.out.println("");
    System.out.println("--------------------------------------------------------------------");

    // Print the table rows and calculate each movie's total
    for (int i = 0; i < tickets.length; i++) {
        System.out.printf("%-20s", movies[i]);

        for (int j = 0; j < tickets[i].length; j++) {
            System.out.printf("%-15d", tickets[i][j]);
            totalSales[i] += tickets[i][j];
        }
        System.out.println("");
    }

    System.out.println("");

    // Print each movie's total and find the top performing movie
    int maxSales = totalSales[0];
    String topMovie = movies[0];

    for (int i = 0; i < movies.length; i++) {
        System.out.println("Total movie ticket sales for " + movies[i] + " " + totalSales[i]);

        if (totalSales[i] > maxSales) {
            maxSales = totalSales[i];
            topMovie = movies[i];
        }
    }

    System.out.println("");
    System.out.println("Top performing movie: " + topMovie);
}
