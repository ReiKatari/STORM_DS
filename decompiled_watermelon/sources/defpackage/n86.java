package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n86  reason: default package */
/* loaded from: classes.dex */
public final class n86 extends nk6 implements bj2 {
    public /* synthetic */ float X;
    public final /* synthetic */ k24 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n86(k24 k24Var, j11 j11Var) {
        super(3, j11Var);
        this.Y = k24Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        o31 o31Var = (o31) obj;
        float floatValue = ((Number) obj2).floatValue();
        n86 n86Var = new n86(this.Y, (j11) obj3);
        n86Var.X = floatValue;
        o27 o27Var = o27.a;
        n86Var.v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        ((mi2) this.Y.getValue()).n(new Float(this.X));
        return o27.a;
    }
}
