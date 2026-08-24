package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w75  reason: default package */
/* loaded from: classes.dex */
public final class w75 extends s41 {
    public long R;
    public boolean X;
    public String Y;
    public Long Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ l85 e0;
    public int f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w75(l85 l85Var, s41 s41Var) {
        super(s41Var);
        this.e0 = l85Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.d0 = obj;
        this.f0 |= Integer.MIN_VALUE;
        Object d = this.e0.d(0L, false, null, null, this);
        if (d == x61.COROUTINE_SUSPENDED) {
            return d;
        }
        return new hm5(d);
    }
}
