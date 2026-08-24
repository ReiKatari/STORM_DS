package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fw5  reason: default package */
/* loaded from: classes.dex */
public final class fw5 extends defpackage.hw6 implements defpackage.ho2 {
    public /* synthetic */ me.magnum.melonds.domain.model.VideoRenderer X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ int Z;
    public /* synthetic */ me.magnum.melonds.domain.model.VideoFiltering d0;

    @Override // defpackage.ho2
    public final java.lang.Object p(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r1 = this;
            me.magnum.melonds.domain.model.VideoRenderer r2 = (me.magnum.melonds.domain.model.VideoRenderer) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r1 = r3.booleanValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r4.intValue()
            me.magnum.melonds.domain.model.VideoFiltering r5 = (me.magnum.melonds.domain.model.VideoFiltering) r5
            r41 r6 = (defpackage.r41) r6
            fw5 r4 = new fw5
            r0 = 5
            r4.<init>(r0, r6)
            r4.X = r2
            r4.Y = r1
            r4.Z = r3
            r4.d0 = r5
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r1 = r4.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r5) {
            r4 = this;
            me.magnum.melonds.domain.model.VideoRenderer r0 = r4.X
            boolean r1 = r4.Y
            int r2 = r4.Z
            me.magnum.melonds.domain.model.VideoFiltering r4 = r4.d0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r5)
            cw5 r5 = new cw5
            r5.<init>(r0, r1, r2, r4)
            return r5
    }
}
