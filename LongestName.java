// Compile Error
// Typing - set the type of a variable
// Type - refers to the "kind" of data a variable holds
// Saying that the type of a variable is String means that this variable is an instance of the String class


// The following class does not compile
// Why?
// Compile error - "The operator < is undefined for the argument type(s) int, String"
// The < operator can only be used on integers or floats and not strings, 
// so the name variable is incompatible as it's a string

// class LongestName {
//     public static void main(String[] names) {
//         String longest = "";
//         for (String name : names) {
//             if (longest.length() < name ){
//                 longest = name;
//             }
//         }
//         return longest;
//     }
// }