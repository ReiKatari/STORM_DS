package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gc  reason: default package */
/* loaded from: classes.dex */
public final class gc implements defpackage.eo2 {
    public final /* synthetic */ defpackage.zv0 A;
    public final /* synthetic */ defpackage.a74 B;
    public final /* synthetic */ defpackage.eo2 L;
    public final /* synthetic */ defpackage.eo2 R;
    public final /* synthetic */ defpackage.ke6 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;

    public gc(defpackage.zv0 r1, defpackage.a74 r2, defpackage.eo2 r3, defpackage.eo2 r4, defpackage.ke6 r5, long r6, long r8) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r8
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r13, java.lang.Object r14) {
            r12 = this;
            px0 r13 = (defpackage.px0) r13
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            r0 = r14 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = 0
        L11:
            r14 = r14 & r2
            r10 = r13
            xq2 r10 = (defpackage.xq2) r10
            boolean r13 = r10.S(r14, r0)
            if (r13 == 0) goto L2e
            long r8 = r12.Z
            r11 = 0
            zv0 r1 = r12.A
            a74 r2 = r12.B
            eo2 r3 = r12.L
            eo2 r4 = r12.R
            ke6 r5 = r12.X
            long r6 = r12.Y
            defpackage.hc.b(r1, r2, r3, r4, r5, r6, r8, r10, r11)
            goto L31
        L2e:
            r10.V()
        L31:
            jg7 r12 = defpackage.jg7.a
            return r12
    }
}
