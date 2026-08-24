package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt3  reason: default package */
/* loaded from: classes.dex */
public final class qt3 {
    public static st3 a(tt3 tt3Var) {
        tt3Var.getClass();
        int i = pt3.a[tt3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return st3.ON_PAUSE;
            }
            return st3.ON_STOP;
        }
        return st3.ON_DESTROY;
    }

    public static st3 b(tt3 tt3Var) {
        tt3Var.getClass();
        int i = pt3.a[tt3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    return null;
                }
                return st3.ON_CREATE;
            }
            return st3.ON_RESUME;
        }
        return st3.ON_START;
    }

    public static st3 c(tt3 tt3Var) {
        tt3Var.getClass();
        int i = pt3.a[tt3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return st3.ON_RESUME;
            }
            return st3.ON_START;
        }
        return st3.ON_CREATE;
    }
}
