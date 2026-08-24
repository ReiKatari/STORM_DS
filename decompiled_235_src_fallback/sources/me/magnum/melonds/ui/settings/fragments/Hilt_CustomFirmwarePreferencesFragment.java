package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Hilt_CustomFirmwarePreferencesFragment extends me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment implements defpackage.kr2 {
    public defpackage.bo7 B;
    public boolean L;
    public volatile defpackage.mt R;
    public final java.lang.Object X;
    public boolean Y;

    public Hilt_CustomFirmwarePreferencesFragment() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.L = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.X = r1
            r2.Y = r0
            return
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r2 = this;
            mt r0 = r2.R
            if (r0 != 0) goto L19
            java.lang.Object r0 = r2.X
            monitor-enter(r0)
            mt r1 = r2.R     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            mt r1 = new mt     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r2.R = r1     // Catch: java.lang.Throwable -> L13
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
            mt r2 = r2.R
            java.lang.Object r2 = r2.c()
            return r2
    }

    @Override // androidx.fragment.app.o
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = super.getContext()
            if (r0 != 0) goto Lc
            boolean r0 = r1.L
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            r1.j()
            bo7 r1 = r1.B
            return r1
    }

    @Override // androidx.fragment.app.o, defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r1 = this;
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.T(r1, r0)
            return r1
    }

    public final void j() {
            r2 = this;
            bo7 r0 = r2.B
            if (r0 != 0) goto L19
            android.content.Context r0 = super.getContext()
            bo7 r1 = new bo7
            r1.<init>(r0, r2)
            r2.B = r1
            android.content.Context r0 = super.getContext()
            boolean r0 = defpackage.bl2.I(r0)
            r2.L = r0
        L19:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(android.app.Activity r4) {
            r3 = this;
            super.onAttach(r4)
            bo7 r0 = r3.B
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
            r3.j()
            boolean r4 = r3.Y
            if (r4 != 0) goto L2e
            r3.Y = r1
            java.lang.Object r4 = r3.c()
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment_GeneratedInjector r4 = (me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment_GeneratedInjector) r4
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r3 = (me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment) r3
            r4.b(r3)
        L2e:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(android.content.Context r1) {
            r0 = this;
            super.onAttach(r1)
            r0.j()
            boolean r1 = r0.Y
            if (r1 != 0) goto L18
            r1 = 1
            r0.Y = r1
            java.lang.Object r1 = r0.c()
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment_GeneratedInjector r1 = (me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment_GeneratedInjector) r1
            me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment r0 = (me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment) r0
            r1.b(r0)
        L18:
            return
    }

    @Override // androidx.fragment.app.o
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r2) {
            r1 = this;
            android.view.LayoutInflater r2 = super.onGetLayoutInflater(r2)
            bo7 r0 = new bo7
            r0.<init>(r2, r1)
            android.view.LayoutInflater r1 = r2.cloneInContext(r0)
            return r1
    }
}
