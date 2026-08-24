package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n64  reason: default package */
/* loaded from: classes.dex */
public final class n64 extends defpackage.z64 implements defpackage.fy0, defpackage.jm3 {
    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r3, defpackage.x24 r4, long r5) {
            r2 = this;
            boolean r0 = r2.j0
            if (r0 == 0) goto L14
            nq6 r0 = defpackage.u93.a
            java.lang.Object r2 = defpackage.hf.K(r2, r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            long r0 = defpackage.u93.b
            dx4 r4 = r4.y(r5)
            int r5 = r4.A
            if (r2 == 0) goto L2b
            float r6 = defpackage.sm1.b(r0)
            int r6 = r3.r0(r6)
            int r5 = java.lang.Math.max(r5, r6)
        L2b:
            int r6 = r4.B
            if (r2 == 0) goto L3b
            float r2 = defpackage.sm1.a(r0)
            int r2 = r3.r0(r2)
            int r6 = java.lang.Math.max(r6, r2)
        L3b:
            m83 r2 = new m83
            r2.<init>(r5, r4, r6)
            zt1 r4 = defpackage.zt1.A
            f34 r2 = r3.K(r5, r6, r4, r2)
            return r2
    }
}
