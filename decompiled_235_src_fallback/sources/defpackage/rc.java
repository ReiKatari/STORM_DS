package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc  reason: default package */
/* loaded from: classes.dex */
public final class rc extends defpackage.hw6 implements defpackage.fo2 {
    public /* synthetic */ defpackage.w61 X;
    public /* synthetic */ float Y;
    public final /* synthetic */ defpackage.dd Z;

    public rc(defpackage.dd r1, defpackage.r41 r2) {
            r0 = this;
            r0.Z = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            w61 r2 = (defpackage.w61) r2
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r41 r4 = (defpackage.r41) r4
            rc r0 = new rc
            dd r1 = r1.Z
            r0.<init>(r1, r4)
            r0.X = r2
            r0.Y = r3
            jg7 r1 = defpackage.jg7.a
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r5) {
            r4 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            w61 r5 = r4.X
            float r0 = r4.Y
            qc r1 = new qc
            dd r4 = r4.Z
            r2 = 0
            r3 = 0
            r1.<init>(r4, r0, r3, r2)
            r4 = 3
            defpackage.hv.L(r5, r3, r3, r1, r4)
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
