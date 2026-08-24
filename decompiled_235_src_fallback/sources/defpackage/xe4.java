package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xe4  reason: default package */
/* loaded from: classes.dex */
public final class xe4 extends defpackage.c20 {
    public final int b;

    static {
            java.lang.String r0 = "NetworkNotRoamingCtrlr"
            defpackage.ga0.h(r0)
            return
    }

    public xe4(defpackage.if4 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            r1 = 7
            r0.b = r1
            return
    }

    @Override // defpackage.k11
    public final boolean c(defpackage.yw7 r1) {
            r0 = this;
            r1.getClass()
            p21 r0 = r1.j
            kf4 r0 = r0.a
            kf4 r1 = defpackage.kf4.NOT_ROAMING
            if (r0 != r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // defpackage.c20
    public final int d() {
            r0 = this;
            int r0 = r0.b
            return r0
    }

    @Override // defpackage.c20
    public final boolean e(java.lang.Object r1) {
            r0 = this;
            gf4 r1 = (defpackage.gf4) r1
            r1.getClass()
            boolean r0 = r1.a
            if (r0 == 0) goto L14
            boolean r0 = r1.d
            if (r0 == 0) goto L14
            boolean r0 = r1.e
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            return r0
        L14:
            r0 = 1
            return r0
    }
}
