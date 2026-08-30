package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {
    public static p a(q qVar) {
        qVar.getClass();
        int i2 = m.f1477a[qVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return null;
                }
                return p.ON_PAUSE;
            }
            return p.ON_STOP;
        }
        return p.ON_DESTROY;
    }

    public static p b(q qVar) {
        qVar.getClass();
        int i2 = m.f1477a[qVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 5) {
                    return null;
                }
                return p.ON_CREATE;
            }
            return p.ON_RESUME;
        }
        return p.ON_START;
    }

    public static p c(q qVar) {
        qVar.getClass();
        int i2 = m.f1477a[qVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return null;
                }
                return p.ON_RESUME;
            }
            return p.ON_START;
        }
        return p.ON_CREATE;
    }
}
