package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z75  reason: default package */
/* loaded from: classes.dex */
public final class z75 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.l85 Y;
    public final /* synthetic */ java.util.Map Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ defpackage.ar0 e0;
    public final /* synthetic */ defpackage.qn2 f0;

    public z75(defpackage.l85 r1, java.util.Map r2, boolean r3, defpackage.ar0 r4, defpackage.qn2 r5, defpackage.r41 r6) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r0.f0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            z75 r0 = (defpackage.z75) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            z75 r0 = new z75
            ar0 r4 = r7.e0
            qn2 r5 = r7.f0
            l85 r1 = r7.Y
            java.util.Map r2 = r7.Z
            boolean r3 = r7.d0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r14) {
            r13 = this;
            l61 r1 = r13.B
            java.util.Map r0 = r13.Z
            l85 r2 = r13.Y
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r13.X
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L1f
            if (r4 != r6) goto L19
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L15
            goto Lc9
        L15:
            r0 = move-exception
            r14 = r0
            goto Lcc
        L19:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r5
        L1f:
            defpackage.oi2.Y(r14)
            r2.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            int r14 = r0.size()
            r7.<init>(r14)
            java.util.Set r14 = r0.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L36:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto L70
            java.lang.Object r4 = r14.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r8 = r4.getKey()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "utf-8"
            java.lang.String r8 = java.net.URLEncoder.encode(r8, r9)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "="
            r9.append(r8)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r7.add(r4)
            goto L36
        L70:
            r11 = 0
            r12 = 62
            java.lang.String r8 = "&"
            r9 = 0
            r10 = 0
            java.lang.String r14 = defpackage.gt0.P0(r7, r8, r9, r10, r11, r12)
            cn5 r4 = r2.e
            en5 r7 = r4.c
            if (r7 != 0) goto L85
            en5 r7 = r4.a()
        L85:
            java.lang.String r4 = r7.d
            if (r4 == 0) goto L117
            java.lang.String r7 = "?"
            java.lang.String r14 = defpackage.lb1.m(r4, r7, r14)
            s9 r4 = new s9
            r7 = 13
            r4.<init>(r7)
            java.lang.String r7 = "GET"
            r4.D(r7, r5)
            r4.I(r14)
            pa r14 = new pa
            r14.<init>(r4)
            java.lang.String r4 = "u"
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto Lae
            goto Lbe
        Lae:
            java.lang.String r7 = "t"
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lb9
            goto Lbe
        Lb9:
            hb5 r5 = new hb5
            r5.<init>(r4, r0)
        Lbe:
            boolean r0 = r13.d0
            r13.X = r6     // Catch: java.lang.Throwable -> L15
            java.lang.Object r14 = r2.f(r14, r5, r0, r13)     // Catch: java.lang.Throwable -> L15
            if (r14 != r3) goto Lc9
            return r3
        Lc9:
            wl5 r14 = (defpackage.wl5) r14     // Catch: java.lang.Throwable -> L15
            goto Ld8
        Lcc:
            r1.getClass()
            defpackage.yh2.o(r1)
            em5 r0 = new em5
            r0.<init>(r14)
            r14 = r0
        Ld8:
            ar0 r0 = r13.e0
            qn2 r13 = r13.f0
            boolean r3 = r14 instanceof defpackage.em5
            if (r3 != 0) goto L104
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> Led
            wl5 r14 = (defpackage.wl5) r14     // Catch: java.lang.Throwable -> Led
            java.lang.Object r13 = defpackage.l85.b(r2, r0, r14, r13)     // Catch: java.lang.Throwable -> Lf0
            r14.close()     // Catch: java.lang.Throwable -> Led
            goto L111
        Led:
            r0 = move-exception
            r13 = r0
            goto Lf8
        Lf0:
            r0 = move-exception
            r13 = r0
            throw r13     // Catch: java.lang.Throwable -> Lf3
        Lf3:
            r0 = move-exception
            defpackage.ge7.t(r14, r13)     // Catch: java.lang.Throwable -> Led
            throw r0     // Catch: java.lang.Throwable -> Led
        Lf8:
            r1.getClass()
            defpackage.yh2.o(r1)
            em5 r14 = new em5
            r14.<init>(r13)
            goto L110
        L104:
            java.lang.Throwable r13 = defpackage.hm5.a(r14)
            r13.getClass()
            em5 r14 = new em5
            r14.<init>(r13)
        L110:
            r13 = r14
        L111:
            hm5 r14 = new hm5
            r14.<init>(r13)
            return r14
        L117:
            fs0 r13 = new fs0
            java.lang.String r14 = "RAOfflineProxy is selected but no active loopback host is available"
            r13.<init>(r14)
            throw r13
    }
}
