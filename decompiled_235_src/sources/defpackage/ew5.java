package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.MicSource;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ew5  reason: default package */
/* loaded from: classes.dex */
public final class ew5 extends hw6 implements io2 {
    public int X;
    public /* synthetic */ jt5 Y;
    public /* synthetic */ vr4 Z;
    public /* synthetic */ cw5 d0;
    public /* synthetic */ oc7 e0;
    public /* synthetic */ boolean f0;
    public final /* synthetic */ hw5 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew5(hw5 hw5Var, r41 r41Var) {
        super(6, r41Var);
        this.g0 = hw5Var;
    }

    @Override // defpackage.io2
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        ew5 ew5Var = new ew5(this.g0, (r41) obj6);
        ew5Var.Y = (jt5) obj;
        ew5Var.Z = (vr4) obj2;
        ew5Var.d0 = (cw5) obj3;
        ew5Var.e0 = (oc7) obj4;
        ew5Var.f0 = booleanValue;
        return ew5Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        jt5 jt5Var = this.Y;
        vr4 vr4Var = this.Z;
        cw5 cw5Var = this.d0;
        oc7 oc7Var = this.e0;
        boolean z = this.f0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                return obj;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        boolean booleanValue = ((Boolean) oc7Var.L).booleanValue();
        this.Y = null;
        this.Z = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = z;
        this.X = 1;
        Object a = this.g0.b.a(jt5Var, (ConsoleType) vr4Var.A, (MicSource) vr4Var.B, cw5Var.a, cw5Var.b, cw5Var.c, cw5Var.d, (String) oc7Var.A, (String) oc7Var.B, booleanValue, z, this);
        if (a == x61Var) {
            return x61Var;
        }
        return a;
    }
}
