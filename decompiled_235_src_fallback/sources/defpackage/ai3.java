package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai3  reason: default package */
/* loaded from: classes.dex */
public final class ai3 {
    public final java.lang.Float a;
    public defpackage.hr1 b;

    public ai3(java.lang.Float r1, defpackage.hr1 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ai3
            if (r1 != 0) goto L9
            goto L20
        L9:
            ai3 r4 = (defpackage.ai3) r4
            java.lang.Float r1 = r4.a
            java.lang.Float r2 = r3.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L20
            hr1 r4 = r4.b
            hr1 r3 = r3.b
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 == 0) goto L20
            return r0
        L20:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Float r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.lb1.a(r2, r0, r1)
            hr1 r3 = r3.b
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }
}
