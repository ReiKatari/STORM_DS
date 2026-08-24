package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h64  reason: default package */
/* loaded from: classes.dex */
public final class h64 implements defpackage.y54 {
    public final /* synthetic */ int a;
    public final android.content.SharedPreferences b;

    public /* synthetic */ h64(android.content.SharedPreferences r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.y54
    public final int a() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 6
            return r0
        L7:
            r0 = 40
            return r0
    }

    @Override // defpackage.y54
    public final void b() {
            r3 = this;
            int r0 = r3.a
            android.content.SharedPreferences r3 = r3.b
            switch(r0) {
                case 0: goto L20;
                default: goto L7;
            }
        L7:
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r0 = "bios_dir"
            du1 r1 = defpackage.du1.A
            r3.putStringSet(r0, r1)
            java.lang.String r0 = "rom_search_dirs"
            r3.putStringSet(r0, r1)
            java.lang.String r0 = "sram_dir"
            r3.putStringSet(r0, r1)
            r3.apply()
            return
        L20:
            r0 = 0
            java.lang.String r1 = "ra_username"
            java.lang.String r0 = r3.getString(r1, r0)
            if (r0 == 0) goto L49
            java.lang.CharSequence r2 = defpackage.qs6.T0(r0)
            java.lang.String r2 = r2.toString()
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 != 0) goto L49
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.CharSequence r0 = defpackage.qs6.T0(r0)
            java.lang.String r0 = r0.toString()
            r3.putString(r1, r0)
            r3.apply()
        L49:
            return
    }

    @Override // defpackage.y54
    public final int c() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 7
            return r0
        L7:
            r0 = 41
            return r0
    }
}
