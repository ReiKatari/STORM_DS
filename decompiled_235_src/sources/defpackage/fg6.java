package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg6  reason: default package */
/* loaded from: classes.dex */
public final class fg6 extends hw6 implements io2 {
    public /* synthetic */ boolean X;
    public /* synthetic */ float Y;
    public /* synthetic */ float Z;
    public /* synthetic */ boolean d0;
    public /* synthetic */ boolean e0;

    public fg6(r41 r41Var) {
        super(6, r41Var);
    }

    @Override // defpackage.io2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        float floatValue = ((Number) obj2).floatValue();
        float floatValue2 = ((Number) obj3).floatValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        boolean booleanValue3 = ((Boolean) obj5).booleanValue();
        fg6 fg6Var = new fg6((r41) obj6);
        fg6Var.X = booleanValue;
        fg6Var.Y = floatValue;
        fg6Var.Z = floatValue2;
        fg6Var.d0 = booleanValue2;
        fg6Var.e0 = booleanValue3;
        return fg6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z = this.X;
        float f = this.Y;
        float f2 = this.Z;
        boolean z2 = this.d0;
        boolean z3 = this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        return new xf6(z, f, f2, z2, z3, false);
    }
}
