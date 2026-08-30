package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: az1  reason: default package */
/* loaded from: classes.dex */
public final class az1 extends nk6 implements ej2 {
    public /* synthetic */ nd3 X;
    public /* synthetic */ ti4 Y;
    public /* synthetic */ fb6 Z;
    public /* synthetic */ boolean c0;
    public /* synthetic */ int d0;

    public az1(j11 j11Var) {
        super(6, j11Var);
    }

    @Override // defpackage.ej2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        int intValue = ((Number) obj5).intValue();
        az1 az1Var = new az1((j11) obj6);
        az1Var.X = (nd3) obj;
        az1Var.Y = (ti4) obj2;
        az1Var.Z = (fb6) obj3;
        az1Var.c0 = booleanValue;
        az1Var.d0 = intValue;
        return az1Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        nd3 nd3Var = this.X;
        ti4 ti4Var = this.Y;
        fb6 fb6Var = this.Z;
        boolean z = this.c0;
        int i = this.d0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        return new kv1(nd3Var, ti4Var, fb6Var, z, i);
    }
}
