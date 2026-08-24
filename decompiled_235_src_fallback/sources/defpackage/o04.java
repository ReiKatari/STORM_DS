package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o04  reason: default package */
/* loaded from: classes.dex */
public abstract class o04 {
    public int A;
    public int B;
    public int L;
    public java.lang.Object R;

    public o04() {
            r0 = this;
            r0.<init>()
            yj7 r0 = defpackage.yj7.a
            if (r0 != 0) goto Le
            yj7 r0 = new yj7
            r0.<init>()
            defpackage.yj7.a = r0
        Le:
            return
    }

    public int a(int r2) {
            r1 = this;
            int r0 = r1.L
            if (r2 >= r0) goto L10
            java.lang.Object r0 = r1.R
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r1 = r1.B
            int r1 = r1 + r2
            short r1 = r0.getShort(r1)
            return r1
        L10:
            r1 = 0
            return r1
    }

    public void b() {
            r1 = this;
            java.lang.Object r0 = r1.R
            p04 r0 = (defpackage.p04) r0
            int r0 = r0.d0
            int r1 = r1.L
            if (r0 != r1) goto Lb
            return
        Lb:
            defpackage.i.l()
            return
    }

    public abstract java.lang.Object c(android.view.View r1);

    public abstract void d(android.view.View r1, java.lang.Object r2);

    public void e() {
            r3 = this;
        L0:
            int r0 = r3.A
            java.lang.Object r1 = r3.R
            p04 r1 = (defpackage.p04) r1
            int r2 = r1.Y
            if (r0 >= r2) goto L15
            int[] r1 = r1.L
            r1 = r1[r0]
            if (r1 >= 0) goto L15
            int r0 = r0 + 1
            r3.A = r0
            goto L0
        L15:
            return
    }

    public void f(android.view.View r4, java.lang.Object r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r3.B
            if (r0 < r1) goto La
            r3.d(r4, r5)
            return
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r3.B
            r2 = 0
            if (r0 < r1) goto L16
            java.lang.Object r0 = r3.c(r4)
            goto L28
        L16:
            int r0 = r3.A
            java.lang.Object r0 = r4.getTag(r0)
            java.lang.Object r1 = r3.R
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r0)
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = r2
        L28:
            boolean r0 = r3.g(r0, r5)
            if (r0 == 0) goto L57
            android.view.View$AccessibilityDelegate r0 = defpackage.ao7.e(r4)
            if (r0 != 0) goto L35
            goto L43
        L35:
            boolean r1 = r0 instanceof defpackage.a2
            if (r1 == 0) goto L3e
            a2 r0 = (defpackage.a2) r0
            b2 r2 = r0.a
            goto L43
        L3e:
            b2 r2 = new b2
            r2.<init>(r0)
        L43:
            if (r2 != 0) goto L4a
            b2 r2 = new b2
            r2.<init>()
        L4a:
            defpackage.ao7.n(r4, r2)
            int r0 = r3.A
            r4.setTag(r0, r5)
            int r3 = r3.L
            defpackage.ao7.i(r4, r3)
        L57:
            return
    }

    public abstract boolean g(java.lang.Object r1, java.lang.Object r2);

    public boolean hasNext() {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.R
            p04 r1 = (defpackage.p04) r1
            int r1 = r1.Y
            if (r0 >= r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public void remove() {
            r3 = this;
            java.lang.Object r0 = r3.R
            p04 r0 = (defpackage.p04) r0
            r3.b()
            int r1 = r3.B
            r2 = -1
            if (r1 == r2) goto L1b
            r0.c()
            int r1 = r3.B
            r0.k(r1)
            r3.B = r2
            int r0 = r0.d0
            r3.L = r0
            return
        L1b:
            java.lang.String r3 = "Call next() before removing element from the iterator."
            defpackage.i.m(r3)
            return
    }
}
