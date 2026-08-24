package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i76  reason: default package */
/* loaded from: classes.dex */
public final class i76 extends hw6 implements eo2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ to d0;
    public final /* synthetic */ ah5 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i76(float f, to toVar, ah5 ah5Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = f;
        this.d0 = toVar;
        this.e0 = ah5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((i76) q((r41) obj2, (p76) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        i76 i76Var = new i76(this.Z, this.d0, this.e0, r41Var);
        i76Var.Y = obj;
        return i76Var;
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
            sa5 sa5Var = new sa5(8, this.e0, (p76) this.Y);
            this.X = 1;
            if (kj2.l(RecyclerView.B1, this.Z, this.d0, sa5Var, this, 4) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
