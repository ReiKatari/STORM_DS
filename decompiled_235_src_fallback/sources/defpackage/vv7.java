package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vv7  reason: default package */
/* loaded from: classes.dex */
public final class vv7 {
    public static final java.util.List c = null;
    public static final java.util.List d = null;
    public static final java.util.List e = null;
    public final int a;
    public final int b;

    static {
            vo7 r0 = new vo7
            r0.<init>()
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 600(0x258, float:8.41E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 840(0x348, float:1.177E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r2 = new java.lang.Integer[]{r1, r2, r3}
            java.util.List r2 = defpackage.hf.c0(r2)
            defpackage.vv7.c = r2
            r3 = 1200(0x4b0, float:1.682E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1600(0x640, float:2.242E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r3, r4}
            java.util.List r3 = defpackage.hf.c0(r3)
            java.util.ArrayList r3 = defpackage.gt0.V0(r2, r3)
            r4 = 480(0x1e0, float:6.73E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 900(0x384, float:1.261E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer[] r1 = new java.lang.Integer[]{r1, r4, r5}
            java.util.List r1 = defpackage.hf.c0(r1)
            defpackage.vv7.d = r1
            defpackage.vv7.e = r1
            defpackage.vo7.b(r0, r2, r1)
            defpackage.vo7.b(r0, r3, r1)
            return
    }

    public vv7(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0 = 46
            if (r1 < 0) goto L19
            if (r2 < 0) goto Le
            return
        Le:
            java.lang.String r1 = "Expected minHeightDp to be at least 0, minHeightDp: "
            java.lang.String r0 = defpackage.xg6.o(r1, r2, r0)
            defpackage.i.f(r0)
            r0 = 0
            throw r0
        L19:
            java.lang.String r2 = "Expected minWidthDp to be at least 0, minWidthDp: "
            java.lang.String r0 = defpackage.xg6.o(r2, r1, r0)
            defpackage.i.f(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L21
            java.lang.Class<vv7> r2 = defpackage.vv7.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L21
        L10:
            vv7 r5 = (defpackage.vv7) r5
            int r2 = r4.a
            int r3 = r5.a
            if (r2 == r3) goto L19
            return r1
        L19:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 == r5) goto L20
            return r1
        L20:
            return r0
        L21:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            int r0 = r0 * 31
            int r1 = r1.b
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowSizeClass(minWidthDp="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", minHeightDp="
            r0.append(r1)
            int r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
