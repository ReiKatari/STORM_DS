package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c85  reason: default package */
/* loaded from: classes.dex */
public final class c85 extends s41 {
    public long R;
    public /* synthetic */ Object X;
    public final /* synthetic */ l85 Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c85(l85 l85Var, s41 s41Var) {
        super(s41Var);
        this.Y = l85Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        Object o = this.Y.o(0L, 0, 0, this);
        if (o == x61.COROUTINE_SUSPENDED) {
            return o;
        }
        return new hm5(o);
    }
}
