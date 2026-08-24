package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k32  reason: default package */
/* loaded from: classes.dex */
public final class k32 extends defpackage.hw6 implements defpackage.io2 {
    public /* synthetic */ defpackage.fk3 X;
    public /* synthetic */ defpackage.vr4 Y;
    public /* synthetic */ defpackage.um6 Z;
    public /* synthetic */ boolean d0;
    public /* synthetic */ int e0;

    public k32(defpackage.r41 r2) {
            r1 = this;
            r0 = 6
            r1.<init>(r0, r2)
            return
    }

    @Override // defpackage.io2
    public final java.lang.Object n(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r0 = this;
            fk3 r1 = (defpackage.fk3) r1
            vr4 r2 = (defpackage.vr4) r2
            um6 r3 = (defpackage.um6) r3
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            java.lang.Number r5 = (java.lang.Number) r5
            int r4 = r5.intValue()
            r41 r6 = (defpackage.r41) r6
            k32 r5 = new k32
            r5.<init>(r6)
            r5.X = r1
            r5.Y = r2
            r5.Z = r3
            r5.d0 = r0
            r5.e0 = r4
            jg7 r0 = defpackage.jg7.a
            java.lang.Object r0 = r5.s(r0)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            fk3 r1 = r6.X
            vr4 r2 = r6.Y
            um6 r3 = r6.Z
            boolean r4 = r6.d0
            int r5 = r6.e0
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r7)
            vz1 r0 = new vz1
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
