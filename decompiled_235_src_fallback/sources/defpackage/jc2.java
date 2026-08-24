package defpackage;
/* renamed from: jc2  reason: default package */
/* loaded from: classes.dex */
public abstract class jc2 extends defpackage.hf {
    public static java.util.ArrayList A0(java.io.File r5) {
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r5.getClass()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.io.FileInputStream r4 = new java.io.FileInputStream
            r4.<init>(r5)
            r3.<init>(r4, r0)
            r2.<init>(r3)
            ev r5 = new ev     // Catch: java.lang.Throwable -> L3e
            r0 = 2
            r5.<init>(r2, r0)     // Catch: java.lang.Throwable -> L3e
            f11 r0 = new f11     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L3e
        L2b:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L40
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3e
            r0.getClass()     // Catch: java.lang.Throwable -> L3e
            r1.add(r0)     // Catch: java.lang.Throwable -> L3e
            goto L2b
        L3e:
            r5 = move-exception
            goto L44
        L40:
            r2.close()
            return r1
        L44:
            throw r5     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            defpackage.ge7.t(r2, r5)
            throw r0
    }

    public static java.lang.String B0(java.io.File r3) {
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r3.getClass()
            r0.getClass()
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r0)
            java.lang.String r3 = defpackage.yh2.E(r1)     // Catch: java.lang.Throwable -> L1a
            r1.close()
            return r3
        L1a:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r0 = move-exception
            defpackage.ge7.t(r1, r3)
            throw r0
    }

    public static java.io.File C0(java.io.File r4) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "image_cache"
            r0.<init>(r1)
            java.lang.String r1 = r0.getPath()
            r1.getClass()
            int r1 = defpackage.hf.W(r1)
            if (r1 <= 0) goto L15
            return r0
        L15:
            java.lang.String r4 = r4.toString()
            r4.getClass()
            int r1 = r4.length()
            if (r1 != 0) goto L23
            goto L2b
        L23:
            char r1 = java.io.File.separatorChar
            boolean r2 = defpackage.qs6.m0(r4, r1)
            if (r2 == 0) goto L40
        L2b:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            return r1
        L40:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            java.lang.String r4 = r3.toString()
            r2.<init>(r4)
            return r2
    }

    public static java.lang.String D0(java.io.File r10, java.io.File r11) {
            za2 r0 = defpackage.hf.r0(r10)
            za2 r0 = z0(r0)
            java.util.List r1 = r0.b
            za2 r2 = defpackage.hf.r0(r11)
            za2 r2 = z0(r2)
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
            boolean r7 = defpackage.nb3.k(r7, r8)
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
            boolean r8 = defpackage.nb3.k(r8, r9)
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
            java.util.List r0 = defpackage.gt0.D0(r1, r6)
            java.lang.String r1 = java.io.File.separator
            r1.getClass()
            r3 = 124(0x7c, float:1.74E-43)
            defpackage.gt0.O0(r0, r5, r1, r2, r3)
        L83:
            java.lang.String r0 = r5.toString()
        L87:
            if (r0 == 0) goto L8a
            return r0
        L8a:
            java.lang.String r0 = " and "
            r1 = 46
            java.lang.String r3 = "this and base files have different roots: "
            defpackage.e41.l(r3, r10, r0, r11, r1)
            return r2
    }

    public static final defpackage.hc2 E0(java.io.File r3, defpackage.ic2 r4) {
            r3.getClass()
            r4.getClass()
            hc2 r0 = new hc2
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    public static void F0(java.io.File r2, java.lang.String r3) {
            java.nio.charset.Charset r0 = defpackage.qm0.a
            r2.getClass()
            r0.getClass()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            G0(r1, r3, r0)     // Catch: java.lang.Throwable -> L14
            r1.close()
            return
        L14:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L16
        L16:
            r3 = move-exception
            defpackage.ge7.t(r1, r2)
            throw r3
    }

    public static final void G0(java.io.FileOutputStream r8, java.lang.String r9, java.nio.charset.Charset r10) {
            r10.getClass()
            int r0 = r9.length()
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 >= r1) goto L16
            byte[] r9 = r9.getBytes(r10)
            r9.getClass()
            r8.write(r9)
            return
        L16:
            java.nio.charset.CharsetEncoder r10 = r10.newEncoder()
            java.nio.charset.CodingErrorAction r0 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r10 = r10.onMalformedInput(r0)
            java.nio.charset.CharsetEncoder r10 = r10.onUnmappableCharacter(r0)
            r0 = 8192(0x2000, float:1.148E-41)
            java.nio.CharBuffer r1 = java.nio.CharBuffer.allocate(r0)
            r10.getClass()
            float r2 = r10.maxBytesPerChar()
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r2 = (int) r2
            int r0 = r0 * r2
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r0.getClass()
            r2 = 0
            r3 = r2
            r4 = r3
        L43:
            int r5 = r9.length()
            if (r3 >= r5) goto La3
            int r5 = 8192 - r4
            int r6 = r9.length()
            int r6 = r6 - r3
            int r5 = java.lang.Math.min(r5, r6)
            int r6 = r3 + r5
            char[] r7 = r1.array()
            r7.getClass()
            r9.getChars(r3, r6, r7, r4)
            int r5 = r5 + r4
            r1.limit(r5)
            int r3 = r9.length()
            r4 = 1
            if (r6 != r3) goto L6d
            r3 = r4
            goto L6e
        L6d:
            r3 = r2
        L6e:
            java.nio.charset.CoderResult r3 = r10.encode(r1, r0, r3)
            boolean r3 = r3.isUnderflow()
            if (r3 == 0) goto L9e
            byte[] r3 = r0.array()
            int r5 = r0.position()
            r8.write(r3, r2, r5)
            int r3 = r1.position()
            int r5 = r1.limit()
            if (r3 == r5) goto L95
            char r3 = r1.get()
            r1.put(r2, r3)
            goto L96
        L95:
            r4 = r2
        L96:
            r1.clear()
            r0.clear()
            r3 = r6
            goto L43
        L9e:
            java.lang.String r8 = "Check failed."
            defpackage.i.m(r8)
        La3:
            return
    }

    public static void v0(java.io.File r9, java.io.File r10) {
            lw0 r0 = new lw0
            r1 = 27
            r2 = 0
            r0.<init>(r1, r2)
            boolean r1 = r9.exists()
            java.lang.String r2 = "The source file doesn't exist."
            r3 = 0
            if (r1 == 0) goto La9
            ic2 r1 = defpackage.ic2.TOP_DOWN     // Catch: defpackage.uz6 -> La8
            hc2 r1 = E0(r9, r1)     // Catch: defpackage.uz6 -> La8
            bc r4 = new bc     // Catch: defpackage.uz6 -> La8
            r5 = 4
            r4.<init>(r5, r0)     // Catch: defpackage.uz6 -> La8
            hc2 r5 = new hc2     // Catch: defpackage.uz6 -> La8
            java.io.File r6 = r1.a     // Catch: defpackage.uz6 -> La8
            ic2 r1 = r1.b     // Catch: defpackage.uz6 -> La8
            r7 = 2147483647(0x7fffffff, float:NaN)
            r5.<init>(r6, r1, r4, r7)     // Catch: defpackage.uz6 -> La8
            fc2 r1 = new fc2     // Catch: defpackage.uz6 -> La8
            r1.<init>(r5)     // Catch: defpackage.uz6 -> La8
        L2e:
            boolean r4 = r1.hasNext()     // Catch: defpackage.uz6 -> La8
            if (r4 == 0) goto La8
            java.lang.Object r4 = r1.next()     // Catch: defpackage.uz6 -> La8
            java.io.File r4 = (java.io.File) r4     // Catch: defpackage.uz6 -> La8
            boolean r5 = r4.exists()     // Catch: defpackage.uz6 -> La8
            if (r5 == 0) goto L9f
            java.lang.String r5 = D0(r4, r9)     // Catch: defpackage.uz6 -> La8
            java.io.File r6 = new java.io.File     // Catch: defpackage.uz6 -> La8
            r6.<init>(r10, r5)     // Catch: defpackage.uz6 -> La8
            boolean r5 = r6.exists()     // Catch: defpackage.uz6 -> La8
            if (r5 == 0) goto L7a
            boolean r5 = r4.isDirectory()     // Catch: defpackage.uz6 -> La8
            if (r5 == 0) goto L5b
            boolean r5 = r6.isDirectory()     // Catch: defpackage.uz6 -> La8
            if (r5 != 0) goto L7a
        L5b:
            boolean r5 = r6.isDirectory()     // Catch: defpackage.uz6 -> La8
            if (r5 == 0) goto L68
            boolean r5 = x0(r6)     // Catch: defpackage.uz6 -> La8
            if (r5 == 0) goto L6f
            goto L7a
        L68:
            boolean r5 = r6.delete()     // Catch: defpackage.uz6 -> La8
            if (r5 == 0) goto L6f
            goto L7a
        L6f:
            x1 r9 = new x1     // Catch: defpackage.uz6 -> La8
            java.lang.String r10 = "The destination file already exists."
            r9.<init>(r4, r6, r10)     // Catch: defpackage.uz6 -> La8
            r0.o(r6, r9)     // Catch: defpackage.uz6 -> La8
            throw r3     // Catch: defpackage.uz6 -> La8
        L7a:
            boolean r5 = r4.isDirectory()     // Catch: defpackage.uz6 -> La8
            if (r5 == 0) goto L84
            r6.mkdirs()     // Catch: defpackage.uz6 -> La8
            goto L2e
        L84:
            w0(r4, r6)     // Catch: defpackage.uz6 -> La8
            long r5 = r6.length()     // Catch: defpackage.uz6 -> La8
            long r7 = r4.length()     // Catch: defpackage.uz6 -> La8
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L94
            goto L2e
        L94:
            java.io.IOException r9 = new java.io.IOException     // Catch: defpackage.uz6 -> La8
            java.lang.String r10 = "Source file wasn't copied completely, length of destination file differs."
            r9.<init>(r10)     // Catch: defpackage.uz6 -> La8
            r0.o(r4, r9)     // Catch: defpackage.uz6 -> La8
            throw r3     // Catch: defpackage.uz6 -> La8
        L9f:
            x1 r9 = new x1     // Catch: defpackage.uz6 -> La8
            r9.<init>(r4, r3, r2)     // Catch: defpackage.uz6 -> La8
            r0.o(r4, r9)     // Catch: defpackage.uz6 -> La8
            throw r3     // Catch: defpackage.uz6 -> La8
        La8:
            return
        La9:
            x1 r10 = new x1
            r10.<init>(r9, r3, r2)
            r0.o(r9, r10)
            throw r3
    }

    public static void w0(java.io.File r2, java.io.File r3) {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L5c
            boolean r0 = r3.exists()
            if (r0 == 0) goto L1b
            boolean r0 = r3.delete()
            if (r0 == 0) goto L13
            goto L1b
        L13:
            x1 r0 = new x1
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r2, r3, r1)
            throw r0
        L1b:
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L30
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L28
            return
        L28:
            gb2 r0 = new gb2
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r2, r3, r1)
            throw r0
        L30:
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L39
            r0.mkdirs()
        L39:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4d
            defpackage.f04.w(r0, r2)     // Catch: java.lang.Throwable -> L4f
            r2.close()     // Catch: java.lang.Throwable -> L4d
            r0.close()
            return
        L4d:
            r2 = move-exception
            goto L56
        L4f:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L51
        L51:
            r1 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Throwable -> L4d
            throw r1     // Catch: java.lang.Throwable -> L4d
        L56:
            throw r2     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            defpackage.ge7.t(r0, r2)
            throw r3
        L5c:
            x1 r3 = new x1
            r0 = 0
            java.lang.String r1 = "The source file doesn't exist."
            r3.<init>(r2, r0, r1)
            throw r3
    }

    public static boolean x0(java.io.File r4) {
            r4.getClass()
            ic2 r0 = defpackage.ic2.BOTTOM_UP
            hc2 r4 = E0(r4, r0)
            fc2 r0 = new fc2
            r0.<init>(r4)
            r4 = 1
        Lf:
            r1 = r4
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            boolean r3 = r2.delete()
            if (r3 != 0) goto L28
            boolean r2 = r2.exists()
            if (r2 != 0) goto L2b
        L28:
            if (r1 == 0) goto L2b
            goto Lf
        L2b:
            r1 = 0
            goto L10
        L2d:
            return r1
    }

    public static java.lang.String y0(java.io.File r2) {
            r2.getClass()
            java.lang.String r2 = r2.getName()
            r2.getClass()
            r0 = 46
            java.lang.String r1 = ""
            java.lang.String r2 = defpackage.qs6.O0(r0, r2, r1)
            return r2
    }

    public static final defpackage.za2 z0(defpackage.za2 r6) {
            za2 r0 = new za2
            java.io.File r1 = r6.a
            java.util.List r6 = r6.b
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r6.size()
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L13:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L5f
            java.lang.Object r3 = r6.next()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "."
            boolean r5 = defpackage.nb3.k(r4, r5)
            if (r5 == 0) goto L2c
            goto L13
        L2c:
            java.lang.String r5 = ".."
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 == 0) goto L5b
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L57
            java.lang.Object r4 = defpackage.gt0.Q0(r2)
            java.io.File r4 = (java.io.File) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L57
            int r3 = r2.size()
            int r3 = r3 + (-1)
            java.lang.Object r3 = r2.remove(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            goto L13
        L57:
            r2.add(r3)
            goto L13
        L5b:
            r2.add(r3)
            goto L13
        L5f:
            r0.<init>(r1, r2)
            return r0
    }
}
