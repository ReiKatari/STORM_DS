package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n31  reason: default package */
/* loaded from: classes.dex */
public final class n31 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ long Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ java.lang.Object g0;
    public final /* synthetic */ java.lang.Object h0;

    public n31(long r2, defpackage.hs2 r4, android.app.DownloadManager r5, defpackage.kt r6, java.io.File r7, defpackage.r41 r8) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.Z = r2
            r1.e0 = r4
            r1.f0 = r5
            r1.g0 = r6
            r1.h0 = r7
            r1.<init>(r0, r8)
            return
    }

    public n31(defpackage.nh7 r2, defpackage.p31 r3, defpackage.z70 r4, long r5, defpackage.rc3 r7, defpackage.r41 r8) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.e0 = r2
            r1.f0 = r3
            r1.g0 = r4
            r1.Z = r5
            r1.h0 = r7
            r2 = 2
            r1.<init>(r2, r8)
            return
    }

    public n31(defpackage.sz1 r2, defpackage.pz1 r3, java.lang.String r4, long r5, defpackage.gk4 r7, defpackage.ik4 r8, defpackage.r41 r9) {
            r1 = this;
            r0 = 1
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r1.f0 = r4
            r1.Z = r5
            r1.g0 = r7
            r1.h0 = r8
            r2 = 2
            r1.<init>(r2, r9)
            return
    }

    public n31(defpackage.zx4 r2, java.lang.String r3, long r4, defpackage.k47 r6, defpackage.p27 r7, defpackage.mk4 r8, defpackage.r41 r9) {
            r1 = this;
            r0 = 3
            r1.X = r0
            r1.d0 = r2
            r1.e0 = r3
            r1.Z = r4
            r1.f0 = r6
            r1.g0 = r7
            r1.h0 = r8
            r2 = 2
            r1.<init>(r2, r9)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L34;
                case 1: goto L25;
                case 2: goto L16;
                default: goto L7;
            }
        L7:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            n31 r2 = (defpackage.n31) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r35 r3 = (defpackage.r35) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            n31 r2 = (defpackage.n31) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L25:
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            n31 r2 = (defpackage.n31) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L34:
            k86 r3 = (defpackage.k86) r3
            r41 r4 = (defpackage.r41) r4
            r41 r2 = r2.q(r4, r3)
            n31 r2 = (defpackage.n31) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r18, java.lang.Object r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            int r2 = r0.X
            java.lang.Object r3 = r0.h0
            java.lang.Object r4 = r0.g0
            java.lang.Object r5 = r0.f0
            java.lang.Object r6 = r0.e0
            switch(r2) {
                case 0: goto L5f;
                case 1: goto L44;
                case 2: goto L2c;
                default: goto L11;
            }
        L11:
            n31 r7 = new n31
            java.lang.Object r1 = r0.d0
            r8 = r1
            zx4 r8 = (defpackage.zx4) r8
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9
            r12 = r5
            k47 r12 = (defpackage.k47) r12
            r13 = r4
            p27 r13 = (defpackage.p27) r13
            r14 = r3
            mk4 r14 = (defpackage.mk4) r14
            long r10 = r0.Z
            r15 = r18
            r7.<init>(r8, r9, r10, r12, r13, r14, r15)
            return r7
        L2c:
            n31 r8 = new n31
            r11 = r6
            hs2 r11 = (defpackage.hs2) r11
            r12 = r5
            android.app.DownloadManager r12 = (android.app.DownloadManager) r12
            r13 = r4
            kt r13 = (defpackage.kt) r13
            r14 = r3
            java.io.File r14 = (java.io.File) r14
            long r9 = r0.Z
            r15 = r18
            r8.<init>(r9, r11, r12, r13, r14, r15)
            r8.d0 = r1
            return r8
        L44:
            n31 r8 = new n31
            java.lang.Object r1 = r0.d0
            r9 = r1
            sz1 r9 = (defpackage.sz1) r9
            r10 = r6
            pz1 r10 = (defpackage.pz1) r10
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11
            r14 = r4
            gk4 r14 = (defpackage.gk4) r14
            r15 = r3
            ik4 r15 = (defpackage.ik4) r15
            long r12 = r0.Z
            r16 = r18
            r8.<init>(r9, r10, r11, r12, r14, r15, r16)
            return r8
        L5f:
            n31 r8 = new n31
            r9 = r6
            nh7 r9 = (defpackage.nh7) r9
            r10 = r5
            p31 r10 = (defpackage.p31) r10
            r11 = r4
            z70 r11 = (defpackage.z70) r11
            long r12 = r0.Z
            r14 = r3
            rc3 r14 = (defpackage.rc3) r14
            r15 = r18
            r8.<init>(r9, r10, r11, r12, r14, r15)
            r8.d0 = r1
            return r8
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r22) {
            r21 = this;
            r11 = r21
            int r0 = r11.X
            long r1 = r11.Z
            jg7 r3 = defpackage.jg7.a
            java.lang.Object r4 = r11.f0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.Object r6 = r11.g0
            r7 = 1
            java.lang.Object r8 = r11.h0
            java.lang.Object r9 = r11.e0
            r10 = 0
            switch(r0) {
                case 0: goto L16d;
                case 1: goto L127;
                case 2: goto Lc0;
                default: goto L17;
            }
        L17:
            mk4 r8 = (defpackage.mk4) r8
            r17 = r9
            java.lang.String r17 = (java.lang.String) r17
            p27 r6 = (defpackage.p27) r6
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r11.Y
            if (r1 == 0) goto L35
            if (r1 != r7) goto L2f
            defpackage.oi2.Y(r22)
            r1 = r22
            r9 = r17
            goto L71
        L2f:
            defpackage.i.m(r5)
            r3 = r10
            goto Lbf
        L35:
            defpackage.oi2.Y(r22)
            java.lang.Object r1 = r11.d0
            r16 = r1
            zx4 r16 = (defpackage.zx4) r16
            r11.Y = r7
            r16.getClass()
            int r1 = r17.length()
            if (r1 != 0) goto L4a
            goto L52
        L4a:
            long r13 = r11.Z
            boolean r1 = defpackage.k47.c(r13)
            if (r1 == 0) goto L56
        L52:
            r1 = r10
            r9 = r17
            goto L6d
        L56:
            yx4 r12 = new yx4
            r15 = 0
            r12.<init>(r13, r15, r16, r17)
            r1 = r16
            r9 = r17
            l61 r2 = r1.a
            l5 r5 = new l5
            r7 = 24
            r5.<init>(r1, r12, r10, r7)
            java.lang.Object r1 = defpackage.hv.d0(r2, r5, r11)
        L6d:
            if (r1 != r0) goto L71
            r3 = r0
            goto Lbf
        L71:
            k47 r1 = (defpackage.k47) r1
            if (r1 == 0) goto Lbf
            long r0 = r1.a
            r2 = 32
            long r10 = r0 >> r2
            int r2 = (int) r10
            int r2 = r8.i(r2)
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r10
            int r0 = (int) r0
            int r0 = r8.i(r0)
            long r0 = defpackage.jx2.f(r2, r0)
            k47 r4 = (defpackage.k47) r4
            boolean r2 = defpackage.k47.a(r0, r4)
            if (r2 != 0) goto Lbf
            c37 r2 = r6.n()
            fp r2 = r2.a
            java.lang.String r2 = r2.B
            boolean r2 = defpackage.nb3.k(r2, r9)
            if (r2 == 0) goto Lbf
            mk4 r2 = r6.b
            if (r8 != r2) goto Lbf
            qn2 r2 = r6.c
            c37 r4 = r6.n()
            fp r4 = r4.a
            c37 r4 = defpackage.p27.e(r4, r0)
            r2.g(r4)
            k47 r2 = new k47
            r2.<init>(r0)
            r6.w = r2
        Lbf:
            return r3
        Lc0:
            r0 = r9
            hs2 r0 = (defpackage.hs2) r0
            java.lang.Object r12 = r11.d0
            r17 = r12
            r35 r17 = (defpackage.r35) r17
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r13 = r11.Y
            if (r13 == 0) goto Lda
            if (r13 != r7) goto Ld5
            defpackage.oi2.Y(r22)
            goto L126
        Ld5:
            defpackage.i.m(r5)
            r3 = r10
            goto L126
        Lda:
            defpackage.oi2.Y(r22)
            gs2 r13 = new gs2
            r14 = r4
            android.app.DownloadManager r14 = (android.app.DownloadManager) r14
            r18 = r9
            hs2 r18 = (defpackage.hs2) r18
            r19 = r6
            kt r19 = (defpackage.kt) r19
            r20 = r8
            java.io.File r20 = (java.io.File) r20
            long r4 = r11.Z
            r15 = r4
            r13.<init>(r14, r15, r17, r18, r19, r20)
            r4 = r17
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "content://downloads/my_downloads/"
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.content.Context r2 = r0.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            r5 = 0
            r2.registerContentObserver(r1, r5, r13)
            r13.onChange(r5, r1)
            ci2 r1 = new ci2
            r2 = 2
            r1.<init>(r2, r0, r13)
            r11.d0 = r10
            r11.Y = r7
            java.lang.Object r0 = defpackage.kj2.q(r4, r1, r11)
            if (r0 != r12) goto L126
            r3 = r12
        L126:
            return r3
        L127:
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r11.Y
            if (r0 == 0) goto L13d
            if (r0 != r7) goto L139
            defpackage.oi2.Y(r22)
            r0 = r22
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r0 = r0.A
            goto L167
        L139:
            defpackage.i.m(r5)
            goto L16c
        L13d:
            defpackage.oi2.Y(r22)
            java.lang.Object r0 = r11.d0
            sz1 r0 = (defpackage.sz1) r0
            oj4 r0 = r0.i
            pz1 r9 = (defpackage.pz1) r9
            java.lang.String r1 = r9.a
            java.lang.String r2 = r9.b
            vj4 r3 = r9.c
            long r9 = r3.b
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            gk4 r6 = (defpackage.gk4) r6
            ik4 r8 = (defpackage.ik4) r8
            r11.Y = r7
            r3 = r9
            r9 = r6
            long r6 = r11.Z
            r10 = r8
            r8 = 0
            java.lang.Object r0 = r0.e(r1, r2, r3, r5, r6, r8, r9, r10, r11)
            if (r0 != r12) goto L167
            r10 = r12
            goto L16c
        L167:
            hm5 r10 = new hm5
            r10.<init>(r0)
        L16c:
            return r10
        L16d:
            z70 r6 = (defpackage.z70) r6
            p31 r4 = (defpackage.p31) r4
            nh7 r9 = (defpackage.nh7) r9
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r12 = r11.Y
            if (r12 == 0) goto L184
            if (r12 != r7) goto L17f
            defpackage.oi2.Y(r22)
            goto L1a7
        L17f:
            defpackage.i.m(r5)
            r3 = r10
            goto L1a7
        L184:
            defpackage.oi2.Y(r22)
            java.lang.Object r5 = r11.d0
            k86 r5 = (defpackage.k86) r5
            float r1 = defpackage.p31.R0(r4, r6, r1)
            r9.e = r1
            rc3 r8 = (defpackage.rc3) r8
            t00 r1 = new t00
            r1.<init>(r4, r9, r8, r5)
            u6 r2 = new u6
            r5 = 5
            r2.<init>(r4, r9, r6, r5)
            r11.Y = r7
            java.lang.Object r1 = r9.a(r1, r2, r11)
            if (r1 != r0) goto L1a7
            r3 = r0
        L1a7:
            return r3
    }
}
