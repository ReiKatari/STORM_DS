package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u22  reason: default package */
/* loaded from: classes.dex */
public final class u22 extends defpackage.hw6 implements defpackage.eo2 {
    public /* synthetic */ java.lang.Object X;
    public final /* synthetic */ defpackage.nv4 Y;
    public final /* synthetic */ long Z;

    public u22(defpackage.nv4 r1, long r2, defpackage.r41 r4) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            tz1 r1 = (defpackage.tz1) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            u22 r0 = (defpackage.u22) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r5, java.lang.Object r6) {
            r4 = this;
            u22 r0 = new u22
            nv4 r1 = r4.Y
            long r2 = r4.Z
            r0.<init>(r1, r2, r5)
            r0.X = r6
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = r5.X
            tz1 r0 = (defpackage.tz1) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r6)
            long r1 = r0.a
            nv4 r6 = r5.Y
            gd5 r6 = r6.a
            long r3 = r6.e
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L1f
            long r0 = r0.b
            long r5 = r5.Z
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 < 0) goto L1f
            r5 = 1
            goto L20
        L1f:
            r5 = 0
        L20:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
    }
}
