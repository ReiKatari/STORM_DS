package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tq3  reason: default package */
/* loaded from: classes.dex */
public final class tq3 extends rq3 {
    public final fn3 a;

    public tq3(fn3 fn3Var, za7 za7Var) {
        this.a = fn3Var;
        za7Var.getClass();
        x31 x31Var = x31.b;
        x31Var.getClass();
        q9 q9Var = new q9(za7Var, sq3.c, x31Var);
        qo0 a = q75.a(sq3.class);
        String b = a.b();
        if (b != null) {
            sq3 sq3Var = (sq3) q9Var.F(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        } else {
            i.i("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        fn3 fn3Var = this.a;
        String simpleName = fn3Var.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = fn3Var.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(fn3Var)));
        sb.append("}}");
        return sb.toString();
    }
}
