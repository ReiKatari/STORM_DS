package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gg7  reason: default package */
/* loaded from: classes.dex */
public final class gg7 extends defpackage.hw6 implements defpackage.go2 {
    public int X;
    public /* synthetic */ java.lang.Throwable Y;
    public /* synthetic */ long Z;

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            ne2 r2 = (defpackage.ne2) r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Number r4 = (java.lang.Number) r4
            long r1 = r4.longValue()
            r41 r5 = (defpackage.r41) r5
            gg7 r4 = new gg7
            r0 = 4
            r4.<init>(r0, r5)
            r4.Y = r3
            r4.Z = r1
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r1 = r4.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.X
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r8)
            goto L38
        Ld:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L14:
            defpackage.oi2.Y(r8)
            java.lang.Throwable r8 = r7.Y
            long r3 = r7.Z
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r5 = defpackage.hg7.a
            java.lang.String r6 = "Cannot check for unfinished work"
            r1.e(r5, r6, r8)
            r5 = 30000(0x7530, double:1.4822E-319)
            long r3 = r3 * r5
            long r5 = defpackage.hg7.b
            long r3 = java.lang.Math.min(r3, r5)
            r7.X = r2
            java.lang.Object r7 = defpackage.q60.t(r3, r7)
            if (r7 != r0) goto L38
            return r0
        L38:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
    }
}
