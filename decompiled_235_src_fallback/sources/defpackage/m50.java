package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m50  reason: default package */
/* loaded from: classes.dex */
public final class m50 {
    public android.graphics.RenderEffect a;
    public final float b;
    public final float c;
    public final int d;

    public m50(float r1, float r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            return
    }

    public final android.graphics.RenderEffect a() {
            r4 = this;
            android.graphics.RenderEffect r0 = r4.a
            if (r0 != 0) goto L22
            float r0 = r4.b
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            float r3 = r4.c
            if (r2 != 0) goto L16
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L16
            android.graphics.RenderEffect r0 = defpackage.sd0.d()
            goto L20
        L16:
            int r1 = r4.d
            android.graphics.Shader$TileMode r1 = defpackage.u24.G(r1)
            android.graphics.RenderEffect r0 = defpackage.sd0.e(r0, r3, r1)
        L20:
            r4.a = r0
        L22:
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L20
        L3:
            boolean r0 = r3 instanceof defpackage.m50
            if (r0 != 0) goto L8
            goto L22
        L8:
            m50 r3 = (defpackage.m50) r3
            float r0 = r3.b
            float r1 = r2.b
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L22
            float r0 = r2.c
            float r1 = r3.c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L22
            int r2 = r2.d
            int r3 = r3.d
            if (r2 != r3) goto L22
        L20:
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.b
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r3 = r3.d
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlurEffect(renderEffect=null, radiusX="
            r0.<init>(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", radiusY="
            r0.append(r1)
            float r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", edgeTreatment="
            r0.append(r1)
            int r2 = r2.d
            java.lang.String r2 = defpackage.uj2.d0(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
