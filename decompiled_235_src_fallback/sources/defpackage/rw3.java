package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rw3  reason: default package */
/* loaded from: classes.dex */
public final class rw3 extends defpackage.u {
    public final defpackage.qw3 a;
    public final int b;
    public boolean c;

    public rw3(int r2) {
            r1 = this;
            r1.<init>()
            qw3 r0 = new qw3
            r0.<init>()
            r1.a = r0
            r1.b = r2
            return
    }

    @Override // defpackage.u
    public final boolean b(defpackage.a50 r1) {
            r0 = this;
            boolean r1 = r0.c
            if (r1 == 0) goto L15
            qw3 r0 = r0.a
            java.lang.Object r0 = r0.b
            a21 r0 = (defpackage.a21) r0
            a50 r0 = (defpackage.a50) r0
            boolean r1 = r0 instanceof defpackage.gw3
            if (r1 == 0) goto L15
            gw3 r0 = (defpackage.gw3) r0
            r1 = 0
            r0.g = r1
        L15:
            r0 = 1
            return r0
    }

    @Override // defpackage.u
    public final defpackage.a50 d() {
            r0 = this;
            qw3 r0 = r0.a
            return r0
    }

    @Override // defpackage.u
    public final boolean e() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.u
    public final defpackage.b50 g(defpackage.am1 r4) {
            r3 = this;
            boolean r0 = r4.h
            r1 = 0
            if (r0 == 0) goto L28
            qw3 r0 = r3.a
            java.lang.Object r0 = r0.c
            a21 r0 = (defpackage.a21) r0
            if (r0 != 0) goto Le
            goto L38
        Le:
            u r0 = r4.h()
            a50 r0 = r0.d()
            boolean r2 = r0 instanceof defpackage.xr4
            if (r2 != 0) goto L1e
            boolean r0 = r0 instanceof defpackage.qw3
            if (r0 == 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            r3.c = r1
            int r3 = r4.e
            b50 r3 = defpackage.b50.a(r3)
            return r3
        L28:
            int r0 = r4.g
            int r3 = r3.b
            if (r0 < r3) goto L38
            int r4 = r4.c
            int r4 = r4 + r3
            b50 r3 = new b50
            r0 = -1
            r3.<init>(r0, r1, r4)
            return r3
        L38:
            r3 = 0
            return r3
    }
}
