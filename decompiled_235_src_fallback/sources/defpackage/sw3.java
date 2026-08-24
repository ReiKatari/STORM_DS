package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw3  reason: default package */
/* loaded from: classes.dex */
public abstract class sw3 implements defpackage.wb6 {
    public final defpackage.wb6 a;

    public sw3(defpackage.wb6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.wb6
    public final int d(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.lang.Integer r0 = defpackage.xs6.h0(r1)
            if (r0 == 0) goto Le
            int r0 = r0.intValue()
            return r0
        Le:
            java.lang.String r0 = " is not a valid list index"
            java.lang.String r0 = r1.concat(r0)
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.wb6
    public final defpackage.np2 e() {
            r0 = this;
            bt6 r0 = defpackage.bt6.f
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L22
        L3:
            boolean r0 = r3 instanceof defpackage.sw3
            if (r0 != 0) goto L8
            goto L24
        L8:
            sw3 r3 = (defpackage.sw3) r3
            wb6 r0 = r3.a
            wb6 r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L24
            java.lang.String r2 = r2.a()
            java.lang.String r3 = r3.a()
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // defpackage.wb6
    public final int f() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.wb6
    public final java.lang.String g(int r1) {
            r0 = this;
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
    }

    public final int hashCode() {
            r1 = this;
            wb6 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r1.a()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // defpackage.wb6
    public final java.util.List i(int r3) {
            r2 = this;
            if (r3 < 0) goto L5
            yt1 r2 = defpackage.yt1.A
            return r2
        L5:
            java.lang.String r0 = "Illegal index "
            java.lang.String r1 = ", "
            java.lang.StringBuilder r3 = defpackage.xg6.t(r0, r3, r1)
            java.lang.String r2 = r2.a()
            java.lang.String r0 = " expects only non-negative indices"
            defpackage.u34.s(r3, r2, r0)
            r2 = 0
            return r2
    }

    @Override // defpackage.wb6
    public final defpackage.wb6 j(int r3) {
            r2 = this;
            if (r3 < 0) goto L5
            wb6 r2 = r2.a
            return r2
        L5:
            java.lang.String r0 = "Illegal index "
            java.lang.String r1 = ", "
            java.lang.StringBuilder r3 = defpackage.xg6.t(r0, r3, r1)
            java.lang.String r2 = r2.a()
            java.lang.String r0 = " expects only non-negative indices"
            defpackage.u34.s(r3, r2, r0)
            r2 = 0
            return r2
    }

    @Override // defpackage.wb6
    public final boolean k(int r3) {
            r2 = this;
            if (r3 < 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "Illegal index "
            java.lang.String r1 = ", "
            java.lang.StringBuilder r3 = defpackage.xg6.t(r0, r3, r1)
            java.lang.String r2 = r2.a()
            java.lang.String r0 = " expects only non-negative indices"
            defpackage.u34.s(r3, r2, r0)
            r2 = 0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            wb6 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
