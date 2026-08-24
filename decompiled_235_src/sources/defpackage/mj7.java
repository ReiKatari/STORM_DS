package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mj7  reason: default package */
/* loaded from: classes.dex */
public final class mj7 {
    public static oj7 a(di7 di7Var) {
        di7Var.getClass();
        if (di7Var instanceof p25) {
            return oj7.PREVIEW;
        }
        if (di7Var instanceof d23) {
            return oj7.IMAGE_CAPTURE;
        }
        if (di7Var instanceof r13) {
            return oj7.IMAGE_ANALYSIS;
        }
        if (ej2.L(di7Var)) {
            return oj7.VIDEO_CAPTURE;
        }
        if (di7Var instanceof pr6) {
            return oj7.STREAM_SHARING;
        }
        return oj7.UNDEFINED;
    }

    public static oj7 b(zi7 zi7Var) {
        zi7Var.getClass();
        int i = lj7.a[zi7Var.x().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return oj7.UNDEFINED;
                        }
                        return oj7.STREAM_SHARING;
                    }
                    return oj7.VIDEO_CAPTURE;
                }
                return oj7.PREVIEW;
            }
            return oj7.IMAGE_CAPTURE;
        }
        return oj7.IMAGE_ANALYSIS;
    }
}
