package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b66  reason: default package */
/* loaded from: classes.dex */
public abstract class b66 {
    public static final long[] a = null;

    static {
            r0 = 2
            long[] r0 = new long[r0]
            r0 = {x0010: FILL_ARRAY_DATA  , data: [-9187201950435737345, -1} // fill-array
            defpackage.b66.a = r0
            ja4 r0 = new ja4
            r1 = 0
            r0.<init>(r1)
            return
    }

    public static final int a(int r1) {
            r0 = 7
            if (r1 != r0) goto L5
            r1 = 6
            return r1
        L5:
            int r0 = r1 / 8
            int r1 = r1 - r0
            return r1
    }

    public static final int b(int r0) {
            if (r0 != 0) goto L4
            r0 = 6
            return r0
        L4:
            int r0 = r0 * 2
            int r0 = r0 + 1
            return r0
    }

    public static final int c(int r1) {
            if (r1 <= 0) goto La
            r0 = -1
            int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r1 = r0 >>> r1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final int d(int r2) {
            r0 = 7
            if (r2 != r0) goto L6
            r2 = 8
            return r2
        L6:
            int r1 = r2 + (-1)
            int r1 = r1 / r0
            int r1 = r1 + r2
            return r1
    }
}
