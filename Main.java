public class Main {
    public static void main(String[] args) {
        BTree bTree = new BTree();
//        bTree.insertValue(8);
//        bTree.insertValue(9);
//        bTree.insertValue(10);
//        bTree.insertValue(11);
//        bTree.insertValue(15);
//        bTree.insertValue(20);
//        bTree.insertValue(17);

        for (int i = 0; bTree.size < 10000; i++) {
            int r;
            r = (int) (Math.random() * 10000);
            if (!bTree.contains(r, 0)){
                bTree.insertValue(r);
            }
        }


        bTree.findValue(9);
        BTree.counts = 0;

//        long current = System.nanoTime();
//        bTree.findValue(1020);
//        long result = System.nanoTime() - current;
//        System.out.println("Час виконання: " + result / (Math.pow(10, 9)));

    }
}
