boolean palindrome(string str, int start, int end) {
  if(start>=end){
    return true;
  }
  
  return (str.charAt(start) == str.charAt(end)) && palindrome(str, start+1, end-1);
}
