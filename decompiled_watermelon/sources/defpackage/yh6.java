package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yh6  reason: default package */
/* loaded from: classes.dex */
public final class yh6 {
    public final bi6 a;
    public jg3 b;
    public final xh6 c = new xh6(this, 2);
    public final xh6 d = new xh6(this, 0);
    public final xh6 e = new xh6(this, 1);

    public yh6(bi6 bi6Var) {
        this.a = bi6Var;
    }

    public final jg3 a() {
        jg3 jg3Var = this.b;
        if (jg3Var != null) {
            return jg3Var;
        }
        i.i("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
