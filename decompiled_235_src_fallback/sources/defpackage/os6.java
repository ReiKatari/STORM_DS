package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: os6  reason: default package */
/* loaded from: classes.dex */
public abstract class os6 {
    public static final java.lang.String[] a = null;
    public static final byte[] b = null;

    static {
            r0 = 93
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L6:
            r4 = 32
            if (r3 >= r4) goto L3c
            int r4 = r3 >> 12
            char r4 = b(r4)
            int r5 = r3 >> 8
            char r5 = b(r5)
            int r6 = r3 >> 4
            char r6 = b(r6)
            char r7 = b(r3)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "\\u"
            r8.<init>(r9)
            r8.append(r4)
            r8.append(r5)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r4 = r8.toString()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        L3c:
            java.lang.String r3 = "\\\""
            r5 = 34
            r1[r5] = r3
            java.lang.String r3 = "\\\\"
            r6 = 92
            r1[r6] = r3
            java.lang.String r3 = "\\t"
            r7 = 9
            r1[r7] = r3
            java.lang.String r3 = "\\b"
            r8 = 8
            r1[r8] = r3
            java.lang.String r3 = "\\n"
            r9 = 10
            r1[r9] = r3
            java.lang.String r3 = "\\r"
            r10 = 13
            r1[r10] = r3
            java.lang.String r3 = "\\f"
            r11 = 12
            r1[r11] = r3
            defpackage.os6.a = r1
            byte[] r0 = new byte[r0]
        L6a:
            if (r2 >= r4) goto L72
            r1 = 1
            r0[r2] = r1
            int r2 = r2 + 1
            goto L6a
        L72:
            r0[r5] = r5
            r0[r6] = r6
            r1 = 116(0x74, float:1.63E-43)
            r0[r7] = r1
            r1 = 98
            r0[r8] = r1
            r1 = 110(0x6e, float:1.54E-43)
            r0[r9] = r1
            r1 = 114(0x72, float:1.6E-43)
            r0[r10] = r1
            r1 = 102(0x66, float:1.43E-43)
            r0[r11] = r1
            defpackage.os6.b = r0
            return
    }

    public static final void a(java.lang.StringBuilder r7, java.lang.String r8) {
            r8.getClass()
            r0 = 34
            r7.append(r0)
            int r1 = r8.length()
            r2 = 0
            r3 = r2
        Le:
            if (r2 >= r1) goto L2a
            char r4 = r8.charAt(r2)
            java.lang.String[] r5 = defpackage.os6.a
            int r6 = r5.length
            if (r4 >= r6) goto L27
            r6 = r5[r4]
            if (r6 == 0) goto L27
            r7.append(r8, r3, r2)
            r3 = r5[r4]
            r7.append(r3)
            int r3 = r2 + 1
        L27:
            int r2 = r2 + 1
            goto Le
        L2a:
            if (r3 == 0) goto L34
            int r1 = r8.length()
            r7.append(r8, r3, r1)
            goto L37
        L34:
            r7.append(r8)
        L37:
            r7.append(r0)
            return
    }

    public static final char b(int r1) {
            r1 = r1 & 15
            r0 = 10
            if (r1 >= r0) goto La
            int r1 = r1 + 48
        L8:
            char r1 = (char) r1
            return r1
        La:
            int r1 = r1 + 87
            goto L8
    }
}
