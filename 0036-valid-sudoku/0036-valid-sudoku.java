class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> hset = new HashSet<>();


    

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char bruh = board[i][j];

                if(bruh== '.'){
                    continue;
                }

                String row= bruh+"in row"+i;
                String col = bruh+"in col"+j;
                String box = bruh+"in box"+(i/3)+"-"+(j/3);

                if(!(hset.add(row) && hset.add(col) && hset.add(box))){
                    return false;
                }
            }
        }

        return true;
        
    }
}