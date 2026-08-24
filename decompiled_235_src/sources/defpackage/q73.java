package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q73  reason: default package */
/* loaded from: classes.dex */
public final class q73 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ le2 Y;
    public final /* synthetic */ ah2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q73(le2 le2Var, ah2 ah2Var, r41 r41Var) {
        super(2, r41Var);
        this.Y = le2Var;
        this.Z = ah2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((q73) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new q73(this.Y, this.Z, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            y6 y6Var = new y6(this.Z, 10);
            this.X = 1;
            if (this.Y.b(y6Var, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
