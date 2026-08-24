package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jg6  reason: default package */
/* loaded from: classes.dex */
public final class jg6 extends defpackage.hw6 implements defpackage.ho2 {
    public /* synthetic */ me.magnum.melonds.domain.model.RendererConfiguration X;
    public /* synthetic */ defpackage.bg6 Y;
    public /* synthetic */ java.lang.String Z;
    public /* synthetic */ java.lang.String d0;
    public final /* synthetic */ defpackage.ng6 e0;
    public final /* synthetic */ defpackage.jt5 f0;

    public jg6(defpackage.ng6 r1, defpackage.jt5 r2, defpackage.r41 r3) {
            r0 = this;
            r0.e0 = r1
            r0.f0 = r2
            r1 = 5
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.ho2
    public final java.lang.Object p(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r2 = this;
            me.magnum.melonds.domain.model.RendererConfiguration r3 = (me.magnum.melonds.domain.model.RendererConfiguration) r3
            bg6 r4 = (defpackage.bg6) r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = (java.lang.String) r6
            r41 r7 = (defpackage.r41) r7
            jg6 r0 = new jg6
            ng6 r1 = r2.e0
            jt5 r2 = r2.f0
            r0.<init>(r1, r2, r7)
            r0.X = r3
            r0.Y = r4
            r0.Z = r5
            r0.d0 = r6
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r2 = r0.s(r2)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            me.magnum.melonds.domain.model.RendererConfiguration r1 = r6.X
            bg6 r3 = r6.Y
            java.lang.String r4 = r6.Z
            java.lang.String r5 = r6.d0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r7)
            po5 r7 = defpackage.ng6.l
            ng6 r0 = r6.e0
            jt5 r2 = r6.f0
            me.magnum.melonds.domain.model.RendererConfiguration r6 = r0.b(r1, r2, r3, r4, r5)
            return r6
    }
}
