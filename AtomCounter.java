

import java.util.*;


public class Practice {
    public static void main(String[] args) {

        addMolecule("C6H12OH");


    }


    public static void addMolecule(String addMolecule) {
        HashMap<String, Integer> molecule = new HashMap<>();
        String[] sb = addMolecule.split("(?=\\p{Upper})");
        int a = 0;


            for (int i = 0; i < sb.length; i++) {
                try {
                    Scanner scanner = new Scanner(sb[i]).useDelimiter("[^0-9]+");
                    a = scanner.nextInt();
                    }

                    catch(Exception e)
                    {
                    System.out.print("");
                    }

                String sd = sb[i];
                if(molecule.containsKey(sd))
                {

                    ifContains(molecule, sd);
                }
                else if (sd.matches(".*\\d.*"))
                    {
                    sd = sd.replaceAll("[0-9]", "");
                    molecule.put(sd,a);
                    }
                else
                    {
                        molecule.put(sd, 1);
                    }
                }
            System.out.println(Arrays.asList(molecule));
    }




    public static boolean ifContains(HashMap<String,Integer> hs,String s){

    if (hs.containsKey(s)){
        int b =hs.get(s);
        b++;
        hs.replace(s,b);
        return true;
    }
    return false;
    }
}






//        String[] sb = s.split("(?=\\p{Upper})");
//        int a = 0;
//        for (int i = 0; i < sb.length; i++) {
//
//            try {
//                Scanner in = new Scanner(sb[i]).useDelimiter("[^0-9]+");
//                a = in.nextInt();
//            }catch (Exception e){
//                System.out.print("");
//            }
//            String sd = sb[i];
//            if (sd.matches(".*\\d.*")){
//                sd= sd.replaceAll("[0-9]","");
//                System.out.println(sd + " =" +a );
//            }
//            else
//                System.out.println(sd +"= 1"  );
//
////            if (sd.matches("\\d+")){
////                sd= sd.replaceAll("[0-9]","");
//
//                System.out.println(sd + " =" +a );
//            }





//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//
//        System.out.println(sb);
//
//        List<Character> a = new ArrayList<Character>();
//        for (int i =0;i<s.length();i++) {
//            a.add(s.charAt(i));
//        }
//
//        Iterator iterator = a.listIterator();
//
//        while (iterator.hasNext()){
//
//            System.out.println(iterator.next());
//        }
//
//    }
//}
// }




