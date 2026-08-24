package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk  reason: default package */
/* loaded from: classes.dex */
public final class fk extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public defpackage.hb4 Y;
    public defpackage.hk Z;
    public int d0;
    public final /* synthetic */ defpackage.hk e0;

    public /* synthetic */ fk(defpackage.hk r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.e0 = r1
            r1 = 2
            r0.<init>(r1, r2)
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
            fk r2 = (defpackage.fk) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            fk r2 = (defpackage.fk) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            hk r1 = r1.e0
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            fk r3 = new fk
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            fk r3 = new fk
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            java.lang.String r1 = "ra_token"
            java.lang.String r2 = "ra_username"
            hk r3 = r8.e0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L60;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.d0
            if (r7 == 0) goto L23
            if (r7 != r5) goto L1f
            hk r3 = r8.Z
            hb4 r8 = r8.Y
            defpackage.oi2.Y(r9)
            goto L37
        L1f:
            defpackage.i.m(r4)
            goto L5b
        L23:
            defpackage.oi2.Y(r9)
            hb4 r9 = r3.b
            r8.Y = r9
            r8.Z = r3
            r8.d0 = r5
            java.lang.Object r8 = r9.e(r8)
            if (r8 != r0) goto L36
        L34:
            r6 = r0
            goto L5b
        L36:
            r8 = r9
        L37:
            android.content.SharedPreferences r9 = r3.a     // Catch: java.lang.Throwable -> L4f
            java.lang.String r9 = r9.getString(r2, r6)     // Catch: java.lang.Throwable -> L4f
            if (r9 != 0) goto L41
            r0 = r6
            goto L57
        L41:
            android.content.SharedPreferences r0 = r3.a     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r0.getString(r1, r6)     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L51
            ib5 r0 = new ib5     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L4f
            goto L57
        L4f:
            r9 = move-exception
            goto L5c
        L51:
            hb5 r1 = new hb5     // Catch: java.lang.Throwable -> L4f
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> L4f
            r0 = r1
        L57:
            r8.h(r6)
            goto L34
        L5b:
            return r6
        L5c:
            r8.h(r6)
            throw r9
        L60:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.d0
            if (r7 == 0) goto L74
            if (r7 != r5) goto L70
            hk r3 = r8.Z
            hb4 r8 = r8.Y
            defpackage.oi2.Y(r9)
            goto L88
        L70:
            defpackage.i.m(r4)
            goto L9c
        L74:
            defpackage.oi2.Y(r9)
            hb4 r9 = r3.b
            r8.Y = r9
            r8.Z = r3
            r8.d0 = r5
            java.lang.Object r8 = r9.e(r8)
            if (r8 != r0) goto L87
            r6 = r0
            goto L9c
        L87:
            r8 = r9
        L88:
            android.content.SharedPreferences r9 = r3.a     // Catch: java.lang.Throwable -> L9d
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: java.lang.Throwable -> L9d
            r9.remove(r2)     // Catch: java.lang.Throwable -> L9d
            r9.remove(r1)     // Catch: java.lang.Throwable -> L9d
            r9.apply()     // Catch: java.lang.Throwable -> L9d
            r8.h(r6)
            jg7 r6 = defpackage.jg7.a
        L9c:
            return r6
        L9d:
            r9 = move-exception
            r8.h(r6)
            throw r9
    }
}
