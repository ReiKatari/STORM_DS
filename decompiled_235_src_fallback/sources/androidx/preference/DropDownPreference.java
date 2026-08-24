package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DropDownPreference extends androidx.preference.ListPreference {
    public final android.widget.ArrayAdapter h0;
    public android.widget.Spinner i0;
    public final defpackage.np1 j0;

    public DropDownPreference(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130969044(0x7f0401d4, float:1.7546759E38)
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            np1 r4 = new np1
            r4.<init>(r2, r1)
            r2.j0 = r4
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r0 = 17367049(0x1090009, float:2.516295E-38)
            r4.<init>(r3, r0)
            r2.h0 = r4
            r4.clear()
            java.lang.CharSequence[] r2 = r2.Z
            if (r2 == 0) goto L2e
            int r3 = r2.length
        L20:
            if (r1 >= r3) goto L2e
            r0 = r2[r1]
            java.lang.String r0 = r0.toString()
            r4.add(r0)
            int r1 = r1 + 1
            goto L20
        L2e:
            return
    }

    @Override // androidx.preference.ListPreference
    public final void g(java.lang.CharSequence[] r4) {
            r3 = this;
            r3.Z = r4
            android.widget.ArrayAdapter r4 = r3.h0
            r4.clear()
            java.lang.CharSequence[] r3 = r3.Z
            if (r3 == 0) goto L1b
            int r0 = r3.length
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1b
            r2 = r3[r1]
            java.lang.String r2 = r2.toString()
            r4.add(r2)
            int r1 = r1 + 1
            goto Ld
        L1b:
            return
    }

    @Override // androidx.preference.Preference
    public final void notifyChanged() {
            r0 = this;
            super.notifyChanged()
            android.widget.ArrayAdapter r0 = r0.h0
            if (r0 == 0) goto La
            r0.notifyDataSetChanged()
        La:
            return
    }

    @Override // androidx.preference.Preference
    public final void onBindViewHolder(defpackage.x15 r6) {
            r5 = this;
            android.view.View r0 = r6.a
            r1 = 2131427902(0x7f0b023e, float:1.8477433E38)
            android.view.View r0 = r0.findViewById(r1)
            android.widget.Spinner r0 = (android.widget.Spinner) r0
            r5.i0 = r0
            android.widget.ArrayAdapter r1 = r5.h0
            r0.setAdapter(r1)
            android.widget.Spinner r0 = r5.i0
            np1 r1 = r5.j0
            r0.setOnItemSelectedListener(r1)
            android.widget.Spinner r0 = r5.i0
            java.lang.String r1 = r5.e0
            java.lang.CharSequence[] r2 = r5.d0
            if (r1 == 0) goto L38
            if (r2 == 0) goto L38
            int r3 = r2.length
            int r3 = r3 + (-1)
        L26:
            if (r3 < 0) goto L38
            r4 = r2[r3]
            java.lang.String r4 = r4.toString()
            boolean r4 = android.text.TextUtils.equals(r4, r1)
            if (r4 == 0) goto L35
            goto L39
        L35:
            int r3 = r3 + (-1)
            goto L26
        L38:
            r3 = -1
        L39:
            r0.setSelection(r3)
            super.onBindViewHolder(r6)
            return
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void onClick() {
            r0 = this;
            android.widget.Spinner r0 = r0.i0
            r0.performClick()
            return
    }
}
