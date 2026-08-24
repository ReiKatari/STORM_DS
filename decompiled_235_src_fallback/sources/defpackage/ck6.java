package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ck6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ck6 extends defpackage.po2 implements defpackage.qn2 {
    public final /* synthetic */ defpackage.bs0 d0;
    public final /* synthetic */ defpackage.ah5 e0;
    public final /* synthetic */ defpackage.ah5 f0;

    public ck6(defpackage.bs0 r7, defpackage.ah5 r8, defpackage.ah5 r9) {
            r6 = this;
            r6.d0 = r7
            r6.e0 = r8
            r6.f0 = r9
            java.lang.String r4 = "Slider$lambda$3$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F"
            r5 = 0
            r1 = 1
            java.lang.Class<mb3> r2 = defpackage.mb3.class
            java.lang.String r3 = "scaleToOffset"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            bs0 r0 = r5.d0
            float r1 = r0.a
            float r0 = r0.b
            ah5 r2 = r5.e0
            float r2 = r2.A
            ah5 r5 = r5.f0
            float r5 = r5.A
            float r0 = r0 - r1
            r3 = 0
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L1c
            r6 = r3
            goto L1e
        L1c:
            float r6 = r6 - r1
            float r6 = r6 / r0
        L1e:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L23
            goto L24
        L23:
            r3 = r6
        L24:
            r6 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L2b
            r3 = r6
        L2b:
            float r5 = defpackage.oi2.L(r2, r5, r3)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
    }
}
