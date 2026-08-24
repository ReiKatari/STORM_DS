package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej4  reason: default package */
/* loaded from: classes.dex */
public final class ej4 {
    public final defpackage.ui4 a;
    public final java.lang.Long b;
    public final byte[] c;

    public ej4(defpackage.ui4 r1, java.lang.Long r2, byte[] r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ej4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ej4 r5 = (defpackage.ej4) r5
            ui4 r1 = r4.a
            ui4 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Long r1 = r4.b
            java.lang.Long r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            byte[] r4 = r4.c
            byte[] r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            ui4 r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.Long r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            byte[] r3 = r3.c
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r1 = java.util.Arrays.hashCode(r3)
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            byte[] r0 = r3.c
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Verification(integrity="
            r1.<init>(r2)
            ui4 r2 = r3.a
            r1.append(r2)
            java.lang.String r2 = ", lastSeq="
            r1.append(r2)
            java.lang.Long r3 = r3.b
            r1.append(r3)
            java.lang.String r3 = ", lastPayloadHash="
            r1.append(r3)
            java.lang.String r3 = ")"
            java.lang.String r3 = defpackage.i61.n(r1, r0, r3)
            return r3
    }
}
