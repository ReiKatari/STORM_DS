package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg2  reason: default package */
/* loaded from: classes.dex */
public final class mg2 implements defpackage.ne2 {
    public final /* synthetic */ defpackage.ne2 A;
    public final /* synthetic */ defpackage.m16 B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ defpackage.qn2 R;

    public mg2(defpackage.ne2 r1, defpackage.m16 r2, boolean r3, defpackage.qn2 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r7, defpackage.r41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.lg2
            if (r0 == 0) goto L13
            r0 = r8
            lg2 r0 = (defpackage.lg2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            lg2 r0 = new lg2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.oi2.Y(r8)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L31:
            ne2 r6 = r0.Y
            defpackage.oi2.Y(r8)
            goto L50
        L37:
            defpackage.oi2.Y(r8)
            java.util.Set r7 = (java.util.Set) r7
            ne2 r7 = r6.A
            r0.Y = r7
            r0.X = r5
            m16 r8 = r6.B
            boolean r2 = r6.L
            qn2 r6 = r6.R
            java.lang.Object r8 = defpackage.hv.S(r0, r8, r5, r2, r6)
            if (r8 != r1) goto L4f
            goto L5a
        L4f:
            r6 = r7
        L50:
            r0.Y = r3
            r0.X = r4
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            jg7 r6 = defpackage.jg7.a
            return r6
    }
}
