package me.magnum.melonds.ui.romlist;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RomListActivity extends defpackage.sx2 {
    public static final /* synthetic */ int K0 = 0;
    public defpackage.e14 B0;
    public final defpackage.uo7 C0;
    public final defpackage.uo7 D0;
    public defpackage.s9 E0;
    public defpackage.ac F0;
    public defpackage.on2 G0;
    public final defpackage.ex6 H0;
    public final defpackage.tp6 I0;
    public defpackage.r9 J0;

    public RomListActivity() {
            r7 = this;
            r0 = 3
            r7.<init>(r0)
            ny5 r1 = new ny5
            r2 = 0
            r1.<init>(r7, r2)
            uo7 r2 = new uo7
            java.lang.Class<tz5> r3 = defpackage.tz5.class
            ar0 r3 = defpackage.gh5.a(r3)
            ny5 r4 = new ny5
            r5 = 1
            r4.<init>(r7, r5)
            ny5 r5 = new ny5
            r6 = 2
            r5.<init>(r7, r6)
            r2.<init>(r3, r4, r1, r5)
            r7.C0 = r2
            ny5 r1 = new ny5
            r1.<init>(r7, r0)
            uo7 r0 = new uo7
            java.lang.Class<qh7> r2 = defpackage.qh7.class
            ar0 r2 = defpackage.gh5.a(r2)
            ny5 r3 = new ny5
            r4 = 4
            r3.<init>(r7, r4)
            ny5 r4 = new ny5
            r5 = 5
            r4.<init>(r7, r5)
            r0.<init>(r2, r3, r1, r4)
            r7.D0 = r0
            er2 r0 = new er2
            r1 = 23
            r0.<init>(r7, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r7.H0 = r1
            r0 = 0
            tp6 r0 = defpackage.up6.a(r0)
            r7.I0 = r0
            return
    }

    public final defpackage.qh7 B() {
            r0 = this;
            uo7 r0 = r0.D0
            java.lang.Object r0 = r0.getValue()
            qh7 r0 = (defpackage.qh7) r0
            return r0
    }

    public final defpackage.tz5 C() {
            r0 = this;
            uo7 r0 = r0.C0
            java.lang.Object r0 = r0.getValue()
            tz5 r0 = (defpackage.tz5) r0
            return r0
    }

    public final void D(defpackage.kt r6) {
            r5 = this;
            ac r0 = r5.F0
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            zb r0 = new zb
            r0.<init>(r5)
            java.lang.Object r1 = r0.L
            wb r1 = (defpackage.wb) r1
            r2 = 2131951855(0x7f1300ef, float:1.9540136E38)
            r0.z(r2)
            r2 = 0
            r1.u = r2
            r3 = 2131623991(0x7f0e0037, float:1.887515E38)
            r1.t = r3
            ey5 r3 = new ey5
            r4 = 1
            r3.<init>(r5, r4)
            r4 = 2131952216(0x7f130258, float:1.9540868E38)
            r0.y(r4, r3)
            r3 = 0
            r1.m = r3
            ac r0 = r0.B()
            r5.F0 = r0
            qh7 r5 = r5.B()
            r6.getClass()
            as0 r0 = defpackage.to7.a(r5)
            bf4 r1 = new bf4
            r3 = 24
            r1.<init>(r5, r6, r2, r3)
            r5 = 3
            defpackage.hv.L(r0, r2, r2, r1, r5)
            return
    }

    @Override // defpackage.jq, defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            r4.getClass()
            int r0 = r4.getAction()
            if (r0 != 0) goto L45
            int r0 = r4.getKeyCode()
            r1 = 20
            r2 = 1
            if (r0 == r1) goto L34
            r1 = 92
            if (r0 == r1) goto L2b
            r1 = 93
            if (r0 == r1) goto L23
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L2b
            r1 = 103(0x67, float:1.44E-43)
            if (r0 == r1) goto L23
            goto L45
        L23:
            tz5 r3 = r3.C()
            r3.j(r2)
            return r2
        L2b:
            tz5 r3 = r3.C()
            r4 = 0
            r3.j(r4)
            return r2
        L34:
            on2 r0 = r3.G0
            if (r0 == 0) goto L45
            java.lang.Object r0 = r0.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto L45
            return r2
        L45:
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
    }

    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r6) {
            r5 = this;
            g57 r0 = defpackage.ht.a()
            int r0 = r0.getThemeResId()
            r5.setTheme(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L17
            do6 r0 = new do6
            r0.<init>(r5)
            goto L1c
        L17:
            hy5 r0 = new hy5
            r0.<init>(r5)
        L1c:
            r0.a()
            g57 r0 = defpackage.ht.a()
            g57 r1 = defpackage.g57.LIGHT
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L39
            ix6 r0 = new ix6
            r76 r1 = new r76
            r4 = 17
            r1.<init>(r4)
            r0.<init>(r3, r3, r2, r1)
            defpackage.tr1.a(r5, r0)
            goto L49
        L39:
            ix6 r0 = new ix6
            r76 r1 = new r76
            r4 = 18
            r1.<init>(r4)
            r4 = 2
            r0.<init>(r3, r3, r4, r1)
            defpackage.tr1.a(r5, r0)
        L49:
            super.onCreate(r6)
            android.view.LayoutInflater r6 = r5.getLayoutInflater()
            r0 = 2131623965(0x7f0e001d, float:1.8875096E38)
            r1 = 0
            android.view.View r6 = r6.inflate(r0, r1, r3)
            r0 = 2131427664(0x7f0b0150, float:1.847695E38)
            android.view.View r3 = defpackage.gi2.B(r6, r0)
            androidx.fragment.app.FragmentContainerView r3 = (androidx.fragment.app.FragmentContainerView) r3
            if (r3 == 0) goto Lf7
            r0 = 2131428016(0x7f0b02b0, float:1.8477665E38)
            android.view.View r3 = defpackage.gi2.B(r6, r0)
            androidx.appcompat.widget.Toolbar r3 = (androidx.appcompat.widget.Toolbar) r3
            if (r3 == 0) goto Lf7
            r0 = 2131428072(0x7f0b02e8, float:1.8477778E38)
            android.view.View r4 = defpackage.gi2.B(r6, r0)
            if (r4 == 0) goto Lf7
            r9 r0 = new r9
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r0.<init>(r6, r3)
            r5.J0 = r0
            r5.setContentView(r6)
            r9 r6 = r5.J0
            if (r6 == 0) goto Lf1
            androidx.appcompat.widget.Toolbar r6 = r6.A
            r5.y(r6)
            ak7 r6 = r5.w()
            if (r6 == 0) goto L95
            r6.j0()
        L95:
            s9 r6 = new s9
            hy5 r0 = new hy5
            r0.<init>(r5)
            r6.<init>(r5, r0)
            r5.E0 = r6
            au3 r6 = defpackage.bl2.C(r5)
            iy5 r0 = new iy5
            r0.<init>(r5, r1, r2)
            r2 = 3
            defpackage.hv.L(r6, r1, r1, r0, r2)
            au3 r6 = defpackage.bl2.C(r5)
            iy5 r0 = new iy5
            r0.<init>(r5, r1, r2)
            defpackage.hv.L(r6, r1, r1, r0, r2)
            au3 r6 = defpackage.bl2.C(r5)
            iy5 r0 = new iy5
            r3 = 5
            r0.<init>(r5, r1, r3)
            defpackage.hv.L(r6, r1, r1, r0, r2)
            au3 r6 = defpackage.bl2.C(r5)
            iy5 r0 = new iy5
            r3 = 7
            r0.<init>(r5, r1, r3)
            defpackage.hv.L(r6, r1, r1, r0, r2)
            au3 r6 = defpackage.bl2.C(r5)
            iy5 r0 = new iy5
            r3 = 9
            r0.<init>(r5, r1, r3)
            defpackage.hv.L(r6, r1, r1, r0, r2)
            au3 r6 = defpackage.bl2.C(r5)
            iy5 r0 = new iy5
            r3 = 11
            r0.<init>(r5, r1, r3)
            defpackage.hv.L(r6, r1, r1, r0, r2)
            return
        Lf1:
            java.lang.String r5 = "binding"
            defpackage.nb3.a0(r5)
            throw r1
        Lf7:
            android.content.res.Resources r5 = r6.getResources()
            java.lang.String r5 = r5.getResourceName(r0)
            java.lang.String r6 = "Missing required view with ID: "
            java.lang.String r5 = r6.concat(r5)
            defpackage.u34.x(r5)
            return
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(android.view.Menu r4) {
            r3 = this;
            r4.getClass()
            android.view.MenuInflater r0 = r3.getMenuInflater()
            r1 = 2131755008(0x7f100000, float:1.9140883E38)
            r0.inflate(r1, r4)
            r0 = 2131427401(0x7f0b0049, float:1.8476417E38)
            android.view.MenuItem r4 = r4.findItem(r0)
            java.lang.Class<android.app.SearchManager> r0 = android.app.SearchManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.SearchManager r0 = (android.app.SearchManager) r0
            if (r0 == 0) goto L43
            android.view.View r1 = r4.getActionView()
            r1.getClass()
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            r2 = 2131952013(0x7f13018d, float:1.9540457E38)
            java.lang.String r2 = r3.getString(r2)
            r1.setQueryHint(r2)
            android.content.ComponentName r2 = r3.getComponentName()
            android.app.SearchableInfo r0 = r0.getSearchableInfo(r2)
            r1.setSearchableInfo(r0)
            hy5 r0 = new hy5
            r0.<init>(r3)
            r1.setOnQueryTextListener(r0)
        L43:
            my5 r0 = new my5
            r0.<init>(r3)
            r4.setOnActionExpandListener(r0)
            r3 = 1
            return r3
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem r7) {
            r6 = this;
            r7.getClass()
            int r7 = r7.getItemId()
            r0 = 2131427408(0x7f0b0050, float:1.8476431E38)
            r1 = 1
            if (r7 != r0) goto L15
            tz5 r6 = r6.C()
            r6.r()
            return r1
        L15:
            r0 = 2131427404(0x7f0b004c, float:1.8476423E38)
            if (r7 != r0) goto L24
            tz5 r6 = r6.C()
            gn6 r7 = defpackage.gn6.ALPHABETICALLY
            r6.q(r7)
            return r1
        L24:
            r0 = 2131427406(0x7f0b004e, float:1.8476427E38)
            if (r7 != r0) goto L33
            tz5 r6 = r6.C()
            gn6 r7 = defpackage.gn6.RECENTLY_PLAYED
            r6.q(r7)
            return r1
        L33:
            r0 = 2131427405(0x7f0b004d, float:1.8476425E38)
            if (r7 != r0) goto L42
            tz5 r6 = r6.C()
            gn6 r7 = defpackage.gn6.MOST_PLAYED
            r6.q(r7)
            return r1
        L42:
            r0 = 2131427388(0x7f0b003c, float:1.847639E38)
            r2 = 5
            java.lang.String r3 = "emulatorLauncherValidatorDelegate"
            r4 = 3
            r5 = 0
            if (r7 != r0) goto L71
            me.magnum.melonds.domain.model.ConsoleType r7 = me.magnum.melonds.domain.model.ConsoleType.DS
            s9 r6 = r6.E0
            if (r6 == 0) goto L6d
            r7.getClass()
            vw1 r6 = r6.A()
            tw1 r0 = new tw1
            r0.<init>(r7)
            r6.f = r0
            as0 r0 = defpackage.to7.a(r6)
            xd1 r3 = new xd1
            r3.<init>(r6, r7, r5, r2)
            defpackage.hv.L(r0, r5, r5, r3, r4)
            return r1
        L6d:
            defpackage.nb3.a0(r3)
            throw r5
        L71:
            r0 = 2131427389(0x7f0b003d, float:1.8476393E38)
            if (r7 != r0) goto L9b
            me.magnum.melonds.domain.model.ConsoleType r7 = me.magnum.melonds.domain.model.ConsoleType.DSi
            s9 r6 = r6.E0
            if (r6 == 0) goto L97
            r7.getClass()
            vw1 r6 = r6.A()
            tw1 r0 = new tw1
            r0.<init>(r7)
            r6.f = r0
            as0 r0 = defpackage.to7.a(r6)
            xd1 r3 = new xd1
            r3.<init>(r6, r7, r5, r2)
            defpackage.hv.L(r0, r5, r5, r3, r4)
            return r1
        L97:
            defpackage.nb3.a0(r3)
            throw r5
        L9b:
            r0 = 2131427393(0x7f0b0041, float:1.84764E38)
            if (r7 != r0) goto Lab
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity> r0 = me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity.class
            r7.<init>(r6, r0)
            r6.startActivity(r7)
            return r1
        Lab:
            r0 = 2131427400(0x7f0b0048, float:1.8476415E38)
            if (r7 != r0) goto Lc6
            tz5 r6 = r6.C()
            r6.p()
            p06 r6 = r6.b
            xb2 r6 = (defpackage.xb2) r6
            o41 r7 = r6.h
            ib2 r0 = new ib2
            r0.<init>(r6, r5, r4)
            defpackage.hv.L(r7, r5, r5, r0, r4)
            return r1
        Lc6:
            r0 = 2131427402(0x7f0b004a, float:1.847642E38)
            if (r7 != r0) goto Ld6
            android.content.Intent r7 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.settings.SettingsActivity> r0 = me.magnum.melonds.ui.settings.SettingsActivity.class
            r7.<init>(r6, r0)
            r6.startActivity(r7)
            return r1
        Ld6:
            r6 = 0
            return r6
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(android.view.Menu r4) {
            r3 = this;
            r4.getClass()
            r0 = 2131427408(0x7f0b0050, float:1.8476431E38)
            android.view.MenuItem r0 = r4.findItem(r0)
            if (r0 == 0) goto L37
            tz5 r1 = r3.C()
            de5 r1 = r1.s
            rp6 r1 = r1.A
            java.lang.Object r1 = r1.getValue()
            n06 r1 = (defpackage.n06) r1
            int[] r2 = defpackage.gy5.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L31
            r2 = 2
            if (r1 != r2) goto L2c
            r1 = 2131230986(0x7f08010a, float:1.807804E38)
            goto L34
        L2c:
            defpackage.i.d()
            r3 = 0
            return r3
        L31:
            r1 = 2131230987(0x7f08010b, float:1.8078042E38)
        L34:
            r0.setIcon(r1)
        L37:
            boolean r3 = super.onPrepareOptionsMenu(r4)
            return r3
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
            r5 = this;
            super.onStart()
            ex6 r0 = r5.H0
            java.lang.Object r1 = r0.getValue()
            v82 r1 = (defpackage.v82) r1
            mv0 r2 = r1.a
            java.lang.String r3 = "display"
            java.lang.Object r2 = r2.getSystemService(r3)
            r2.getClass()
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            zk1 r3 = r1.d
            r4 = 0
            r2.registerDisplayListener(r3, r4)
            r1.b()
            java.lang.Object r0 = r0.getValue()
            v82 r0 = (defpackage.v82) r0
            z5 r1 = new z5
            r2 = 26
            r1.<init>(r5, r2)
            zv0 r5 = new zv0
            r2 = -808863654(0xffffffffcfc9b85a, float:-6.768604E9)
            r3 = 1
            r5.<init>(r2, r3, r1)
            r0.c = r5
            x82 r0 = r0.b
            if (r0 == 0) goto L42
            vs4 r0 = r0.B
            r0.setValue(r5)
        L42:
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
            r1 = this;
            ex6 r0 = r1.H0
            java.lang.Object r0 = r0.getValue()
            v82 r0 = (defpackage.v82) r0
            r0.a()
            super.onStop()
            return
    }
}
