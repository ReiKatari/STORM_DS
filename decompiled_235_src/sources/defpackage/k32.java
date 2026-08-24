package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k32  reason: default package */
/* loaded from: classes.dex */
public final class k32 extends hw6 implements io2 {
    public /* synthetic */ fk3 X;
    public /* synthetic */ vr4 Y;
    public /* synthetic */ um6 Z;
    public /* synthetic */ boolean d0;
    public /* synthetic */ int e0;

    public k32(r41 r41Var) {
        super(6, r41Var);
    }

    @Override // defpackage.io2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        int intValue = ((Number) obj5).intValue();
        k32 k32Var = new k32((r41) obj6);
        k32Var.X = (fk3) obj;
        k32Var.Y = (vr4) obj2;
        k32Var.Z = (um6) obj3;
        k32Var.d0 = booleanValue;
        k32Var.e0 = intValue;
        return k32Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        fk3 fk3Var = this.X;
        vr4 vr4Var = this.Y;
        um6 um6Var = this.Z;
        boolean z = this.d0;
        int i = this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        return new vz1(fk3Var, vr4Var, um6Var, z, i);
    }
}
