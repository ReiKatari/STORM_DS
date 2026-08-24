package me.magnum.melonds.ui.settings;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SettingsActivity extends defpackage.jq implements defpackage.kr2 {
    public static final /* synthetic */ int F0 = 0;
    public final defpackage.ex6 A0;
    public final defpackage.tp6 B0;
    public final defpackage.tp6 C0;
    public final defpackage.gd6 D0;
    public defpackage.s9 E0;
    public volatile defpackage.r8 x0;
    public final java.lang.Object y0;
    public boolean z0;

    public SettingsActivity() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.y0 = r0
            r0 = 0
            r2.z0 = r0
            iq r0 = new iq
            r1 = 11
            r0.<init>(r2, r1)
            r2.q(r0)
            t46 r0 = new t46
            r1 = 8
            r0.<init>(r2, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r2.A0 = r1
            java.lang.String r0 = ""
            tp6 r0 = defpackage.up6.a(r0)
            r2.B0 = r0
            r0 = 0
            tp6 r0 = defpackage.up6.a(r0)
            r2.C0 = r0
            gd6 r0 = new gd6
            r1 = 1
            r0.<init>(r2, r1)
            r2.D0 = r0
            return
    }

    public final void A(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r8 r0 = r0.z()
            r0.d()
            return
    }

    public final boolean B(defpackage.k15 r2, androidx.preference.Preference r3) {
            r1 = this;
            java.lang.String r0 = r3.getFragment()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Class r2 = r2.getClass()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            if (r2 != 0) goto L15
            r1.getClassLoader()
        L15:
            ll2 r2 = r1.t()
            gl2 r2 = r2.H()
            androidx.fragment.app.o r2 = r2.a(r0)
            android.os.Bundle r3 = r3.getExtras()
            r2.setArguments(r3)
            ll2 r3 = r1.t()
            r3.getClass()
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r3)
            r3 = 2130772000(0x7f010020, float:1.7147106E38)
            r0.d = r3
            r3 = 2130772002(0x7f010022, float:1.714711E38)
            r0.e = r3
            r3 = 2130771999(0x7f01001f, float:1.7147104E38)
            r0.f = r3
            r3 = 2130772001(0x7f010021, float:1.7147108E38)
            r0.g = r3
            s9 r1 = r1.E0
            r3 = 0
            if (r1 == 0) goto L60
            java.lang.Object r1 = r1.b
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            int r1 = r1.getId()
            r0.e(r1, r2, r3)
            r0.c()
            r0.h()
            r1 = 1
            return r1
        L60:
            java.lang.String r1 = "binding"
            defpackage.nb3.a0(r1)
            throw r3
    }

    public final void C(defpackage.k15 r3, androidx.preference.PreferenceScreen r4) {
            r2 = this;
            r4.getClass()
            java.lang.Class r0 = r3.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L10
            r2.getClassLoader()
        L10:
            ll2 r0 = r2.t()
            gl2 r0 = r0.H()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            androidx.fragment.app.o r3 = r0.a(r3)
            java.lang.String r4 = r4.getKey()
            vr4 r0 = new vr4
            java.lang.String r1 = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT"
            r0.<init>(r1, r4)
            vr4[] r4 = new defpackage.vr4[]{r0}
            android.os.Bundle r4 = defpackage.jw2.l(r4)
            r3.setArguments(r4)
            ll2 r4 = r2.t()
            r4.getClass()
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            r0.<init>(r4)
            r4 = 2130772000(0x7f010020, float:1.7147106E38)
            r0.d = r4
            r4 = 2130772002(0x7f010022, float:1.714711E38)
            r0.e = r4
            r4 = 2130771999(0x7f01001f, float:1.7147104E38)
            r0.f = r4
            r4 = 2130772001(0x7f010021, float:1.7147108E38)
            r0.g = r4
            s9 r2 = r2.E0
            r4 = 0
            if (r2 == 0) goto L71
            java.lang.Object r2 = r2.b
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            int r2 = r2.getId()
            r0.e(r2, r3, r4)
            r0.c()
            r0.h()
            return
        L71:
            java.lang.String r2 = "binding"
            defpackage.nb3.a0(r2)
            throw r4
    }

    public final void D() {
            r2 = this;
            ll2 r0 = r2.t()
            androidx.fragment.app.y r0 = r0.c
            java.util.List r0 = r0.f()
            r0.getClass()
            java.lang.Object r0 = defpackage.gt0.R0(r0)
            androidx.fragment.app.o r0 = (androidx.fragment.app.o) r0
            boolean r1 = r0 instanceof defpackage.q15
            if (r1 == 0) goto L26
            ak7 r2 = r2.w()
            if (r2 == 0) goto L26
            q15 r0 = (defpackage.q15) r0
            java.lang.String r0 = r0.getTitle()
            r2.D0(r0)
        L26:
            return
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r0 = this;
            r8 r0 = r0.z()
            java.lang.Object r0 = r0.c()
            return r0
    }

    @Override // defpackage.mv0, defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r1 = this;
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.R(r1, r0)
            return r1
    }

    @Override // androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r13) {
            r12 = this;
            g57 r0 = defpackage.ht.a()
            int r0 = r0.getThemeResId()
            r12.setTheme(r0)
            g57 r0 = defpackage.ht.a()
            g57 r1 = defpackage.g57.LIGHT
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L25
            ix6 r0 = new ix6
            r76 r1 = new r76
            r4 = 17
            r1.<init>(r4)
            r0.<init>(r3, r3, r2, r1)
            defpackage.tr1.a(r12, r0)
            goto L35
        L25:
            ix6 r0 = new ix6
            r76 r1 = new r76
            r4 = 18
            r1.<init>(r4)
            r4 = 2
            r0.<init>(r3, r3, r4, r1)
            defpackage.tr1.a(r12, r0)
        L35:
            r12.A(r13)
            android.view.LayoutInflater r0 = r12.getLayoutInflater()
            r1 = 2131623966(0x7f0e001e, float:1.8875098E38)
            r4 = 0
            android.view.View r0 = r0.inflate(r1, r4, r3)
            r1 = 2131427882(0x7f0b022a, float:1.8477393E38)
            android.view.View r5 = defpackage.gi2.B(r0, r1)
            r8 = r5
            androidx.fragment.app.FragmentContainerView r8 = (androidx.fragment.app.FragmentContainerView) r8
            if (r8 == 0) goto L15a
            r1 = 2131427883(0x7f0b022b, float:1.8477395E38)
            android.view.View r5 = defpackage.gi2.B(r0, r1)
            if (r5 == 0) goto L15a
            j97 r9 = new j97
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r1 = 11
            r9.<init>(r5, r1)
            r1 = 2131428016(0x7f0b02b0, float:1.8477665E38)
            android.view.View r5 = defpackage.gi2.B(r0, r1)
            r10 = r5
            androidx.appcompat.widget.Toolbar r10 = (androidx.appcompat.widget.Toolbar) r10
            if (r10 == 0) goto L15a
            r1 = 2131428072(0x7f0b02e8, float:1.8477778E38)
            android.view.View r11 = defpackage.gi2.B(r0, r1)
            if (r11 == 0) goto L15a
            s9 r6 = new s9
            r7 = r0
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            r6.<init>(r7, r8, r9, r10, r11)
            r12.E0 = r6
            r12.setContentView(r7)
            s9 r0 = r12.E0
            java.lang.String r1 = "binding"
            if (r0 == 0) goto L156
            java.lang.Object r0 = r0.d
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r12.y(r0)
            ak7 r0 = r12.w()
            if (r0 == 0) goto L9a
            r0.B0(r2)
        L9a:
            bh5 r0 = new bh5
            r0.<init>()
            r2 = -1
            r0.A = r2
            s9 r2 = r12.E0
            if (r2 == 0) goto L152
            java.lang.Object r2 = r2.a
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            pk0 r5 = new pk0
            r6 = 6
            r5.<init>(r6, r0, r12)
            java.util.WeakHashMap r0 = defpackage.ao7.a
            defpackage.sn7.c(r2, r5)
            ll2 r0 = r12.t()
            gd6 r2 = new gd6
            r2.<init>(r12, r3)
            java.util.ArrayList r0 = r0.n
            r0.add(r2)
            if (r13 != 0) goto L14e
            android.content.Intent r13 = r12.getIntent()
            android.os.Bundle r13 = r13.getExtras()
            if (r13 == 0) goto Ld6
            java.lang.String r0 = "entry_point"
            java.lang.String r13 = r13.getString(r0)
            goto Ld7
        Ld6:
            r13 = r4
        Ld7:
            if (r13 == 0) goto Lff
            int r0 = r13.hashCode()
            r2 = -1721943526(0xffffffff995d3a1a, float:-1.1437166E-23)
            if (r0 == r2) goto Lf3
            r2 = 2074200845(0x7ba1cb0d, float:1.6801563E36)
            if (r0 == r2) goto Le8
            goto Lff
        Le8:
            java.lang.String r0 = "custom_firmware_entry_point"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto Lff
            java.lang.Class<me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment> r13 = me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment.class
            goto L101
        Lf3:
            java.lang.String r0 = "translator"
            boolean r13 = r13.equals(r0)
            if (r13 != 0) goto Lfc
            goto Lff
        Lfc:
            java.lang.Class<me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment> r13 = me.magnum.melonds.ui.settings.fragments.TranslatorPreferencesFragment.class
            goto L101
        Lff:
            java.lang.Class<me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment> r13 = me.magnum.melonds.ui.settings.fragments.MainPreferencesFragment.class
        L101:
            ll2 r0 = r12.t()
            r0.getClass()
            androidx.fragment.app.a r2 = new androidx.fragment.app.a
            r2.<init>(r0)
            s9 r0 = r12.E0
            if (r0 == 0) goto L14a
            java.lang.Object r0 = r0.b
            androidx.fragment.app.FragmentContainerView r0 = (androidx.fragment.app.FragmentContainerView) r0
            int r0 = r0.getId()
            gl2 r1 = r2.a
            if (r1 == 0) goto L144
            java.lang.ClassLoader r5 = r2.b
            if (r5 == 0) goto L13e
            java.lang.String r13 = r13.getName()
            androidx.fragment.app.o r13 = r1.a(r13)
            r2.e(r0, r13, r4)
            boolean r13 = r2.i
            if (r13 != 0) goto L138
            r2.j = r3
            androidx.fragment.app.u r13 = r2.t
            r13.A(r2, r3)
            goto L14e
        L138:
            java.lang.String r12 = "This transaction is already being added to the back stack"
            defpackage.i.m(r12)
            return
        L13e:
            java.lang.String r12 = "The FragmentManager must be attached to itshost to create a Fragment"
            defpackage.i.m(r12)
            return
        L144:
            java.lang.String r12 = "Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()"
            defpackage.i.m(r12)
            return
        L14a:
            defpackage.nb3.a0(r1)
            throw r4
        L14e:
            r12.D()
            return
        L152:
            defpackage.nb3.a0(r1)
            throw r4
        L156:
            defpackage.nb3.a0(r1)
            throw r4
        L15a:
            android.content.res.Resources r12 = r0.getResources()
            java.lang.String r12 = r12.getResourceName(r1)
            java.lang.String r13 = "Missing required view with ID: "
            java.lang.String r12 = r13.concat(r12)
            defpackage.u34.x(r12)
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
            r0 = this;
            super.onDestroy()
            r8 r0 = r0.z()
            r0.a()
            return
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem r3) {
            r2 = this;
            r3.getClass()
            int r0 = r3.getItemId()
            r1 = 16908332(0x102002c, float:2.3877352E-38)
            if (r0 != r1) goto L1d
            ll2 r3 = r2.t()
            r0 = -1
            r1 = 0
            boolean r3 = r3.R(r0, r1)
            if (r3 != 0) goto L1b
            r2.finish()
        L1b:
            r2 = 1
            return r2
        L1d:
            boolean r2 = super.onOptionsItemSelected(r3)
            return r2
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
            r5 = this;
            super.onStart()
            ex6 r0 = r5.A0
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
            ak7 r1 = r5.w()
            if (r1 == 0) goto L33
            java.lang.CharSequence r1 = r1.h0()
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L3d
        L33:
            r1 = 2131952616(0x7f1303e8, float:1.954168E38)
            java.lang.String r1 = r5.getString(r1)
            r1.getClass()
        L3d:
            tp6 r2 = r5.B0
            r2.getClass()
            r2.m(r4, r1)
            ll2 r1 = r5.t()
            gd6 r2 = r5.D0
            java.util.ArrayList r1 = r1.n
            r1.add(r2)
            java.lang.Object r0 = r0.getValue()
            v82 r0 = (defpackage.v82) r0
            y36 r1 = new y36
            r2 = 4
            r1.<init>(r5, r2)
            zv0 r5 = new zv0
            r2 = 181857455(0xad6ecaf, float:2.0696481E-32)
            r3 = 1
            r5.<init>(r2, r3, r1)
            r0.c = r5
            x82 r0 = r0.b
            if (r0 == 0) goto L70
            vs4 r0 = r0.B
            r0.setValue(r5)
        L70:
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
            r2 = this;
            ll2 r0 = r2.t()
            gd6 r1 = r2.D0
            java.util.ArrayList r0 = r0.n
            r0.remove(r1)
            ex6 r0 = r2.A0
            java.lang.Object r0 = r0.getValue()
            v82 r0 = (defpackage.v82) r0
            r0.a()
            super.onStop()
            return
    }

    public final defpackage.r8 z() {
            r2 = this;
            r8 r0 = r2.x0
            if (r0 != 0) goto L19
            java.lang.Object r0 = r2.y0
            monitor-enter(r0)
            r8 r1 = r2.x0     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            r8 r1 = new r8     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r2.x0 = r1     // Catch: java.lang.Throwable -> L13
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
            r8 r2 = r2.x0
            return r2
    }
}
