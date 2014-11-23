public class NamingConvention {
    public String toCamelCase(String variableName) {
        String camelString = "";

        char currentChar;
        for (int i = 0; i < variableName.length(); i++) {
            currentChar = variableName.charAt(i);
            if (currentChar != '_') {
                camelString += currentChar;
                continue;
            }

            i++;
            currentChar = variableName.charAt(i);
            camelString += Character.toUpperCase(currentChar);
        }

        return camelString;
    }
}