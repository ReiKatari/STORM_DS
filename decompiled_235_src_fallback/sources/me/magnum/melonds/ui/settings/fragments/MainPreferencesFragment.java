package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MainPreferencesFragment extends me.magnum.melonds.ui.settings.fragments.Hilt_MainPreferencesFragment implements defpackage.q15 {
    public MainPreferencesFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.q15
    public final java.lang.String getTitle() {
            r1 = this;
            r0 = 2131952616(0x7f1303e8, float:1.954168E38)
            java.lang.String r1 = r1.getString(r0)
            r1.getClass()
            return r1
    }

    @Override // defpackage.k15
    public final void onCreatePreferences(android.os.Bundle r1, java.lang.String r2) {
            r0 = this;
            r1 = 2132148241(0x7f160011, float:1.9938454E38)
            r0.setPreferencesFromResource(r1, r2)
            return
    }

    @Override // me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment, defpackage.k15
    public final androidx.recyclerview.widget.RecyclerView onCreateRecyclerView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r1 = super.onCreateRecyclerView(r1, r2, r3)
            android.content.res.Resources r2 = r0.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.screenWidthDp
            r3 = 600(0x258, float:8.41E-43)
            if (r2 < r3) goto L1d
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            r0.requireContext()
            r2.<init>()
            r1.setLayoutManager(r2)
        L1d:
            return r1
    }
}
