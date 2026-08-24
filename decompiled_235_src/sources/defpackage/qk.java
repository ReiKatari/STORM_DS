package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk  reason: default package */
/* loaded from: classes.dex */
public final class qk extends s41 {
    public long R;
    public boolean X;
    public boolean Y;
    public kk Z;
    public Object d0;
    public ia5 e0;
    public int f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ pl h0;
    public int i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(pl plVar, s41 s41Var) {
        super(s41Var);
        this.h0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.g0 = obj;
        this.i0 |= Integer.MIN_VALUE;
        Object g = this.h0.g(0L, false, null, false, this);
        if (g == x61.COROUTINE_SUSPENDED) {
            return g;
        }
        return new hm5(g);
    }
}
