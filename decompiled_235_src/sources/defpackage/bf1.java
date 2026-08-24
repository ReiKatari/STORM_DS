package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bf1  reason: default package */
/* loaded from: classes.dex */
public final class bf1 implements f86 {
    public final qn2 a;
    public final af1 b = new af1(this);
    public final db4 c = new db4();
    public final vs4 d;
    public final vs4 e;
    public final vs4 f;

    public bf1(qn2 qn2Var) {
        this.a = qn2Var;
        Boolean bool = Boolean.FALSE;
        this.d = np2.Y(bool);
        this.e = np2.Y(bool);
        this.f = np2.Y(bool);
    }

    @Override // defpackage.f86
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.f86
    public final Object d(xa4 xa4Var, eo2 eo2Var, s41 s41Var) {
        Object C = g04.C(new b0(this, xa4Var, eo2Var, (r41) null, 19), s41Var);
        if (C == x61.COROUTINE_SUSPENDED) {
            return C;
        }
        return jg7.a;
    }

    @Override // defpackage.f86
    public final float e(float f) {
        return ((Number) this.a.g(Float.valueOf(f))).floatValue();
    }
}
