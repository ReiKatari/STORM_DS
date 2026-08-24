package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cu0  reason: default package */
/* loaded from: classes.dex */
public final class cu0 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.ul0 X;
    public byte[] Y;
    public int Z;
    public int d0;
    public int e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ defpackage.le2[] g0;
    public final /* synthetic */ defpackage.on2 h0;
    public final /* synthetic */ defpackage.fo2 i0;
    public final /* synthetic */ defpackage.ne2 j0;

    public cu0(defpackage.r41 r1, defpackage.ne2 r2, defpackage.on2 r3, defpackage.fo2 r4, defpackage.le2[] r5) {
            r0 = this;
            r0.g0 = r5
            r0.h0 = r3
            r0.i0 = r4
            r0.j0 = r2
            r2 = 2
            r0.<init>(r2, r1)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            cu0 r0 = (defpackage.cu0) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            cu0 r0 = new cu0
            fo2 r4 = r6.i0
            ne2 r2 = r6.j0
            on2 r3 = r6.h0
            le2[] r5 = r6.g0
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.f0 = r8
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 0
            gr1 r4 = defpackage.fh4.b
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L50
            if (r2 == r8) goto L33
            if (r2 == r6) goto L1c
            if (r2 != r5) goto L16
            goto L1c
        L16:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r7
        L1c:
            int r2 = r0.d0
            int r7 = r0.Z
            byte[] r9 = r0.Y
            ul0 r10 = r0.X
            java.lang.Object r11 = r0.f0
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            defpackage.oi2.Y(r20)
            r18 = r11
            r11 = r2
            r2 = r9
            r9 = r10
            r10 = r18
            goto L84
        L33:
            int r2 = r0.d0
            int r7 = r0.Z
            byte[] r9 = r0.Y
            ul0 r10 = r0.X
            java.lang.Object r11 = r0.f0
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            defpackage.oi2.Y(r20)
            r12 = r20
            gm0 r12 = (defpackage.gm0) r12
            java.lang.Object r12 = r12.a
            r18 = r11
            r11 = r2
            r2 = r9
            r9 = r10
            r10 = r18
            goto L99
        L50:
            defpackage.oi2.Y(r20)
            java.lang.Object r2 = r0.f0
            w61 r2 = (defpackage.w61) r2
            le2[] r9 = r0.g0
            int r9 = r9.length
            if (r9 != 0) goto L5d
            goto La1
        L5d:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            defpackage.fv.z0(r3, r9, r4, r10)
            r11 = 6
            v80 r16 = defpackage.nb3.c(r9, r7, r7, r11)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r15.<init>(r9)
            r14 = r3
        L6d:
            if (r14 >= r9) goto L7e
            m7 r12 = new m7
            le2[] r13 = r0.g0
            r17 = 0
            r12.<init>(r13, r14, r15, r16, r17)
            defpackage.hv.L(r2, r7, r7, r12, r5)
            int r14 = r14 + 1
            goto L6d
        L7e:
            byte[] r2 = new byte[r9]
            r11 = r3
            r7 = r9
            r9 = r16
        L84:
            int r11 = r11 + r8
            byte r11 = (byte) r11
            r0.f0 = r10
            r0.X = r9
            r0.Y = r2
            r0.Z = r7
            r0.d0 = r11
            r0.e0 = r8
            java.lang.Object r12 = r9.p(r0)
            if (r12 != r1) goto L99
            goto Lfd
        L99:
            java.lang.Object r12 = defpackage.gm0.a(r12)
            j43 r12 = (defpackage.j43) r12
            if (r12 != 0) goto La4
        La1:
            jg7 r0 = defpackage.jg7.a
            return r0
        La4:
            int r13 = r12.a
            r14 = r10[r13]
            java.lang.Object r12 = r12.b
            r10[r13] = r12
            if (r14 != r4) goto Lb0
            int r7 = r7 + (-1)
        Lb0:
            r12 = r2[r13]
            if (r12 == r11) goto Lc3
            byte r12 = (byte) r11
            r2[r13] = r12
            java.lang.Object r12 = r9.m()
            java.lang.Object r12 = defpackage.gm0.a(r12)
            j43 r12 = (defpackage.j43) r12
            if (r12 != 0) goto La4
        Lc3:
            if (r7 != 0) goto L84
            on2 r12 = r0.h0
            java.lang.Object r12 = r12.c()
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            ne2 r13 = r0.j0
            fo2 r14 = r0.i0
            if (r12 != 0) goto Le6
            r0.f0 = r10
            r0.X = r9
            r0.Y = r2
            r0.Z = r7
            r0.d0 = r11
            r0.e0 = r6
            java.lang.Object r12 = r14.e(r13, r10, r0)
            if (r12 != r1) goto L84
            goto Lfd
        Le6:
            r15 = 14
            defpackage.fv.w0(r10, r12, r3, r3, r15)
            r0.f0 = r10
            r0.X = r9
            r0.Y = r2
            r0.Z = r7
            r0.d0 = r11
            r0.e0 = r5
            java.lang.Object r12 = r14.e(r13, r12, r0)
            if (r12 != r1) goto L84
        Lfd:
            return r1
    }
}
