package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gw5  reason: default package */
/* loaded from: classes.dex */
public final class gw5 extends defpackage.hw6 implements defpackage.go2 {
    public /* synthetic */ java.lang.String X;
    public /* synthetic */ java.lang.String Y;
    public /* synthetic */ boolean Z;

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r1 = this;
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            r41 r5 = (defpackage.r41) r5
            gw5 r4 = new gw5
            r0 = 4
            r4.<init>(r0, r5)
            r4.X = r2
            r4.Y = r3
            r4.Z = r1
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r1 = r4.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            java.lang.String r0 = r3.X
            java.lang.String r1 = r3.Y
            boolean r3 = r3.Z
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            oc7 r4 = new oc7
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.<init>(r0, r1, r3)
            return r4
    }
}
