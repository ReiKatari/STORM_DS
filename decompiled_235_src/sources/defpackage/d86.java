package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d86  reason: default package */
/* loaded from: classes.dex */
public final class d86 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ e86 Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d86(e86 e86Var, float f, float f2, r41 r41Var) {
        super(2, r41Var);
        this.Y = e86Var;
        this.Z = f;
        this.d0 = f2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((d86) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new d86(this.Y, this.Z, this.d0, r41Var);
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
            m86 m86Var = this.Y.J0;
            long floatToRawIntBits = Float.floatToRawIntBits(this.Z);
            this.X = 1;
            if (y76.a(m86Var, (floatToRawIntBits << 32) | (Float.floatToRawIntBits(this.d0) & 4294967295L), this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
