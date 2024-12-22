public static boolean isNonZeroRow(int r,int [][] array2D){
    for(int i = 0;i < array2D[r].length;i++){
        if(array2D[r][i] == 0){
            return false;
        }
    }
    return true;
}