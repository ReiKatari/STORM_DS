package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok7  reason: default package */
/* loaded from: classes.dex */
public final class ok7 implements defpackage.tt7 {
    public final java.lang.String a;
    public final defpackage.vs4 b;

    public ok7(defpackage.p83 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            vs4 r1 = defpackage.np2.Y(r1)
            r0.b = r1
            return
    }

    @Override // defpackage.tt7
    public final int a(defpackage.qh1 r1) {
            r0 = this;
            p83 r0 = r0.e()
            int r0 = r0.b
            return r0
    }

    @Override // defpackage.tt7
    public final int b(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            p83 r0 = r0.e()
            int r0 = r0.c
            return r0
    }

    @Override // defpackage.tt7
    public final int c(defpackage.qh1 r1) {
            r0 = this;
            p83 r0 = r0.e()
            int r0 = r0.d
            return r0
    }

    @Override // defpackage.tt7
    public final int d(defpackage.qh1 r1, defpackage.kk3 r2) {
            r0 = this;
            p83 r0 = r0.e()
            int r0 = r0.a
            return r0
    }

    public final defpackage.p83 e() {
            r0 = this;
            vs4 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            p83 r0 = (defpackage.p83) r0
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.ok7
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            p83 r1 = r1.e()
            ok7 r2 = (defpackage.ok7) r2
            p83 r2 = r2.e()
            boolean r1 = defpackage.nb3.k(r1, r2)
            return r1
    }

    public final void f(defpackage.p83 r1) {
            r0 = this;
            vs4 r0 = r0.b
            r0.setValue(r1)
            return
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "(left="
            r0.append(r1)
            p83 r1 = r2.e()
            int r1 = r1.a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            p83 r1 = r2.e()
            int r1 = r1.b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            p83 r1 = r2.e()
            int r1 = r1.c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            p83 r2 = r2.e()
            int r2 = r2.d
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
