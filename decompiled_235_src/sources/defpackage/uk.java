package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk  reason: default package */
/* loaded from: classes.dex */
public final class uk extends s41 {
    public String R;
    public Object X;
    public boolean Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ pl d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(pl plVar, s41 s41Var) {
        super(s41Var);
        this.d0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object k = this.d0.k(null, false, this);
        if (k == x61.COROUTINE_SUSPENDED) {
            return k;
        }
        return new hm5(k);
    }
}
