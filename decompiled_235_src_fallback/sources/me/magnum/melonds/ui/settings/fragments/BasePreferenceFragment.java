package me.magnum.melonds.ui.settings.fragments;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class BasePreferenceFragment extends defpackage.k15 {
    public java.lang.String A;

    public BasePreferenceFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public final void h(java.lang.String r5, java.lang.String[] r6, boolean r7) {
            r4 = this;
            androidx.preference.Preference r5 = r4.findPreference(r5)
            androidx.preference.TwoStatePreference r5 = (androidx.preference.TwoStatePreference) r5
            if (r5 != 0) goto L9
            return
        L9:
            boolean r0 = r5.A
            r1 = 0
            if (r0 != r7) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = r1
        L11:
            int r2 = r6.length
        L12:
            if (r1 >= r2) goto L22
            r3 = r6[r1]
            androidx.preference.Preference r3 = r4.findPreference(r3)
            if (r3 == 0) goto L1f
            r3.setVisible(r0)
        L1f:
            int r1 = r1 + 1
            goto L12
        L22:
            x05 r0 = r5.getOnPreferenceChangeListener()
            n20 r1 = new n20
            r1.<init>(r0, r7, r6, r4)
            r5.setOnPreferenceChangeListener(r1)
            return
    }

    public final void i(androidx.recyclerview.widget.RecyclerView r3, java.lang.String r4, int r5) {
            r2 = this;
            wf5 r0 = r3.getAdapter()
            boolean r1 = r0 instanceof defpackage.t15
            if (r1 == 0) goto Lb
            t15 r0 = (defpackage.t15) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto Lf
            goto L31
        Lf:
            int r0 = r0.l(r4)
            r1 = -1
            if (r0 != r1) goto L17
            goto L31
        L17:
            wg5 r1 = r3.I(r0)
            if (r1 == 0) goto L23
            android.view.View r2 = r1.a
            r2.requestFocus()
            return
        L23:
            r1 = 6
            if (r5 >= r1) goto L31
            r3.h0(r0)
            o20 r0 = new o20
            r0.<init>(r2, r3, r4, r5)
            r3.post(r0)
        L31:
            return
    }

    @Override // defpackage.k15
    public androidx.recyclerview.widget.RecyclerView onCreateRecyclerView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r1 = super.onCreateRecyclerView(r1, r2, r3)
            r2 = 0
            r1.setClipToPadding(r2)
            i r2 = new i
            r3 = 4
            r2.<init>(r3)
            java.util.WeakHashMap r3 = defpackage.ao7.a
            defpackage.sn7.c(r1, r2)
            me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2 r2 = new me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2
            r2.<init>(r1, r0)
            java.util.ArrayList r0 = r1.B0
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.B0 = r0
        L23:
            java.util.ArrayList r0 = r1.B0
            r0.add(r2)
            return r1
    }

    @Override // defpackage.k15
    public final boolean onPreferenceTreeClick(androidx.preference.Preference r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = r2.getKey()
            r1.A = r0
            boolean r1 = super.onPreferenceTreeClick(r2)
            return r1
    }

    @Override // androidx.fragment.app.o
    public void onResume() {
            r4 = this;
            super.onResume()
            java.lang.String r0 = r4.A
            if (r0 != 0) goto L8
            goto Le
        L8:
            androidx.recyclerview.widget.RecyclerView r1 = r4.getListView()
            if (r1 != 0) goto Lf
        Le:
            return
        Lf:
            v r2 = new v
            r3 = 3
            r2.<init>(r4, r1, r0, r3)
            r1.post(r2)
            return
    }
}
