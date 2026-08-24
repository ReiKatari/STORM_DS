package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb1  reason: default package */
/* loaded from: classes.dex */
public final class xb1 {
    public static final defpackage.xb1 b = null;
    public final java.util.HashMap a;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            xb1 r1 = new xb1
            r1.<init>(r0)
            defpackage.u24.H(r1)
            defpackage.xb1.b = r1
            return
    }

    public xb1(java.util.LinkedHashMap r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public xb1(defpackage.xb1 r2) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            java.util.HashMap r2 = r2.a
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public final long a(java.lang.String r3) {
            r2 = this;
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.HashMap r2 = r2.a
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof java.lang.Long
            if (r3 == 0) goto L11
            r0 = r2
        L11:
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            return r2
    }

    public final java.lang.String b(java.lang.String r1) {
            r0 = this;
            java.util.HashMap r0 = r0.a
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto Ld
            java.lang.String r0 = (java.lang.String) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final boolean c(java.lang.String r1) {
            r0 = this;
            java.util.HashMap r0 = r0.a
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L16
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L5
            goto L66
        L5:
            r1 = 0
            if (r8 == 0) goto L67
            java.lang.Class<xb1> r2 = defpackage.xb1.class
            java.lang.Class r3 = r8.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L15
            goto L67
        L15:
            xb1 r8 = (defpackage.xb1) r8
            java.util.HashMap r8 = r8.a
            java.util.HashMap r7 = r7.a
            java.util.Set r2 = r7.keySet()
            java.util.Set r3 = r8.keySet()
            boolean r3 = defpackage.nb3.k(r2, r3)
            if (r3 != 0) goto L2a
            goto L67
        L2a:
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.get(r3)
            java.lang.Object r3 = r8.get(r3)
            if (r4 == 0) goto L5e
            if (r3 != 0) goto L47
            goto L5e
        L47:
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L59
            r5 = r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L59
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            boolean r3 = defpackage.fv.p0(r5, r3)
            goto L63
        L59:
            boolean r3 = r4.equals(r3)
            goto L63
        L5e:
            if (r4 != r3) goto L62
            r3 = r0
            goto L63
        L62:
            r3 = r1
        L63:
            if (r3 != 0) goto L2e
            goto L67
        L66:
            return r0
        L67:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.util.HashMap r4 = r4.a
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L2f
            java.lang.Object r1 = r1.getKey()
            int r1 = java.util.Objects.hashCode(r1)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r2 = java.util.Arrays.deepHashCode(r2)
            r1 = r1 ^ r2
            goto L33
        L2f:
            int r1 = r1.hashCode()
        L33:
            int r0 = r0 + r1
            goto Lb
        L35:
            int r0 = r0 * 31
            return r0
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Data {"
            r0.<init>(r1)
            java.util.HashMap r7 = r7.a
            java.util.Set r7 = r7.entrySet()
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            vn0 r5 = new vn0
            r7 = 19
            r5.<init>(r7)
            r6 = 31
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r7 = defpackage.gt0.P0(r1, r2, r3, r4, r5, r6)
            java.lang.String r1 = "}"
            java.lang.String r7 = defpackage.i61.n(r0, r7, r1)
            return r7
    }
}
