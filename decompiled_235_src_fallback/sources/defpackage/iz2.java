package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz2  reason: default package */
/* loaded from: classes.dex */
public abstract class iz2 {
    public static final defpackage.da0 a = null;
    public static final java.lang.String[] b = null;
    public static final java.lang.String[] c = null;
    public static final java.lang.String[] d = null;

    static {
            da0 r0 = defpackage.da0.R
            java.lang.String r0 = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.iz2.a = r0
            java.lang.String r9 = "WINDOW_UPDATE"
            java.lang.String r10 = "CONTINUATION"
            java.lang.String r1 = "DATA"
            java.lang.String r2 = "HEADERS"
            java.lang.String r3 = "PRIORITY"
            java.lang.String r4 = "RST_STREAM"
            java.lang.String r5 = "SETTINGS"
            java.lang.String r6 = "PUSH_PROMISE"
            java.lang.String r7 = "PING"
            java.lang.String r8 = "GOAWAY"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            defpackage.iz2.b = r0
            r0 = 64
            java.lang.String[] r0 = new java.lang.String[r0]
            defpackage.iz2.c = r0
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            r3 = r2
        L30:
            r4 = 32
            if (r3 >= r0) goto L53
            java.lang.String r5 = java.lang.Integer.toBinaryString(r3)
            r5.getClass()
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "%8s"
            java.lang.String r5 = defpackage.az7.d(r6, r5)
            r6 = 48
            java.lang.String r4 = r5.replace(r4, r6)
            r4.getClass()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L30
        L53:
            defpackage.iz2.d = r1
            java.lang.String[] r0 = defpackage.iz2.c
            java.lang.String r1 = ""
            r0[r2] = r1
            java.lang.String r1 = "END_STREAM"
            r3 = 1
            r0[r3] = r1
            int[] r1 = new int[]{r3}
            java.lang.String r3 = "PADDED"
            r5 = 8
            r0[r5] = r3
            r3 = r1[r2]
            r6 = r3 | 8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r3 = r0[r3]
            java.lang.String r8 = "|PADDED"
            java.lang.String r3 = defpackage.i61.n(r7, r3, r8)
            r0[r6] = r3
            java.lang.String r3 = "END_HEADERS"
            r6 = 4
            r0[r6] = r3
            java.lang.String r3 = "PRIORITY"
            r0[r4] = r3
            java.lang.String r3 = "END_HEADERS|PRIORITY"
            r7 = 36
            r0[r7] = r3
            int[] r0 = new int[]{r6, r4, r7}
            r3 = r2
        L91:
            r4 = 3
            if (r3 >= r4) goto Lcf
            r4 = r0[r3]
            r6 = r1[r2]
            java.lang.String[] r7 = defpackage.iz2.c
            r9 = r6 | r4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r11 = r7[r6]
            r10.append(r11)
            r11 = 124(0x7c, float:1.74E-43)
            r10.append(r11)
            r12 = r7[r4]
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r7[r9] = r10
            r9 = r9 | r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r6 = r7[r6]
            r10.append(r6)
            r10.append(r11)
            r4 = r7[r4]
            java.lang.String r4 = defpackage.i61.n(r10, r4, r8)
            r7[r9] = r4
            int r3 = r3 + 1
            goto L91
        Lcf:
            java.lang.String[] r0 = defpackage.iz2.c
            int r0 = r0.length
        Ld2:
            if (r2 >= r0) goto Le3
            java.lang.String[] r1 = defpackage.iz2.c
            r3 = r1[r2]
            if (r3 != 0) goto Le0
            java.lang.String[] r3 = defpackage.iz2.d
            r3 = r3[r2]
            r1[r2] = r3
        Le0:
            int r2 = r2 + 1
            goto Ld2
        Le3:
            return
    }

    public static java.lang.String a(int r2) {
            java.lang.String[] r0 = defpackage.iz2.b
            int r1 = r0.length
            if (r2 >= r1) goto L8
            r2 = r0[r2]
            return r2
        L8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = "0x%02x"
            java.lang.String r2 = defpackage.az7.d(r0, r2)
            return r2
    }

    public static java.lang.String b(boolean r4, int r5, int r6, int r7, int r8) {
            java.lang.String r0 = a(r7)
            if (r8 != 0) goto L9
            java.lang.String r7 = ""
            goto L57
        L9:
            r1 = 2
            java.lang.String[] r2 = defpackage.iz2.d
            if (r7 == r1) goto L55
            r1 = 3
            if (r7 == r1) goto L55
            r1 = 4
            if (r7 == r1) goto L4c
            r1 = 6
            if (r7 == r1) goto L4c
            r1 = 7
            if (r7 == r1) goto L55
            r1 = 8
            if (r7 == r1) goto L55
            java.lang.String[] r1 = defpackage.iz2.c
            int r3 = r1.length
            if (r8 >= r3) goto L29
            r1 = r1[r8]
            r1.getClass()
            goto L2b
        L29:
            r1 = r2[r8]
        L2b:
            r2 = 5
            if (r7 != r2) goto L3b
            r2 = r8 & 4
            if (r2 == 0) goto L3b
            java.lang.String r7 = "HEADERS"
            java.lang.String r8 = "PUSH_PROMISE"
            java.lang.String r7 = defpackage.xs6.e0(r1, r7, r8)
            goto L57
        L3b:
            if (r7 != 0) goto L4a
            r7 = r8 & 32
            if (r7 == 0) goto L4a
            java.lang.String r7 = "PRIORITY"
            java.lang.String r8 = "COMPRESSED"
            java.lang.String r7 = defpackage.xs6.e0(r1, r7, r8)
            goto L57
        L4a:
            r7 = r1
            goto L57
        L4c:
            r7 = 1
            if (r8 != r7) goto L52
            java.lang.String r7 = "ACK"
            goto L57
        L52:
            r7 = r2[r8]
            goto L57
        L55:
            r7 = r2[r8]
        L57:
            if (r4 == 0) goto L5c
            java.lang.String r4 = "<<"
            goto L5e
        L5c:
            java.lang.String r4 = ">>"
        L5e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r0, r7}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = defpackage.az7.d(r5, r4)
            return r4
    }

    public static java.lang.String c(boolean r1, int r2, int r3, long r4) {
            r0 = 8
            java.lang.String r0 = a(r0)
            if (r1 == 0) goto Lb
            java.lang.String r1 = "<<"
            goto Ld
        Lb:
            java.lang.String r1 = ">>"
        Ld:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3, r0, r4}
            java.lang.String r2 = "%s 0x%08x %5d %-13s %d"
            java.lang.String r1 = defpackage.az7.d(r2, r1)
            return r1
    }
}
