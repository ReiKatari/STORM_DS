package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk2  reason: default package */
/* loaded from: classes.dex */
public final class nk2 extends defpackage.qu2 {
    public static final android.util.Range d = null;
    public final int a;
    public final int b;
    public final defpackage.da2 c;

    static {
            android.util.Range r0 = new android.util.Range
            r1 = 30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r1)
            defpackage.nk2.d = r0
            return
    }

    public nk2() {
            r1 = this;
            r1.<init>()
            r0 = 60
            r1.a = r0
            r1.b = r0
            da2 r0 = defpackage.da2.FPS_RANGE
            r1.c = r0
            return
    }

    @Override // defpackage.qu2
    public final defpackage.da2 a() {
            r0 = this;
            da2 r0 = r0.c
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FpsRangeFeature(minFps="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", maxFps="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
