package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh4  reason: default package */
/* loaded from: classes.dex */
public final class wh4 implements defpackage.gg3 {
    public final java.lang.Object a;
    public final java.util.List b;
    public final defpackage.go3 c;

    public wh4(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            r4.getClass()
            r2.<init>()
            r2.a = r4
            yt1 r4 = defpackage.yt1.A
            r2.b = r4
            xr3 r4 = defpackage.xr3.PUBLICATION
            ci2 r0 = new ci2
            r1 = 15
            r0.<init>(r1, r3, r2)
            go3 r3 = defpackage.kj2.M(r4, r0)
            r2.c = r3
            return
    }

    public wh4(java.lang.String r1, java.lang.Object r2, java.lang.annotation.Annotation[] r3) {
            r0 = this;
            r2.getClass()
            r0.<init>(r1, r2)
            java.util.List r1 = java.util.Arrays.asList(r3)
            r1.getClass()
            r0.b = r1
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r4) {
            r3 = this;
            wb6 r0 = r3.e()
            ux0 r4 = r4.c(r0)
            r4.getClass()
            wb6 r1 = r3.e()
            int r1 = r4.q(r1)
            r2 = -1
            if (r1 != r2) goto L1c
            r4.a(r0)
            java.lang.Object r3 = r3.a
            return r3
        L1c:
            fc6 r3 = new fc6
            java.lang.String r4 = "Unexpected index "
            java.lang.String r4 = defpackage.lb1.g(r1, r4)
            r3.<init>(r4)
            throw r3
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            r2.getClass()
            wb6 r2 = r0.e()
            vx0 r1 = r1.c(r2)
            wb6 r0 = r0.e()
            r1.a(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            go3 r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            wb6 r0 = (defpackage.wb6) r0
            return r0
    }
}
