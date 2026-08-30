package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: q72  reason: default package */
/* loaded from: classes.dex */
public abstract class q72 extends tq5 {
    public static boolean H(File file) {
        file.getClass();
        p72 p72Var = p72.BOTTOM_UP;
        p72Var.getClass();
        m72 m72Var = new m72(new o72(file, p72Var));
        while (true) {
            boolean z = true;
            while (m72Var.hasNext()) {
                File file2 = (File) m72Var.next();
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

    public static String I(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        return zg6.U0('.', name, "");
    }

    public static final f62 J(f62 f62Var) {
        File file = f62Var.a;
        List<File> list = f62Var.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file2 : list) {
            String name = file2.getName();
            if (!b53.x(name, ".")) {
                if (b53.x(name, "..")) {
                    if (!arrayList.isEmpty() && !b53.x(((File) tq0.T0(arrayList)).getName(), "..")) {
                        Comparable comparable = (Comparable) arrayList.remove(arrayList.size() - 1);
                    } else {
                        arrayList.add(file2);
                    }
                } else {
                    arrayList.add(file2);
                }
            }
        }
        return new f62(file, arrayList);
    }

    public static ArrayList K(File file) {
        Charset charset = hk0.a;
        file.getClass();
        charset.getClass();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = new ay0(new mu(2, bufferedReader)).iterator();
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
                dt3.W(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static String L(File file) {
        Charset charset = hk0.a;
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String R = yf2.R(inputStreamReader);
            inputStreamReader.close();
            return R;
        } finally {
        }
    }

    public static File M(File file) {
        File file2 = new File("image_cache");
        String path = file2.getPath();
        path.getClass();
        if (tq5.p(path) > 0) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() != 0) {
            char c = File.separatorChar;
            if (!zg6.t0(file3, c)) {
                return new File(file3 + c + file2);
            }
        }
        return new File(file3 + file2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String N(java.io.File r10, java.io.File r11) {
        /*
            f62 r0 = defpackage.tq5.E(r10)
            f62 r0 = J(r0)
            java.util.List r1 = r0.b
            f62 r2 = defpackage.tq5.E(r11)
            f62 r2 = J(r2)
            java.util.List r3 = r2.b
            java.io.File r0 = r0.a
            java.io.File r2 = r2.a
            boolean r0 = r0.equals(r2)
            r2 = 0
            if (r0 != 0) goto L21
        L1f:
            r0 = r2
            goto L87
        L21:
            int r0 = r3.size()
            int r4 = r1.size()
            int r5 = java.lang.Math.min(r4, r0)
            r6 = 0
        L2e:
            if (r6 >= r5) goto L41
            java.lang.Object r7 = r1.get(r6)
            java.lang.Object r8 = r3.get(r6)
            boolean r7 = defpackage.b53.x(r7, r8)
            if (r7 == 0) goto L41
            int r6 = r6 + 1
            goto L2e
        L41:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r7 = r0 + (-1)
            if (r6 > r7) goto L6c
        L4a:
            java.lang.Object r8 = r3.get(r7)
            java.io.File r8 = (java.io.File) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = ".."
            boolean r8 = defpackage.b53.x(r8, r9)
            if (r8 == 0) goto L5d
            goto L1f
        L5d:
            r5.append(r9)
            if (r7 == r6) goto L67
            char r8 = java.io.File.separatorChar
            r5.append(r8)
        L67:
            if (r7 == r6) goto L6c
            int r7 = r7 + (-1)
            goto L4a
        L6c:
            if (r6 >= r4) goto L83
            if (r6 >= r0) goto L75
            char r0 = java.io.File.separatorChar
            r5.append(r0)
        L75:
            java.util.List r0 = defpackage.tq0.G0(r6, r1)
            java.lang.String r1 = java.io.File.separator
            r1.getClass()
            r3 = 124(0x7c, float:1.74E-43)
            defpackage.tq0.R0(r0, r5, r1, r2, r3)
        L83:
            java.lang.String r0 = r5.toString()
        L87:
            if (r0 == 0) goto L8a
            return r0
        L8a:
            java.lang.String r0 = " and "
            r1 = 46
            java.lang.String r3 = "this and base files have different roots: "
            defpackage.f81.l(r3, r10, r0, r11, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q72.N(java.io.File, java.io.File):java.lang.String");
    }

    public static void O(File file, String str) {
        Charset charset = hk0.a;
        file.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            P(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void P(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z;
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
                i.n("Check failed.");
                return;
            }
        }
    }
}
