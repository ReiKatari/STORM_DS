package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w11  reason: default package */
/* loaded from: classes.dex */
public final class w11 {
    public static final android.util.SparseIntArray n = null;
    public boolean a;
    public int b;
    public int c;
    public java.lang.String d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public int j;
    public java.lang.String k;
    public int l;
    public int m;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            defpackage.w11.n = r0
            r1 = 3
            r2 = 1
            r0.append(r1, r2)
            r3 = 5
            r4 = 2
            r0.append(r3, r4)
            r5 = 9
            r0.append(r5, r1)
            r1 = 4
            r0.append(r4, r1)
            r0.append(r2, r3)
            r2 = 0
            r3 = 6
            r0.append(r2, r3)
            r2 = 7
            r0.append(r1, r2)
            r1 = 8
            r0.append(r1, r1)
            r0.append(r2, r5)
            r1 = 10
            r0.append(r3, r1)
            return
    }

    public final void a(defpackage.w11 r2) {
            r1 = this;
            boolean r0 = r2.a
            r1.a = r0
            int r0 = r2.b
            r1.b = r0
            java.lang.String r0 = r2.d
            r1.d = r0
            int r0 = r2.e
            r1.e = r0
            int r0 = r2.f
            r1.f = r0
            float r0 = r2.h
            r1.h = r0
            float r2 = r2.g
            r1.g = r2
            return
    }

    public final void b(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            int[] r0 = defpackage.e75.k
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0)
            r10 = 1
            r8.a = r10
            int r0 = r9.getIndexCount()
            r1 = 0
            r2 = r1
        Lf:
            if (r2 >= r0) goto Lc1
            int r3 = r9.getIndex(r2)
            android.util.SparseIntArray r4 = defpackage.w11.n
            int r4 = r4.get(r3)
            r5 = 3
            switch(r4) {
                case 1: goto Lb5;
                case 2: goto Lac;
                case 3: goto L92;
                case 4: goto L8b;
                case 5: goto L82;
                case 6: goto L79;
                case 7: goto L70;
                case 8: goto L67;
                case 9: goto L5e;
                case 10: goto L21;
                default: goto L1f;
            }
        L1f:
            goto Lbd
        L21:
            android.util.TypedValue r4 = r9.peekValue(r3)
            int r4 = r4.type
            r6 = -2
            r7 = -1
            if (r4 != r10) goto L37
            int r3 = r9.getResourceId(r3, r7)
            r8.m = r3
            if (r3 == r7) goto Lbd
            r8.l = r6
            goto Lbd
        L37:
            if (r4 != r5) goto L55
            java.lang.String r4 = r9.getString(r3)
            r8.k = r4
            java.lang.String r5 = "/"
            int r4 = r4.indexOf(r5)
            if (r4 <= 0) goto L51
            int r3 = r9.getResourceId(r3, r7)
            r8.m = r3
            r8.l = r6
            goto Lbd
        L51:
            r8.l = r7
            goto Lbd
        L55:
            int r4 = r8.m
            int r3 = r9.getInteger(r3, r4)
            r8.l = r3
            goto Lbd
        L5e:
            float r4 = r8.i
            float r3 = r9.getFloat(r3, r4)
            r8.i = r3
            goto Lbd
        L67:
            int r4 = r8.j
            int r3 = r9.getInteger(r3, r4)
            r8.j = r3
            goto Lbd
        L70:
            float r4 = r8.g
            float r3 = r9.getFloat(r3, r4)
            r8.g = r3
            goto Lbd
        L79:
            int r4 = r8.c
            int r3 = r9.getInteger(r3, r4)
            r8.c = r3
            goto Lbd
        L82:
            int r4 = r8.b
            int r3 = defpackage.z11.l(r9, r3, r4)
            r8.b = r3
            goto Lbd
        L8b:
            int r3 = r9.getInt(r3, r1)
            r8.f = r3
            goto Lbd
        L92:
            android.util.TypedValue r4 = r9.peekValue(r3)
            int r4 = r4.type
            if (r4 != r5) goto La1
            java.lang.String r3 = r9.getString(r3)
            r8.d = r3
            goto Lbd
        La1:
            java.lang.String[] r4 = defpackage.gr1.R
            int r3 = r9.getInteger(r3, r1)
            r3 = r4[r3]
            r8.d = r3
            goto Lbd
        Lac:
            int r4 = r8.e
            int r3 = r9.getInt(r3, r4)
            r8.e = r3
            goto Lbd
        Lb5:
            float r4 = r8.h
            float r3 = r9.getFloat(r3, r4)
            r8.h = r3
        Lbd:
            int r2 = r2 + 1
            goto Lf
        Lc1:
            r9.recycle()
            return
    }
}
