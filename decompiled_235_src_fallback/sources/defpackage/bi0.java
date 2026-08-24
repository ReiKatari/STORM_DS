package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bi0  reason: default package */
/* loaded from: classes.dex */
public final class bi0 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.dh5 X;
    public defpackage.dh5 Y;
    public defpackage.dh5 Z;
    public defpackage.dh5 d0;
    public int e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ defpackage.ci0 g0;
    public final /* synthetic */ java.lang.String h0;
    public final /* synthetic */ defpackage.vd i0;

    public bi0(defpackage.ci0 r1, java.lang.String r2, defpackage.vd r3, defpackage.r41 r4) {
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
            bi0 r0 = (defpackage.bi0) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            bi0 r0 = new bi0
            java.lang.String r1 = r3.h0
            vd r2 = r3.i0
            ci0 r3 = r3.g0
            r0.<init>(r3, r1, r2, r4)
            r0.f0 = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r26) {
            r25 = this;
            r0 = r25
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 0
            java.lang.String r4 = "CXCP"
            java.lang.String r7 = r0.h0
            vd r8 = r0.i0
            r14 = 1
            r9 = 0
            if (r2 == 0) goto L33
            if (r2 != r14) goto L2c
            dh5 r2 = r0.d0
            dh5 r5 = r0.Z
            dh5 r6 = r0.Y
            dh5 r10 = r0.X
            java.lang.Object r11 = r0.f0
            w61 r11 = (defpackage.w61) r11
            defpackage.oi2.Y(r26)     // Catch: java.lang.Throwable -> L29
            r12 = r9
            r9 = r5
            r5 = r11
            r11 = r26
            goto L141
        L29:
            r0 = move-exception
            goto L189
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L33:
            defpackage.oi2.Y(r26)
            java.lang.Object r2 = r0.f0
            w61 r2 = (defpackage.w61) r2
            dh5 r11 = new dh5
            r11.<init>()
            b0 r5 = new b0
            r10 = 11
            ci0 r6 = r0.g0
            r5.<init>(r6, r7, r8, r9, r10)
            r10 = 3
            kg1 r5 = defpackage.hv.i(r2, r9, r9, r5, r10)
            r11.A = r5
            dh5 r5 = new dh5
            r5.<init>()
            a6 r12 = new a6
            r13 = 8
            r12.<init>(r8, r9, r13)
            kg1 r12 = defpackage.hv.i(r2, r9, r9, r12, r10)
            r5.A = r12
            dh5 r12 = new dh5
            r12.<init>()
            ai0 r13 = new ai0
            r15 = 2
            r13.<init>(r15, r9, r3)
            ap6 r13 = defpackage.hv.L(r2, r9, r9, r13, r10)
            r12.A = r13
            dh5 r13 = new dh5
            r13.<init>()
            a6 r15 = new a6
            r14 = 7
            r15.<init>(r6, r9, r14)
            ap6 r6 = defpackage.hv.L(r2, r9, r9, r15, r10)
            r13.A = r6
            r6 = r5
            r10 = r11
            r5 = r2
            r2 = r13
        L87:
            boolean r11 = defpackage.g04.H(r5)
            if (r11 == 0) goto L18f
            v96 r14 = new v96     // Catch: java.lang.Throwable -> L29
            l61 r11 = r0.B     // Catch: java.lang.Throwable -> L29
            r11.getClass()     // Catch: java.lang.Throwable -> L29
            r14.<init>(r11)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r10.A     // Catch: java.lang.Throwable -> L29
            jg1 r11 = (defpackage.jg1) r11     // Catch: java.lang.Throwable -> L29
            if (r11 == 0) goto La9
            eb r11 = r11.n()     // Catch: java.lang.Throwable -> L29
            xh0 r13 = new xh0     // Catch: java.lang.Throwable -> L29
            r13.<init>(r10, r7, r9, r3)     // Catch: java.lang.Throwable -> L29
            r14.h(r11, r13)     // Catch: java.lang.Throwable -> L29
        La9:
            java.lang.Object r11 = r6.A     // Catch: java.lang.Throwable -> L29
            jg1 r11 = (defpackage.jg1) r11     // Catch: java.lang.Throwable -> L29
            if (r11 == 0) goto Lbc
            eb r11 = r11.n()     // Catch: java.lang.Throwable -> L29
            xh0 r13 = new xh0     // Catch: java.lang.Throwable -> L29
            r15 = 1
            r13.<init>(r6, r7, r9, r15)     // Catch: java.lang.Throwable -> L29
            r14.h(r11, r13)     // Catch: java.lang.Throwable -> L29
        Lbc:
            java.lang.Object r11 = r12.A     // Catch: java.lang.Throwable -> L29
            rc3 r11 = (defpackage.rc3) r11     // Catch: java.lang.Throwable -> L29
            gr1 r21 = defpackage.w96.e
            if (r11 == 0) goto Lf8
            m44 r15 = r11.U()     // Catch: java.lang.Throwable -> L29
            yh0 r22 = new yh0     // Catch: java.lang.Throwable -> L29
            r13 = 0
            r11 = r12
            r12 = r9
            r9 = r11
            r11 = r8
            r8 = r22
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L29
            r8 = r11
            t96 r16 = new t96     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r15.B     // Catch: java.lang.Throwable -> L29
            r18 = r11
            ed3 r18 = (defpackage.ed3) r18     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r15.L     // Catch: java.lang.Throwable -> L29
            r19 = r11
            fo2 r19 = (defpackage.fo2) r19     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r15.R     // Catch: java.lang.Throwable -> L29
            r20 = r11
            gw0 r20 = (defpackage.gw0) r20     // Catch: java.lang.Throwable -> L29
            r23 = 0
            r17 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L29
            r13 = r16
            r11 = r17
            r11.j(r13, r3)     // Catch: java.lang.Throwable -> L29
            goto Lfc
        Lf8:
            r11 = r12
            r12 = r9
            r9 = r11
            r11 = r14
        Lfc:
            java.lang.Object r13 = r2.A     // Catch: java.lang.Throwable -> L29
            rc3 r13 = (defpackage.rc3) r13     // Catch: java.lang.Throwable -> L29
            if (r13 == 0) goto L12d
            m44 r13 = r13.U()     // Catch: java.lang.Throwable -> L29
            zh0 r14 = new zh0     // Catch: java.lang.Throwable -> L29
            r14.<init>(r2, r12, r3)     // Catch: java.lang.Throwable -> L29
            t96 r16 = new t96     // Catch: java.lang.Throwable -> L29
            java.lang.Object r15 = r13.B     // Catch: java.lang.Throwable -> L29
            r18 = r15
            ed3 r18 = (defpackage.ed3) r18     // Catch: java.lang.Throwable -> L29
            java.lang.Object r15 = r13.L     // Catch: java.lang.Throwable -> L29
            r19 = r15
            fo2 r19 = (defpackage.fo2) r19     // Catch: java.lang.Throwable -> L29
            java.lang.Object r13 = r13.R     // Catch: java.lang.Throwable -> L29
            r20 = r13
            gw0 r20 = (defpackage.gw0) r20     // Catch: java.lang.Throwable -> L29
            r23 = 0
            r17 = r11
            r22 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L29
            r13 = r16
            r11.j(r13, r3)     // Catch: java.lang.Throwable -> L29
        L12d:
            r0.f0 = r5     // Catch: java.lang.Throwable -> L29
            r0.X = r10     // Catch: java.lang.Throwable -> L29
            r0.Y = r6     // Catch: java.lang.Throwable -> L29
            r0.Z = r9     // Catch: java.lang.Throwable -> L29
            r0.d0 = r2     // Catch: java.lang.Throwable -> L29
            r15 = 1
            r0.e0 = r15     // Catch: java.lang.Throwable -> L29
            java.lang.Object r11 = r11.e(r0)     // Catch: java.lang.Throwable -> L29
            if (r11 != r1) goto L141
            return r1
        L141:
            lm4 r11 = (defpackage.lm4) r11     // Catch: java.lang.Throwable -> L29
            if (r11 == 0) goto L182
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = "Camera open completed: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L29
            r0.append(r11)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L29
            android.util.Log.i(r4, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r0 = r10.A     // Catch: java.lang.Throwable -> L29
            jg1 r0 = (defpackage.jg1) r0     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L164
            ed3 r0 = (defpackage.ed3) r0     // Catch: java.lang.Throwable -> L29
            r0.h(r12)     // Catch: java.lang.Throwable -> L29
        L164:
            java.lang.Object r0 = r6.A     // Catch: java.lang.Throwable -> L29
            jg1 r0 = (defpackage.jg1) r0     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L16f
            ed3 r0 = (defpackage.ed3) r0     // Catch: java.lang.Throwable -> L29
            r0.h(r12)     // Catch: java.lang.Throwable -> L29
        L16f:
            java.lang.Object r0 = r9.A     // Catch: java.lang.Throwable -> L29
            rc3 r0 = (defpackage.rc3) r0     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L178
            r0.h(r12)     // Catch: java.lang.Throwable -> L29
        L178:
            java.lang.Object r0 = r2.A     // Catch: java.lang.Throwable -> L29
            rc3 r0 = (defpackage.rc3) r0     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L181
            r0.h(r12)     // Catch: java.lang.Throwable -> L29
        L181:
            return r11
        L182:
            r24 = r12
            r12 = r9
            r9 = r24
            goto L87
        L189:
            java.lang.String r1 = "Unexpected throwable during camera opening!"
            android.util.Log.e(r4, r1, r0)
            throw r0
        L18f:
            r12 = r9
            lm4 r0 = new lm4
            df0 r1 = new df0
            r2 = 12
            r1.<init>(r2)
            r15 = 1
            r0.<init>(r12, r1, r15)
            return r0
    }
}
