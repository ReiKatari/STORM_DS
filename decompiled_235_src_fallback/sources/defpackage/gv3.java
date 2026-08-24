package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gv3  reason: default package */
/* loaded from: classes.dex */
public final class gv3 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public java.util.List k;
    public boolean l;

    public final void a(android.view.View r8) {
            r7 = this;
            java.util.List r0 = r7.k
            int r0 = r0.size()
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
        Lb:
            if (r3 >= r0) goto L41
            java.util.List r4 = r7.k
            java.lang.Object r4 = r4.get(r3)
            wg5 r4 = (defpackage.wg5) r4
            android.view.View r4 = r4.a
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            hg5 r5 = (defpackage.hg5) r5
            if (r4 == r8) goto L3e
            wg5 r6 = r5.a
            boolean r6 = r6.h()
            if (r6 == 0) goto L28
            goto L3e
        L28:
            wg5 r5 = r5.a
            int r5 = r5.b()
            int r6 = r7.d
            int r5 = r5 - r6
            int r6 = r7.e
            int r5 = r5 * r6
            if (r5 >= 0) goto L37
            goto L3e
        L37:
            if (r5 >= r2) goto L3e
            r1 = r4
            if (r5 != 0) goto L3d
            goto L41
        L3d:
            r2 = r5
        L3e:
            int r3 = r3 + 1
            goto Lb
        L41:
            if (r1 != 0) goto L47
            r8 = -1
            r7.d = r8
            return
        L47:
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            hg5 r8 = (defpackage.hg5) r8
            wg5 r8 = r8.a
            int r8 = r8.b()
            r7.d = r8
            return
    }

    public final android.view.View b(defpackage.mg5 r5) {
            r4 = this;
            java.util.List r0 = r4.k
            if (r0 == 0) goto L37
            int r5 = r0.size()
            r0 = 0
        L9:
            if (r0 >= r5) goto L35
            java.util.List r1 = r4.k
            java.lang.Object r1 = r1.get(r0)
            wg5 r1 = (defpackage.wg5) r1
            android.view.View r1 = r1.a
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            wg5 r3 = r2.a
            boolean r3 = r3.h()
            if (r3 == 0) goto L24
            goto L32
        L24:
            int r3 = r4.d
            wg5 r2 = r2.a
            int r2 = r2.b()
            if (r3 != r2) goto L32
            r4.a(r1)
            return r1
        L32:
            int r0 = r0 + 1
            goto L9
        L35:
            r4 = 0
            return r4
        L37:
            int r0 = r4.d
            android.view.View r5 = r5.e(r0)
            int r0 = r4.d
            int r1 = r4.e
            int r0 = r0 + r1
            r4.d = r0
            return r5
    }
}
