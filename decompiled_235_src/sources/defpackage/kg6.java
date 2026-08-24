package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg6  reason: default package */
/* loaded from: classes.dex */
public final class kg6 extends hw6 implements ho2 {
    public /* synthetic */ bg6 X;
    public /* synthetic */ String Y;
    public /* synthetic */ Map Z;
    public /* synthetic */ boolean d0;
    public final /* synthetic */ ng6 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg6(ng6 ng6Var, r41 r41Var) {
        super(5, r41Var);
        this.e0 = ng6Var;
    }

    @Override // defpackage.ho2
    public final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        kg6 kg6Var = new kg6(this.e0, (r41) obj5);
        kg6Var.X = (bg6) obj;
        kg6Var.Y = (String) obj2;
        kg6Var.Z = (Map) obj3;
        kg6Var.d0 = booleanValue;
        return kg6Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        bg6 bg6Var = this.X;
        String str = this.Y;
        Map map = this.Z;
        boolean z = this.d0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        po5 po5Var = ng6.l;
        return this.e0.B(bg6Var, str, map, z);
    }
}
