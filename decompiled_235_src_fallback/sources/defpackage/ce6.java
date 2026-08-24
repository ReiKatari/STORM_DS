package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce6  reason: default package */
/* loaded from: classes.dex */
public final class ce6 {
    public final android.content.SharedPreferences a;

    public ce6(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "shader_compile_times"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r3.getClass()
            r2.a = r3
            return
    }

    public final void a(java.lang.String r3, defpackage.be6 r4, long r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            boolean r0 = defpackage.qs6.v0(r3)
            if (r0 != 0) goto L2a
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L13
            goto L2a
        L13:
            android.content.SharedPreferences r2 = r2.a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = r4.name()
            java.lang.String r0 = "|"
            java.lang.String r3 = defpackage.lb1.m(r4, r0, r3)
            android.content.SharedPreferences$Editor r2 = r2.putLong(r3, r5)
            r2.apply()
        L2a:
            return
    }
}
