package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ll  reason: default package */
/* loaded from: classes.dex */
public final class ll extends s41 {
    public long R;
    public long X;
    public boolean Y;
    public Long Z;
    public hb5 d0;
    public fb5 e0;
    public String f0;
    public Long g0;
    public Object h0;
    public o85 i0;
    public ab5 j0;
    public /* synthetic */ Object k0;
    public final /* synthetic */ pl l0;
    public int m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(pl plVar, s41 s41Var) {
        super(s41Var);
        this.l0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.k0 = obj;
        this.m0 |= Integer.MIN_VALUE;
        Object B = this.l0.B(0L, 0L, false, null, null, this);
        if (B == x61.COROUTINE_SUSPENDED) {
            return B;
        }
        return new hm5(B);
    }
}
