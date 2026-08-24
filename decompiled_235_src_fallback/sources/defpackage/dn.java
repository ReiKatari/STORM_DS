package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dn  reason: default package */
/* loaded from: classes.dex */
public final class dn extends defpackage.hw6 implements defpackage.qn2 {
    public defpackage.uo X;
    public defpackage.zg5 Y;
    public int Z;
    public final /* synthetic */ defpackage.gn d0;
    public final /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.jz6 f0;
    public final /* synthetic */ long g0;
    public final /* synthetic */ defpackage.qn2 h0;

    public dn(defpackage.gn r1, java.lang.Object r2, defpackage.jz6 r3, long r4, defpackage.qn2 r6, defpackage.r41 r7) {
            r0 = this;
            r0.d0 = r1
            r0.e0 = r2
            r0.f0 = r3
            r0.g0 = r4
            r0.h0 = r6
            r1 = 1
            r0.<init>(r1, r7)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            r7 = r9
            r41 r7 = (defpackage.r41) r7
            dn r0 = new dn
            long r4 = r8.g0
            qn2 r6 = r8.h0
            gn r1 = r8.d0
            java.lang.Object r2 = r8.e0
            jz6 r3 = r8.f0
            r0.<init>(r1, r2, r3, r4, r6, r7)
            jg7 r8 = defpackage.jg7.a
            java.lang.Object r8 = r0.s(r8)
            return r8
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r23) {
            r22 = this;
            r5 = r22
            jz6 r1 = r5.f0
            gn r7 = r5.d0
            uo r0 = r7.c
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r5.Z
            r3 = 1
            if (r2 == 0) goto L23
            if (r2 != r3) goto L1c
            zg5 r0 = r5.Y
            uo r1 = r5.X
            defpackage.oi2.Y(r23)     // Catch: java.util.concurrent.CancellationException -> L19
            goto L81
        L19:
            r0 = move-exception
            goto L93
        L1c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L23:
            defpackage.oi2.Y(r23)
            wc7 r2 = r7.a     // Catch: java.util.concurrent.CancellationException -> L19
            qn2 r2 = r2.a     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r4 = r5.e0     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r2 = r2.g(r4)     // Catch: java.util.concurrent.CancellationException -> L19
            ap r2 = (defpackage.ap) r2     // Catch: java.util.concurrent.CancellationException -> L19
            r0.L = r2     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r2 = r1.L     // Catch: java.util.concurrent.CancellationException -> L19
            vs4 r4 = r7.e     // Catch: java.util.concurrent.CancellationException -> L19
            r4.setValue(r2)     // Catch: java.util.concurrent.CancellationException -> L19
            vs4 r2 = r7.d     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L19
            r2.setValue(r4)     // Catch: java.util.concurrent.CancellationException -> L19
            vs4 r2 = r0.B     // Catch: java.util.concurrent.CancellationException -> L19
            java.lang.Object r15 = r2.getValue()     // Catch: java.util.concurrent.CancellationException -> L19
            ap r2 = r0.L     // Catch: java.util.concurrent.CancellationException -> L19
            ap r16 = defpackage.nw7.R(r2)     // Catch: java.util.concurrent.CancellationException -> L19
            long r8 = r0.R     // Catch: java.util.concurrent.CancellationException -> L19
            boolean r2 = r0.Y     // Catch: java.util.concurrent.CancellationException -> L19
            uo r13 = new uo     // Catch: java.util.concurrent.CancellationException -> L19
            wc7 r14 = r0.A     // Catch: java.util.concurrent.CancellationException -> L19
            r19 = -9223372036854775808
            r21 = r2
            r17 = r8
            r13.<init>(r14, r15, r16, r17, r19, r21)     // Catch: java.util.concurrent.CancellationException -> L19
            r0 = r13
            zg5 r10 = new zg5     // Catch: java.util.concurrent.CancellationException -> L19
            r10.<init>()     // Catch: java.util.concurrent.CancellationException -> L19
            long r13 = r5.g0     // Catch: java.util.concurrent.CancellationException -> L19
            qn2 r9 = r5.h0     // Catch: java.util.concurrent.CancellationException -> L19
            cn r4 = new cn     // Catch: java.util.concurrent.CancellationException -> L19
            r11 = 0
            r8 = r0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.util.concurrent.CancellationException -> L19
            r5.X = r0     // Catch: java.util.concurrent.CancellationException -> L19
            r5.Y = r10     // Catch: java.util.concurrent.CancellationException -> L19
            r5.Z = r3     // Catch: java.util.concurrent.CancellationException -> L19
            r2 = r13
            java.lang.Object r1 = defpackage.kj2.k(r0, r1, r2, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L19
            if (r1 != r12) goto L7f
            return r12
        L7f:
            r1 = r0
            r0 = r10
        L81:
            boolean r0 = r0.A     // Catch: java.util.concurrent.CancellationException -> L19
            if (r0 == 0) goto L88
            mo r0 = defpackage.mo.BoundReached     // Catch: java.util.concurrent.CancellationException -> L19
            goto L8a
        L88:
            mo r0 = defpackage.mo.Finished     // Catch: java.util.concurrent.CancellationException -> L19
        L8a:
            defpackage.gn.b(r7)     // Catch: java.util.concurrent.CancellationException -> L19
            ro r2 = new ro     // Catch: java.util.concurrent.CancellationException -> L19
            r2.<init>(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L19
            return r2
        L93:
            defpackage.gn.b(r7)
            throw r0
    }
}
