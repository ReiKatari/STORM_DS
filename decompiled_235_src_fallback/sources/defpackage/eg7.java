package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg7  reason: default package */
/* loaded from: classes.dex */
public final class eg7 extends defpackage.o66 {
    public final java.lang.ThreadLocal Z;
    private volatile boolean threadLocalIsSet;

    public eg7(defpackage.r41 r3, defpackage.l61 r4) {
            r2 = this;
            wj0 r0 = defpackage.wj0.R
            j61 r1 = r4.Z(r0)
            if (r1 != 0) goto Ld
            l61 r0 = r4.N(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.Z = r0
            l61 r3 = r3.b()
            d90 r0 = defpackage.d90.r0
            j61 r3 = r3.Z(r0)
            boolean r3 = r3 instanceof defpackage.n61
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = defpackage.k57.c(r4, r3)
            defpackage.k57.a(r4, r3)
            r2.z0(r4, r3)
        L31:
            return
    }

    @Override // defpackage.o66, defpackage.ed3
    public final void g(java.lang.Object r5) {
            r4 = this;
            r4.y0()
            java.lang.Object r5 = defpackage.lb4.H(r5)
            r41 r4 = r4.Y
            l61 r0 = r4.b()
            r1 = 0
            java.lang.Object r2 = defpackage.k57.c(r0, r1)
            gr1 r3 = defpackage.k57.a
            if (r2 == r3) goto L1a
            eg7 r1 = defpackage.mb3.O(r4, r0, r2)
        L1a:
            r4.i(r5)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L27
            boolean r4 = r1.x0()
            if (r4 == 0) goto L26
            goto L27
        L26:
            return
        L27:
            defpackage.k57.a(r0, r2)
            return
        L2b:
            r4 = move-exception
            if (r1 == 0) goto L34
            boolean r5 = r1.x0()
            if (r5 == 0) goto L37
        L34:
            defpackage.k57.a(r0, r2)
        L37:
            throw r4
    }

    @Override // defpackage.o66
    public final void w0() {
            r0 = this;
            r0.y0()
            return
    }

    public final boolean x0() {
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            r1 = 1
            if (r0 == 0) goto Lf
            java.lang.ThreadLocal r0 = r2.Z
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.ThreadLocal r2 = r2.Z
            r2.remove()
            r2 = r0 ^ 1
            return r2
    }

    public final void y0() {
            r2 = this;
            boolean r0 = r2.threadLocalIsSet
            if (r0 == 0) goto L1c
            java.lang.ThreadLocal r0 = r2.Z
            java.lang.Object r0 = r0.get()
            vr4 r0 = (defpackage.vr4) r0
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.A
            l61 r1 = (defpackage.l61) r1
            java.lang.Object r0 = r0.B
            defpackage.k57.a(r1, r0)
        L17:
            java.lang.ThreadLocal r2 = r2.Z
            r2.remove()
        L1c:
            return
    }

    public final void z0(defpackage.l61 r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.threadLocalIsSet = r0
            java.lang.ThreadLocal r1 = r1.Z
            vr4 r0 = new vr4
            r0.<init>(r2, r3)
            r1.set(r0)
            return
    }
}
