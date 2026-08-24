package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b84  reason: default package */
/* loaded from: classes.dex */
public final class b84 {
    public final int a;
    public final boolean b;
    public int c;
    public int d;
    public int e;
    public java.lang.String f;
    public int g;
    public int h;
    public final float i;
    public final androidx.constraintlayout.motion.widget.b j;
    public final java.util.ArrayList k;
    public androidx.constraintlayout.motion.widget.c l;
    public final java.util.ArrayList m;
    public final int n;
    public final boolean o;
    public int p;
    public final int q;
    public final int r;

    public b84(androidx.constraintlayout.motion.widget.b r5, int r6) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.a = r0
            r1 = 0
            r4.b = r1
            r4.c = r0
            r4.d = r0
            r4.e = r1
            r2 = 0
            r4.f = r2
            r4.g = r0
            r3 = 400(0x190, float:5.6E-43)
            r4.h = r3
            r3 = 0
            r4.i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.k = r3
            r4.l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.m = r2
            r4.n = r1
            r4.o = r1
            r4.p = r0
            r4.q = r1
            r4.r = r1
            r4.a = r0
            r4.j = r5
            r0 = 2131428073(0x7f0b02e9, float:1.847778E38)
            r4.d = r0
            r4.c = r6
            int r6 = r5.j
            r4.h = r6
            int r5 = r5.k
            r4.q = r5
            return
    }

    public b84(androidx.constraintlayout.motion.widget.b r11, android.content.Context r12, android.content.res.XmlResourceParser r13) {
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.a = r0
            r1 = 0
            r10.b = r1
            r10.c = r0
            r10.d = r0
            r10.e = r1
            r2 = 0
            r10.f = r2
            r10.g = r0
            r3 = 400(0x190, float:5.6E-43)
            r10.h = r3
            r3 = 0
            r10.i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.k = r3
            r10.l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r10.m = r2
            r10.n = r1
            r10.o = r1
            r10.p = r0
            r10.r = r1
            int r2 = r11.j
            android.util.SparseArray r3 = r11.g
            r10.h = r2
            int r2 = r11.k
            r10.q = r2
            r10.j = r11
            android.util.AttributeSet r13 = android.util.Xml.asAttributeSet(r13)
            int[] r2 = defpackage.e75.t
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r2)
            int r2 = r13.getIndexCount()
            r4 = r1
        L4e:
            r5 = 1
            if (r4 >= r2) goto L172
            int r6 = r13.getIndex(r4)
            r7 = 2
            java.lang.String r8 = "xml"
            java.lang.String r9 = "layout"
            if (r6 != r7) goto L93
            int r5 = r13.getResourceId(r6, r0)
            r10.c = r5
            android.content.res.Resources r5 = r12.getResources()
            int r6 = r10.c
            java.lang.String r5 = r5.getResourceTypeName(r6)
            boolean r6 = r9.equals(r5)
            if (r6 == 0) goto L83
            z11 r5 = new z11
            r5.<init>()
            int r6 = r10.c
            r5.j(r12, r6)
            int r6 = r10.c
            r3.append(r6, r5)
            goto L16e
        L83:
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L16e
            int r5 = r10.c
            int r5 = r11.i(r12, r5)
            r10.c = r5
            goto L16e
        L93:
            r7 = 3
            if (r6 != r7) goto Lcf
            int r5 = r10.d
            int r5 = r13.getResourceId(r6, r5)
            r10.d = r5
            android.content.res.Resources r5 = r12.getResources()
            int r6 = r10.d
            java.lang.String r5 = r5.getResourceTypeName(r6)
            boolean r6 = r9.equals(r5)
            if (r6 == 0) goto Lbf
            z11 r5 = new z11
            r5.<init>()
            int r6 = r10.d
            r5.j(r12, r6)
            int r6 = r10.d
            r3.append(r6, r5)
            goto L16e
        Lbf:
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L16e
            int r5 = r10.d
            int r5 = r11.i(r12, r5)
            r10.d = r5
            goto L16e
        Lcf:
            r8 = 6
            if (r6 != r8) goto L110
            android.util.TypedValue r8 = r13.peekValue(r6)
            int r8 = r8.type
            r9 = -2
            if (r8 != r5) goto Le7
            int r5 = r13.getResourceId(r6, r0)
            r10.g = r5
            if (r5 == r0) goto L16e
            r10.e = r9
            goto L16e
        Le7:
            if (r8 != r7) goto L107
            java.lang.String r5 = r13.getString(r6)
            r10.f = r5
            if (r5 == 0) goto L16e
            java.lang.String r7 = "/"
            int r5 = r5.indexOf(r7)
            if (r5 <= 0) goto L103
            int r5 = r13.getResourceId(r6, r0)
            r10.g = r5
            r10.e = r9
            goto L16e
        L103:
            r10.e = r0
            goto L16e
        L107:
            int r5 = r10.e
            int r5 = r13.getInteger(r6, r5)
            r10.e = r5
            goto L16e
        L110:
            r7 = 4
            r8 = 8
            if (r6 != r7) goto L122
            int r5 = r10.h
            int r5 = r13.getInt(r6, r5)
            r10.h = r5
            if (r5 >= r8) goto L16e
            r10.h = r8
            goto L16e
        L122:
            if (r6 != r8) goto L12d
            float r5 = r10.i
            float r5 = r13.getFloat(r6, r5)
            r10.i = r5
            goto L16e
        L12d:
            if (r6 != r5) goto L138
            int r5 = r10.n
            int r5 = r13.getInteger(r6, r5)
            r10.n = r5
            goto L16e
        L138:
            if (r6 != 0) goto L143
            int r5 = r10.a
            int r5 = r13.getResourceId(r6, r5)
            r10.a = r5
            goto L16e
        L143:
            r5 = 9
            if (r6 != r5) goto L150
            boolean r5 = r10.o
            boolean r5 = r13.getBoolean(r6, r5)
            r10.o = r5
            goto L16e
        L150:
            r5 = 7
            if (r6 != r5) goto L15a
            int r5 = r13.getInteger(r6, r0)
            r10.p = r5
            goto L16e
        L15a:
            r5 = 5
            if (r6 != r5) goto L164
            int r5 = r13.getInteger(r6, r1)
            r10.q = r5
            goto L16e
        L164:
            r5 = 10
            if (r6 != r5) goto L16e
            int r5 = r13.getInteger(r6, r1)
            r10.r = r5
        L16e:
            int r4 = r4 + 1
            goto L4e
        L172:
            int r11 = r10.d
            if (r11 != r0) goto L178
            r10.b = r5
        L178:
            r13.recycle()
            return
    }

    public b84(androidx.constraintlayout.motion.widget.b r5, defpackage.b84 r6) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.a = r0
            r1 = 0
            r4.b = r1
            r4.c = r0
            r4.d = r0
            r4.e = r1
            r2 = 0
            r4.f = r2
            r4.g = r0
            r3 = 400(0x190, float:5.6E-43)
            r4.h = r3
            r3 = 0
            r4.i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4.k = r3
            r4.l = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.m = r2
            r4.n = r1
            r4.o = r1
            r4.p = r0
            r4.q = r1
            r4.r = r1
            r4.j = r5
            int r5 = r5.j
            r4.h = r5
            if (r6 == 0) goto L5d
            int r5 = r6.p
            r4.p = r5
            int r5 = r6.e
            r4.e = r5
            java.lang.String r5 = r6.f
            r4.f = r5
            int r5 = r6.g
            r4.g = r5
            int r5 = r6.h
            r4.h = r5
            java.util.ArrayList r5 = r6.k
            r4.k = r5
            float r5 = r6.i
            r4.i = r5
            int r5 = r6.q
            r4.q = r5
        L5d:
            return
    }
}
