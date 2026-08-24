package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jk  reason: default package */
/* loaded from: classes.dex */
public final class jk {
    public final android.content.SharedPreferences a;
    public final defpackage.hb4 b;
    public final defpackage.tp6 c;

    public jk(android.content.SharedPreferences r9) {
            r8 = this;
            r8.<init>()
            r8.a = r9
            hb4 r0 = new hb4
            r0.<init>()
            r8.b = r0
            java.lang.String r0 = "ra_profile_username"
            r1 = 0
            java.lang.String r3 = r9.getString(r0, r1)
            if (r3 != 0) goto L16
            goto L2b
        L16:
            lb5 r2 = new lb5
            java.lang.String r0 = "ra_profile_score"
            r4 = 0
            long r0 = r9.getLong(r0, r4)
            java.lang.String r6 = "ra_profile_softcore_score"
            long r6 = r9.getLong(r6, r4)
            r4 = r0
            r2.<init>(r3, r4, r6)
            r1 = r2
        L2b:
            tp6 r9 = defpackage.up6.a(r1)
            r8.c = r9
            return
    }

    public static final void a(defpackage.jk r4, defpackage.lb5 r5) {
            android.content.SharedPreferences r0 = r4.a
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "ra_profile_username"
            java.lang.String r2 = r5.a
            r0.putString(r1, r2)
            java.lang.String r1 = "ra_profile_score"
            long r2 = r5.b
            r0.putLong(r1, r2)
            java.lang.String r1 = "ra_profile_softcore_score"
            long r2 = r5.c
            r0.putLong(r1, r2)
            r0.apply()
            tp6 r4 = r4.c
            r4.getClass()
            r0 = 0
            r4.m(r0, r5)
            return
    }

    public final java.lang.Object b(defpackage.s41 r5) {
            r4 = this;
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            b0 r1 = new b0
            r2 = 0
            r3 = 6
            r1.<init>(r4, r2, r3)
            java.lang.Object r4 = defpackage.hv.d0(r0, r1, r5)
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 != r5) goto L14
            return r4
        L14:
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
