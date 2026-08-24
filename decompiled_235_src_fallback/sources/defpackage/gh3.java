package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gh3  reason: default package */
/* loaded from: classes.dex */
public final class gh3 extends defpackage.jg3 {
    public int e;
    public java.lang.String f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;

    public gh3() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.e = r0
            r1 = 0
            r2.f = r1
            r2.g = r0
            r0 = 0
            r2.h = r0
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.i = r1
            r2.j = r1
            r2.k = r1
            r2.l = r1
            r2.m = r0
            return
    }

    @Override // defpackage.jg3
    public final void a(java.util.HashMap r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.jg3
    public final defpackage.jg3 b() {
            r2 = this;
            gh3 r0 = new gh3
            r0.<init>()
            super.c(r2)
            java.lang.String r1 = r2.f
            r0.f = r1
            int r1 = r2.g
            r0.g = r1
            int r1 = r2.h
            r0.h = r1
            float r1 = r2.i
            r0.i = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r0.j = r1
            float r1 = r2.k
            r0.k = r1
            float r2 = r2.l
            r0.l = r2
            return r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            jg3 r0 = r0.b()
            return r0
    }

    @Override // defpackage.jg3
    public final void d(java.util.HashSet r1) {
            r0 = this;
            return
    }

    @Override // defpackage.jg3
    public final void e(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            int[] r0 = defpackage.e75.g
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0)
            android.util.SparseIntArray r10 = defpackage.fh3.a
            int r10 = r9.getIndexCount()
            r0 = 0
            r1 = r0
        Le:
            r2 = -1
            java.lang.String r3 = "KeyPosition"
            if (r1 >= r10) goto Lf0
            int r4 = r9.getIndex(r1)
            android.util.SparseIntArray r5 = defpackage.fh3.a
            int r6 = r5.get(r4)
            r7 = 3
            switch(r6) {
                case 1: goto Lc0;
                case 2: goto Lb7;
                case 3: goto L9d;
                case 4: goto L94;
                case 5: goto L8b;
                case 6: goto L82;
                case 7: goto L78;
                case 8: goto L6c;
                case 9: goto L62;
                case 10: goto L58;
                case 11: goto L4e;
                case 12: goto L44;
                default: goto L21;
            }
        L21:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "unused attribute 0x"
            r2.<init>(r6)
            java.lang.String r6 = java.lang.Integer.toHexString(r4)
            r2.append(r6)
            java.lang.String r6 = "   "
            r2.append(r6)
            int r4 = r5.get(r4)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r3, r2)
            goto Lec
        L44:
            float r2 = r8.j
            float r2 = r9.getFloat(r4, r2)
            r8.j = r2
            goto Lec
        L4e:
            float r2 = r8.i
            float r2 = r9.getFloat(r4, r2)
            r8.i = r2
            goto Lec
        L58:
            int r2 = r8.g
            int r2 = r9.getInt(r4, r2)
            r8.g = r2
            goto Lec
        L62:
            int r2 = r8.m
            int r2 = r9.getInt(r4, r2)
            r8.m = r2
            goto Lec
        L6c:
            float r2 = r8.j
            float r2 = r9.getFloat(r4, r2)
            r8.i = r2
            r8.j = r2
            goto Lec
        L78:
            float r2 = r8.l
            float r2 = r9.getFloat(r4, r2)
            r8.l = r2
            goto Lec
        L82:
            float r2 = r8.k
            float r2 = r9.getFloat(r4, r2)
            r8.k = r2
            goto Lec
        L8b:
            int r2 = r8.h
            int r2 = r9.getInt(r4, r2)
            r8.h = r2
            goto Lec
        L94:
            int r2 = r8.e
            int r2 = r9.getInteger(r4, r2)
            r8.e = r2
            goto Lec
        L9d:
            android.util.TypedValue r2 = r9.peekValue(r4)
            int r2 = r2.type
            if (r2 != r7) goto Lac
            java.lang.String r2 = r9.getString(r4)
            r8.f = r2
            goto Lec
        Lac:
            java.lang.String[] r2 = defpackage.gr1.R
            int r3 = r9.getInteger(r4, r0)
            r2 = r2[r3]
            r8.f = r2
            goto Lec
        Lb7:
            int r2 = r8.a
            int r2 = r9.getInt(r4, r2)
            r8.a = r2
            goto Lec
        Lc0:
            boolean r3 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            if (r3 == 0) goto Ld5
            int r3 = r8.b
            int r3 = r9.getResourceId(r4, r3)
            r8.b = r3
            if (r3 != r2) goto Lec
            java.lang.String r2 = r9.getString(r4)
            r8.c = r2
            goto Lec
        Ld5:
            android.util.TypedValue r2 = r9.peekValue(r4)
            int r2 = r2.type
            if (r2 != r7) goto Le4
            java.lang.String r2 = r9.getString(r4)
            r8.c = r2
            goto Lec
        Le4:
            int r2 = r8.b
            int r2 = r9.getResourceId(r4, r2)
            r8.b = r2
        Lec:
            int r1 = r1 + 1
            goto Le
        Lf0:
            int r8 = r8.a
            if (r8 != r2) goto Lf9
            java.lang.String r8 = "no frame position"
            android.util.Log.e(r3, r8)
        Lf9:
            return
    }
}
