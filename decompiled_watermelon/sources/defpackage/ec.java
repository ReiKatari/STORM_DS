package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ec  reason: default package */
/* loaded from: classes.dex */
public final class ec extends nk6 implements cj2 {
    public int X;
    public /* synthetic */ nc Y;
    public /* synthetic */ pt3 Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ pc d0;
    public final /* synthetic */ float e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(pc pcVar, float f, j11 j11Var) {
        super(4, j11Var);
        this.d0 = pcVar;
        this.e0 = f;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        ec ecVar = new ec(this.d0, this.e0, (j11) obj4);
        ecVar.Y = (nc) obj;
        ecVar.Z = (pt3) obj2;
        ecVar.c0 = obj3;
        return ecVar.v(o27.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [k75, java.lang.Object] */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        float h;
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
            nc ncVar = this.Y;
            float c = this.Z.c(this.c0);
            if (!Float.isNaN(c)) {
                ?? obj2 = new Object();
                pc pcVar = this.d0;
                if (Float.isNaN(pcVar.j.h())) {
                    h = RecyclerView.A1;
                } else {
                    h = pcVar.j.h();
                }
                obj2.A = h;
                ho hoVar = pcVar.c;
                s4 s4Var = new s4(2, ncVar, obj2);
                this.Y = null;
                this.Z = null;
                this.X = 1;
                if (gk2.p(h, c, this.e0, hoVar, s4Var, this) == p31Var) {
                    return p31Var;
                }
            }
        }
        return o27.a;
    }
}
