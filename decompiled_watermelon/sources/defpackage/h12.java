package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h12  reason: default package */
/* loaded from: classes.dex */
public class h12 implements ez6 {
    @Override // defpackage.ez6
    public final dz6 a(qo2 qo2Var, n07 n07Var) {
        Class cls = n07Var.a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new i12(cls);
        }
        return null;
    }
}
