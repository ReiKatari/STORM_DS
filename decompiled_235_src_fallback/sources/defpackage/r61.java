package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r61  reason: default package */
/* loaded from: classes.dex */
public final class r61 extends defpackage.r0 {
    public static final defpackage.q61 L = null;
    public final java.lang.String B;

    static {
            q61 r0 = new q61
            r0.<init>()
            defpackage.r61.L = r0
            return
    }

    public r61(java.lang.String r2) {
            r1 = this;
            q61 r0 = defpackage.r61.L
            r1.<init>(r0)
            r1.B = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.r61
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r61 r4 = (defpackage.r61) r4
            java.lang.String r3 = r3.B
            java.lang.String r4 = r4.B
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.B
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CoroutineName("
            r0.<init>(r1)
            java.lang.String r2 = r2.B
            r1 = 41
            java.lang.String r2 = defpackage.lb1.q(r0, r2, r1)
            return r2
    }
}
