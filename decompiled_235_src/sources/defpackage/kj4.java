package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj4  reason: default package */
/* loaded from: classes.dex */
public final class kj4 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ oj4 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj4(oj4 oj4Var, s41 s41Var) {
        super(s41Var);
        this.X = oj4Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object d = this.X.d(null, null, 0L, null, 0L, 0L, false, null, null, this);
        if (d == x61.COROUTINE_SUSPENDED) {
            return d;
        }
        return new hm5(d);
    }
}
