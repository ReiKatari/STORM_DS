package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k96  reason: default package */
/* loaded from: classes.dex */
public final class k96 extends defpackage.hw6 implements defpackage.qn2 {
    public int X;
    public final /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.n96 d0;
    public final /* synthetic */ defpackage.ga7 e0;
    public final /* synthetic */ float f0;

    public k96(java.lang.Object r1, java.lang.Object r2, defpackage.n96 r3, defpackage.ga7 r4, float r5, defpackage.r41 r6) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r0.f0 = r5
            r1 = 1
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            r6 = r8
            r41 r6 = (defpackage.r41) r6
            k96 r0 = new k96
            ga7 r4 = r7.e0
            float r5 = r7.f0
            java.lang.Object r1 = r7.Y
            java.lang.Object r2 = r7.Z
            n96 r3 = r7.d0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            jg7 r7 = defpackage.jg7.a
            java.lang.Object r7 = r0.s(r7)
            return r7
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r10.X
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r11)
            goto L30
        Ld:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L14:
            defpackage.oi2.Y(r11)
            j96 r3 = new j96
            float r8 = r10.f0
            r9 = 0
            java.lang.Object r4 = r10.Y
            java.lang.Object r5 = r10.Z
            n96 r6 = r10.d0
            ga7 r7 = r10.e0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.X = r2
            java.lang.Object r10 = defpackage.g04.C(r3, r10)
            if (r10 != r0) goto L30
            return r0
        L30:
            jg7 r10 = defpackage.jg7.a
            return r10
    }
}
