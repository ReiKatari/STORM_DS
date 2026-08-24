package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x35  reason: default package */
/* loaded from: classes.dex */
public final class x35 {
    public static final defpackage.x35 d = null;
    public final float a;
    public final defpackage.bs0 b;
    public final int c;

    static {
            x35 r0 = new x35
            bs0 r1 = new bs0
            r2 = 0
            r1.<init>(r2, r2)
            r3 = 0
            r0.<init>(r2, r1, r3)
            defpackage.x35.d = r0
            return
    }

    public x35(float r1, defpackage.bs0 r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L10
            return
        L10:
            java.lang.String r0 = "current must not be NaN"
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof defpackage.x35
            if (r0 != 0) goto L8
            goto L26
        L8:
            x35 r3 = (defpackage.x35) r3
            float r0 = r3.a
            float r1 = r2.a
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L26
            bs0 r0 = r2.b
            bs0 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1d
            goto L26
        L1d:
            int r2 = r2.c
            int r3 = r3.c
            if (r2 == r3) goto L24
            goto L26
        L24:
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            float r0 = r2.a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            bs0 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r2 = r2.c
            int r1 = r1 + r2
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ProgressBarRangeInfo(current="
            r0.<init>(r1)
            float r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", range="
            r0.append(r1)
            bs0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", steps="
            r0.append(r1)
            int r2 = r2.c
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
