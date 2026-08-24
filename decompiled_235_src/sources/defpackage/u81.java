package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u81  reason: default package */
/* loaded from: classes.dex */
public final class u81 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ l61 Y;
    public final /* synthetic */ m16 Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ qn2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u81(l61 l61Var, m16 m16Var, boolean z, boolean z2, qn2 qn2Var, r41 r41Var) {
        super(2, r41Var);
        this.Y = l61Var;
        this.Z = m16Var;
        this.d0 = z;
        this.e0 = z2;
        this.f0 = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((u81) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new u81(this.Y, this.Z, this.d0, this.e0, this.f0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                return obj;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        t81 t81Var = new t81(this.Z, this.d0, this.e0, this.f0, (r41) null);
        this.X = 1;
        Object d0 = hv.d0(this.Y, t81Var, this);
        if (d0 == x61Var) {
            return x61Var;
        }
        return d0;
    }
}
