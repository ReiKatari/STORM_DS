package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w44  reason: default package */
/* loaded from: classes.dex */
public final class w44 extends y44 {
    public final Class r;

    public w44(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.r = cls;
        } else {
            f81.g(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.y44, defpackage.z44
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.y44
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
                if (gh6.g0(((Enum) r3).name(), str, true)) {
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
        StringBuilder u = b31.u("Enum value ", str, " not found for type ");
        u.append(cls.getName());
        u.append('.');
        throw new IllegalArgumentException(u.toString());
    }
}
