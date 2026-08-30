package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nm3  reason: default package */
/* loaded from: classes.dex */
public final class nm3 {
    public static pm3 a(qm3 qm3Var) {
        qm3Var.getClass();
        int i = mm3.a[qm3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return pm3.ON_PAUSE;
            }
            return pm3.ON_STOP;
        }
        return pm3.ON_DESTROY;
    }

    public static pm3 b(qm3 qm3Var) {
        qm3Var.getClass();
        int i = mm3.a[qm3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    return null;
                }
                return pm3.ON_CREATE;
            }
            return pm3.ON_RESUME;
        }
        return pm3.ON_START;
    }

    public static pm3 c(qm3 qm3Var) {
        qm3Var.getClass();
        int i = mm3.a[qm3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return pm3.ON_RESUME;
            }
            return pm3.ON_START;
        }
        return pm3.ON_CREATE;
    }
}
