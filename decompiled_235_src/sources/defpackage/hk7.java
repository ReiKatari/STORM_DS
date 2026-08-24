package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk7  reason: default package */
/* loaded from: classes.dex */
public final class hk7 extends oi2 {
    public final Object e;
    public final vl7 f;
    public final vs0 g;

    public hk7(Object obj, vl7 vl7Var, vs0 vs0Var) {
        obj.getClass();
        vl7Var.getClass();
        this.e = obj;
        this.f = vl7Var;
        this.g = vs0Var;
    }

    @Override // defpackage.oi2
    public final oi2 U(String str, qn2 qn2Var) {
        Object obj = this.e;
        if (((Boolean) qn2Var.g(obj)).booleanValue()) {
            return this;
        }
        return new n92(obj, str, this.g, this.f);
    }

    @Override // defpackage.oi2
    public final Object o() {
        return this.e;
    }
}
