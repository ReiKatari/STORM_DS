package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wo5  reason: default package */
/* loaded from: classes.dex */
public final class wo5 extends nk6 implements dj2 {
    public int X;
    public /* synthetic */ List Y;
    public /* synthetic */ List Z;
    public /* synthetic */ qb6 c0;
    public /* synthetic */ rb6 d0;
    public final /* synthetic */ yo5 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo5(j11 j11Var, yo5 yo5Var) {
        super(5, j11Var);
        this.e0 = yo5Var;
    }

    @Override // defpackage.dj2
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wo5 wo5Var = new wo5((j11) obj5, this.e0);
        wo5Var.Y = (List) obj;
        wo5Var.Z = (List) obj2;
        wo5Var.c0 = (qb6) obj3;
        wo5Var.d0 = (rb6) obj4;
        return wo5Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        List list = this.Y;
        List list2 = this.Z;
        qb6 qb6Var = this.c0;
        rb6 rb6Var = this.d0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
                return obj;
            }
            i.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        me2.a0(obj);
        bb1 bb1Var = tg1.a;
        r50 r50Var = new r50(this.e0, list, list2, qb6Var, rb6Var, (j11) null);
        this.Y = null;
        this.Z = null;
        this.c0 = null;
        this.d0 = null;
        this.X = 1;
        Object G = tq5.G(bb1Var, r50Var, this);
        if (G == p31Var) {
            return p31Var;
        }
        return G;
    }
}
