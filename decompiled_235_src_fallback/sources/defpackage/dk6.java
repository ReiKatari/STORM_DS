package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk6  reason: default package */
/* loaded from: classes.dex */
public final class dk6 extends defpackage.hw6 implements defpackage.fo2 {
    public /* synthetic */ float X;
    public final /* synthetic */ defpackage.qa4 Y;

    public dk6(defpackage.qa4 r1, defpackage.r41 r2) {
            r0 = this;
            r0.Y = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            java.lang.Number r2 = (java.lang.Number) r2
            float r1 = r2.floatValue()
            r41 r3 = (defpackage.r41) r3
            dk6 r2 = new dk6
            qa4 r0 = r0.Y
            r2.<init>(r0, r3)
            r2.X = r1
            jg7 r0 = defpackage.jg7.a
            r2.s(r0)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            float r2 = r1.X
            qa4 r1 = r1.Y
            java.lang.Object r1 = r1.getValue()
            qn2 r1 = (defpackage.qn2) r1
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r1.g(r0)
            jg7 r1 = defpackage.jg7.a
            return r1
    }
}
