package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd4  reason: default package */
/* loaded from: classes.dex */
public final class cd4 extends ed4 {
    public final Class r;

    public cd4(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            e41.f(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.ed4, defpackage.fd4
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.ed4
    /* renamed from: h */
    public final Enum g(String str) {
        Enum r3;
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i < length) {
                r3 = enumConstants[i];
                if (xs6.Z(((Enum) r3).name(), str, true)) {
                    break;
                }
                i++;
            } else {
                r3 = null;
                break;
            }
        }
        Enum r32 = r3;
        if (r32 != null) {
            return r32;
        }
        StringBuilder t = i61.t("Enum value ", str, " not found for type ");
        t.append(cls.getName());
        t.append('.');
        throw new IllegalArgumentException(t.toString());
    }
}
