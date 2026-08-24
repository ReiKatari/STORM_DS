package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr5  reason: default package */
/* loaded from: classes.dex */
public final class gr5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ qn2 Y;
    public final /* synthetic */ pq5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr5(qn2 qn2Var, pq5 pq5Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = qn2Var;
        this.Z = pq5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                ((gr5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            default:
                ((gr5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        pq5 pq5Var = this.Z;
        qn2 qn2Var = this.Y;
        switch (i) {
            case 0:
                return new gr5(qn2Var, pq5Var, r41Var, 0);
            default:
                return new gr5(qn2Var, pq5Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        pq5 pq5Var = this.Z;
        qn2 qn2Var = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                qn2Var.g(pq5Var);
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                qn2Var.g(pq5Var);
                return jg7Var;
        }
    }
}
