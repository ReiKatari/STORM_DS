package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d86  reason: default package */
/* loaded from: classes.dex */
public final class d86 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.e86 Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float d0;

    public d86(defpackage.e86 r1, float r2, float r3, defpackage.r41 r4) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
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
            d86 r0 = (defpackage.d86) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            d86 r4 = new d86
            float r0 = r2.Z
            float r1 = r2.d0
            e86 r2 = r2.Y
            r4.<init>(r2, r0, r1, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.X
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r10)
            goto L3c
        Ld:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            r9 = 0
            return r9
        L14:
            defpackage.oi2.Y(r10)
            e86 r10 = r9.Y
            m86 r10 = r10.J0
            float r1 = r9.Z
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r3 = (long) r1
            float r1 = r9.d0
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r5 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
            long r3 = r3 | r5
            r9.X = r2
            java.lang.Object r9 = defpackage.y76.a(r10, r3, r9)
            if (r9 != r0) goto L3c
            return r0
        L3c:
            jg7 r9 = defpackage.jg7.a
            return r9
    }
}
