package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m65  reason: default package */
/* loaded from: classes.dex */
public final class m65 extends hw6 implements qn2 {
    public int X;
    public final /* synthetic */ n65 Y;
    public final /* synthetic */ float Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m65(n65 n65Var, float f, r41 r41Var) {
        super(1, r41Var);
        this.Y = n65Var;
        this.Z = f;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        return new m65(this.Y, this.Z, (r41) obj).s(jg7.a);
    }

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
            n65 n65Var = this.Y;
            float h = n65Var.e.h();
            z5 z5Var = new z5(n65Var, 21);
            this.X = 1;
            if (kj2.l(h, this.Z, null, z5Var, this, 12) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
