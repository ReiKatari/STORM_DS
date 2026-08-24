package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s12  reason: default package */
/* loaded from: classes.dex */
public final class s12 implements defpackage.ne2 {
    public final /* synthetic */ defpackage.sz1 A;
    public final /* synthetic */ defpackage.nv4 B;
    public final /* synthetic */ defpackage.pq5 L;

    public s12(defpackage.sz1 r1, defpackage.nv4 r2, defpackage.pq5 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    @Override // defpackage.ne2
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object r1, defpackage.r41 r2) {
            r0 = this;
            bv4 r1 = (defpackage.bv4) r1
            java.lang.Object r0 = r0.b(r1, r2)
            return r0
    }

    public final java.lang.Object b(defpackage.bv4 r14, defpackage.r41 r15) {
            r13 = this;
            boolean r0 = r15 instanceof defpackage.r12
            if (r0 == 0) goto L13
            r0 = r15
            r12 r0 = (defpackage.r12) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            r12 r0 = new r12
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L2a
            defpackage.oi2.Y(r15)
            goto La3
        L2a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r3
        L30:
            defpackage.oi2.Y(r15)
            sz1 r15 = r13.A
            tp6 r15 = r15.Q0
            r15.l(r14)
            sz1 r15 = r13.A
            pb5 r2 = new pb5
            lc5 r6 = r14.c
            int r6 = r6.a
            jf4 r7 = r15.o
            boolean r7 = r7.a()
            r2.<init>(r6, r7)
            java.lang.String r6 = "pending_snapshot_changed"
            r15.e1(r2, r6)
            lc5 r15 = r14.c
            int r2 = r15.a
            sz1 r6 = r13.A
            xv2 r7 = r6.m
            if (r2 != 0) goto Lb8
            gd5 r15 = r14.a
            java.lang.String r2 = r15.a
            java.lang.String r15 = r15.c
            r7.b(r2, r15)
            sz1 r15 = r13.A
            q33 r2 = r15.g0
            lc5 r15 = r14.c
            int r15 = r15.a
            monitor-enter(r2)
            boolean r6 = r2.A     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L8b
            if (r15 == 0) goto L73
            goto L8b
        L73:
            r2.A = r4     // Catch: java.lang.Throwable -> L88
            monitor-exit(r2)
            sz1 r14 = r13.A
            nv4 r13 = r13.B
            o41 r15 = r14.z
            a12 r0 = new a12
            r0.<init>(r14, r13, r3)
            r13 = 3
            defpackage.hv.L(r15, r3, r3, r0, r13)
            jg7 r13 = defpackage.jg7.a
            return r13
        L88:
            r0 = move-exception
            r13 = r0
            goto Lb6
        L8b:
            monitor-exit(r2)
            sz1 r15 = r13.A
            jf4 r15 = r15.o
            boolean r15 = r15.a()
            if (r15 == 0) goto Lc9
            sz1 r15 = r13.A
            gd5 r14 = r14.a
            r0.Y = r5
            java.lang.Object r15 = r15.N0(r14, r0)
            if (r15 != r1) goto La3
            return r1
        La3:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r14 = r15.booleanValue()
            if (r14 == 0) goto Lc9
            sz1 r13 = r13.A
            sz1$b r14 = defpackage.sz1.b.ONLINE_LIVE
            r13.G = r14
            sx1 r13 = r13.w
            r13.d = r4
            goto Lc9
        Lb6:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            throw r13
        Lb8:
            gd5 r14 = r14.a
            java.lang.String r10 = r14.a
            java.lang.String r11 = r14.c
            pq5 r13 = r13.L
            java.lang.String r12 = r13.a
            int r8 = r15.b
            int r9 = r15.c
            r7.c(r8, r9, r10, r11, r12)
        Lc9:
            jg7 r13 = defpackage.jg7.a
            return r13
    }
}
