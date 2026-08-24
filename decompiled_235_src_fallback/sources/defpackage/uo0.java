package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo0  reason: default package */
/* loaded from: classes.dex */
public final class uo0 extends androidx.fragment.app.i implements defpackage.kr2 {
    public defpackage.bo7 A;
    public boolean B;
    public volatile defpackage.mt L;
    public final java.lang.Object R;
    public boolean X;
    public final defpackage.uo7 Y;
    public defpackage.bt Z;

    public uo0() {
            r6 = this;
            r6.<init>()
            r0 = 0
            r6.B = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r6.R = r1
            r6.X = r0
            pj r1 = new pj
            r2 = 4
            r1.<init>(r6, r2)
            xr3 r3 = defpackage.xr3.NONE
            pj r4 = new pj
            r5 = 5
            r4.<init>(r1, r5)
            go3 r1 = defpackage.kj2.M(r3, r4)
            java.lang.Class<gp0> r3 = defpackage.gp0.class
            ar0 r3 = defpackage.gh5.a(r3)
            to0 r4 = new to0
            r4.<init>(r1, r0)
            to0 r0 = new to0
            r5 = 1
            r0.<init>(r1, r5)
            le r5 = new le
            r5.<init>(r2, r6, r1)
            uo7 r1 = new uo7
            r1.<init>(r3, r4, r5, r0)
            r6.Y = r1
            return
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r2 = this;
            mt r0 = r2.L
            if (r0 != 0) goto L19
            java.lang.Object r0 = r2.R
            monitor-enter(r0)
            mt r1 = r2.L     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            mt r1 = new mt     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r2.L = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            mt r2 = r2.L
            java.lang.Object r2 = r2.c()
            return r2
    }

    @Override // androidx.fragment.app.o
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = super.getContext()
            if (r0 != 0) goto Lc
            boolean r0 = r1.B
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            r1.i()
            bo7 r1 = r1.A
            return r1
    }

    @Override // androidx.fragment.app.o, defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r1 = this;
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.T(r1, r0)
            return r1
    }

    public final void i() {
            r2 = this;
            bo7 r0 = r2.A
            if (r0 != 0) goto L19
            android.content.Context r0 = super.getContext()
            bo7 r1 = new bo7
            r1.<init>(r0, r2)
            r2.A = r1
            android.content.Context r0 = super.getContext()
            boolean r0 = defpackage.bl2.I(r0)
            r2.B = r0
        L19:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(android.app.Activity r4) {
            r3 = this;
            super.onAttach(r4)
            bo7 r0 = r3.A
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            android.content.Context r0 = defpackage.mt.d(r0)
            if (r0 != r4) goto L10
            goto L12
        L10:
            r4 = r2
            goto L13
        L12:
            r4 = r1
        L13:
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            defpackage.qo2.o(r4, r0, r2)
            r3.i()
            boolean r4 = r3.X
            if (r4 != 0) goto L2c
            r3.X = r1
            java.lang.Object r3 = r3.c()
            vo0 r3 = (defpackage.vo0) r3
            r3.getClass()
        L2c:
            return
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onAttach(android.content.Context r1) {
            r0 = this;
            super.onAttach(r1)
            r0.i()
            boolean r1 = r0.X
            if (r1 != 0) goto L16
            r1 = 1
            r0.X = r1
            java.lang.Object r0 = r0.c()
            vo0 r0 = (defpackage.vo0) r0
            r0.getClass()
        L16:
            return
    }

    @Override // androidx.fragment.app.i
    public final android.app.Dialog onCreateDialog(android.os.Bundle r7) {
            r6 = this;
            android.view.LayoutInflater r7 = r6.getLayoutInflater()
            r0 = 2131623984(0x7f0e0030, float:1.8875135E38)
            r1 = 0
            r2 = 0
            android.view.View r7 = r7.inflate(r0, r1, r2)
            r0 = 2131427816(0x7f0b01e8, float:1.8477259E38)
            android.view.View r3 = defpackage.gi2.B(r7, r0)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            if (r3 == 0) goto L64
            r0 = 2131427989(0x7f0b0295, float:1.847761E38)
            android.view.View r4 = defpackage.gi2.B(r7, r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L64
            bt r0 = new bt
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r5 = 16
            r0.<init>(r7, r3, r4, r5)
            r6.Z = r0
            zb r7 = new zb
            android.content.Context r0 = r6.requireContext()
            r7.<init>(r0)
            r0 = 2131952019(0x7f130193, float:1.9540469E38)
            r7.z(r0)
            bt r6 = r6.Z
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r6.B
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r7.A(r6)
            qo0 r6 = new qo0
            r6.<init>(r2)
            r0 = 2131952216(0x7f130258, float:1.9540868E38)
            r7.y(r0, r6)
            java.lang.Object r6 = r7.L
            wb r6 = (defpackage.wb) r6
            r6.m = r2
            ac r6 = r7.l()
            return r6
        L5e:
            java.lang.String r6 = "binding"
            defpackage.nb3.a0(r6)
            throw r1
        L64:
            android.content.res.Resources r6 = r7.getResources()
            java.lang.String r6 = r6.getResourceName(r0)
            java.lang.String r7 = "Missing required view with ID: "
            java.lang.String r6 = r7.concat(r6)
            defpackage.u34.x(r6)
            return r1
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r2) {
            r1 = this;
            android.view.LayoutInflater r2 = super.onGetLayoutInflater(r2)
            bo7 r0 = new bo7
            r0.<init>(r2, r1)
            android.view.LayoutInflater r1 = r2.cloneInContext(r0)
            return r1
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
            r4 = this;
            super.onStart()
            au3 r0 = defpackage.bl2.C(r4)
            so0 r1 = new so0
            r2 = 1
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }
}
