package com.ous50.cpt111.week2;

public class CharXmasTree {
    public static void main(String[] args) {

        // \\ 是 \ 的 escape sequence (转义字符)
        // System.out.println adds a line feed
        //

        //method 1
        System.out.println("   *");
        System.out.println("  / \\");
        System.out.println(" /   \\");
        System.out.println("/     \\");
        System.out.println("--| |--");
        System.out.println("-------");

        //method 2
        String xmas_tree =  """
                   *
                  / \\
                 /   \\
                /     \\
                --| |--
                -------""";
        System.out.println(xmas_tree);


        //method 3
        String xmas_tree_with_line =  """
                   *
                  / \\
                 /   \\
                /     \\
                --| |--
                -------
                """;
        System.out.print(xmas_tree_with_line);

//        or just put them in one line for compatilities
        String xmas_tree_in_one_line =  """
                   *\n  / \\\n /   \\\n/     \\\n--| |--\n-------
                """;
        System.out.print(xmas_tree_in_one_line);

        //method 4

        System.out.print("""
                   *
                  / \\
                 /   \\
                /     \\
                --| |--
                -------
                """);

        //method 5

        System.out.println("""
                   *
                  / \\
                 /   \\
                /     \\
                --| |--
                -------""");
    }
}
