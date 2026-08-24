package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk  reason: default package */
/* loaded from: classes.dex */
public final class gk extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public defpackage.hb4 Y;
    public defpackage.hk Z;
    public java.lang.String d0;
    public java.lang.String e0;
    public int f0;
    public final /* synthetic */ defpackage.hk g0;
    public final /* synthetic */ java.lang.String h0;
    public final /* synthetic */ java.lang.String i0;

    public /* synthetic */ gk(defpackage.hk r1, java.lang.String r2, java.lang.String r3, defpackage.r41 r4, int r5) {
            r0 = this;
            r0.X = r5
            r0.g0 = r1
            r0.h0 = r2
            r0.i0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            gk r2 = (defpackage.gk) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            gk r2 = (defpackage.gk) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            int r9 = r7.X
            switch(r9) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            gk r0 = new gk
            java.lang.String r3 = r7.i0
            r5 = 1
            hk r1 = r7.g0
            java.lang.String r2 = r7.h0
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L13:
            r4 = r8
            gk r1 = new gk
            r5 = r4
            java.lang.String r4 = r7.i0
            r6 = 0
            hk r2 = r7.g0
            java.lang.String r3 = r7.h0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.X
            java.lang.String r1 = "ra_username"
            java.lang.String r2 = r11.i0
            java.lang.String r3 = r11.h0
            hk r4 = r11.g0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            r7 = 0
            java.lang.String r8 = "ra_token"
            r9 = 0
            switch(r0) {
                case 0: goto L76;
                default: goto L14;
            }
        L14:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r11.f0
            if (r10 == 0) goto L2c
            if (r10 != r6) goto L28
            java.lang.String r2 = r11.e0
            java.lang.String r3 = r11.d0
            hk r4 = r11.Z
            hb4 r11 = r11.Y
            defpackage.oi2.Y(r12)
            goto L44
        L28:
            defpackage.i.m(r5)
            goto L71
        L2c:
            defpackage.oi2.Y(r12)
            hb4 r12 = r4.b
            r11.Y = r12
            r11.Z = r4
            r11.d0 = r3
            r11.e0 = r2
            r11.f0 = r6
            java.lang.Object r11 = r12.e(r11)
            if (r11 != r0) goto L43
            r9 = r0
            goto L71
        L43:
            r11 = r12
        L44:
            android.content.SharedPreferences r12 = r4.a     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = r12.getString(r1, r9)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r12.getString(r8, r9)     // Catch: java.lang.Throwable -> L66
            boolean r0 = defpackage.nb3.k(r0, r3)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L68
            boolean r0 = defpackage.nb3.k(r1, r2)     // Catch: java.lang.Throwable -> L66
            if (r0 != 0) goto L5b
            goto L68
        L5b:
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch: java.lang.Throwable -> L66
            r12.remove(r8)     // Catch: java.lang.Throwable -> L66
            r12.apply()     // Catch: java.lang.Throwable -> L66
            goto L69
        L66:
            r12 = move-exception
            goto L72
        L68:
            r6 = r7
        L69:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L66
            r11.h(r9)
            r9 = r12
        L71:
            return r9
        L72:
            r11.h(r9)
            throw r12
        L76:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r10 = r11.f0
            if (r10 == 0) goto L8e
            if (r10 != r6) goto L8a
            java.lang.String r2 = r11.e0
            java.lang.String r3 = r11.d0
            hk r4 = r11.Z
            hb4 r11 = r11.Y
            defpackage.oi2.Y(r12)
            goto La6
        L8a:
            defpackage.i.m(r5)
            goto Ld6
        L8e:
            defpackage.oi2.Y(r12)
            hb4 r12 = r4.b
            r11.Y = r12
            r11.Z = r4
            r11.d0 = r3
            r11.e0 = r2
            r11.f0 = r6
            java.lang.Object r11 = r12.e(r11)
            if (r11 != r0) goto La5
            r9 = r0
            goto Ld6
        La5:
            r11 = r12
        La6:
            android.content.SharedPreferences r12 = r4.a     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = r12.getString(r1, r9)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = r12.getString(r8, r9)     // Catch: java.lang.Throwable -> Lcb
            boolean r0 = defpackage.nb3.k(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto Lcd
            boolean r0 = defpackage.nb3.k(r4, r2)     // Catch: java.lang.Throwable -> Lcb
            if (r0 != 0) goto Lbd
            goto Lcd
        Lbd:
            android.content.SharedPreferences$Editor r12 = r12.edit()     // Catch: java.lang.Throwable -> Lcb
            r12.remove(r1)     // Catch: java.lang.Throwable -> Lcb
            r12.remove(r8)     // Catch: java.lang.Throwable -> Lcb
            r12.apply()     // Catch: java.lang.Throwable -> Lcb
            goto Lce
        Lcb:
            r12 = move-exception
            goto Ld7
        Lcd:
            r6 = r7
        Lce:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> Lcb
            r11.h(r9)
            r9 = r12
        Ld6:
            return r9
        Ld7:
            r11.h(r9)
            throw r12
    }
}
