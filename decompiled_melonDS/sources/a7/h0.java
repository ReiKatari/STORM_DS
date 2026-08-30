package a7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 extends j0 {

    /* renamed from: r  reason: collision with root package name */
    public final Class f575r;

    public h0(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f575r = cls;
        } else {
            fj.j.d(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // a7.j0, a7.k0
    public final String b() {
        return this.f575r.getName();
    }

    @Override // a7.j0
    /* renamed from: h */
    public final Enum g(String str) {
        Enum r42;
        Class cls = this.f575r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                r42 = enumConstants[i2];
                if (vc.o.P(((Enum) r42).name(), str, true)) {
                    break;
                }
                i2++;
            } else {
                r42 = null;
                break;
            }
        }
        Enum r43 = r42;
        if (r43 != null) {
            return r43;
        }
        StringBuilder u4 = w.d.u("Enum value ", str, " not found for type ");
        u4.append(cls.getName());
        u4.append('.');
        throw new IllegalArgumentException(u4.toString());
    }
}
