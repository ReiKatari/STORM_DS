package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk  reason: default package */
/* loaded from: classes.dex */
public final class nk extends s41 {
    public o75 R;
    public hb5 X;
    public boolean Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ pl d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(pl plVar, s41 s41Var) {
        super(s41Var);
        this.d0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object c = this.d0.c(null, false, null, this);
        if (c == x61.COROUTINE_SUSPENDED) {
            return c;
        }
        return new hm5(c);
    }
}
