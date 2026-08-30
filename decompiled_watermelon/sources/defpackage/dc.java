package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dc  reason: default package */
/* loaded from: classes.dex */
public final class dc extends nk6 implements bj2 {
    public /* synthetic */ o31 X;
    public /* synthetic */ float Y;
    public final /* synthetic */ pc Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(pc pcVar, j11 j11Var) {
        super(3, j11Var);
        this.Z = pcVar;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        dc dcVar = new dc(this.Z, (j11) obj3);
        dcVar.X = (o31) obj;
        dcVar.Y = floatValue;
        o27 o27Var = o27.a;
        dcVar.v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        tq5.w(this.X, null, null, new cc(this.Z, this.Y, null, 0), 3);
        return o27.a;
    }
}
