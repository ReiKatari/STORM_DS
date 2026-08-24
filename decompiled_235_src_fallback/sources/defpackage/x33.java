package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x33  reason: default package */
/* loaded from: classes.dex */
public final class x33 extends defpackage.y33 {
    public final java.lang.String a;

    public x33(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.x33
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x33 r4 = (defpackage.x33) r4
            java.lang.String r3 = r3.a
            java.lang.String r4 = r4.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "ImportSuccess(fileName="
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.a
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            return r2
    }
}
