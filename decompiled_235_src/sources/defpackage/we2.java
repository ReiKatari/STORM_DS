package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: we2  reason: default package */
/* loaded from: classes.dex */
public final class we2 extends hw6 implements qn2 {
    public final /* synthetic */ long X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we2(long j, r41 r41Var) {
        super(1, r41Var);
        this.X = j;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        new we2(this.X, (r41) obj).s(jg7.a);
        throw null;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        throw new c67("Timed out waiting for " + ((Object) oq1.l(this.X)), null);
    }
}
