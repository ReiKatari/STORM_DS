package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg6  reason: default package */
/* loaded from: classes.dex */
public final class fg6 extends defpackage.hw6 implements defpackage.io2 {
    public /* synthetic */ boolean X;
    public /* synthetic */ float Y;
    public /* synthetic */ float Z;
    public /* synthetic */ boolean d0;
    public /* synthetic */ boolean e0;

    public fg6(defpackage.r41 r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r0, r2)
            return
    }

    @Override // defpackage.io2
    public final java.lang.Object n(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = this;
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r1 = r2.floatValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r2 = r3.floatValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r41 r6 = (defpackage.r41) r6
            fg6 r5 = new fg6
            r5.<init>(r6)
            r5.X = r0
            r5.Y = r1
            r5.Z = r2
            r5.d0 = r3
            r5.e0 = r4
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r0 = r5.s(r0)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            boolean r1 = r7.X
            float r2 = r7.Y
            float r3 = r7.Z
            boolean r4 = r7.d0
            boolean r5 = r7.e0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            xf6 r0 = new xf6
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
