package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el  reason: default package */
/* loaded from: classes.dex */
public final class el extends s41 {
    public hm5 R;
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pl Z;
    public int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el(pl plVar, s41 s41Var) {
        super(s41Var);
        this.Z = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Y = obj;
        this.d0 |= Integer.MIN_VALUE;
        Object v = this.Z.v(null, null, this);
        if (v == x61.COROUTINE_SUSPENDED) {
            return v;
        }
        return new hm5(v);
    }
}
