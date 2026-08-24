package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n17  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n17 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Float B;
    public final /* synthetic */ defpackage.eo2 L;
    public final /* synthetic */ long R;

    public /* synthetic */ n17(long r2, java.lang.Float r4, defpackage.eo2 r5) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r1.B = r4
            r1.L = r5
            return
    }

    public /* synthetic */ n17(java.lang.Float r2, defpackage.eo2 r3, long r4) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.A
            jg7 r1 = defpackage.jg7.a
            r2 = 2
            r3 = 0
            r4 = 1
            long r5 = r8.R
            eo2 r7 = r8.L
            java.lang.Float r8 = r8.B
            px0 r9 = (defpackage.px0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            switch(r0) {
                case 0: goto L5e;
                default: goto L18;
            }
        L18:
            r0 = r10 & 3
            if (r0 == r2) goto L1e
            r0 = r4
            goto L1f
        L1e:
            r0 = r3
        L1f:
            r10 = r10 & r4
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L5a
            r10 = 8
            if (r8 == 0) goto L3f
            r0 = 1484860324(0x58812ba4, float:1.1361955E15)
            r9.b0(r0)
            py0 r0 = defpackage.g31.a
            pq r8 = r0.a(r8)
            defpackage.hv.d(r8, r7, r9, r10)
            r9.p(r3)
            goto L5d
        L3f:
            r8 = 1485059902(0x5884373e, float:1.1629824E15)
            r9.b0(r8)
            py0 r8 = defpackage.g31.a
            float r0 = defpackage.kt0.e(r5)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            pq r8 = r8.a(r0)
            defpackage.hv.d(r8, r7, r9, r10)
            r9.p(r3)
            goto L5d
        L5a:
            r9.V()
        L5d:
            return r1
        L5e:
            r0 = r10 & 3
            if (r0 == r2) goto L63
            r3 = r4
        L63:
            r10 = r10 & r4
            xq2 r9 = (defpackage.xq2) r9
            boolean r10 = r9.S(r10, r3)
            if (r10 == 0) goto L89
            py0 r10 = defpackage.j31.a
            kt0 r0 = new kt0
            r0.<init>(r5)
            pq r10 = r10.a(r0)
            n17 r0 = new n17
            r0.<init>(r8, r7, r5)
            r8 = -1624601445(0xffffffff9f2a8c9b, float:-3.6115206E-20)
            zv0 r8 = defpackage.n16.I(r8, r0, r9)
            r0 = 56
            defpackage.hv.d(r10, r8, r9, r0)
            goto L8c
        L89:
            r9.V()
        L8c:
            return r1
    }
}
