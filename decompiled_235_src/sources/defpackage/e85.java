package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e85  reason: default package */
/* loaded from: classes.dex */
public final class e85 extends s41 {
    public String R;
    public String X;
    public Object Y;
    public qj7 Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ l85 f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e85(l85 l85Var, s41 s41Var) {
        super(s41Var);
        this.f0 = l85Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        Object q = this.f0.q(null, null, this);
        if (q == x61.COROUTINE_SUSPENDED) {
            return q;
        }
        return new hm5(q);
    }
}
