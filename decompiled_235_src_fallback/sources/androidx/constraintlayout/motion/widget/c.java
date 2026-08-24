package androidx.constraintlayout.motion.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class c {
    public static final float[][] E = null;
    public static final float[][] F = null;
    public final float A;
    public final float B;
    public final int C;
    public final int D;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public float g;
    public float h;
    public final int i;
    public final boolean j;
    public float k;
    public float l;
    public boolean m;
    public final float[] n;
    public final int[] o;
    public float p;
    public float q;
    public final androidx.constraintlayout.motion.widget.MotionLayout r;
    public final float s;
    public final float t;
    public final boolean u;
    public final float v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    static {
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0050: FILL_ARRAY_DATA  , data: [1056964608, 0} // fill-array
            float[] r2 = new float[r0]
            r2 = {x0058: FILL_ARRAY_DATA  , data: [0, 1056964608} // fill-array
            float[] r3 = new float[r0]
            r3 = {x0060: FILL_ARRAY_DATA  , data: [1065353216, 1056964608} // fill-array
            float[] r4 = new float[r0]
            r4 = {x0068: FILL_ARRAY_DATA  , data: [1056964608, 1065353216} // fill-array
            float[] r5 = new float[r0]
            r5 = {x0070: FILL_ARRAY_DATA  , data: [1056964608, 1056964608} // fill-array
            float[] r6 = new float[r0]
            r6 = {x0078: FILL_ARRAY_DATA  , data: [0, 1056964608} // fill-array
            float[] r7 = new float[r0]
            r7 = {x0080: FILL_ARRAY_DATA  , data: [1065353216, 1056964608} // fill-array
            float[][] r1 = new float[][]{r1, r2, r3, r4, r5, r6, r7}
            androidx.constraintlayout.motion.widget.c.E = r1
            float[] r2 = new float[r0]
            r2 = {x0088: FILL_ARRAY_DATA  , data: [0, -1082130432} // fill-array
            float[] r3 = new float[r0]
            r3 = {x0090: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            float[] r4 = new float[r0]
            r4 = {x0098: FILL_ARRAY_DATA  , data: [-1082130432, 0} // fill-array
            float[] r5 = new float[r0]
            r5 = {x00a0: FILL_ARRAY_DATA  , data: [1065353216, 0} // fill-array
            float[] r6 = new float[r0]
            r6 = {x00a8: FILL_ARRAY_DATA  , data: [-1082130432, 0} // fill-array
            float[] r7 = new float[r0]
            r7 = {x00b0: FILL_ARRAY_DATA  , data: [1065353216, 0} // fill-array
            float[][] r0 = new float[][]{r2, r3, r4, r5, r6, r7}
            androidx.constraintlayout.motion.widget.c.F = r0
            return
    }

    public c(android.content.Context r8, androidx.constraintlayout.motion.widget.MotionLayout r9, android.content.res.XmlResourceParser r10) {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.a = r0
            r7.b = r0
            r7.c = r0
            r1 = -1
            r7.d = r1
            r7.e = r1
            r7.f = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r7.g = r2
            r7.h = r2
            r7.i = r1
            r7.j = r0
            r1 = 0
            r7.k = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.l = r1
            r7.m = r0
            r2 = 2
            float[] r3 = new float[r2]
            r7.n = r3
            int[] r3 = new int[r2]
            r7.o = r3
            r3 = 1082130432(0x40800000, float:4.0)
            r7.s = r3
            r3 = 1067030938(0x3f99999a, float:1.2)
            r7.t = r3
            r3 = 1
            r7.u = r3
            r7.v = r1
            r7.w = r0
            r4 = 1092616192(0x41200000, float:10.0)
            r7.x = r4
            r7.y = r4
            r7.z = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r7.A = r1
            r7.B = r1
            r7.C = r0
            r7.D = r0
            r7.r = r9
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r10)
            int[] r10 = defpackage.e75.o
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r10)
            int r9 = r8.getIndexCount()
            r10 = r0
        L60:
            if (r10 >= r9) goto L17d
            int r4 = r8.getIndex(r10)
            r5 = 16
            if (r4 != r5) goto L74
            int r5 = r7.d
            int r4 = r8.getResourceId(r4, r5)
            r7.d = r4
            goto L179
        L74:
            r5 = 17
            if (r4 != r5) goto L8e
            int r5 = r7.a
            int r4 = r8.getInt(r4, r5)
            r7.a = r4
            float[][] r5 = androidx.constraintlayout.motion.widget.c.E
            r4 = r5[r4]
            r5 = r4[r0]
            r7.h = r5
            r4 = r4[r3]
            r7.g = r4
            goto L179
        L8e:
            r5 = 6
            if (r4 != r3) goto Lb1
            int r6 = r7.b
            int r4 = r8.getInt(r4, r6)
            r7.b = r4
            if (r4 >= r5) goto La9
            float[][] r5 = androidx.constraintlayout.motion.widget.c.F
            r4 = r5[r4]
            r5 = r4[r0]
            r7.k = r5
            r4 = r4[r3]
            r7.l = r4
            goto L179
        La9:
            r7.l = r1
            r7.k = r1
            r7.j = r3
            goto L179
        Lb1:
            if (r4 != r5) goto Lbd
            float r5 = r7.s
            float r4 = r8.getFloat(r4, r5)
            r7.s = r4
            goto L179
        Lbd:
            r5 = 5
            if (r4 != r5) goto Lca
            float r5 = r7.t
            float r4 = r8.getFloat(r4, r5)
            r7.t = r4
            goto L179
        Lca:
            r5 = 7
            if (r4 != r5) goto Ld7
            boolean r5 = r7.u
            boolean r4 = r8.getBoolean(r4, r5)
            r7.u = r4
            goto L179
        Ld7:
            if (r4 != r2) goto Le3
            float r5 = r7.v
            float r4 = r8.getFloat(r4, r5)
            r7.v = r4
            goto L179
        Le3:
            r5 = 3
            if (r4 != r5) goto Lf0
            float r5 = r7.x
            float r4 = r8.getFloat(r4, r5)
            r7.x = r4
            goto L179
        Lf0:
            r5 = 18
            if (r4 != r5) goto Lfe
            int r5 = r7.e
            int r4 = r8.getResourceId(r4, r5)
            r7.e = r4
            goto L179
        Lfe:
            r5 = 9
            if (r4 != r5) goto L10c
            int r5 = r7.c
            int r4 = r8.getInt(r4, r5)
            r7.c = r4
            goto L179
        L10c:
            r5 = 8
            if (r4 != r5) goto L117
            int r4 = r8.getInteger(r4, r0)
            r7.w = r4
            goto L179
        L117:
            r5 = 4
            if (r4 != r5) goto L121
            int r4 = r8.getResourceId(r4, r0)
            r7.f = r4
            goto L179
        L121:
            r5 = 10
            if (r4 != r5) goto L12e
            int r5 = r7.i
            int r4 = r8.getResourceId(r4, r5)
            r7.i = r4
            goto L179
        L12e:
            r5 = 12
            if (r4 != r5) goto L13b
            float r5 = r7.y
            float r4 = r8.getFloat(r4, r5)
            r7.y = r4
            goto L179
        L13b:
            r5 = 13
            if (r4 != r5) goto L148
            float r5 = r7.z
            float r4 = r8.getFloat(r4, r5)
            r7.z = r4
            goto L179
        L148:
            r5 = 14
            if (r4 != r5) goto L155
            float r5 = r7.A
            float r4 = r8.getFloat(r4, r5)
            r7.A = r4
            goto L179
        L155:
            r5 = 15
            if (r4 != r5) goto L162
            float r5 = r7.B
            float r4 = r8.getFloat(r4, r5)
            r7.B = r4
            goto L179
        L162:
            r5 = 11
            if (r4 != r5) goto L16f
            int r5 = r7.C
            int r4 = r8.getInt(r4, r5)
            r7.C = r4
            goto L179
        L16f:
            if (r4 != 0) goto L179
            int r5 = r7.D
            int r4 = r8.getInt(r4, r5)
            r7.D = r4
        L179:
            int r10 = r10 + 1
            goto L60
        L17d:
            r8.recycle()
            return
    }

    public final android.graphics.RectF a(android.view.ViewGroup r3, android.graphics.RectF r4) {
            r2 = this;
            r0 = -1
            int r2 = r2.f
            if (r2 != r0) goto L6
            goto Lc
        L6:
            android.view.View r2 = r3.findViewById(r2)
            if (r2 != 0) goto Le
        Lc:
            r2 = 0
            return r2
        Le:
            int r3 = r2.getLeft()
            float r3 = (float) r3
            int r0 = r2.getTop()
            float r0 = (float) r0
            int r1 = r2.getRight()
            float r1 = (float) r1
            int r2 = r2.getBottom()
            float r2 = (float) r2
            r4.set(r3, r0, r1, r2)
            return r4
    }

    public final android.graphics.RectF b(android.view.ViewGroup r3, android.graphics.RectF r4) {
            r2 = this;
            r0 = -1
            int r2 = r2.e
            if (r2 != r0) goto L6
            goto Lc
        L6:
            android.view.View r2 = r3.findViewById(r2)
            if (r2 != 0) goto Le
        Lc:
            r2 = 0
            return r2
        Le:
            int r3 = r2.getLeft()
            float r3 = (float) r3
            int r0 = r2.getTop()
            float r0 = (float) r0
            int r1 = r2.getRight()
            float r1 = (float) r1
            int r2 = r2.getBottom()
            float r2 = (float) r2
            r4.set(r3, r0, r1, r2)
            return r4
    }

    public final void c(boolean r9) {
            r8 = this;
            r0 = 3
            r1 = 4
            r2 = 6
            float[][] r3 = androidx.constraintlayout.motion.widget.c.E
            float[][] r4 = androidx.constraintlayout.motion.widget.c.F
            r5 = 1
            r6 = 2
            r7 = 5
            if (r9 == 0) goto L1d
            r9 = r4[r0]
            r4[r1] = r9
            r9 = r4[r6]
            r4[r7] = r9
            r9 = r3[r6]
            r3[r7] = r9
            r9 = r3[r5]
            r3[r2] = r9
            goto L2d
        L1d:
            r9 = r4[r6]
            r4[r1] = r9
            r9 = r4[r0]
            r4[r7] = r9
            r9 = r3[r5]
            r3[r7] = r9
            r9 = r3[r6]
            r3[r2] = r9
        L2d:
            int r9 = r8.a
            r9 = r3[r9]
            r0 = 0
            r1 = r9[r0]
            r8.h = r1
            r9 = r9[r5]
            r8.g = r9
            int r9 = r8.b
            if (r9 < r2) goto L3f
            return
        L3f:
            r9 = r4[r9]
            r0 = r9[r0]
            r8.k = r0
            r9 = r9[r5]
            r8.l = r9
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            float r0 = r2.k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto Lb
            java.lang.String r2 = "rotation"
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = " , "
            r0.append(r1)
            float r2 = r2.l
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
