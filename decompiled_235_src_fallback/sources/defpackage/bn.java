package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bn  reason: default package */
/* loaded from: classes.dex */
public final class bn implements defpackage.tt7 {
    public final int a;
    public final java.lang.String b;
    public final defpackage.vs4 c;
    public final defpackage.vs4 d;

    public bn(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            e83 r1 = defpackage.e83.e
            vs4 r1 = defpackage.np2.Y(r1)
            r0.c = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            vs4 r1 = defpackage.np2.Y(r1)
            r0.d = r1
            return
    }

    @Override // defpackage.tt7
    public final int a(defpackage.qh1 r1) {
            r0 = this;
            e83 r0 = r0.e()
            int r0 = r0.b
            return r0
    }

    @Override // defpackage.tt7
    public final int b(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            e83 r0 = r0.e()
            int r0 = r0.c
            return r0
    }

    @Override // defpackage.tt7
    public final int c(defpackage.qh1 r1) {
            r0 = this;
            e83 r0 = r0.e()
            int r0 = r0.d
            return r0
    }

    @Override // defpackage.tt7
    public final int d(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            e83 r0 = r0.e()
            int r0 = r0.a
            return r0
    }

    public final defpackage.e83 e() {
            r0 = this;
            vs4 r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            e83 r0 = (defpackage.e83) r0
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L10
        L3:
            boolean r0 = r2 instanceof defpackage.bn
            if (r0 != 0) goto L8
            goto L12
        L8:
            bn r2 = (defpackage.bn) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 != r2) goto L12
        L10:
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final void f(boolean r1) {
            r0 = this;
            vs4 r0 = r0.d
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }

    public final void g(defpackage.vu7 r3, int r4) {
            r2 = this;
            int r0 = r2.a
            if (r4 == 0) goto L9
            r4 = r4 & r0
            if (r4 == 0) goto L8
            goto L9
        L8:
            return
        L9:
            ru7 r4 = r3.a
            e83 r4 = r4.h(r0)
            vs4 r1 = r2.c
            r1.setValue(r4)
            ru7 r3 = r3.a
            boolean r3 = r3.t(r0)
            r2.f(r3)
            return
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.b
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            e83 r1 = r3.e()
            int r1 = r1.a
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            e83 r2 = r3.e()
            int r2 = r2.b
            r0.append(r2)
            r0.append(r1)
            e83 r2 = r3.e()
            int r2 = r2.c
            r0.append(r2)
            r0.append(r1)
            e83 r3 = r3.e()
            int r3 = r3.d
            r1 = 41
            java.lang.String r3 = defpackage.xg6.q(r0, r3, r1)
            return r3
    }
}
