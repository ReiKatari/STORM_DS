package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rk6  reason: default package */
/* loaded from: classes.dex */
public final class rk6 extends s41 {
    public long R;
    public long X;
    public boolean Y;
    public String Z;
    public Long d0;
    public bh5 e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ vk6 g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk6(vk6 vk6Var, s41 s41Var) {
        super(s41Var);
        this.g0 = vk6Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        Object a = vk6.a(this.g0, 0L, false, null, null, this);
        if (a == x61.COROUTINE_SUSPENDED) {
            return a;
        }
        return new hm5(a);
    }
}
