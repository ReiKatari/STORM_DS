package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl7  reason: default package */
/* loaded from: classes.dex */
public final class dl7 extends defpackage.fl7 implements java.lang.Iterable, defpackage.zf3 {
    public final java.lang.String A;
    public final float B;
    public final float L;
    public final float R;
    public final float X;
    public final float Y;
    public final float Z;
    public final float d0;
    public final java.util.List e0;
    public final java.util.List f0;

    public dl7(java.lang.String r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, java.util.List r9, java.util.ArrayList r10) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            r0.f0 = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L68
            boolean r2 = r5 instanceof defpackage.dl7
            if (r2 != 0) goto Lc
            goto L68
        Lc:
            dl7 r5 = (defpackage.dl7) r5
            java.lang.String r2 = r5.A
            java.lang.String r3 = r4.A
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 != 0) goto L19
            return r1
        L19:
            float r2 = r4.B
            float r3 = r5.B
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.L
            float r3 = r5.L
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.R
            float r3 = r5.R
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.X
            float r3 = r5.X
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.Y
            float r3 = r5.Y
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.Z
            float r3 = r5.Z
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.d0
            float r3 = r5.d0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            java.util.List r2 = r4.e0
            java.util.List r3 = r5.e0
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L5c
            return r1
        L5c:
            java.util.List r4 = r4.f0
            java.util.List r5 = r5.f0
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L67
            return r1
        L67:
            return r0
        L68:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.A
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.B
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.L
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.R
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.X
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.Y
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.Z
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.d0
            int r0 = defpackage.xg6.a(r2, r0, r1)
            java.util.List r2 = r3.e0
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.List r3 = r3.f0
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            dw4 r0 = new dw4
            r0.<init>(r1)
            return r0
    }
}
