package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd6  reason: default package */
/* loaded from: classes.dex */
public final class dd6 implements defpackage.ds1 {
    public final int a;
    public final int b;

    public dd6(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.ds1
    public final void a(defpackage.gs1 r4) {
            r3 = this;
            java.lang.Object r0 = r4.Y
            m42 r0 = (defpackage.m42) r0
            int r0 = r0.b()
            int r1 = r3.a
            r2 = 0
            int r0 = defpackage.gi2.q(r1, r2, r0)
            java.lang.Object r1 = r4.Y
            m42 r1 = (defpackage.m42) r1
            int r1 = r1.b()
            int r3 = r3.b
            int r3 = defpackage.gi2.q(r3, r2, r1)
            if (r0 >= r3) goto L23
            r4.f(r0, r3)
            return
        L23:
            r4.f(r3, r0)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.dd6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            dd6 r5 = (defpackage.dd6) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            int r0 = r0 * 31
            int r1 = r1.b
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SetSelectionCommand(start="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
