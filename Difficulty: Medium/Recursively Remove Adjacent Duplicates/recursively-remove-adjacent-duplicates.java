class Solution {

    public String removeUtil(String s) {
        
        // Base case
        if (s.length() <= 1)
            return s;

        StringBuilder result = new StringBuilder();
        int i = 0;
        boolean duplicateFound = false;

        while (i < s.length()) {

            int j = i;

            // Move j forward while characters are same
            while (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
                j++;
            }

            // If no duplicate found, keep the character
            if (i == j) {
                result.append(s.charAt(i));
            } else {
                duplicateFound = true;  // duplicates removed
            }

            i = j + 1;
        }

        // If no duplicates were found, return result
        if (!duplicateFound)
            return result.toString();

        // Otherwise call recursively
        return removeUtil(result.toString());
    }
}