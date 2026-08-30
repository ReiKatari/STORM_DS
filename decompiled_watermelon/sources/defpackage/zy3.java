package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zy3  reason: default package */
/* loaded from: classes.dex */
public interface zy3 {
    Object a(aj2 aj2Var, Object obj);

    boolean b(mi2 mi2Var);

    default zy3 f(zy3 zy3Var) {
        if (zy3Var == wy3.a) {
            return this;
        }
        return new vr0(this, zy3Var);
    }
}
