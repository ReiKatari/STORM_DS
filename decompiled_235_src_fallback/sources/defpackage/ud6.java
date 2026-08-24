package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud6  reason: default package */
/* loaded from: classes.dex */
public final class ud6 {
    public final defpackage.td6 a;
    public final java.lang.Object b;

    public ud6(defpackage.td6 r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            if (r3 == 0) goto L38
            qs0 r1 = defpackage.us0.a
            java.lang.Object r1 = r1.get(r2)
            j0 r1 = (defpackage.j0) r1
            java.lang.Class[] r1 = r1.a
            java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
            i0 r0 = new i0
            r0.<init>(r3)
            boolean r1 = r1.anyMatch(r0)
            if (r1 == 0) goto L23
            goto L38
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "The "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r2 = " method doesn't support options of type "
            java.lang.Class r3 = r3.getClass()
            defpackage.fa6.g(r1, r2, r3)
            r1 = 0
            throw r1
        L38:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.Class<ud6> r2 = defpackage.ud6.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L27
        L10:
            ud6 r5 = (defpackage.ud6) r5
            td6 r2 = r4.a
            td6 r3 = r5.a
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L27
            java.lang.Object r4 = r4.b
            java.lang.Object r5 = r5.b
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L27
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r0 = this;
            td6 r0 = r0.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }
}
