package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: he7  reason: default package */
/* loaded from: classes.dex */
public final class he7 implements defpackage.hg3 {
    public final defpackage.ar0 a;
    public final java.util.List b;

    public he7(defpackage.ar0 r2) {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r0.getClass()
            r1.<init>()
            r1.a = r2
            r1.b = r0
            return
    }

    @Override // defpackage.hg3
    public final boolean a() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.hg3
    public final java.util.List b() {
            r0 = this;
            java.util.List r0 = r0.b
            return r0
    }

    @Override // defpackage.hg3
    public final defpackage.ar0 c() {
            r0 = this;
            ar0 r0 = r0.a
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.he7
            if (r0 == 0) goto L1a
            he7 r2 = (defpackage.he7) r2
            ar0 r2 = r2.a
            ar0 r1 = r1.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1a
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            boolean r1 = defpackage.nb3.k(r1, r1)
            if (r1 == 0) goto L1a
            r1 = 1
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r2 = this;
            ar0 r2 = r2.a
            int r2 = r2.hashCode()
            r0 = 31
            int r2 = r2 * r0
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            int r2 = defpackage.i61.b(r2, r1, r0)
            r0 = 0
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            ar0 r7 = r7.a
            java.lang.Class r7 = r7.a
            r7.getClass()
            boolean r0 = r7.isArray()
            if (r0 == 0) goto L68
            java.lang.Class<boolean[]> r0 = boolean[].class
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L18
            java.lang.String r7 = "kotlin.BooleanArray"
            goto L6c
        L18:
            java.lang.Class<char[]> r0 = char[].class
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L23
            java.lang.String r7 = "kotlin.CharArray"
            goto L6c
        L23:
            java.lang.Class<byte[]> r0 = byte[].class
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2e
            java.lang.String r7 = "kotlin.ByteArray"
            goto L6c
        L2e:
            java.lang.Class<short[]> r0 = short[].class
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L39
            java.lang.String r7 = "kotlin.ShortArray"
            goto L6c
        L39:
            java.lang.Class<int[]> r0 = int[].class
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L44
            java.lang.String r7 = "kotlin.IntArray"
            goto L6c
        L44:
            java.lang.Class<float[]> r0 = float[].class
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L4f
            java.lang.String r7 = "kotlin.FloatArray"
            goto L6c
        L4f:
            java.lang.Class<long[]> r0 = long[].class
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L5a
            java.lang.String r7 = "kotlin.LongArray"
            goto L6c
        L5a:
            java.lang.Class<double[]> r0 = double[].class
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L65
            java.lang.String r7 = "kotlin.DoubleArray"
            goto L6c
        L65:
            java.lang.String r7 = "kotlin.Array"
            goto L6c
        L68:
            java.lang.String r7 = r7.getName()
        L6c:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            boolean r1 = r0.isEmpty()
            java.lang.String r6 = ""
            if (r1 == 0) goto L78
            r0 = r6
            goto L8b
        L78:
            h37 r4 = new h37
            r1 = 11
            r4.<init>(r1)
            r5 = 24
            java.lang.String r1 = ", "
            java.lang.String r2 = "<"
            java.lang.String r3 = ">"
            java.lang.String r0 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
        L8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            r1.append(r6)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = " (Kotlin reflection is not available)"
            java.lang.String r7 = r7.concat(r0)
            return r7
    }
}
