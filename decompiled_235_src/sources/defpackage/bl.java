package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl  reason: default package */
/* loaded from: classes.dex */
public final class bl extends s41 {
    public String R;
    public ga5 X;
    public kk Y;
    public Object Z;
    public boolean d0;
    public boolean e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ pl g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(pl plVar, s41 s41Var) {
        super(s41Var);
        this.g0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        Object q = this.g0.q(null, false, false, this);
        if (q == x61.COROUTINE_SUSPENDED) {
            return q;
        }
        return new hm5(q);
    }
}
