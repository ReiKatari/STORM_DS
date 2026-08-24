package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a32  reason: default package */
/* loaded from: classes.dex */
public final class a32 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.vr4 Z;
    public final /* synthetic */ defpackage.sz1 d0;
    public final /* synthetic */ java.lang.String e0;
    public final /* synthetic */ java.lang.String f0;

    public /* synthetic */ a32(defpackage.vr4 r1, defpackage.sz1 r2, java.lang.String r3, java.lang.String r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            a32 r2 = (defpackage.a32) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            a32 r2 = (defpackage.a32) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            int r10 = r8.X
            switch(r10) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            a32 r0 = new a32
            java.lang.String r4 = r8.f0
            r6 = 1
            vr4 r1 = r8.Z
            sz1 r2 = r8.d0
            java.lang.String r3 = r8.e0
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L15:
            r5 = r9
            a32 r1 = new a32
            r6 = r5
            java.lang.String r5 = r8.f0
            r7 = 0
            vr4 r2 = r8.Z
            sz1 r3 = r8.d0
            java.lang.String r4 = r8.e0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.X
            r1 = 0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r3 = 1
            jg7 r4 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L4b;
                default: goto Lb;
            }
        Lb:
            vr4 r6 = r13.Z
            java.lang.Object r12 = r6.B
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r13.Y
            if (r5 == 0) goto L22
            if (r5 != r3) goto L1e
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L1b
            goto L3e
        L1b:
            r0 = move-exception
            r13 = r0
            goto L45
        L1e:
            defpackage.i.m(r2)
            goto L44
        L22:
            defpackage.oi2.Y(r14)
            kg4 r14 = defpackage.kg4.B     // Catch: java.lang.Throwable -> L1b
            a32 r5 = new a32     // Catch: java.lang.Throwable -> L1b
            sz1 r7 = r13.d0     // Catch: java.lang.Throwable -> L1b
            java.lang.String r8 = r13.e0     // Catch: java.lang.Throwable -> L1b
            java.lang.String r9 = r13.f0     // Catch: java.lang.Throwable -> L1b
            r10 = 0
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1b
            r13.Y = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r13 = defpackage.hv.d0(r14, r5, r13)     // Catch: java.lang.Throwable -> L1b
            if (r13 != r0) goto L3e
            r1 = r0
            goto L44
        L3e:
            tu0 r12 = (defpackage.tu0) r12
            r12.b0(r4)
            r1 = r4
        L44:
            return r1
        L45:
            tu0 r12 = (defpackage.tu0) r12
            r12.b0(r4)
            throw r13
        L4b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r13.Y
            sz1 r6 = r13.d0
            r7 = 2
            if (r5 == 0) goto L64
            if (r5 == r3) goto L60
            if (r5 != r7) goto L5c
            defpackage.oi2.Y(r14)
            goto L86
        L5c:
            defpackage.i.m(r2)
            goto Lab
        L60:
            defpackage.oi2.Y(r14)
            goto L78
        L64:
            defpackage.oi2.Y(r14)
            vr4 r14 = r13.Z
            java.lang.Object r14 = r14.A
            tu0 r14 = (defpackage.tu0) r14
            if (r14 == 0) goto L78
            r13.Y = r3
            java.lang.Object r14 = r14.q(r13)
            if (r14 != r0) goto L78
            goto L84
        L78:
            iw2 r14 = r6.o0
            r13.Y = r7
            java.lang.String r1 = r13.e0
            java.lang.Object r14 = r14.d(r1, r13)
            if (r14 != r0) goto L86
        L84:
            r1 = r0
            goto Lab
        L86:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            vr4 r0 = new vr4
            java.lang.String r1 = "reason"
            java.lang.String r13 = r13.f0
            r0.<init>(r1, r13)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r14)
            vr4 r14 = new vr4
            java.lang.String r1 = "discarded"
            r14.<init>(r1, r13)
            vr4[] r13 = new defpackage.vr4[]{r0, r14}
            java.lang.String r14 = "hardcore_queue_session_closed"
            r6.G0(r14, r13)
            r1 = r4
        Lab:
            return r1
    }
}
