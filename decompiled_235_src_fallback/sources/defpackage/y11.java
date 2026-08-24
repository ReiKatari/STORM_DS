package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y11  reason: default package */
/* loaded from: classes.dex */
public final class y11 {
    public static final android.util.SparseIntArray o = null;
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public float n;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            defpackage.y11.o = r0
            r1 = 6
            r2 = 1
            r0.append(r1, r2)
            r3 = 7
            r4 = 2
            r0.append(r3, r4)
            r5 = 8
            r6 = 3
            r0.append(r5, r6)
            r7 = 4
            r0.append(r7, r7)
            r7 = 5
            r0.append(r7, r7)
            r7 = 0
            r0.append(r7, r1)
            r0.append(r2, r3)
            r0.append(r4, r5)
            r1 = 9
            r0.append(r6, r1)
            r2 = 10
            r0.append(r1, r2)
            r1 = 11
            r0.append(r2, r1)
            r2 = 12
            r0.append(r1, r2)
            return
    }

    public final void a(defpackage.y11 r2) {
            r1 = this;
            boolean r0 = r2.a
            r1.a = r0
            float r0 = r2.b
            r1.b = r0
            float r0 = r2.c
            r1.c = r0
            float r0 = r2.d
            r1.d = r0
            float r0 = r2.e
            r1.e = r0
            float r0 = r2.f
            r1.f = r0
            float r0 = r2.g
            r1.g = r0
            float r0 = r2.h
            r1.h = r0
            int r0 = r2.i
            r1.i = r0
            float r0 = r2.j
            r1.j = r0
            float r0 = r2.k
            r1.k = r0
            float r0 = r2.l
            r1.l = r0
            boolean r0 = r2.m
            r1.m = r0
            float r2 = r2.n
            r1.n = r2
            return
    }

    public final void b(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            int[] r0 = defpackage.e75.s
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
            r6 = 1
            r4.a = r6
            int r0 = r5.getIndexCount()
            r1 = 0
        Le:
            if (r1 >= r0) goto L90
            int r2 = r5.getIndex(r1)
            android.util.SparseIntArray r3 = defpackage.y11.o
            int r3 = r3.get(r2)
            switch(r3) {
                case 1: goto L84;
                case 2: goto L7b;
                case 3: goto L72;
                case 4: goto L69;
                case 5: goto L60;
                case 6: goto L57;
                case 7: goto L4e;
                case 8: goto L45;
                case 9: goto L3c;
                case 10: goto L33;
                case 11: goto L28;
                case 12: goto L1f;
                default: goto L1d;
            }
        L1d:
            goto L8c
        L1f:
            int r3 = r4.i
            int r2 = defpackage.z11.l(r5, r2, r3)
            r4.i = r2
            goto L8c
        L28:
            r4.m = r6
            float r3 = r4.n
            float r2 = r5.getDimension(r2, r3)
            r4.n = r2
            goto L8c
        L33:
            float r3 = r4.l
            float r2 = r5.getDimension(r2, r3)
            r4.l = r2
            goto L8c
        L3c:
            float r3 = r4.k
            float r2 = r5.getDimension(r2, r3)
            r4.k = r2
            goto L8c
        L45:
            float r3 = r4.j
            float r2 = r5.getDimension(r2, r3)
            r4.j = r2
            goto L8c
        L4e:
            float r3 = r4.h
            float r2 = r5.getDimension(r2, r3)
            r4.h = r2
            goto L8c
        L57:
            float r3 = r4.g
            float r2 = r5.getDimension(r2, r3)
            r4.g = r2
            goto L8c
        L60:
            float r3 = r4.f
            float r2 = r5.getFloat(r2, r3)
            r4.f = r2
            goto L8c
        L69:
            float r3 = r4.e
            float r2 = r5.getFloat(r2, r3)
            r4.e = r2
            goto L8c
        L72:
            float r3 = r4.d
            float r2 = r5.getFloat(r2, r3)
            r4.d = r2
            goto L8c
        L7b:
            float r3 = r4.c
            float r2 = r5.getFloat(r2, r3)
            r4.c = r2
            goto L8c
        L84:
            float r3 = r4.b
            float r2 = r5.getFloat(r2, r3)
            r4.b = r2
        L8c:
            int r1 = r1 + 1
            goto Le
        L90:
            r5.recycle()
            return
    }
}
