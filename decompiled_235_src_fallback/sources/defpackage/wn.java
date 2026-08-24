package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wn  reason: default package */
/* loaded from: classes.dex */
public final class wn extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.xn L;
    public final /* synthetic */ long R;

    public /* synthetic */ wn(defpackage.xn r1, long r2, int r4) {
            r0 = this;
            r0.B = r4
            r0.L = r1
            r0.R = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.B
            r1 = 0
            r3 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r9.R
            xn r9 = r9.L
            switch(r0) {
                case 0: goto L44;
                default: goto L10;
            }
        L10:
            yn r0 = r9.n0
            java.lang.Object r0 = r0.a()
            boolean r0 = defpackage.nb3.k(r10, r0)
            if (r0 == 0) goto L2a
            long r0 = r9.o0
            boolean r10 = defpackage.q93.b(r0, r3)
            if (r10 == 0) goto L26
            r1 = r5
            goto L3e
        L26:
            long r9 = r9.o0
            r1 = r9
            goto L3e
        L2a:
            yn r9 = r9.n0
            ja4 r9 = r9.d
            java.lang.Object r9 = r9.g(r10)
            pp6 r9 = (defpackage.pp6) r9
            if (r9 == 0) goto L3e
            java.lang.Object r9 = r9.getValue()
            q93 r9 = (defpackage.q93) r9
            long r1 = r9.a
        L3e:
            q93 r9 = new q93
            r9.<init>(r1)
            return r9
        L44:
            aa7 r10 = (defpackage.aa7) r10
            java.lang.Object r0 = r10.a()
            yn r7 = r9.n0
            java.lang.Object r7 = r7.a()
            boolean r0 = defpackage.nb3.k(r0, r7)
            if (r0 == 0) goto L62
            long r7 = r9.o0
            boolean r0 = defpackage.q93.b(r7, r3)
            if (r0 == 0) goto L5f
            goto L7c
        L5f:
            long r5 = r9.o0
            goto L7c
        L62:
            yn r0 = r9.n0
            ja4 r0 = r0.d
            java.lang.Object r3 = r10.a()
            java.lang.Object r0 = r0.g(r3)
            pp6 r0 = (defpackage.pp6) r0
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r0.getValue()
            q93 r0 = (defpackage.q93) r0
            long r5 = r0.a
            goto L7c
        L7b:
            r5 = r1
        L7c:
            yn r0 = r9.n0
            ja4 r0 = r0.d
            java.lang.Object r10 = r10.c()
            java.lang.Object r10 = r0.g(r10)
            pp6 r10 = (defpackage.pp6) r10
            if (r10 == 0) goto L94
            java.lang.Object r10 = r10.getValue()
            q93 r10 = (defpackage.q93) r10
            long r1 = r10.a
        L94:
            qa4 r9 = r9.m0
            java.lang.Object r9 = r9.getValue()
            gj6 r9 = (defpackage.gj6) r9
            if (r9 == 0) goto Lb2
            eo2 r9 = r9.a
            q93 r10 = new q93
            r10.<init>(r5)
            q93 r0 = new q93
            r0.<init>(r1)
            java.lang.Object r9 = r9.o(r10, r0)
            rc2 r9 = (defpackage.rc2) r9
            if (r9 != 0) goto Lbb
        Lb2:
            r9 = 1137180672(0x43c80000, float:400.0)
            r10 = 5
            r0 = 0
            r1 = 0
            io6 r9 = defpackage.ge7.U(r0, r9, r1, r10)
        Lbb:
            return r9
    }
}
