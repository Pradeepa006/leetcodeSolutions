class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> oli = new ArrayList<>();

        List<Integer> prev = null;

        for (int i = 0; i < numRows; i++) {
            List<Integer> li = new ArrayList<>();
            li.add(1);
            if (prev != null) {
                for (int j = 1; j < prev.size(); j++) {
                    li.add(prev.get(j - 1) + prev.get(j));
                }
                li.add(1);
            }
            oli.add(li);
            prev = li;
        }

        return oli;
    }
}