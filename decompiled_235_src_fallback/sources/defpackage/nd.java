package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd  reason: default package */
/* loaded from: classes.dex */
public final class nd extends defpackage.lz implements defpackage.yg2 {
    public final defpackage.s63 A;
    public final defpackage.ab6 B;
    public final defpackage.te L;
    public final defpackage.rf5 R;
    public final java.lang.String X;
    public final android.graphics.Rect Y;
    public final android.view.autofill.AutofillId Z;
    public final defpackage.q94 d0;
    public boolean e0;

    public nd(defpackage.s63 r1, defpackage.ab6 r2, defpackage.te r3, defpackage.rf5 r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.Y = r1
            defpackage.k2.m(r3)
            u2 r1 = defpackage.hi2.z(r3)
            if (r1 == 0) goto L24
            java.lang.Object r1 = r1.b
            android.view.autofill.AutofillId r1 = defpackage.au.b(r1)
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L31
            r0.Z = r1
            q94 r1 = new q94
            r1.<init>()
            r0.d0 = r1
            return
        L31:
            java.lang.String r0 = "Required value was null."
            ug r0 = defpackage.i61.e(r0)
            throw r0
    }

    @Override // defpackage.yg2
    public final void a(defpackage.vh2 r3, defpackage.vh2 r4) {
            r2 = this;
            if (r3 == 0) goto L2d
            sm3 r3 = defpackage.nc1.f0(r3)
            if (r3 == 0) goto L2d
            ta6 r0 = r3.x()
            if (r0 == 0) goto L2d
            ja4 r0 = r0.A
            fb6 r1 = defpackage.sa6.g
            boolean r1 = r0.b(r1)
            if (r1 != 0) goto L20
            fb6 r1 = defpackage.sa6.h
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L2d
        L20:
            int r3 = r3.B
            s63 r0 = r2.A
            java.lang.Object r0 = r0.B
            android.view.autofill.AutofillManager r0 = (android.view.autofill.AutofillManager) r0
            te r1 = r2.L
            defpackage.oc3.p(r0, r1, r3)
        L2d:
            if (r4 == 0) goto L5d
            sm3 r3 = defpackage.nc1.f0(r4)
            if (r3 == 0) goto L5d
            ta6 r4 = r3.x()
            if (r4 == 0) goto L5d
            ja4 r4 = r4.A
            fb6 r0 = defpackage.sa6.g
            boolean r0 = r4.b(r0)
            if (r0 != 0) goto L4f
            fb6 r0 = defpackage.sa6.h
            boolean r4 = r4.b(r0)
            if (r4 == 0) goto L4e
            goto L4f
        L4e:
            return
        L4f:
            int r3 = r3.B
            rf5 r4 = r2.R
            ei r4 = r4.b
            ld r0 = new ld
            r0.<init>(r2, r3)
            r4.m(r3, r0)
        L5d:
            return
    }
}
