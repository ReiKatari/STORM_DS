package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iu0  reason: default package */
/* loaded from: classes.dex */
public final class iu0 implements defpackage.a74 {
    public final defpackage.a74 a;
    public final defpackage.a74 b;

    public iu0(defpackage.a74 r1, defpackage.a74 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.a74
    public final boolean a(defpackage.qn2 r2) {
            r1 = this;
            a74 r0 = r1.a
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L12
            a74 r1 = r1.b
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // defpackage.a74
    public final java.lang.Object b(defpackage.eo2 r2, java.lang.Object r3) {
            r1 = this;
            a74 r0 = r1.a
            java.lang.Object r3 = r0.b(r2, r3)
            a74 r1 = r1.b
            java.lang.Object r1 = r1.b(r2, r3)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.iu0
            if (r0 == 0) goto L1c
            iu0 r3 = (defpackage.iu0) r3
            a74 r0 = r3.a
            a74 r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1c
            a74 r2 = r2.b
            a74 r3 = r3.b
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            a74 r0 = r1.a
            int r0 = r0.hashCode()
            a74 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            java.lang.String r1 = ""
            pn r2 = defpackage.pn.X
            java.lang.Object r3 = r3.b(r2, r1)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 93
            java.lang.String r3 = defpackage.lb1.q(r0, r3, r1)
            return r3
    }
}
