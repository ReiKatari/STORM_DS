package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k83  reason: default package */
/* loaded from: classes.dex */
public final class k83 extends defpackage.f55 implements java.lang.Runnable, defpackage.zk4, android.view.View.OnAttachStateChangeListener {
    public final defpackage.dv7 L;
    public boolean R;
    public boolean X;
    public defpackage.vu7 Y;

    public k83(defpackage.dv7 r2) {
            r1 = this;
            boolean r0 = r2.t
            r0 = r0 ^ 1
            r1.<init>(r0)
            r1.L = r2
            return
    }

    @Override // defpackage.zk4
    public final defpackage.vu7 U(android.view.View r6, defpackage.vu7 r7) {
            r5 = this;
            r5.Y = r7
            dv7 r0 = r5.L
            ok7 r1 = r0.r
            ru7 r2 = r7.a
            r3 = 8
            e83 r4 = r2.h(r3)
            p83 r4 = defpackage.jv7.b(r4)
            r1.f(r4)
            boolean r1 = r5.R
            if (r1 == 0) goto L23
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 != r2) goto L37
            r6.post(r5)
            goto L37
        L23:
            boolean r5 = r5.X
            if (r5 != 0) goto L37
            ok7 r5 = r0.s
            e83 r6 = r2.h(r3)
            p83 r6 = defpackage.jv7.b(r6)
            r5.f(r6)
            defpackage.dv7.b(r0, r7)
        L37:
            boolean r5 = r0.t
            if (r5 == 0) goto L3e
            vu7 r5 = defpackage.vu7.b
            return r5
        L3e:
            return r7
    }

    @Override // defpackage.f55
    public final void i0(defpackage.au7 r6) {
            r5 = this;
            r0 = 0
            r5.R = r0
            r5.X = r0
            vu7 r0 = r5.Y
            zt7 r6 = r6.a
            long r1 = r6.b()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 <= 0) goto L38
            if (r0 == 0) goto L38
            ru7 r6 = r0.a
            dv7 r1 = r5.L
            ok7 r2 = r1.s
            r3 = 8
            e83 r4 = r6.h(r3)
            p83 r4 = defpackage.jv7.b(r4)
            r2.f(r4)
            ok7 r2 = r1.r
            e83 r6 = r6.h(r3)
            p83 r6 = defpackage.jv7.b(r6)
            r2.f(r6)
            defpackage.dv7.b(r1, r0)
        L38:
            r6 = 0
            r5.Y = r6
            return
    }

    @Override // defpackage.f55
    public final void j0(defpackage.au7 r1) {
            r0 = this;
            r1 = 1
            r0.R = r1
            r0.X = r1
            return
    }

    @Override // defpackage.f55
    public final defpackage.vu7 k0(defpackage.vu7 r1, java.util.List r2) {
            r0 = this;
            dv7 r0 = r0.L
            defpackage.dv7.b(r0, r1)
            boolean r0 = r0.t
            if (r0 == 0) goto Lc
            vu7 r0 = defpackage.vu7.b
            return r0
        Lc:
            return r1
    }

    @Override // defpackage.f55
    public final defpackage.rr6 l0(defpackage.au7 r1, defpackage.rr6 r2) {
            r0 = this;
            r1 = 0
            r0.R = r1
            return r2
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            r1.requestApplyInsets()
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            boolean r0 = r5.R
            if (r0 == 0) goto L26
            r0 = 0
            r5.R = r0
            r5.X = r0
            vu7 r0 = r5.Y
            if (r0 == 0) goto L26
            dv7 r1 = r5.L
            ok7 r2 = r1.s
            r3 = 8
            ru7 r4 = r0.a
            e83 r3 = r4.h(r3)
            p83 r3 = defpackage.jv7.b(r3)
            r2.f(r3)
            defpackage.dv7.b(r1, r0)
            r0 = 0
            r5.Y = r0
        L26:
            return
    }
}
