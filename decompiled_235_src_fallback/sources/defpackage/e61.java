package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e61  reason: default package */
/* loaded from: classes.dex */
public final class e61 extends defpackage.zg1 implements defpackage.va6 {
    public defpackage.p97 m0;
    public defpackage.c37 n0;
    public defpackage.jt3 o0;
    public boolean p0;
    public boolean q0;
    public defpackage.mk4 r0;
    public defpackage.p27 s0;
    public defpackage.l33 t0;
    public defpackage.nh2 u0;

    public static void U0(defpackage.jt3 r5, java.lang.String r6, boolean r7) {
            if (r7 != 0) goto L3
            return
        L3:
            t37 r7 = r5.e
            w51 r0 = r5.v
            if (r7 == 0) goto L2e
            gh1 r1 = new gh1
            r1.<init>()
            pu0 r2 = new pu0
            r3 = 1
            r2.<init>(r6, r3)
            r6 = 2
            ds1[] r6 = new defpackage.ds1[r6]
            r4 = 0
            r6[r4] = r1
            r6[r3] = r2
            java.util.List r6 = defpackage.hf.c0(r6)
            yc1 r5 = r5.d
            c37 r5 = r5.n(r6)
            r6 = 0
            r7.a(r6, r5)
            r0.g(r5)
            return
        L2e:
            c37 r5 = new c37
            int r7 = r6.length()
            long r1 = defpackage.jx2.f(r7, r7)
            r7 = 4
            r5.<init>(r6, r7, r1)
            r0.g(r5)
            return
    }

    @Override // defpackage.va6
    public final void A0(defpackage.gb6 r11) {
            r10 = this;
            boolean r0 = r10.q0
            c37 r1 = r10.n0
            fp r1 = r1.a
            fg3[] r2 = defpackage.eb6.a
            fb6 r2 = defpackage.bb6.F
            fg3[] r3 = defpackage.eb6.a
            r4 = 18
            r4 = r3[r4]
            r11.a(r2, r1)
            p97 r1 = r10.m0
            fp r1 = r1.a
            fb6 r2 = defpackage.bb6.G
            r4 = 19
            r4 = r3[r4]
            r11.a(r2, r1)
            c37 r1 = r10.n0
            long r1 = r1.b
            fb6 r4 = defpackage.bb6.H
            r5 = 20
            r5 = r3[r5]
            k47 r5 = new k47
            r5.<init>(r1)
            r11.a(r4, r5)
            rf r1 = defpackage.xd5.Y
            fb6 r2 = defpackage.bb6.s
            r4 = 9
            r4 = r3[r4]
            r11.a(r2, r1)
            c37 r1 = r10.n0
            fp r1 = r1.a
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r5 = 0
            if (r2 < r4) goto L52
            oh r2 = new oh
            android.view.autofill.AutofillValue r1 = defpackage.wa2.j(r1)
            r2.<init>(r1)
            goto L53
        L52:
            r2 = r5
        L53:
            if (r2 == 0) goto L5e
            fb6 r1 = defpackage.bb6.t
            r4 = 10
            r4 = r3[r4]
            r11.a(r1, r2)
        L5e:
            d61 r1 = new d61
            r2 = 0
            r1.<init>(r10, r2)
            fb6 r2 = defpackage.sa6.h
            y1 r4 = new y1
            r4.<init>(r5, r1)
            r11.a(r2, r4)
            l33 r1 = r10.t0
            int r1 = r1.d
            r2 = 7
            r4 = 6
            if (r1 != r4) goto L81
            c41 r1 = defpackage.d41.a
            r1.getClass()
            sf r1 = defpackage.c41.d
            defpackage.eb6.c(r11, r1)
            goto La0
        L81:
            if (r1 != r2) goto L84
            goto L88
        L84:
            r6 = 8
            if (r1 != r6) goto L93
        L88:
            c41 r1 = defpackage.d41.a
            r1.getClass()
            sf r1 = defpackage.c41.c
            defpackage.eb6.c(r11, r1)
            goto La0
        L93:
            r6 = 4
            if (r1 != r6) goto La0
            c41 r1 = defpackage.d41.a
            r1.getClass()
            sf r1 = defpackage.c41.e
            defpackage.eb6.c(r11, r1)
        La0:
            boolean r1 = r10.p0
            jg7 r6 = defpackage.jg7.a
            if (r1 != 0) goto Lab
            fb6 r1 = defpackage.bb6.j
            r11.a(r1, r6)
        Lab:
            if (r0 == 0) goto Lb2
            fb6 r1 = defpackage.bb6.L
            r11.a(r1, r6)
        Lb2:
            boolean r1 = r10.p0
            fb6 r6 = defpackage.bb6.O
            r7 = 28
            r3 = r3[r7]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r11.a(r6, r3)
            d61 r3 = new d61
            r6 = 1
            r3.<init>(r10, r6)
            defpackage.eb6.a(r11, r3)
            r3 = 2
            if (r1 == 0) goto Leb
            d61 r1 = new d61
            r1.<init>(r10, r3)
            fb6 r7 = defpackage.sa6.k
            y1 r8 = new y1
            r8.<init>(r5, r1)
            r11.a(r7, r8)
            d61 r1 = new d61
            r1.<init>(r10, r11)
            fb6 r7 = defpackage.sa6.o
            y1 r8 = new y1
            r8.<init>(r5, r1)
            r11.a(r7, r8)
        Leb:
            ov4 r1 = new ov4
            r7 = 5
            r1.<init>(r10, r7)
            fb6 r8 = defpackage.sa6.j
            y1 r9 = new y1
            r9.<init>(r5, r1)
            r11.a(r8, r9)
            l33 r1 = r10.t0
            int r1 = r1.e
            c61 r8 = new c61
            r8.<init>(r10, r4)
            fb6 r4 = defpackage.bb6.I
            k33 r9 = new k33
            r9.<init>(r1)
            r11.a(r4, r9)
            fb6 r1 = defpackage.sa6.p
            y1 r4 = new y1
            r4.<init>(r5, r8)
            r11.a(r1, r4)
            c61 r1 = new c61
            r1.<init>(r10, r2)
            fb6 r2 = defpackage.sa6.b
            y1 r4 = new y1
            r4.<init>(r5, r1)
            r11.a(r2, r4)
            c61 r1 = new c61
            r1.<init>(r10, r6)
            fb6 r2 = defpackage.sa6.c
            y1 r4 = new y1
            r4.<init>(r5, r1)
            r11.a(r2, r4)
            c37 r1 = r10.n0
            long r1 = r1.b
            boolean r1 = defpackage.k47.c(r1)
            if (r1 != 0) goto L165
            if (r0 != 0) goto L165
            c61 r0 = new c61
            r0.<init>(r10, r3)
            fb6 r1 = defpackage.sa6.q
            y1 r2 = new y1
            r2.<init>(r5, r0)
            r11.a(r1, r2)
            boolean r0 = r10.p0
            if (r0 == 0) goto L165
            c61 r0 = new c61
            r1 = 3
            r0.<init>(r10, r1)
            fb6 r1 = defpackage.sa6.r
            y1 r2 = new y1
            r2.<init>(r5, r0)
            r11.a(r1, r2)
        L165:
            boolean r0 = r10.p0
            if (r0 == 0) goto L178
            c61 r0 = new c61
            r0.<init>(r10, r7)
            fb6 r10 = defpackage.sa6.s
            y1 r1 = new y1
            r1.<init>(r5, r0)
            r11.a(r10, r1)
        L178:
            return
    }

    @Override // defpackage.va6
    public final boolean C0() {
            r0 = this;
            r0 = 1
            return r0
    }
}
