package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw2  reason: default package */
/* loaded from: classes.dex */
public final class pw2 implements defpackage.wb6 {
    public final java.lang.String a;
    public final defpackage.wb6 b;
    public final defpackage.wb6 c;

    public pw2(java.lang.String r1, defpackage.wb6 r2, defpackage.wb6 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.wb6
    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.a
            return r0
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
            java.lang.String r0 = " is not a valid map index"
            java.lang.String r0 = r1.concat(r0)
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.wb6
    public final defpackage.np2 e() {
            r0 = this;
            bt6 r0 = defpackage.bt6.g
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof defpackage.pw2
            if (r0 != 0) goto L8
            goto L2a
        L8:
            pw2 r3 = (defpackage.pw2) r3
            java.lang.String r0 = r3.a
            java.lang.String r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            wb6 r0 = r2.b
            wb6 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            wb6 r2 = r2.c
            wb6 r3 = r3.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    @Override // defpackage.wb6
    public final int f() {
            r0 = this;
            r0 = 2
            return r0
    }

    @Override // defpackage.wb6
    public final java.lang.String g(int r1) {
            r0 = this;
            java.lang.String r0 = java.lang.String.valueOf(r1)
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wb6 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            wb6 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
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
            java.lang.String r2 = r2.a
            java.lang.String r0 = " expects only non-negative indices"
            java.lang.String r2 = defpackage.i61.n(r3, r2, r0)
            defpackage.i.f(r2)
            r2 = 0
            return r2
    }

    @Override // defpackage.wb6
    public final defpackage.wb6 j(int r4) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L16
            int r4 = r4 % 2
            if (r4 == 0) goto L13
            r1 = 1
            if (r4 != r1) goto Ld
            wb6 r3 = r3.c
            return r3
        Ld:
            java.lang.String r3 = "Unreached"
            defpackage.i.m(r3)
            return r0
        L13:
            wb6 r3 = r3.b
            return r3
        L16:
            java.lang.String r1 = "Illegal index "
            java.lang.String r2 = ", "
            java.lang.StringBuilder r4 = defpackage.xg6.t(r1, r4, r2)
            java.lang.String r3 = r3.a
            java.lang.String r1 = " expects only non-negative indices"
            java.lang.String r3 = defpackage.i61.n(r4, r3, r1)
            defpackage.i.f(r3)
            return r0
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
            java.lang.String r2 = r2.a
            java.lang.String r0 = " expects only non-negative indices"
            java.lang.String r2 = defpackage.i61.n(r3, r2, r0)
            defpackage.i.f(r2)
            r2 = 0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            wb6 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            wb6 r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
