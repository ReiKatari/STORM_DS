package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx2  reason: default package */
/* loaded from: classes.dex */
public abstract class hx2 {
    public static final int[] a = null;
    public static final long[] b = null;

    static {
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L6:
            java.lang.String r4 = "0123456789abcdef"
            if (r3 >= r0) goto L1e
            int r5 = r3 >> 4
            char r5 = r4.charAt(r5)
            int r5 = r5 << 8
            r6 = r3 & 15
            char r4 = r4.charAt(r6)
            r4 = r4 | r5
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        L1e:
            defpackage.hx2.a = r1
            int[] r1 = new int[r0]
            r3 = r2
        L23:
            java.lang.String r5 = "0123456789ABCDEF"
            if (r3 >= r0) goto L3b
            int r6 = r3 >> 4
            char r6 = r5.charAt(r6)
            int r6 = r6 << 8
            r7 = r3 & 15
            char r5 = r5.charAt(r7)
            r5 = r5 | r6
            r1[r3] = r5
            int r3 = r3 + 1
            goto L23
        L3b:
            int[] r1 = new int[r0]
            r3 = r2
        L3e:
            if (r3 >= r0) goto L46
            r6 = -1
            r1[r3] = r6
            int r3 = r3 + 1
            goto L3e
        L46:
            r3 = r2
            r6 = r3
        L48:
            int r7 = r4.length()
            if (r3 >= r7) goto L5a
            char r7 = r4.charAt(r3)
            int r8 = r6 + 1
            r1[r7] = r6
            int r3 = r3 + 1
            r6 = r8
            goto L48
        L5a:
            r3 = r2
            r6 = r3
        L5c:
            int r7 = r5.length()
            if (r3 >= r7) goto L6e
            char r7 = r5.charAt(r3)
            int r8 = r6 + 1
            r1[r7] = r6
            int r3 = r3 + 1
            r6 = r8
            goto L5c
        L6e:
            long[] r1 = new long[r0]
            r3 = r2
        L71:
            if (r3 >= r0) goto L7a
            r6 = -1
            r1[r3] = r6
            int r3 = r3 + 1
            goto L71
        L7a:
            r0 = r2
            r3 = r0
        L7c:
            int r6 = r4.length()
            if (r0 >= r6) goto L8f
            char r6 = r4.charAt(r0)
            int r7 = r3 + 1
            long r8 = (long) r3
            r1[r6] = r8
            int r0 = r0 + 1
            r3 = r7
            goto L7c
        L8f:
            r0 = r2
        L90:
            int r3 = r5.length()
            if (r2 >= r3) goto La3
            char r3 = r5.charAt(r2)
            int r4 = r0 + 1
            long r6 = (long) r0
            r1[r3] = r6
            int r2 = r2 + 1
            r0 = r4
            goto L90
        La3:
            defpackage.hx2.b = r1
            return
    }
}
