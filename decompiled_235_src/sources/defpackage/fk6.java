package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk6  reason: default package */
/* loaded from: classes.dex */
public final class fk6 extends hw6 implements eo2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float d0;
    public final /* synthetic */ float e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk6(float f, float f2, float f3, r41 r41Var) {
        super(2, r41Var);
        this.Z = f;
        this.d0 = f2;
        this.e0 = f3;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((fk6) q((r41) obj2, (cd) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        fk6 fk6Var = new fk6(this.Z, this.d0, this.e0, r41Var);
        fk6Var.Y = obj;
        return fk6Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ah5] */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            ?? obj2 = new Object();
            float f = this.Z;
            obj2.A = f;
            gn b = nb3.b(f);
            Float f2 = new Float(this.d0);
            sc7 sc7Var = jk6.b;
            Float f3 = new Float(this.e0);
            qk4 qk4Var = new qk4(18, (cd) this.Y, (Object) obj2);
            this.X = 1;
            Object d = b.d();
            wc7 wc7Var = nw7.e0;
            if (eb4.a(b.f, new dn(b, f3, new jz6(sc7Var, wc7Var, d, f2, (ap) wc7Var.a.g(f3)), b.c.R, qk4Var, null), this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
