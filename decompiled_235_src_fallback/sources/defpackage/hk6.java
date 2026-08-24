package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk6  reason: default package */
/* loaded from: classes.dex */
public final class hk6 extends defpackage.hw6 implements defpackage.fo2 {
    public int X;
    public /* synthetic */ defpackage.j25 Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ float e0;
    public final /* synthetic */ defpackage.qa4 f0;
    public final /* synthetic */ defpackage.pp6 g0;

    public hk6(boolean r1, float r2, defpackage.qa4 r3, defpackage.pp6 r4, defpackage.r41 r5) {
            r0 = this;
            r0.d0 = r1
            r0.e0 = r2
            r0.f0 = r3
            r0.g0 = r4
            r1 = 3
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            j25 r9 = (defpackage.j25) r9
            jk4 r10 = (defpackage.jk4) r10
            long r0 = r10.a
            r7 = r11
            r41 r7 = (defpackage.r41) r7
            hk6 r2 = new hk6
            qa4 r5 = r8.f0
            pp6 r6 = r8.g0
            boolean r3 = r8.d0
            float r4 = r8.e0
            r2.<init>(r3, r4, r5, r6, r7)
            r2.Y = r9
            r2.Z = r0
            jg7 r8 = defpackage.jg7.a
            java.lang.Object r8 = r2.s(r8)
            return r8
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.X
            qa4 r2 = r7.f0
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto Lf
            defpackage.oi2.Y(r8)     // Catch: defpackage.tr2 -> L51
            goto L5a
        Lf:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L16:
            defpackage.oi2.Y(r8)
            j25 r8 = r7.Y
            long r4 = r7.Z
            boolean r1 = r7.d0
            r6 = 32
            if (r1 == 0) goto L2d
            long r4 = r4 >> r6
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r4 = r7.e0
            float r4 = r4 - r1
            goto L33
        L2d:
            long r4 = r4 >> r6
            int r1 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r1)
        L33:
            pp6 r1 = r7.g0
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r4 = r4 - r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r4)
            r2.setValue(r1)
            r7.X = r3     // Catch: defpackage.tr2 -> L51
            java.lang.Object r7 = r8.b(r7)     // Catch: defpackage.tr2 -> L51
            if (r7 != r0) goto L5a
            return r0
        L51:
            java.lang.Float r7 = new java.lang.Float
            r8 = 0
            r7.<init>(r8)
            r2.setValue(r7)
        L5a:
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
