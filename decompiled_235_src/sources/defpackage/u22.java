package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u22  reason: default package */
/* loaded from: classes.dex */
public final class u22 extends hw6 implements eo2 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nv4 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u22(nv4 nv4Var, long j, r41 r41Var) {
        super(2, r41Var);
        this.Y = nv4Var;
        this.Z = j;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((u22) q((r41) obj2, (tz1) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        u22 u22Var = new u22(this.Y, this.Z, r41Var);
        u22Var.X = obj;
        return u22Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        boolean z;
        tz1 tz1Var = (tz1) this.X;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        oi2.Y(obj);
        if (tz1Var.a == this.Y.a.e && tz1Var.b >= this.Z) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
