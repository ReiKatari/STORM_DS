package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class d61 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.e61 B;

    public /* synthetic */ d61(defpackage.e61 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ d61(defpackage.e61 r1, defpackage.gb6 r2) {
            r0 = this;
            r2 = 3
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.A
            r1 = 0
            r2 = 0
            r3 = 1
            e61 r8 = r8.B
            switch(r0) {
                case 0: goto Lac;
                case 1: goto L8e;
                case 2: goto L80;
                default: goto La;
            }
        La:
            fp r9 = (defpackage.fp) r9
            boolean r0 = r8.p0
            if (r0 != 0) goto L11
            goto L7b
        L11:
            jt3 r0 = r8.o0
            t37 r0 = r0.e
            if (r0 == 0) goto L3e
            qc2 r4 = new qc2
            r4.<init>()
            pu0 r5 = new pu0
            r5.<init>(r9, r3)
            r9 = 2
            ds1[] r9 = new defpackage.ds1[r9]
            r9[r2] = r4
            r9[r3] = r5
            java.util.List r9 = defpackage.hf.c0(r9)
            jt3 r8 = r8.o0
            yc1 r2 = r8.d
            w51 r8 = r8.v
            c37 r9 = r2.n(r9)
            r0.a(r1, r9)
            r8.g(r9)
        L3c:
            r2 = r3
            goto L7b
        L3e:
            c37 r0 = r8.n0
            fp r1 = r0.a
            java.lang.String r1 = r1.B
            long r4 = r0.b
            int r0 = defpackage.k47.c
            r0 = 32
            long r6 = r4 >> r0
            int r2 = (int) r6
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r4 = (int) r4
            java.lang.StringBuilder r1 = defpackage.qs6.G0(r1, r2, r4, r9)
            java.lang.String r1 = r1.toString()
            c37 r2 = r8.n0
            long r4 = r2.b
            long r4 = r4 >> r0
            int r0 = (int) r4
            java.lang.String r9 = r9.B
            int r9 = r9.length()
            int r9 = r9 + r0
            long r4 = defpackage.jx2.f(r9, r9)
            jt3 r8 = r8.o0
            w51 r8 = r8.v
            c37 r9 = new c37
            r0 = 4
            r9.<init>(r1, r0, r4)
            r8.g(r9)
            goto L3c
        L7b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L80:
            fp r9 = (defpackage.fp) r9
            jt3 r0 = r8.o0
            java.lang.String r9 = r9.B
            boolean r8 = r8.p0
            defpackage.e61.U0(r0, r9, r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L8e:
            java.util.List r9 = (java.util.List) r9
            jt3 r0 = r8.o0
            b47 r0 = r0.d()
            if (r0 == 0) goto La7
            jt3 r8 = r8.o0
            b47 r8 = r8.d()
            r8.getClass()
            a47 r8 = r8.a
            r9.add(r8)
            r2 = r3
        La7:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        Lac:
            oh r9 = (defpackage.oh) r9
            jt3 r0 = r8.o0
            vs4 r0 = r0.t
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.setValue(r2)
            jt3 r0 = r8.o0
            vs4 r0 = r0.s
            r0.setValue(r2)
            jt3 r0 = r8.o0
            android.view.autofill.AutofillValue r3 = r9.a
            boolean r3 = defpackage.k2.D(r3)
            if (r3 == 0) goto Lce
            android.view.autofill.AutofillValue r9 = r9.a
            java.lang.CharSequence r1 = defpackage.k2.k(r9)
        Lce:
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            boolean r8 = r8.p0
            defpackage.e61.U0(r0, r1, r8)
            return r2
    }
}
