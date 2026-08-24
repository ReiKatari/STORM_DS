package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db1  reason: default package */
/* loaded from: classes.dex */
public final class db1 {
    public final android.content.Context a;
    public final defpackage.ex6 b;

    public db1(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            a5 r2 = new a5
            r0 = 23
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final java.lang.String a(long r3, java.lang.String r5) {
            r2 = this;
            r5.getClass()
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            r0 = 16
            defpackage.g04.y(r0)
            java.lang.String r3 = java.lang.Long.toString(r3, r0)
            r3.getClass()
            r4 = 8
            java.lang.String r3 = defpackage.qs6.B0(r4, r3)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            android.content.SharedPreferences r0 = r2.c()
            java.lang.String r4 = r3.toLowerCase(r4)
            r4.getClass()
            java.lang.String r1 = "custom_name_"
            java.lang.String r4 = r1.concat(r4)
            r1 = 0
            java.lang.String r4 = r0.getString(r4, r1)
            if (r4 == 0) goto L43
            boolean r0 = defpackage.qs6.v0(r4)
            if (r0 != 0) goto L43
            r1 = r4
        L43:
            if (r1 == 0) goto L4d
            boolean r4 = defpackage.qs6.v0(r1)
            if (r4 == 0) goto L4c
            goto L4d
        L4c:
            return r1
        L4d:
            java.lang.String r2 = r2.b(r3)
            if (r2 == 0) goto L5b
            boolean r3 = defpackage.qs6.v0(r2)
            if (r3 == 0) goto L5a
            goto L5b
        L5a:
            return r2
        L5b:
            return r5
    }

    public final java.lang.String b(java.lang.String r2) {
            r1 = this;
            android.content.SharedPreferences r1 = r1.c()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            java.lang.String r0 = "file_name_"
            java.lang.String r2 = r0.concat(r2)
            r0 = 0
            java.lang.String r1 = r1.getString(r2, r0)
            if (r1 == 0) goto L21
            boolean r2 = defpackage.qs6.v0(r1)
            if (r2 != 0) goto L21
            return r1
        L21:
            return r0
    }

    public final android.content.SharedPreferences c() {
            r0 = this;
            ex6 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            r0.getClass()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            return r0
    }

    public final void d(long r3, java.lang.String r5) {
            r2 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            r0 = 16
            defpackage.g04.y(r0)
            java.lang.String r3 = java.lang.Long.toString(r3, r0)
            r3.getClass()
            r4 = 8
            java.lang.String r3 = defpackage.qs6.B0(r4, r3)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            android.content.SharedPreferences r2 = r2.c()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "file_name_"
            if (r5 == 0) goto L44
            boolean r0 = defpackage.qs6.v0(r5)
            if (r0 == 0) goto L34
            goto L44
        L34:
            java.lang.String r3 = r4.concat(r3)
            java.lang.CharSequence r4 = defpackage.qs6.T0(r5)
            java.lang.String r4 = r4.toString()
            r2.putString(r3, r4)
            goto L4b
        L44:
            java.lang.String r3 = r4.concat(r3)
            r2.remove(r3)
        L4b:
            r2.apply()
            return
    }

    public final void e(long r3, java.lang.String r5) {
            r2 = this;
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            r0 = 16
            defpackage.g04.y(r0)
            java.lang.String r3 = java.lang.Long.toString(r3, r0)
            r3.getClass()
            r4 = 8
            java.lang.String r3 = defpackage.qs6.B0(r4, r3)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            android.content.SharedPreferences r2 = r2.c()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "ra_hash_"
            if (r5 == 0) goto L44
            boolean r0 = defpackage.qs6.v0(r5)
            if (r0 == 0) goto L34
            goto L44
        L34:
            java.lang.String r3 = r4.concat(r3)
            java.lang.CharSequence r4 = defpackage.qs6.T0(r5)
            java.lang.String r4 = r4.toString()
            r2.putString(r3, r4)
            goto L4b
        L44:
            java.lang.String r3 = r4.concat(r3)
            r2.remove(r3)
        L4b:
            r2.apply()
            return
    }
}
