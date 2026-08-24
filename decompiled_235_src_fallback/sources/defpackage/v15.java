package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v15  reason: default package */
/* loaded from: classes.dex */
public final class v15 {
    public final android.content.Context a;
    public long b;
    public android.content.SharedPreferences c;
    public android.content.SharedPreferences.Editor d;
    public boolean e;
    public final java.lang.String f;
    public androidx.preference.PreferenceScreen g;
    public defpackage.k15 h;
    public defpackage.k15 i;
    public defpackage.k15 j;

    public v15(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.b = r0
            r2.a = r3
            java.lang.String r3 = b(r3)
            r2.f = r3
            r3 = 0
            r2.c = r3
            return
    }

    public static android.content.SharedPreferences a(android.content.Context r2) {
            java.lang.String r0 = b(r2)
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    public static java.lang.String b(android.content.Context r1) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "_preferences"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public final android.content.SharedPreferences.Editor c() {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto L15
            android.content.SharedPreferences$Editor r0 = r1.d
            if (r0 != 0) goto L12
            android.content.SharedPreferences r0 = r1.d()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r1.d = r0
        L12:
            android.content.SharedPreferences$Editor r1 = r1.d
            return r1
        L15:
            android.content.SharedPreferences r1 = r1.d()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            return r1
    }

    public final android.content.SharedPreferences d() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.c
            if (r0 != 0) goto Lf
            java.lang.String r0 = r3.f
            r1 = 0
            android.content.Context r2 = r3.a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            r3.c = r0
        Lf:
            android.content.SharedPreferences r3 = r3.c
            return r3
    }

    public final androidx.preference.PreferenceScreen e(android.content.Context r2, int r3, androidx.preference.PreferenceScreen r4) {
            r1 = this;
            r0 = 1
            r1.e = r0
            u15 r0 = new u15
            r0.<init>(r2, r1)
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.XmlResourceParser r2 = r2.getXml(r3)
            androidx.preference.PreferenceGroup r3 = r0.c(r2, r4)     // Catch: java.lang.Throwable -> L27
            r2.close()
            androidx.preference.PreferenceScreen r3 = (androidx.preference.PreferenceScreen) r3
            r3.onAttachedToHierarchy(r1)
            android.content.SharedPreferences$Editor r2 = r1.d
            if (r2 == 0) goto L23
            r2.apply()
        L23:
            r2 = 0
            r1.e = r2
            return r3
        L27:
            r1 = move-exception
            r2.close()
            throw r1
    }
}
