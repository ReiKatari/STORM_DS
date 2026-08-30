package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: db1  reason: default package */
/* loaded from: classes.dex */
public final class db1 implements sw5 {
    public final mi2 a;
    public final cb1 b = new cb1(this);
    public final x24 c = new x24();
    public final tj4 d;
    public final tj4 e;
    public final tj4 f;

    public db1(mi2 mi2Var) {
        this.a = mi2Var;
        Boolean bool = Boolean.FALSE;
        this.d = me2.G(bool);
        this.e = me2.G(bool);
        this.f = me2.G(bool);
    }

    @Override // defpackage.sw5
    public final boolean b() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final float d(float f) {
        return ((Number) this.a.n(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.sw5
    public final Object e(r24 r24Var, aj2 aj2Var, j11 j11Var) {
        Object k = iq2.k(new a0(this, r24Var, aj2Var, (j11) null, 20), j11Var);
        if (k == p31.COROUTINE_SUSPENDED) {
            return k;
        }
        return o27.a;
    }
}
