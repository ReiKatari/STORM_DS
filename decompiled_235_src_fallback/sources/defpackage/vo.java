package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vo  reason: default package */
/* loaded from: classes.dex */
public abstract class vo {
    public static final android.view.animation.LinearInterpolator a = null;
    public static final defpackage.q92 b = null;
    public static final defpackage.q92 c = null;
    public static final defpackage.q92 d = null;

    static {
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            defpackage.vo.a = r0
            q92 r0 = new q92
            r1 = 1
            r0.<init>(r1)
            defpackage.vo.b = r0
            q92 r0 = new q92
            r1 = 0
            r0.<init>(r1)
            defpackage.vo.c = r0
            q92 r0 = new q92
            float[] r1 = defpackage.q92.e
            r0.<init>(r1)
            defpackage.vo.d = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            return
    }

    public static float a(float r0, float r1, float r2) {
            float r0 = defpackage.i61.a(r1, r0, r2, r0)
            return r0
    }

    public static float b(float r1, float r2, float r3, float r4, float r5) {
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L5
            return r1
        L5:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 < 0) goto La
            return r2
        La:
            float r5 = r5 - r3
            float r4 = r4 - r3
            float r5 = r5 / r4
            float r1 = a(r1, r2, r5)
            return r1
    }

    public static int c(float r0, int r1, int r2) {
            int r2 = r2 - r1
            float r2 = (float) r2
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            int r0 = r0 + r1
            return r0
    }
}
