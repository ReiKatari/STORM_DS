package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sk6  reason: default package */
/* loaded from: classes.dex */
public final class sk6 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ vk6 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk6(vk6 vk6Var, s41 s41Var) {
        super(s41Var);
        this.X = vk6Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object d = this.X.d(null, null, null, this);
        if (d == x61.COROUTINE_SUSPENDED) {
            return d;
        }
        return new hm5(d);
    }
}
