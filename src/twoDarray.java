import java.util.Scanner;
// addition of two 2d array
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col,i,j;

        System.out.println("enter the row : ");
        row = sc.nextInt();
        System.out.println("enterr the col");
        col = sc.nextInt();
        int [][] arr1 = new int[row][col];
        int [][] arr2 = new int[row][col];
        int sum[][] = new int[row ][col ];
        for(i=0; i<row; i++){
            for(j=0; j<col;j++){
                System.out.println("enter the element at row "+i +"and col "+j);
                arr1[i][j]=sc.nextInt();

            }
        }
        for(i=0; i<row; i++){
            for(j=0;j<col;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println(" \n");
        }

        for(i=0; i<row; i++) {
            for (j = 0; j < col; j++) {
                System.out.println("array 2 enter the element at row " + i + "and col " + j);
                arr2[i][j] = sc.nextInt();

            }
        }
            for(i=0; i<row; i++){
                for(j=0;j<col;j++){
                    System.out.print(arr2[i][j]+" ");
                }
                System.out.println(" \n");
            }
            for(i=0; i<row ; i++){
                for(j=0; j<col;j++){
                    sum[i][j]=arr1[i][j]+ arr2[i][j];

                }
            }
            for(i=0; i<row; i++){
                for(j=0;j<col;j++){
                    System.out.print(+sum[i][j]+" ");
                }
                System.out.println(" \n");
            }

        }

    }


