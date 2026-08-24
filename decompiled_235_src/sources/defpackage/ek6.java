package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek6  reason: default package */
/* loaded from: classes.dex */
public final class ek6 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ qj6 Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float d0;
    public final /* synthetic */ float e0;
    public final /* synthetic */ on2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek6(qj6 qj6Var, float f, float f2, float f3, on2 on2Var, r41 r41Var) {
        super(2, r41Var);
        this.Y = qj6Var;
        this.Z = f;
        this.d0 = f2;
        this.e0 = f3;
        this.f0 = on2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((ek6) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new ek6(this.Y, this.Z, this.d0, this.e0, this.f0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            this.X = 1;
            a74 a74Var = jk6.a;
            fk6 fk6Var = new fk6(this.Z, this.d0, this.e0, null);
            Object b = this.Y.b(xa4.Default, fk6Var, this);
            if (b != x61Var) {
                b = jg7Var;
            }
            if (b == x61Var) {
                return x61Var;
            }
        }
        on2 on2Var = this.f0;
        if (on2Var != null) {
            on2Var.c();
        }
        return jg7Var;
    }
}
