package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh1  reason: default package */
/* loaded from: classes.dex */
public final class kh1 implements java.util.Iterator, defpackage.zf3 {
    public int A;
    public int B;
    public int L;
    public defpackage.l93 R;
    public int X;
    public final /* synthetic */ defpackage.lh1 Y;

    public kh1(defpackage.lh1 r2) {
            r1 = this;
            r1.<init>()
            r1.Y = r2
            r0 = -1
            r1.A = r0
            java.lang.CharSequence r2 = r2.a
            int r2 = r2.length()
            r0 = 0
            int r2 = defpackage.gi2.q(r0, r0, r2)
            r1.B = r2
            r1.L = r2
            return
    }

    public final void a() {
            r8 = this;
            lh1 r0 = r8.Y
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.L
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.A = r3
            r0 = 0
            r8.R = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.X
            int r7 = r7 + r6
            r8.X = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            l93 r0 = new l93
            int r2 = r8.B
            int r1 = defpackage.qs6.o0(r1)
            r0.<init>(r2, r1, r6)
            r8.R = r0
            r8.L = r5
            goto L73
        L32:
            eo2 r0 = r0.c
            int r2 = r8.L
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.o(r1, r2)
            vr4 r0 = (defpackage.vr4) r0
            if (r0 != 0) goto L52
            l93 r0 = new l93
            int r2 = r8.B
            int r1 = defpackage.qs6.o0(r1)
            r0.<init>(r2, r1, r6)
            r8.R = r0
            r8.L = r5
            goto L73
        L52:
            java.lang.Object r1 = r0.A
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.B
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.B
            l93 r2 = defpackage.gi2.R(r2, r1)
            r8.R = r2
            int r1 = r1 + r0
            r8.B = r1
            if (r0 != 0) goto L70
            r3 = r6
        L70:
            int r1 = r1 + r3
            r8.L = r1
        L73:
            r8.A = r6
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.A
            r1 = -1
            if (r0 != r1) goto L8
            r2.a()
        L8:
            int r2 = r2.A
            r0 = 1
            if (r2 != r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.A
            r1 = -1
            if (r0 != r1) goto L8
            r3.a()
        L8:
            int r0 = r3.A
            r2 = 0
            if (r0 == 0) goto L17
            l93 r0 = r3.R
            r0.getClass()
            r3.R = r2
            r3.A = r1
            return r0
        L17:
            defpackage.fa6.c()
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
