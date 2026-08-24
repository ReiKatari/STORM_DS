package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez5  reason: default package */
/* loaded from: classes.dex */
public final class ez5 extends defpackage.hw6 implements defpackage.fo2 {
    public int X;
    public /* synthetic */ defpackage.ne2 Y;
    public /* synthetic */ java.lang.Object[] Z;
    public final /* synthetic */ defpackage.tz5 d0;
    public defpackage.ne2 e0;

    public ez5(defpackage.r41 r1, defpackage.tz5 r2) {
            r0 = this;
            r0.d0 = r2
            r2 = 3
            r0.<init>(r2, r1)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            ne2 r2 = (defpackage.ne2) r2
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r41 r4 = (defpackage.r41) r4
            ez5 r0 = new ez5
            tz5 r1 = r1.d0
            r0.<init>(r4, r1)
            r0.Y = r2
            r0.Z = r3
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r1 = r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1a
            if (r2 != r3) goto L14
            defpackage.oi2.Y(r21)
            goto L9c
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L1a:
            ne2 r2 = r0.e0
            defpackage.oi2.Y(r21)
            r4 = r21
            goto L8d
        L22:
            defpackage.oi2.Y(r21)
            ne2 r2 = r0.Y
            java.lang.Object[] r6 = r0.Z
            r7 = 0
            r7 = r6[r7]
            r7.getClass()
            vr4 r7 = (defpackage.vr4) r7
            java.lang.Object r8 = r7.A
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r8 = r6[r4]
            r8.getClass()
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            r8 = r6[r3]
            r8.getClass()
            r18 = r8
            java.util.List r18 = (java.util.List) r18
            r8 = 3
            r8 = r6[r8]
            r8.getClass()
            r11 = r8
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r7 = r7.B
            r15 = r7
            gn6 r15 = (defpackage.gn6) r15
            tz5 r7 = r0.d0
            tp6 r8 = r7.q
            java.lang.Object r8 = r8.getValue()
            r16 = r8
            hn6 r16 = (defpackage.hn6) r16
            r8 = 4
            r8 = r6[r8]
            r8.getClass()
            r14 = r8
            qw5 r14 = (defpackage.qw5) r14
            r8 = 5
            r6 = r6[r8]
            r6.getClass()
            r13 = r6
            n06 r13 = (defpackage.n06) r13
            r0.Y = r5
            r0.Z = r5
            r0.e0 = r2
            r0.X = r4
            xe1 r4 = defpackage.xk1.a
            nz5 r9 = new nz5
            r19 = 0
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r4 = defpackage.hv.d0(r4, r9, r0)
            if (r4 != r1) goto L8d
            goto L9b
        L8d:
            r0.Y = r5
            r0.Z = r5
            r0.e0 = r5
            r0.X = r3
            java.lang.Object r0 = r2.a(r4, r0)
            if (r0 != r1) goto L9c
        L9b:
            return r1
        L9c:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
