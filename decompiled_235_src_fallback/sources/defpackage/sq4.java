package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sq4  reason: default package */
/* loaded from: classes.dex */
public final class sq4 implements defpackage.tp3 {
    public final defpackage.ue1 a;

    public sq4(defpackage.ue1 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.tp3
    public final int a() {
            r0 = this;
            ue1 r0 = r0.a
            int r0 = r0.n()
            return r0
    }

    @Override // defpackage.tp3
    public final int b() {
            r1 = this;
            ue1 r1 = r1.a
            int r0 = r1.n()
            int r0 = r0 + (-1)
            cr4 r1 = r1.m()
            java.util.List r1 = r1.a
            java.lang.Object r1 = defpackage.gt0.Q0(r1)
            i34 r1 = (defpackage.i34) r1
            int r1 = r1.a
            int r1 = java.lang.Math.min(r0, r1)
            return r1
    }

    @Override // defpackage.tp3
    public final int c() {
            r2 = this;
            ue1 r2 = r2.a
            cr4 r0 = r2.m()
            java.util.List r0 = r0.a
            int r0 = r0.size()
            if (r0 != 0) goto L10
            r2 = 0
            return r2
        L10:
            cr4 r0 = r2.m()
            int r0 = defpackage.gi2.G(r0)
            cr4 r1 = r2.m()
            int r1 = r1.b
            cr4 r2 = r2.m()
            int r2 = r2.c
            int r1 = r1 + r2
            r2 = 1
            if (r1 != 0) goto L29
            goto L2c
        L29:
            int r0 = r0 / r1
            if (r0 >= r2) goto L2d
        L2c:
            return r2
        L2d:
            return r0
    }

    @Override // defpackage.tp3
    public final boolean d() {
            r0 = this;
            ue1 r0 = r0.a
            cr4 r0 = r0.m()
            java.util.List r0 = r0.a
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.tp3
    public final int e() {
            r1 = this;
            ue1 r1 = r1.a
            int r1 = r1.e
            r0 = 0
            int r1 = java.lang.Math.max(r0, r1)
            return r1
    }
}
