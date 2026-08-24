package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk  reason: default package */
/* loaded from: classes.dex */
public final class tk extends s41 {
    public da5 R;
    public boolean X;
    public int Y;
    public int Z;
    public long d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ pl f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(pl plVar, s41 s41Var) {
        super(s41Var);
        this.f0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        Object j = this.f0.j(null, false, this);
        if (j == x61.COROUTINE_SUSPENDED) {
            return j;
        }
        return new hm5(j);
    }
}
