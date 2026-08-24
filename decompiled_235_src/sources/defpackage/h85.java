package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h85  reason: default package */
/* loaded from: classes.dex */
public final class h85 extends s41 {
    public long R;
    public String X;
    public String Y;
    public boolean Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ l85 e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h85(l85 l85Var, s41 s41Var) {
        super(s41Var);
        this.e0 = l85Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.d0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        Object s = this.e0.s(0L, null, false, null, this);
        if (s == x61.COROUTINE_SUSPENDED) {
            return s;
        }
        return new hm5(s);
    }
}
