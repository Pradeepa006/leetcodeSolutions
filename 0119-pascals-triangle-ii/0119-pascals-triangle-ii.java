class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        for(int i = 0 ; i < rowIndex  ; i++ ){
            List<Integer> newli = new ArrayList<>();
            newli.add(1);
            for(int j = 1 ; j < li.size() ; j++){
                newli.add(li.get(j - 1) + li.get(j));
            }
            newli.add(1);
            li = newli;

        }
        return li;
    }
}