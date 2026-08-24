package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik  reason: default package */
/* loaded from: classes.dex */
public final class ik extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public long Z;
    public java.lang.String d0;
    public long e0;
    public final /* synthetic */ long f0;
    public final /* synthetic */ long g0;
    public java.lang.Object h0;
    public java.lang.Object i0;
    public final /* synthetic */ java.lang.Object j0;
    public final /* synthetic */ java.lang.Object k0;

    public ik(defpackage.jk r2, java.lang.String r3, long r4, long r6, defpackage.r41 r8) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.j0 = r2
            r1.k0 = r3
            r1.f0 = r4
            r1.g0 = r6
            r2 = 2
            r1.<init>(r2, r8)
            return
    }

    public ik(defpackage.sz1 r2, long r3, defpackage.o75 r5, defpackage.jb5 r6, defpackage.pq5 r7, java.lang.String r8, long r9, long r11, long r13, defpackage.r41 r15) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.h0 = r2
            r1.Z = r3
            r1.i0 = r5
            r1.j0 = r6
            r1.k0 = r7
            r1.d0 = r8
            r1.e0 = r9
            r1.f0 = r11
            r1.g0 = r13
            r2 = 2
            r1.<init>(r2, r15)
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
            ik r2 = (defpackage.ik) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ik r2 = (defpackage.ik) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r20, java.lang.Object r21) {
            r19 = this;
            r0 = r19
            int r1 = r0.X
            java.lang.Object r2 = r0.k0
            java.lang.Object r3 = r0.j0
            switch(r1) {
                case 0: goto L2f;
                default: goto Lb;
            }
        Lb:
            ik r4 = new ik
            java.lang.Object r1 = r0.h0
            r5 = r1
            sz1 r5 = (defpackage.sz1) r5
            long r6 = r0.Z
            java.lang.Object r1 = r0.i0
            r8 = r1
            o75 r8 = (defpackage.o75) r8
            r9 = r3
            jb5 r9 = (defpackage.jb5) r9
            r10 = r2
            pq5 r10 = (defpackage.pq5) r10
            java.lang.String r11 = r0.d0
            long r12 = r0.e0
            long r14 = r0.f0
            long r0 = r0.g0
            r18 = r20
            r16 = r0
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r14, r16, r18)
            return r4
        L2f:
            ik r5 = new ik
            r6 = r3
            jk r6 = (defpackage.jk) r6
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            long r8 = r0.f0
            long r10 = r0.g0
            r12 = r20
            r5.<init>(r6, r7, r8, r10, r12)
            return r5
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.X
            java.lang.Object r2 = r0.k0
            java.lang.Object r3 = r0.j0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r1) {
                case 0: goto L86;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r1 = r0.i0
            o75 r1 = (defpackage.o75) r1
            java.lang.Object r7 = r0.h0
            sz1 r7 = (defpackage.sz1) r7
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r0.Y
            r10 = 2
            if (r9 == 0) goto L34
            if (r9 == r5) goto L30
            if (r9 != r10) goto L2c
            defpackage.oi2.Y(r20)
            r0 = r20
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r0 = r0.A
            goto L80
        L2c:
            defpackage.i.m(r4)
            goto L85
        L30:
            defpackage.oi2.Y(r20)
            goto L50
        L34:
            defpackage.oi2.Y(r20)
            qf4 r4 = r7.h
            fb5 r11 = new fb5
            long r12 = r0.Z
            long r14 = r1.a
            r16 = 1
            r17 = 0
            r11.<init>(r12, r14, r16, r17)
            r0.Y = r5
            java.lang.Object r4 = r4.b(r11, r0)
            if (r4 != r8) goto L50
            r1 = r8
            goto L7e
        L50:
            oj4 r4 = r7.i
            jb5 r3 = (defpackage.jb5) r3
            java.lang.String r3 = r3.a()
            pq5 r2 = (defpackage.pq5) r2
            java.lang.String r2 = r2.i
            long r5 = r0.Z
            long r11 = r1.a
            java.lang.String r9 = r0.d0
            long r13 = r0.e0
            gk4 r16 = defpackage.gk4.SOFTCORE
            ik4 r17 = defpackage.ik4.OFFLINE_AFTER_START
            r0.Y = r10
            r1 = r8
            r7 = r11
            r10 = r13
            long r12 = r0.f0
            long r14 = r0.g0
            r18 = r4
            r4 = r2
            r2 = r18
            r18 = r0
            java.lang.Object r0 = r2.b(r3, r4, r5, r7, r9, r10, r12, r14, r16, r17, r18)
            if (r0 != r1) goto L80
        L7e:
            r6 = r1
            goto L85
        L80:
            hm5 r6 = new hm5
            r6.<init>(r0)
        L85:
            return r6
        L86:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r0.Y
            if (r7 == 0) goto La9
            if (r7 != r5) goto La4
            long r1 = r0.e0
            long r3 = r0.Z
            java.lang.String r5 = r0.d0
            java.lang.Object r7 = r0.i0
            jk r7 = (defpackage.jk) r7
            java.lang.Object r0 = r0.h0
            hb4 r0 = (defpackage.hb4) r0
            defpackage.oi2.Y(r20)
            r11 = r1
            r9 = r3
            r3 = r0
        La2:
            r0 = r7
            goto Lcf
        La4:
            defpackage.i.m(r4)
            goto L10f
        La9:
            defpackage.oi2.Y(r20)
            r7 = r3
            jk r7 = (defpackage.jk) r7
            hb4 r3 = r7.b
            java.lang.String r2 = (java.lang.String) r2
            r0.h0 = r3
            r0.i0 = r7
            r0.d0 = r2
            long r8 = r0.f0
            r0.Z = r8
            long r10 = r0.g0
            r0.e0 = r10
            r0.Y = r5
            java.lang.Object r0 = r3.e(r0)
            if (r0 != r1) goto Lcb
            r6 = r1
            goto L10f
        Lcb:
            r5 = r2
            r11 = r10
            r9 = r8
            goto La2
        Lcf:
            android.content.SharedPreferences r1 = r0.a     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = "ra_profile_username"
            java.lang.String r14 = r1.getString(r2, r6)     // Catch: java.lang.Throwable -> Lf3
            if (r14 != 0) goto Ldb
            r13 = r6
            goto Lee
        Ldb:
            lb5 r13 = new lb5     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = "ra_profile_score"
            r7 = 0
            long r15 = r1.getLong(r2, r7)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r2 = "ra_profile_softcore_score"
            long r17 = r1.getLong(r2, r7)     // Catch: java.lang.Throwable -> Lf3
            r13.<init>(r14, r15, r17)     // Catch: java.lang.Throwable -> Lf3
        Lee:
            if (r13 == 0) goto Lf5
            java.lang.String r1 = r13.a     // Catch: java.lang.Throwable -> Lf3
            goto Lf6
        Lf3:
            r0 = move-exception
            goto L110
        Lf5:
            r1 = r6
        Lf6:
            boolean r1 = defpackage.nb3.k(r1, r5)     // Catch: java.lang.Throwable -> Lf3
            if (r1 != 0) goto Lfd
            goto L10a
        Lfd:
            java.lang.String r8 = r13.a     // Catch: java.lang.Throwable -> Lf3
            r8.getClass()     // Catch: java.lang.Throwable -> Lf3
            lb5 r7 = new lb5     // Catch: java.lang.Throwable -> Lf3
            r7.<init>(r8, r9, r11)     // Catch: java.lang.Throwable -> Lf3
            defpackage.jk.a(r0, r7)     // Catch: java.lang.Throwable -> Lf3
        L10a:
            r3.h(r6)
            jg7 r6 = defpackage.jg7.a
        L10f:
            return r6
        L110:
            r3.h(r6)
            throw r0
    }
}
