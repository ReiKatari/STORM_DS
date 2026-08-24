package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SoftInputBehaviourPreferencesFragment extends androidx.fragment.app.o implements defpackage.q15 {
    public SoftInputBehaviourPreferencesFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131952682(0x7f13042a, float:1.9541814E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    @Override // androidx.fragment.app.o
    public final android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            r1.getClass()
            androidx.compose.ui.platform.ComposeView r1 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r0 = r0.requireContext()
            r0.getClass()
            r2 = 0
            r3 = 6
            r1.<init>(r0, r2, r3)
            cs1 r0 = defpackage.cs1.p0
            r1.setViewCompositionStrategy(r0)
            zv0 r0 = me.magnum.melonds.ui.settings.fragments.ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt.b
            r1.setContent(r0)
            return r1
    }
}
