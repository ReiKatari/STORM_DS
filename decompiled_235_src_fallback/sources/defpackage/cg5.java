package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cg5  reason: default package */
/* loaded from: classes.dex */
public abstract class cg5 {
    public defpackage.uf5 a;
    public java.util.ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(defpackage.wg5 r2) {
            int r0 = r2.j
            boolean r1 = r2.f()
            if (r1 == 0) goto L9
            goto L15
        L9:
            r0 = r0 & 4
            if (r0 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r2.r
            if (r0 != 0) goto L12
            goto L15
        L12:
            r0.K(r2)
        L15:
            return
    }

    public abstract boolean a(defpackage.wg5 r1, defpackage.wg5 r2, defpackage.dy7 r3, defpackage.dy7 r4);

    public final void c(defpackage.wg5 r10) {
            r9 = this;
            uf5 r9 = r9.a
            if (r9 == 0) goto Lb0
            androidx.recyclerview.widget.RecyclerView r9 = r9.A
            r0 = 1
            r10.n(r0)
            android.view.View r1 = r10.a
            wg5 r2 = r10.h
            r3 = 0
            if (r2 == 0) goto L17
            wg5 r2 = r10.i
            if (r2 != 0) goto L17
            r10.h = r3
        L17:
            r10.i = r3
            int r2 = r10.j
            r2 = r2 & 16
            if (r2 == 0) goto L21
            goto Lb0
        L21:
            mg5 r2 = r9.L
            r9.l0()
            dk0 r3 = r9.e0
            java.lang.Object r4 = r3.X
            kk r4 = (defpackage.kk) r4
            java.lang.Object r5 = r3.R
            uf5 r5 = (defpackage.uf5) r5
            int r6 = r3.L
            r7 = 0
            if (r6 != r0) goto L43
            java.lang.Object r0 = r3.Y
            android.view.View r0 = (android.view.View) r0
            if (r0 != r1) goto L3d
        L3b:
            r0 = r7
            goto L6c
        L3d:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            defpackage.i.m(r9)
            return
        L43:
            r8 = 2
            if (r6 == r8) goto Lab
            r3.L = r8     // Catch: java.lang.Throwable -> L57
            androidx.recyclerview.widget.RecyclerView r6 = r5.A     // Catch: java.lang.Throwable -> L57
            int r6 = r6.indexOfChild(r1)     // Catch: java.lang.Throwable -> L57
            r8 = -1
            if (r6 != r8) goto L59
            r3.z(r1)     // Catch: java.lang.Throwable -> L57
        L54:
            r3.L = r7
            goto L6c
        L57:
            r9 = move-exception
            goto La8
        L59:
            boolean r8 = r4.d(r6)     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L69
            r4.h(r6)     // Catch: java.lang.Throwable -> L57
            r3.z(r1)     // Catch: java.lang.Throwable -> L57
            r5.j(r6)     // Catch: java.lang.Throwable -> L57
            goto L54
        L69:
            r3.L = r7
            goto L3b
        L6c:
            if (r0 == 0) goto L97
            wg5 r3 = androidx.recyclerview.widget.RecyclerView.N(r1)
            r2.p(r3)
            r2.m(r3)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.z1
            if (r2 == 0) goto L97
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L97:
            r2 = r0 ^ 1
            r9.n0(r2)
            if (r0 != 0) goto Lb0
            boolean r10 = r10.j()
            if (r10 == 0) goto Lb0
            r9.removeDetachedView(r1, r7)
            return
        La8:
            r3.L = r7
            throw r9
        Lab:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            defpackage.i.m(r9)
        Lb0:
            return
    }

    public abstract void d(defpackage.wg5 r1);

    public abstract void e();

    public abstract boolean f();
}
