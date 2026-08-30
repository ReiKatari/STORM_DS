package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k67  reason: default package */
/* loaded from: classes.dex */
public final class k67 extends gk2 {
    public final Object a;
    public final w77 b;
    public final iq0 c;

    public k67(Object obj, w77 w77Var, iq0 iq0Var) {
        obj.getClass();
        w77Var.getClass();
        this.a = obj;
        this.b = w77Var;
        this.c = iq0Var;
    }

    @Override // defpackage.gk2
    public final gk2 d0(String str, mi2 mi2Var) {
        Object obj = this.a;
        if (((Boolean) mi2Var.n(obj)).booleanValue()) {
            return this;
        }
        return new u42(obj, str, this.c, this.b);
    }

    @Override // defpackage.gk2
    public final Object y() {
        return this.a;
    }
}
