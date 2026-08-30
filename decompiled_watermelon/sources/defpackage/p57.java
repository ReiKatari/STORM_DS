package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p57  reason: default package */
/* loaded from: classes.dex */
public final class p57 {
    public static r57 a(f47 f47Var) {
        f47Var.getClass();
        if (f47Var instanceof nt4) {
            return r57.PREVIEW;
        }
        if (f47Var instanceof zv2) {
            return r57.IMAGE_CAPTURE;
        }
        if (f47Var instanceof nv2) {
            return r57.IMAGE_ANALYSIS;
        }
        if (yf2.E(f47Var)) {
            return r57.VIDEO_CAPTURE;
        }
        if (f47Var instanceof zf6) {
            return r57.STREAM_SHARING;
        }
        return r57.UNDEFINED;
    }

    public static r57 b(b57 b57Var) {
        b57Var.getClass();
        int i = o57.a[b57Var.n().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return r57.UNDEFINED;
                        }
                        return r57.STREAM_SHARING;
                    }
                    return r57.VIDEO_CAPTURE;
                }
                return r57.PREVIEW;
            }
            return r57.IMAGE_CAPTURE;
        }
        return r57.IMAGE_ANALYSIS;
    }
}
