package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d01  reason: default package */
/* loaded from: classes.dex */
public final class d01 extends defpackage.e01 {
    public final defpackage.cq5 e;
    public final defpackage.cq5 f;
    public final float[] g;

    public d01(defpackage.cq5 r9, defpackage.cq5 r10) {
            r8 = this;
            r0 = 0
            r8.<init>(r10, r9, r10, r0)
            r8.e = r9
            r8.f = r10
            t9 r0 = defpackage.t9.c
            float[] r0 = r0.b
            ys7 r1 = r9.d
            float[] r9 = r9.i
            ys7 r2 = r10.d
            float[] r3 = r10.j
            boolean r4 = defpackage.nc1.H(r1, r2)
            if (r4 == 0) goto L1f
            float[] r9 = defpackage.nc1.X(r3, r9)
            goto L5a
        L1f:
            float[] r4 = r1.a()
            float[] r5 = r2.a()
            ys7 r6 = defpackage.jw2.r
            boolean r1 = defpackage.nc1.H(r1, r6)
            r7 = 3
            if (r1 != 0) goto L3d
            float[] r1 = new float[r7]
            r1 = {x005e: FILL_ARRAY_DATA  , data: [1064752793, 1065353216, 1062420357} // fill-array
            float[] r1 = defpackage.nc1.G(r0, r4, r1)
            float[] r9 = defpackage.nc1.X(r1, r9)
        L3d:
            boolean r1 = defpackage.nc1.H(r2, r6)
            if (r1 != 0) goto L56
            float[] r1 = new float[r7]
            r1 = {x0068: FILL_ARRAY_DATA  , data: [1064752793, 1065353216, 1062420357} // fill-array
            float[] r0 = defpackage.nc1.G(r0, r5, r1)
            float[] r10 = r10.i
            float[] r10 = defpackage.nc1.X(r0, r10)
            float[] r3 = defpackage.nc1.U(r10)
        L56:
            float[] r9 = defpackage.nc1.X(r3, r9)
        L5a:
            r8.g = r9
            return
    }

    @Override // defpackage.e01
    public final long a(long r7) {
            r6 = this;
            float r0 = defpackage.kt0.i(r7)
            float r1 = defpackage.kt0.h(r7)
            float r2 = defpackage.kt0.f(r7)
            float r7 = defpackage.kt0.e(r7)
            cq5 r8 = r6.e
            yp5 r8 = r8.p
            double r3 = (double) r0
            double r3 = r8.c(r3)
            float r0 = (float) r3
            double r3 = (double) r1
            double r3 = r8.c(r3)
            float r1 = (float) r3
            double r2 = (double) r2
            double r2 = r8.c(r2)
            float r8 = (float) r2
            r2 = 0
            float[] r3 = r6.g
            r2 = r3[r2]
            float r2 = r2 * r0
            r4 = 3
            r4 = r3[r4]
            float r4 = r4 * r1
            float r4 = r4 + r2
            r2 = 6
            r2 = r3[r2]
            float r2 = r2 * r8
            float r2 = r2 + r4
            r4 = 1
            r4 = r3[r4]
            float r4 = r4 * r0
            r5 = 4
            r5 = r3[r5]
            float r5 = r5 * r1
            float r5 = r5 + r4
            r4 = 7
            r4 = r3[r4]
            float r4 = r4 * r8
            float r4 = r4 + r5
            r5 = 2
            r5 = r3[r5]
            float r5 = r5 * r0
            r0 = 5
            r0 = r3[r0]
            float r0 = r0 * r1
            float r0 = r0 + r5
            r1 = 8
            r1 = r3[r1]
            float r1 = r1 * r8
            float r1 = r1 + r0
            cq5 r6 = r6.f
            yp5 r8 = r6.m
            double r2 = (double) r2
            double r2 = r8.c(r2)
            float r8 = (float) r2
            yp5 r0 = r6.m
            double r2 = (double) r4
            double r2 = r0.c(r2)
            float r2 = (float) r2
            double r3 = (double) r1
            double r0 = r0.c(r3)
            float r0 = (float) r0
            long r6 = defpackage.hv.a(r8, r2, r0, r7, r6)
            return r6
    }
}
