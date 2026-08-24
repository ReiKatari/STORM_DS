package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z28  reason: default package */
/* loaded from: classes.dex */
public final class z28 implements java.util.Iterator {
    public java.lang.String A;
    public int B;
    public final java.lang.String L;
    public final boolean R;
    public int X;
    public int Y;
    public final /* synthetic */ defpackage.j97 Z;

    public z28(defpackage.j97 r1, defpackage.g60 r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.Z = r1
            r1 = 2
            r0.B = r1
            r1 = 0
            r0.X = r1
            boolean r1 = r2.A
            r0.R = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.Y = r1
            r0.L = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r11 = this;
            int r0 = r11.B
            r1 = 0
            r2 = 4
            if (r0 == r2) goto L97
            int r3 = r0 + (-1)
            r4 = 0
            if (r0 == 0) goto L96
            r0 = 1
            if (r3 == 0) goto L95
            r5 = 2
            if (r3 == r5) goto L94
            r11.B = r2
            int r2 = r11.X
        L15:
            int r3 = r11.X
            r5 = 3
            r6 = -1
            if (r3 == r6) goto L89
            java.lang.String r7 = r11.L
            int r8 = r7.length()
            defpackage.su7.c(r3, r8)
        L24:
            if (r3 >= r8) goto L38
            char r9 = r7.charAt(r3)
            j97 r10 = r11.Z
            java.lang.Object r10 = r10.B
            y28 r10 = (defpackage.y28) r10
            char r10 = r10.a
            if (r9 != r10) goto L35
            goto L39
        L35:
            int r3 = r3 + 1
            goto L24
        L38:
            r3 = r6
        L39:
            if (r3 != r6) goto L43
            int r3 = r7.length()
            r11.X = r6
            r8 = r6
            goto L47
        L43:
            int r8 = r3 + 1
            r11.X = r8
        L47:
            if (r8 != r2) goto L56
            int r8 = r8 + 1
            r11.X = r8
            int r3 = r7.length()
            if (r8 <= r3) goto L15
            r11.X = r6
            goto L15
        L56:
            if (r2 >= r3) goto L5b
            r7.charAt(r2)
        L5b:
            if (r2 >= r3) goto L62
            int r8 = r3 + (-1)
            r7.charAt(r8)
        L62:
            boolean r8 = r11.R
            if (r8 == 0) goto L6b
            if (r2 != r3) goto L6b
            int r2 = r11.X
            goto L15
        L6b:
            int r4 = r11.Y
            if (r4 != r0) goto L7d
            int r3 = r7.length()
            r11.X = r6
            if (r3 <= r2) goto L80
            int r4 = r3 + (-1)
            r7.charAt(r4)
            goto L80
        L7d:
            int r4 = r4 + r6
            r11.Y = r4
        L80:
            java.lang.CharSequence r2 = r7.subSequence(r2, r3)
            java.lang.String r4 = r2.toString()
            goto L8b
        L89:
            r11.B = r5
        L8b:
            r11.A = r4
            int r2 = r11.B
            if (r2 == r5) goto L94
            r11.B = r0
            return r0
        L94:
            return r1
        L95:
            return r0
        L96:
            throw r4
        L97:
            defpackage.e41.m()
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            r0 = 2
            r2.B = r0
            java.lang.String r0 = r2.A
            r1 = 0
            r2.A = r1
            return r0
        Lf:
            defpackage.fa6.c()
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
