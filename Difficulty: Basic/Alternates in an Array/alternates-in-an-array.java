class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList <Integer> alt = new ArrayList<>();
        for (int i = 0; i < arr.length; i = i+2) {
            alt.add (arr[i]);
        } return alt;
        
    }
}