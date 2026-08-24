package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w52  reason: default package */
/* loaded from: classes.dex */
public class w52 implements zc7 {
    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        Class cls = ie7Var.a;
        if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new x52(cls);
        }
        return null;
    }
}
