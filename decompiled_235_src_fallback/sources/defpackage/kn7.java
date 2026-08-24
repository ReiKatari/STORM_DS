package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kn7  reason: default package */
/* loaded from: classes.dex */
public final class kn7 extends defpackage.qu2 {
    public static final defpackage.in7 c = null;
    public final defpackage.in7 a;
    public final defpackage.da2 b;

    static {
            in7 r0 = defpackage.in7.OFF
            defpackage.kn7.c = r0
            return
    }

    public kn7(defpackage.in7 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            da2 r1 = defpackage.da2.VIDEO_STABILIZATION
            r0.b = r1
            return
    }

    @Override // defpackage.qu2
    public final defpackage.da2 a() {
            r0 = this;
            da2 r0 = r0.b
            return r0
    }

    @Override // defpackage.qu2
    public final boolean b(defpackage.cg0 r2, defpackage.qi1 r3) {
            r1 = this;
            int[] r3 = defpackage.jn7.a
            in7 r1 = r1.a
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L22
            r0 = 2
            if (r1 == r0) goto L1d
            r2 = 3
            if (r1 == r2) goto L1c
            r2 = 4
            if (r1 != r2) goto L17
            goto L1c
        L17:
            defpackage.i.d()
            r1 = 0
            return r1
        L1c:
            return r3
        L1d:
            boolean r1 = r2.z()
            return r1
        L22:
            boolean r1 = r2.c()
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VideoStabilizationFeature(mode="
            r0.<init>(r1)
            in7 r2 = r2.a
            java.lang.String r2 = r2.name()
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
