package defpackage;

import com.github.junrar.unpack.ppm.ModelPPM;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: jc2  reason: default package */
/* loaded from: classes.dex */
public abstract class jc2 extends hf {
    public static ArrayList A0(File file) {
        Charset charset = qm0.a;
        file.getClass();
        charset.getClass();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = new f11(new ev(bufferedReader, 2)).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                str.getClass();
                arrayList.add(str);
            }
            bufferedReader.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ge7.t(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static String B0(File file) {
        Charset charset = qm0.a;
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String E = yh2.E(inputStreamReader);
            inputStreamReader.close();
            return E;
        } finally {
        }
    }

    public static File C0(File file) {
        File file2 = new File("image_cache");
        String path = file2.getPath();
        path.getClass();
        if (hf.W(path) > 0) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!qs6.m0(file3, c)) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String D0(File file, File file2) {
        String sb;
        za2 z0 = z0(hf.r0(file));
        List list = z0.b;
        za2 z02 = z0(hf.r0(file2));
        List list2 = z02.b;
        if (z0.a.equals(z02.a)) {
            int size = list2.size();
            int size2 = list.size();
            int min = Math.min(size2, size);
            int i = 0;
            while (i < min && nb3.k(list.get(i), list2.get(i))) {
                i++;
            }
            StringBuilder sb2 = new StringBuilder();
            int i2 = size - 1;
            if (i <= i2) {
                while (!nb3.k(((File) list2.get(i2)).getName(), "..")) {
                    sb2.append("..");
                    if (i2 != i) {
                        sb2.append(File.separatorChar);
                    }
                    if (i2 != i) {
                        i2--;
                    }
                }
            }
            if (i < size2) {
                if (i < size) {
                    sb2.append(File.separatorChar);
                }
                List D0 = gt0.D0(list, i);
                String str = File.separator;
                str.getClass();
                gt0.O0(D0, sb2, str, null, ModelPPM.MAX_FREQ);
            }
            sb = sb2.toString();
            if (sb == null) {
                return sb;
            }
            e41.l("this and base files have different roots: ", file, " and ", file2, 46);
            return null;
        }
        sb = null;
        if (sb == null) {
        }
    }

    public static final hc2 E0(File file, ic2 ic2Var) {
        file.getClass();
        ic2Var.getClass();
        return new hc2(file, ic2Var, null, Integer.MAX_VALUE);
    }

    public static void F0(File file, String str) {
        Charset charset = qm0.a;
        file.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            G0(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void G0(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z;
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i, i3, array, i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (i3 == str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i2 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i = i3;
            } else {
                i.m("Check failed.");
                return;
            }
        }
    }

    public static void v0(File file, File file2) {
        lw0 lw0Var = new lw0(27, (byte) 0);
        if (file.exists()) {
            try {
                hc2 E0 = E0(file, ic2.TOP_DOWN);
                fc2 fc2Var = new fc2(new hc2(E0.a, E0.b, new bc(4, lw0Var), Integer.MAX_VALUE));
                while (fc2Var.hasNext()) {
                    File file3 = (File) fc2Var.next();
                    if (file3.exists()) {
                        File file4 = new File(file2, D0(file3, file));
                        if (file4.exists() && (!file3.isDirectory() || !file4.isDirectory())) {
                            if (file4.isDirectory()) {
                                if (!x0(file4)) {
                                    lw0Var.o(file4, new gb2(file3, file4, "The destination file already exists."));
                                    throw null;
                                }
                            } else if (!file4.delete()) {
                                lw0Var.o(file4, new gb2(file3, file4, "The destination file already exists."));
                                throw null;
                            }
                        }
                        if (file3.isDirectory()) {
                            file4.mkdirs();
                        } else {
                            w0(file3, file4);
                            if (file4.length() != file3.length()) {
                                lw0Var.o(file3, new IOException("Source file wasn't copied completely, length of destination file differs."));
                                throw null;
                            }
                        }
                    } else {
                        lw0Var.o(file3, new gb2(file3, null, "The source file doesn't exist."));
                        throw null;
                    }
                }
                return;
            } catch (uz6 unused) {
                return;
            }
        }
        lw0Var.o(file, new gb2(file, null, "The source file doesn't exist."));
        throw null;
    }

    public static void w0(File file, File file2) {
        if (file.exists()) {
            if (file2.exists() && !file2.delete()) {
                throw new gb2(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
            if (file.isDirectory()) {
                if (file2.mkdirs()) {
                    return;
                }
                throw new gb2(file, file2, "Failed to create target directory.");
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                f04.w(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } else {
            throw new gb2(file, null, "The source file doesn't exist.");
        }
    }

    public static boolean x0(File file) {
        file.getClass();
        fc2 fc2Var = new fc2(E0(file, ic2.BOTTOM_UP));
        while (true) {
            boolean z = true;
            while (fc2Var.hasNext()) {
                File file2 = (File) fc2Var.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static String y0(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return qs6.O0('.', name, "");
    }

    public static final za2 z0(za2 za2Var) {
        File file = za2Var.a;
        List<File> list = za2Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!nb3.k(name, ".")) {
                if (nb3.k(name, "..")) {
                    if (!arrayList.isEmpty() && !nb3.k(((File) gt0.Q0(arrayList)).getName(), "..")) {
                        Comparable comparable = (Comparable) arrayList.remove(arrayList.size() - 1);
                    } else {
                        arrayList.add(file2);
                    }
                } else {
                    arrayList.add(file2);
                }
            }
        }
        return new za2(file, arrayList);
    }
}
