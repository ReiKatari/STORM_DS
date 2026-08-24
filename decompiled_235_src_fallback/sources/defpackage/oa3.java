package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oa3  reason: default package */
/* loaded from: classes.dex */
public final class oa3 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ne2 B;
    public final /* synthetic */ defpackage.wa3 L;

    public /* synthetic */ oa3(defpackage.ne2 r1, defpackage.wa3 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r11, defpackage.r41 r12) {
            r10 = this;
            int r0 = r10.A
            jg7 r1 = defpackage.jg7.a
            wa3 r2 = r10.L
            ne2 r3 = r10.B
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            switch(r0) {
                case 0: goto L4e;
                default: goto L11;
            }
        L11:
            boolean r0 = r12 instanceof defpackage.sa3
            if (r0 == 0) goto L22
            r0 = r12
            sa3 r0 = (defpackage.sa3) r0
            int r8 = r0.X
            r9 = r8 & r6
            if (r9 == 0) goto L22
            int r8 = r8 - r6
            r0.X = r8
            goto L27
        L22:
            sa3 r0 = new sa3
            r0.<init>(r10, r12)
        L27:
            java.lang.Object r10 = r0.R
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r0.X
            if (r6 == 0) goto L3a
            if (r6 != r7) goto L35
            defpackage.oi2.Y(r10)
            goto L4d
        L35:
            defpackage.i.m(r5)
            r1 = r4
            goto L4d
        L3a:
            defpackage.oi2.Y(r10)
            r10 = r11
            java.util.List r10 = (java.util.List) r10
            boolean r10 = r2.e
            if (r10 == 0) goto L4d
            r0.X = r7
            java.lang.Object r10 = r3.a(r11, r0)
            if (r10 != r12) goto L4d
            r1 = r12
        L4d:
            return r1
        L4e:
            boolean r0 = r12 instanceof defpackage.na3
            if (r0 == 0) goto L5f
            r0 = r12
            na3 r0 = (defpackage.na3) r0
            int r8 = r0.X
            r9 = r8 & r6
            if (r9 == 0) goto L5f
            int r8 = r8 - r6
            r0.X = r8
            goto L64
        L5f:
            na3 r0 = new na3
            r0.<init>(r10, r12)
        L64:
            java.lang.Object r10 = r0.R
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r0.X
            if (r6 == 0) goto L77
            if (r6 != r7) goto L72
            defpackage.oi2.Y(r10)
            goto L8a
        L72:
            defpackage.i.m(r5)
            r1 = r4
            goto L8a
        L77:
            defpackage.oi2.Y(r10)
            r10 = r11
            java.util.List r10 = (java.util.List) r10
            boolean r10 = r2.e
            if (r10 == 0) goto L8a
            r0.X = r7
            java.lang.Object r10 = r3.a(r11, r0)
            if (r10 != r12) goto L8a
            r1 = r12
        L8a:
            return r1
    }
}
