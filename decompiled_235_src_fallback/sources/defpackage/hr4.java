package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr4  reason: default package */
/* loaded from: classes.dex */
public final class hr4 extends defpackage.ig5 {
    public androidx.recyclerview.widget.RecyclerView a;
    public final defpackage.ul6 b;
    public defpackage.mo4 c;
    public defpackage.mo4 d;

    public hr4() {
            r1 = this;
            r1.<init>()
            ul6 r0 = new ul6
            r0.<init>(r1)
            r1.b = r0
            return
    }

    public static int b(android.view.View r1, defpackage.ts1 r2) {
            int r0 = r2.g(r1)
            int r1 = r2.e(r1)
            int r1 = r1 / 2
            int r1 = r1 + r0
            int r0 = r2.m()
            int r2 = r2.n()
            int r2 = r2 / 2
            int r2 = r2 + r0
            int r1 = r1 - r2
            return r1
    }

    public static android.view.View c(defpackage.gg5 r8, defpackage.ts1 r9) {
            int r0 = r8.v()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r9.m()
            int r3 = r9.n()
            int r3 = r3 / 2
            int r3 = r3 + r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
        L17:
            if (r4 >= r0) goto L34
            android.view.View r5 = r8.u(r4)
            int r6 = r9.g(r5)
            int r7 = r9.e(r5)
            int r7 = r7 / 2
            int r7 = r7 + r6
            int r7 = r7 - r3
            int r6 = java.lang.Math.abs(r7)
            if (r6 >= r2) goto L31
            r1 = r5
            r2 = r6
        L31:
            int r4 = r4 + 1
            goto L17
        L34:
            return r1
    }

    public final int[] a(defpackage.gg5 r5, android.view.View r6) {
            r4 = this;
            r0 = 2
            int[] r0 = new int[r0]
            boolean r1 = r5.d()
            r2 = 0
            if (r1 == 0) goto L15
            ts1 r1 = r4.d(r5)
            int r1 = b(r6, r1)
            r0[r2] = r1
            goto L17
        L15:
            r0[r2] = r2
        L17:
            boolean r1 = r5.e()
            r3 = 1
            if (r1 == 0) goto L29
            ts1 r4 = r4.e(r5)
            int r4 = b(r6, r4)
            r0[r3] = r4
            return r0
        L29:
            r0[r3] = r2
            return r0
    }

    public final defpackage.ts1 d(defpackage.gg5 r3) {
            r2 = this;
            mo4 r0 = r2.d
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.b
            gg5 r0 = (defpackage.gg5) r0
            if (r0 == r3) goto L12
        La:
            mo4 r0 = new mo4
            r1 = 0
            r0.<init>(r3, r1)
            r2.d = r0
        L12:
            mo4 r2 = r2.d
            return r2
    }

    public final defpackage.ts1 e(defpackage.gg5 r3) {
            r2 = this;
            mo4 r0 = r2.c
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.b
            gg5 r0 = (defpackage.gg5) r0
            if (r0 == r3) goto L12
        La:
            mo4 r0 = new mo4
            r1 = 1
            r0.<init>(r3, r1)
            r2.c = r0
        L12:
            mo4 r2 = r2.c
            return r2
    }

    public final void f() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.a
            if (r0 != 0) goto L5
            goto L3d
        L5:
            gg5 r0 = r0.getLayoutManager()
            if (r0 != 0) goto Lc
            goto L3d
        Lc:
            boolean r1 = r0.e()
            if (r1 == 0) goto L1b
            ts1 r1 = r5.e(r0)
            android.view.View r1 = c(r0, r1)
            goto L2b
        L1b:
            boolean r1 = r0.d()
            if (r1 == 0) goto L2a
            ts1 r1 = r5.d(r0)
            android.view.View r1 = c(r0, r1)
            goto L2b
        L2a:
            r1 = 0
        L2b:
            if (r1 != 0) goto L2e
            goto L3d
        L2e:
            int[] r0 = r5.a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L3e
            r4 = r0[r3]
            if (r4 == 0) goto L3d
            goto L3e
        L3d:
            return
        L3e:
            androidx.recyclerview.widget.RecyclerView r5 = r5.a
            r0 = r0[r3]
            r5.j0(r2, r1, r0)
            return
    }
}
