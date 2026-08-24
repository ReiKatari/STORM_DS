package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg6  reason: default package */
/* loaded from: classes.dex */
public final class eg6 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ wf6 Y;
    public /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eg6(int i, r41 r41Var, int i2) {
        super(i, r41Var);
        this.X = i2;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        wf6 wf6Var = (wf6) obj;
        Boolean bool = (Boolean) obj2;
        switch (i) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                eg6 eg6Var = new eg6(3, (r41) obj3, 0);
                eg6Var.Y = wf6Var;
                eg6Var.Z = booleanValue;
                return eg6Var.s(jg7Var);
            case 1:
                boolean booleanValue2 = bool.booleanValue();
                eg6 eg6Var2 = new eg6(3, (r41) obj3, 1);
                eg6Var2.Y = wf6Var;
                eg6Var2.Z = booleanValue2;
                return eg6Var2.s(jg7Var);
            default:
                boolean booleanValue3 = bool.booleanValue();
                eg6 eg6Var3 = new eg6(3, (r41) obj3, 2);
                eg6Var3.Y = wf6Var;
                eg6Var3.Z = booleanValue3;
                return eg6Var3.s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        switch (this.X) {
            case 0:
                wf6 wf6Var = this.Y;
                boolean z = this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return wf6.a(wf6Var, z, false, false, 223);
            case 1:
                wf6 wf6Var2 = this.Y;
                boolean z2 = this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return wf6.a(wf6Var2, false, z2, false, 191);
            default:
                wf6 wf6Var3 = this.Y;
                boolean z3 = this.Z;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return wf6.a(wf6Var3, false, false, z3, 127);
        }
    }
}
