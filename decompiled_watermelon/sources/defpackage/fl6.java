package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fl6  reason: default package */
/* loaded from: classes.dex */
public final class fl6 extends nk6 implements aj2 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ k24 Y;
    public final /* synthetic */ k24 Z;
    public final /* synthetic */ k24 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl6(k24 k24Var, k24 k24Var2, k24 k24Var3, j11 j11Var) {
        super(2, j11Var);
        this.Y = k24Var;
        this.Z = k24Var2;
        this.c0 = k24Var3;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        o27 o27Var = o27.a;
        ((fl6) t((j11) obj2, bool)).v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        fl6 fl6Var = new fl6(this.Y, this.Z, this.c0, j11Var);
        fl6Var.X = ((Boolean) obj).booleanValue();
        return fl6Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        boolean z = this.X;
        float f = hl6.a;
        if (((Boolean) this.Y.getValue()).booleanValue() != z) {
            mi2 mi2Var = (mi2) this.Z.getValue();
            if (mi2Var != null) {
                mi2Var.n(Boolean.valueOf(z));
            }
            k24 k24Var = this.c0;
            k24Var.setValue(Boolean.valueOf(!((Boolean) k24Var.getValue()).booleanValue()));
        }
        return o27.a;
    }
}
