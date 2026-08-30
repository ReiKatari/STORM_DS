package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t46  reason: default package */
/* loaded from: classes.dex */
public final class t46 extends nk6 implements ej2 {
    public /* synthetic */ boolean X;
    public /* synthetic */ float Y;
    public /* synthetic */ float Z;
    public /* synthetic */ boolean c0;
    public /* synthetic */ boolean d0;

    public t46(j11 j11Var) {
        super(6, j11Var);
    }

    @Override // defpackage.ej2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        float floatValue = ((Number) obj2).floatValue();
        float floatValue2 = ((Number) obj3).floatValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        boolean booleanValue3 = ((Boolean) obj5).booleanValue();
        t46 t46Var = new t46((j11) obj6);
        t46Var.X = booleanValue;
        t46Var.Y = floatValue;
        t46Var.Z = floatValue2;
        t46Var.c0 = booleanValue2;
        t46Var.d0 = booleanValue3;
        return t46Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        boolean z = this.X;
        float f = this.Y;
        float f2 = this.Z;
        boolean z2 = this.c0;
        boolean z3 = this.d0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        me2.a0(obj);
        return new l46(z, f, f2, z2, z3, false);
    }
}
