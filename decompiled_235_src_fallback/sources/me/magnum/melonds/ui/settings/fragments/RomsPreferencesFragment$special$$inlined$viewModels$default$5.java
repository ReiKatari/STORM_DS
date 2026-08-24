package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RomsPreferencesFragment$special$$inlined$viewModels$default$5 extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment B;
    public final /* synthetic */ defpackage.go3 L;

    public RomsPreferencesFragment$special$$inlined$viewModels$default$5(me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment r1, defpackage.go3 r2) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r2 = this;
            go3 r0 = r2.L
            java.lang.Object r0 = r0.getValue()
            bp7 r0 = (defpackage.bp7) r0
            boolean r1 = r0 instanceof defpackage.mw2
            if (r1 == 0) goto Lf
            mw2 r0 = (defpackage.mw2) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L1a
            yo7 r0 = r0.getDefaultViewModelProviderFactory()
            if (r0 != 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment r2 = r2.B
            yo7 r2 = r2.getDefaultViewModelProviderFactory()
            return r2
    }
}
