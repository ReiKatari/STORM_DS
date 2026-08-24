package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux3  reason: default package */
/* loaded from: classes.dex */
public final class ux3 extends sx3 {
    public final hu3 a;

    public ux3(hu3 hu3Var, ap7 ap7Var) {
        this.a = hu3Var;
        ap7Var.getClass();
        h71 h71Var = h71.b;
        h71Var.getClass();
        eb ebVar = new eb(ap7Var, tx3.c, h71Var);
        ar0 a = gh5.a(tx3.class);
        String b = a.b();
        if (b != null) {
            tx3 tx3Var = (tx3) ebVar.G(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        } else {
            i.h("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        hu3 hu3Var = this.a;
        String simpleName = hu3Var.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = hu3Var.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(hu3Var)));
        sb.append("}}");
        return sb.toString();
    }
}
