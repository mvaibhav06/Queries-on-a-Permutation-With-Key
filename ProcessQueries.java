class ProcessQueries {
    public int[] processQueries(int[] queries, int m) {
        int[] out = new int[queries.length];
        List<Integer> temp = new ArrayList<>();

        for(int i=1; i<=m; i++){
            temp.add(i);
        }

        for(int i=0; i<queries.length; i++){
            int a = queries[i];
            int index = temp.indexOf(a);
            out[i] = index;
            temp.remove(Integer.valueOf(queries[i]));
            temp.add(0, queries[i]);
        }
        return out;
    }
}
