package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur3  reason: default package */
/* loaded from: classes.dex */
public final class ur3 extends defpackage.ap6 {
    public final defpackage.r41 Y;

    public ur3(defpackage.l61 r2, defpackage.eo2 r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r41 r2 = defpackage.np2.F(r3, r1, r1)
            r1.Y = r2
            return
    }

    @Override // defpackage.ed3
    public final void j0() {
            r2 = this;
            r41 r0 = r2.Y
            r41 r0 = defpackage.np2.V(r0)     // Catch: java.lang.Throwable -> Lc
            jg7 r1 = defpackage.jg7.a     // Catch: java.lang.Throwable -> Lc
            defpackage.ok1.a(r0, r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            boolean r1 = r0 instanceof defpackage.mk1
            if (r1 == 0) goto L15
            mk1 r0 = (defpackage.mk1) r0
            java.lang.Throwable r0 = r0.A
        L15:
            em5 r1 = defpackage.oi2.p(r0)
            r2.i(r1)
            throw r0
    }
}
