package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz5  reason: default package */
/* loaded from: classes.dex */
public final class qz5 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.lb6 X;
    public defpackage.tz5 Y;
    public defpackage.pq5 Z;
    public int d0;
    public int e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ defpackage.tz5 g0;
    public final /* synthetic */ defpackage.pq5 h0;
    public final /* synthetic */ java.lang.String i0;

    public qz5(defpackage.tz5 r1, defpackage.pq5 r2, java.lang.String r3, defpackage.r41 r4) {
            r0 = this;
            r0.g0 = r1
            r0.h0 = r2
            r0.i0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            qz5 r0 = (defpackage.qz5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            qz5 r0 = new qz5
            pq5 r1 = r3.h0
            java.lang.String r2 = r3.i0
            tz5 r3 = r3.g0
            r0.<init>(r3, r1, r2, r4)
            r0.f0 = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = r7.f0
            w61 r0 = (defpackage.w61) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r7.e0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L31
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1d
            tz5 r0 = r7.Y
            w61 r0 = (defpackage.w61) r0
            lb6 r0 = r7.X
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> L1b
            goto L67
        L1b:
            r8 = move-exception
            goto L6a
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r5
        L23:
            int r0 = r7.d0
            pq5 r2 = r7.Z
            tz5 r4 = r7.Y
            lb6 r6 = r7.X
            defpackage.oi2.Y(r8)
            r8 = r0
            r0 = r6
            goto L52
        L31:
            defpackage.oi2.Y(r8)
            tz5 r8 = r7.g0
            lb6 r2 = r8.o
            pq5 r6 = r7.h0
            r7.f0 = r0
            r7.X = r2
            r7.Y = r8
            r7.Z = r6
            r0 = 0
            r7.d0 = r0
            r7.e0 = r4
            java.lang.Object r4 = r2.a(r7)
            if (r4 != r1) goto L4e
            goto L66
        L4e:
            r4 = r8
            r8 = r0
            r0 = r2
            r2 = r6
        L52:
            e70 r4 = r4.i     // Catch: java.lang.Throwable -> L1b
            r7.f0 = r5     // Catch: java.lang.Throwable -> L1b
            r7.X = r0     // Catch: java.lang.Throwable -> L1b
            r7.Y = r5     // Catch: java.lang.Throwable -> L1b
            r7.Z = r5     // Catch: java.lang.Throwable -> L1b
            r7.d0 = r8     // Catch: java.lang.Throwable -> L1b
            r7.e0 = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r8 = r4.e(r2, r7)     // Catch: java.lang.Throwable -> L1b
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L1b
            goto L70
        L6a:
            em5 r1 = new em5     // Catch: java.lang.Throwable -> Lb1
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Lb1
            r8 = r1
        L70:
            boolean r1 = r8 instanceof defpackage.em5     // Catch: java.lang.Throwable -> Lb1
            if (r1 == 0) goto L76
            goto L77
        L76:
            r5 = r8
        L77:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lb1
            r0.c()
            tz5 r8 = r7.g0
            tp6 r8 = r8.l
            java.lang.String r1 = r7.i0
        L82:
            java.lang.Object r0 = r8.getValue()
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            if (r5 != 0) goto L8e
            java.lang.String r3 = ""
            goto L8f
        L8e:
            r3 = r5
        L8f:
            vr4 r4 = new vr4
            r4.<init>(r1, r3)
            java.util.Map r2 = defpackage.c14.p0(r2, r4)
            boolean r0 = r8.j(r0, r2)
            if (r0 == 0) goto L82
            tz5 r8 = r7.g0
            java.util.LinkedHashSet r0 = r8.n
            java.lang.String r7 = r7.i0
            monitor-enter(r0)
            java.util.LinkedHashSet r8 = r8.n     // Catch: java.lang.Throwable -> Lae
            r8.remove(r7)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r0)
            jg7 r7 = defpackage.jg7.a
            return r7
        Lae:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        Lb1:
            r7 = move-exception
            r0.c()
            throw r7
    }
}
