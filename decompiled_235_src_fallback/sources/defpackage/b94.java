package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b94  reason: default package */
/* loaded from: classes.dex */
public class b94 extends defpackage.f15 {
    public final java.util.HashSet e0;
    public boolean f0;
    public java.lang.CharSequence[] g0;
    public java.lang.CharSequence[] h0;

    public b94() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.e0 = r0
            return
    }

    @Override // defpackage.f15
    public final void k(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L17
            boolean r3 = r2.f0
            if (r3 == 0) goto L17
            androidx.preference.DialogPreference r3 = r2.i()
            androidx.preference.MultiSelectListPreference r3 = (androidx.preference.MultiSelectListPreference) r3
            java.util.HashSet r0 = r2.e0
            boolean r1 = r3.callChangeListener(r0)
            if (r1 == 0) goto L17
            r3.e(r0)
        L17:
            r3 = 0
            r2.f0 = r3
            return
    }

    @Override // defpackage.f15
    public final void l(defpackage.zb r6) {
            r5 = this;
            java.lang.CharSequence[] r0 = r5.h0
            int r0 = r0.length
            boolean[] r1 = new boolean[r0]
            r2 = 0
        L6:
            if (r2 >= r0) goto L1b
            java.lang.CharSequence[] r3 = r5.h0
            r3 = r3[r2]
            java.lang.String r3 = r3.toString()
            java.util.HashSet r4 = r5.e0
            boolean r3 = r4.contains(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L6
        L1b:
            java.lang.CharSequence[] r0 = r5.g0
            a94 r2 = new a94
            r2.<init>(r5)
            java.lang.Object r5 = r6.L
            wb r5 = (defpackage.wb) r5
            r5.q = r0
            r5.z = r2
            r5.v = r1
            r6 = 1
            r5.w = r6
            return
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            r0 = 0
            java.util.HashSet r1 = r4.e0
            if (r5 != 0) goto L2d
            androidx.preference.DialogPreference r5 = r4.i()
            androidx.preference.MultiSelectListPreference r5 = (androidx.preference.MultiSelectListPreference) r5
            java.lang.CharSequence[] r2 = r5.Z
            java.lang.CharSequence[] r3 = r5.d0
            if (r2 == 0) goto L27
            if (r3 == 0) goto L27
            r1.clear()
            java.util.HashSet r2 = r5.e0
            r1.addAll(r2)
            r4.f0 = r0
            java.lang.CharSequence[] r5 = r5.Z
            r4.g0 = r5
            r4.h0 = r3
            return
        L27:
            java.lang.String r4 = "MultiSelectListPreference requires an entries array and an entryValues array."
            defpackage.i.m(r4)
            return
        L2d:
            r1.clear()
            java.lang.String r2 = "MultiSelectListPreferenceDialogFragmentCompat.values"
            java.util.ArrayList r2 = r5.getStringArrayList(r2)
            r1.addAll(r2)
            java.lang.String r1 = "MultiSelectListPreferenceDialogFragmentCompat.changed"
            boolean r0 = r5.getBoolean(r1, r0)
            r4.f0 = r0
            java.lang.String r0 = "MultiSelectListPreferenceDialogFragmentCompat.entries"
            java.lang.CharSequence[] r0 = r5.getCharSequenceArray(r0)
            r4.g0 = r0
            java.lang.String r0 = "MultiSelectListPreferenceDialogFragmentCompat.entryValues"
            java.lang.CharSequence[] r5 = r5.getCharSequenceArray(r0)
            r4.h0 = r5
            return
    }

    @Override // defpackage.f15, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashSet r1 = r2.e0
            r0.<init>(r1)
            java.lang.String r1 = "MultiSelectListPreferenceDialogFragmentCompat.values"
            r3.putStringArrayList(r1, r0)
            java.lang.String r0 = "MultiSelectListPreferenceDialogFragmentCompat.changed"
            boolean r1 = r2.f0
            r3.putBoolean(r0, r1)
            java.lang.String r0 = "MultiSelectListPreferenceDialogFragmentCompat.entries"
            java.lang.CharSequence[] r1 = r2.g0
            r3.putCharSequenceArray(r0, r1)
            java.lang.String r0 = "MultiSelectListPreferenceDialogFragmentCompat.entryValues"
            java.lang.CharSequence[] r2 = r2.h0
            r3.putCharSequenceArray(r0, r2)
            return
    }
}
