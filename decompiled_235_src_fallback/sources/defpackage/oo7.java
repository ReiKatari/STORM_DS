package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oo7  reason: default package */
/* loaded from: classes.dex */
public final class oo7 extends android.view.View {
    public static final defpackage.kj1 j0 = null;
    public final defpackage.ko1 A;
    public final defpackage.ak0 B;
    public final defpackage.zj0 L;
    public boolean R;
    public android.graphics.Outline d0;
    public boolean e0;
    public defpackage.qh1 f0;
    public defpackage.kk3 g0;
    public defpackage.qn2 h0;
    public defpackage.ut2 i0;

    static {
            kj1 r0 = new kj1
            r1 = 2
            r0.<init>(r1)
            defpackage.oo7.j0 = r0
            return
    }

    public oo7(defpackage.ko1 r2, defpackage.ak0 r3, defpackage.zj0 r4) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0)
            r1.A = r2
            r1.B = r3
            r1.L = r4
            kj1 r2 = defpackage.oo7.j0
            r1.setOutlineProvider(r2)
            r2 = 1
            r1.e0 = r2
            th1 r2 = defpackage.hv.f
            r1.f0 = r2
            kk3 r2 = defpackage.kk3.Ltr
            r1.g0 = r2
            xd5 r2 = defpackage.wt2.a
            r2.getClass()
            hh2 r2 = defpackage.hh2.Y
            r1.h0 = r2
            r2 = 0
            r1.setWillNotDraw(r2)
            r2 = 0
            r1.setClipBounds(r2)
            return
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            ak0 r1 = r0.B
            wd r2 = r1.a
            android.graphics.Canvas r3 = r2.a
            r4 = r18
            r2.a = r4
            qh1 r4 = r0.f0
            kk3 r5 = r0.g0
            int r6 = r0.getWidth()
            float r6 = (float) r6
            int r7 = r0.getHeight()
            float r7 = (float) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r8 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r7)
            long r6 = (long) r6
            r10 = 32
            long r8 = r8 << r10
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            long r6 = r6 | r8
            ut2 r8 = r0.i0
            qn2 r9 = r0.h0
            zj0 r10 = r0.L
            bt r11 = r10.i0()
            qh1 r11 = r11.I()
            bt r12 = r10.i0()
            kk3 r12 = r12.K()
            bt r13 = r10.i0()
            xj0 r13 = r13.G()
            bt r14 = r10.i0()
            long r14 = r14.L()
            bt r0 = r10.i0()
            java.lang.Object r0 = r0.L
            r16 = r3
            r3 = r0
            ut2 r3 = (defpackage.ut2) r3
            bt r0 = r10.i0()
            r0.W(r4)
            r0.X(r5)
            r0.V(r2)
            r0.Y(r6)
            r0.L = r8
            r2.h()
            r9.g(r10)     // Catch: java.lang.Throwable -> L98
            r2.p()
            bt r0 = r10.i0()
            r0.W(r11)
            r0.X(r12)
            r0.V(r13)
            r0.Y(r14)
            r0.L = r3
            wd r0 = r1.a
            r1 = r16
            r0.a = r1
            r0 = 0
            r1 = r17
            r1.R = r0
            return
        L98:
            r0 = move-exception
            r2.p()
            bt r1 = r10.i0()
            r1.W(r11)
            r1.X(r12)
            r1.V(r13)
            r1.Y(r14)
            r1.L = r3
            throw r0
    }

    @Override // android.view.View
    public final void forceLayout() {
            r0 = this;
            return
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
            r0 = this;
            boolean r0 = r0.e0
            return r0
    }

    public final defpackage.ak0 getCanvasHolder() {
            r0 = this;
            ak0 r0 = r0.B
            return r0
    }

    public final android.view.View getOwnerView() {
            r0 = this;
            ko1 r0 = r0.A
            return r0
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
            r0 = this;
            boolean r0 = r0.e0
            return r0
    }

    @Override // android.view.View
    public final void invalidate() {
            r1 = this;
            boolean r0 = r1.R
            if (r0 != 0) goto La
            r0 = 1
            r1.R = r0
            super.invalidate()
        La:
            return
    }

    @Override // android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            return
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean r2) {
            r1 = this;
            boolean r0 = r1.e0
            if (r0 == r2) goto L9
            r1.e0 = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setInvalidated(boolean r1) {
            r0 = this;
            r0.R = r1
            return
    }
}
