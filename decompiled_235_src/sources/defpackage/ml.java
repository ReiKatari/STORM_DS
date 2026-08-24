package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml  reason: default package */
/* loaded from: classes.dex */
public final class ml extends s41 {
    public long R;
    public int X;
    public hb5 Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ pl d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(pl plVar, s41 s41Var) {
        super(s41Var);
        this.d0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object C = this.d0.C(0L, 0, null, this);
        if (C == x61.COROUTINE_SUSPENDED) {
            return C;
        }
        return new hm5(C);
    }
}
