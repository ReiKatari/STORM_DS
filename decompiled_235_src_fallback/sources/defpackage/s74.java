package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s74  reason: default package */
/* loaded from: classes.dex */
public final class s74 {
    public static final defpackage.s74 a = null;

    static {
            s74 r0 = new s74
            r0.<init>()
            defpackage.s74.a = r0
            return
    }

    public final boolean a(android.view.MotionEvent r3, int r4) {
            r2 = this;
            float r2 = defpackage.au2.b(r3, r4)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = r2 & r0
            r1 = 2139095040(0x7f800000, float:Infinity)
            if (r2 >= r1) goto L1d
            float r2 = defpackage.r74.a(r3, r4)
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r2 = r2 & r0
            if (r2 >= r1) goto L1d
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }
}
