package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu3  reason: default package */
/* loaded from: classes.dex */
public final class uu3 {
    public static final float b = 0.0f;
    public static final float c = 0.0f;
    public static final float d = 0.0f;
    public final float a;

    static {
            r0 = 0
            a(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            a(r0)
            defpackage.uu3.b = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            a(r0)
            defpackage.uu3.c = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            a(r0)
            defpackage.uu3.d = r0
            return
    }

    public /* synthetic */ uu3(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static void a(float r1) {
            r0 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto Lc
            goto L12
        Lc:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L13
        L12:
            return
        L13:
            java.lang.String r1 = "topRatio should be in [0..1] range or -1"
            defpackage.q53.c(r1)
            return
    }

    public static java.lang.String b(float r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L8
            java.lang.String r2 = "LineHeightStyle.Alignment.Top"
            return r2
        L8:
            float r0 = defpackage.uu3.b
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L11
            java.lang.String r2 = "LineHeightStyle.Alignment.Center"
            return r2
        L11:
            float r0 = defpackage.uu3.c
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L1a
            java.lang.String r2 = "LineHeightStyle.Alignment.Proportional"
            return r2
        L1a:
            float r0 = defpackage.uu3.d
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L23
            java.lang.String r2 = "LineHeightStyle.Alignment.Bottom"
            return r2
        L23:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LineHeightStyle.Alignment(topPercentage = "
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.uu3
            if (r0 != 0) goto L5
            goto L11
        L5:
            uu3 r2 = (defpackage.uu3) r2
            float r2 = r2.a
            float r1 = r1.a
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 == 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            float r0 = r0.a
            java.lang.String r0 = b(r0)
            return r0
    }
}
