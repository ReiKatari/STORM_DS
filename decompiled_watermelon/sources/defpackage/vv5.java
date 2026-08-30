package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vv5  reason: default package */
/* loaded from: classes.dex */
public final class vv5 extends nk6 implements aj2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ ho c0;
    public final /* synthetic */ k75 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv5(float f, ho hoVar, k75 k75Var, j11 j11Var) {
        super(2, j11Var);
        this.Z = f;
        this.c0 = hoVar;
        this.d0 = k75Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((vv5) t((j11) obj2, (dw5) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        vv5 vv5Var = new vv5(this.Z, this.c0, this.d0, j11Var);
        vv5Var.Y = obj;
        return vv5Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            i15 i15Var = new i15(6, this.d0, (dw5) this.Y);
            this.X = 1;
            if (gk2.r(RecyclerView.A1, this.Z, this.c0, i15Var, this, 4) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }
}
