package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo1  reason: default package */
/* loaded from: classes.dex */
public final class uo1 extends defpackage.sr4 implements defpackage.bj5 {
    public final android.graphics.drawable.Drawable X;
    public final defpackage.vs4 Y;
    public final defpackage.vs4 Z;
    public final defpackage.ex6 d0;

    public uo1(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r5.getClass()
            r4.<init>()
            r4.X = r5
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            vs4 r1 = defpackage.np2.Y(r1)
            r4.Y = r1
            go3 r1 = defpackage.vo1.a
            int r1 = r5.getIntrinsicWidth()
            if (r1 < 0) goto L30
            int r1 = r5.getIntrinsicHeight()
            if (r1 < 0) goto L30
            int r1 = r5.getIntrinsicWidth()
            float r1 = (float) r1
            int r2 = r5.getIntrinsicHeight()
            float r2 = (float) r2
            long r1 = defpackage.ii2.n(r1, r2)
            goto L35
        L30:
            r1 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L35:
            xi6 r3 = new xi6
            r3.<init>(r1)
            vs4 r1 = defpackage.np2.Y(r3)
            r4.Z = r1
            pj r1 = new pj
            r2 = 7
            r1.<init>(r4, r2)
            ex6 r2 = new ex6
            r2.<init>(r1)
            r4.d0 = r2
            int r4 = r5.getIntrinsicWidth()
            if (r4 < 0) goto L64
            int r4 = r5.getIntrinsicHeight()
            if (r4 < 0) goto L64
            int r4 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            r5.setBounds(r0, r0, r4, r1)
        L64:
            return
    }

    @Override // defpackage.bj5
    public final void a() {
            r0 = this;
            r0.b()
            return
    }

    @Override // defpackage.bj5
    public final void b() {
            r1 = this;
            android.graphics.drawable.Drawable r1 = r1.X
            boolean r0 = r1 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto Lc
            r0 = r1
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            r0.stop()
        Lc:
            r0 = 0
            r1.setVisible(r0, r0)
            r0 = 0
            r1.setCallback(r0)
            return
    }

    @Override // defpackage.bj5
    public final void c() {
            r1 = this;
            ex6 r0 = r1.d0
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable$Callback r0 = (android.graphics.drawable.Drawable.Callback) r0
            android.graphics.drawable.Drawable r1 = r1.X
            r1.setCallback(r0)
            r0 = 1
            r1.setVisible(r0, r0)
            boolean r0 = r1 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L1a
            android.graphics.drawable.Animatable r1 = (android.graphics.drawable.Animatable) r1
            r1.start()
        L1a:
            return
    }

    @Override // defpackage.sr4
    public final void d(float r3) {
            r2 = this;
            r0 = 1132396544(0x437f0000, float:255.0)
            float r3 = r3 * r0
            int r3 = defpackage.u24.E(r3)
            r0 = 0
            r1 = 255(0xff, float:3.57E-43)
            int r3 = defpackage.gi2.q(r3, r0, r1)
            android.graphics.drawable.Drawable r2 = r2.X
            r2.setAlpha(r3)
            return
    }

    @Override // defpackage.sr4
    public final void e(defpackage.z40 r1) {
            r0 = this;
            if (r1 == 0) goto L5
            android.graphics.ColorFilter r1 = r1.a
            goto L6
        L5:
            r1 = 0
        L6:
            android.graphics.drawable.Drawable r0 = r0.X
            r0.setColorFilter(r1)
            return
    }

    @Override // defpackage.sr4
    public final void f(defpackage.kk3 r3) {
            r2 = this;
            r3.getClass()
            int[] r0 = defpackage.to1.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L16
            r1 = 2
            if (r3 != r1) goto L12
            goto L17
        L12:
            defpackage.i.d()
            return
        L16:
            r0 = 0
        L17:
            android.graphics.drawable.Drawable r2 = r2.X
            r2.setLayoutDirection(r0)
            return
    }

    @Override // defpackage.sr4
    public final long h() {
            r2 = this;
            vs4 r2 = r2.Z
            java.lang.Object r2 = r2.getValue()
            xi6 r2 = (defpackage.xi6) r2
            long r0 = r2.a
            return r0
    }

    @Override // defpackage.sr4
    public final void i(defpackage.um3 r5) {
            r4 = this;
            zj0 r5 = r5.A
            bt r0 = r5.B
            xj0 r0 = r0.G()
            vs4 r1 = r4.Y
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            r1.intValue()
            long r1 = r5.e()
            float r1 = defpackage.xi6.e(r1)
            int r1 = defpackage.u24.E(r1)
            long r2 = r5.e()
            float r5 = defpackage.xi6.c(r2)
            int r5 = defpackage.u24.E(r5)
            android.graphics.drawable.Drawable r4 = r4.X
            r2 = 0
            r4.setBounds(r2, r2, r1, r5)
            r0.h()     // Catch: java.lang.Throwable -> L42
            android.graphics.Canvas r5 = defpackage.xd.a     // Catch: java.lang.Throwable -> L42
            r5 = r0
            wd r5 = (defpackage.wd) r5     // Catch: java.lang.Throwable -> L42
            android.graphics.Canvas r5 = r5.a     // Catch: java.lang.Throwable -> L42
            r4.draw(r5)     // Catch: java.lang.Throwable -> L42
            r0.p()
            return
        L42:
            r4 = move-exception
            r0.p()
            throw r4
    }
}
