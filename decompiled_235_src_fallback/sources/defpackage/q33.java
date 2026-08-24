package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q33  reason: default package */
/* loaded from: classes.dex */
public final class q33 implements defpackage.kw2, defpackage.s03 {
    public boolean A;

    public q33(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.s03
    public void a(defpackage.my4 r2) {
            r1 = this;
            r2.getClass()
            int r1 = r2.a
            int r2 = r2.b
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            r0.onScreenTouch(r1, r2)
            return
    }

    @Override // defpackage.s03
    public void b(defpackage.b63 r1) {
            r0 = this;
            r1.getClass()
            b63 r0 = defpackage.b63.HINGE
            if (r1 == r0) goto Lc
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            r0.e(r1)
        Lc:
            return
    }

    @Override // defpackage.s03
    public void c(defpackage.b63 r4) {
            r3 = this;
            r4.getClass()
            b63 r0 = defpackage.b63.HINGE
            me.magnum.melonds.MelonEmulator r1 = me.magnum.melonds.MelonEmulator.a
            if (r4 != r0) goto L19
            boolean r4 = r3.A
            r2 = r4 ^ 1
            r3.A = r2
            if (r4 != 0) goto L15
            r1.d(r0)
            return
        L15:
            r1.e(r0)
            return
        L19:
            r1.d(r4)
            return
    }

    @Override // defpackage.kw2
    public boolean d() {
            r0 = this;
            boolean r0 = r0.A
            return r0
    }

    @Override // defpackage.kw2
    public boolean e(defpackage.wi6 r1) {
            r0 = this;
            boolean r0 = r0.A
            return r0
    }
}
