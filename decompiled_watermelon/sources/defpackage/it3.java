package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: it3  reason: default package */
/* loaded from: classes.dex */
public final class it3 implements qx3 {
    public qx3[] a;

    @Override // defpackage.qx3
    public final j45 a(Class cls) {
        qx3[] qx3VarArr;
        for (qx3 qx3Var : this.a) {
            if (qx3Var.b(cls)) {
                return qx3Var.a(cls);
            }
        }
        vd6.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.qx3
    public final boolean b(Class cls) {
        for (qx3 qx3Var : this.a) {
            if (qx3Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
