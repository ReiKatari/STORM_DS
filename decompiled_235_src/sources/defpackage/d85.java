package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d85  reason: default package */
/* loaded from: classes.dex */
public final class d85 extends s41 {
    public long R;
    public boolean X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ l85 Z;
    public int d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d85(l85 l85Var, s41 s41Var) {
        super(s41Var);
        this.Z = l85Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Y = obj;
        this.d0 |= Integer.MIN_VALUE;
        Object p = this.Z.p(0L, false, this);
        if (p == x61.COROUTINE_SUSPENDED) {
            return p;
        }
        return new hm5(p);
    }
}
