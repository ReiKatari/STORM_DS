package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn5  reason: default package */
/* loaded from: classes.dex */
public final class cn5 implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    public final android.content.SharedPreferences a;
    public final defpackage.tp6 b;
    public volatile defpackage.en5 c;
    public final defpackage.de5 d;

    public cn5(android.content.SharedPreferences r5) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            en5 r0 = defpackage.fn5.c(r5)
            tp6 r0 = defpackage.up6.a(r0)
            r4.b = r0
            de5 r1 = new de5
            r1.<init>(r0)
            r4.d = r1
            java.lang.String r1 = "ra_offline_backend"
            boolean r2 = r5.contains(r1)
            if (r2 != 0) goto L2f
            android.content.SharedPreferences$Editor r2 = r5.edit()
            ln5 r3 = defpackage.ln5.BUILT_IN
            java.lang.String r3 = r3.getPreferenceValue()
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)
            r1.commit()
        L2f:
            en5 r1 = defpackage.fn5.c(r5)
            r2 = 0
            r0.m(r2, r1)
            r5.registerOnSharedPreferenceChangeListener(r4)
            return
    }

    public final defpackage.en5 a() {
            r1 = this;
            java.util.Set r0 = defpackage.fn5.a
            android.content.SharedPreferences r1 = r1.a
            en5 r1 = defpackage.fn5.c(r1)
            return r1
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            java.util.Set r0 = defpackage.fn5.a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r3 = defpackage.gt0.C0(r0, r3)
            if (r3 == 0) goto L1a
            en5 r2 = defpackage.fn5.c(r2)
            tp6 r1 = r1.b
            r1.getClass()
            r3 = 0
            r1.m(r3, r2)
        L1a:
            return
    }
}
