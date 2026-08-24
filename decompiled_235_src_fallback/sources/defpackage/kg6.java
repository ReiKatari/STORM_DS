package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg6  reason: default package */
/* loaded from: classes.dex */
public final class kg6 extends defpackage.hw6 implements defpackage.ho2 {
    public /* synthetic */ defpackage.bg6 X;
    public /* synthetic */ java.lang.String Y;
    public /* synthetic */ java.util.Map Z;
    public /* synthetic */ boolean d0;
    public final /* synthetic */ defpackage.ng6 e0;

    public kg6(defpackage.ng6 r1, defpackage.r41 r2) {
            r0 = this;
            r0.e0 = r1
            r1 = 5
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.ho2
    public final java.lang.Object p(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r1 = this;
            bg6 r2 = (defpackage.bg6) r2
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            kg6 r0 = new kg6
            ng6 r1 = r1.e0
            r0.<init>(r1, r6)
            r0.X = r2
            r0.Y = r3
            r0.Z = r4
            r0.d0 = r5
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r1 = r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r6) {
            r5 = this;
            bg6 r0 = r5.X
            java.lang.String r1 = r5.Y
            java.util.Map r2 = r5.Z
            boolean r3 = r5.d0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r6)
            po5 r6 = defpackage.ng6.l
            ng6 r5 = r5.e0
            po5 r5 = r5.B(r0, r1, r2, r3)
            return r5
    }
}
