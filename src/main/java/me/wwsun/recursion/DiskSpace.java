package me.wwsun.recursion;

import java.io.File;

/**
 * Created by Weiwei on 2015/3/26.
 */
public class DiskSpace {

    public static long diskUsage(File root) {

        long total = root.length();
        if (root.isDirectory()) {
            for (String childname : root.list()) {
                File child = new File(root, childname);
                total += diskUsage(child);
            }
        }
        System.out.println(total + "\t" + root);
        return total;
    }
}
