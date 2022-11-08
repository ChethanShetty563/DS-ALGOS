void powerSet(string str, int index = 0,
              string curr = "")
{
    int n = str.length();

    // base case
    if (index == n) {
        cout << curr << endl;
        return;
    }

    // Two cases for every character
    // (i) We consider the character
    // as part of current subset
    // (ii) We do not consider current
    // character as part of current
    // subset
    powerSet(str, index + 1, curr + str.charAt(i));
    powerSet(str, index + 1, curr);
}
