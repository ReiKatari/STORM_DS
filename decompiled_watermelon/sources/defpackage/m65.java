package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m65  reason: default package */
/* loaded from: classes.dex */
public abstract class m65 {
    public e65 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(g75 g75Var) {
        RecyclerView recyclerView;
        int i = g75Var.j;
        if (!g75Var.f() && (i & 4) == 0 && (recyclerView = g75Var.r) != null) {
            recyclerView.K(g75Var);
        }
    }

    public abstract boolean a(g75 g75Var, g75 g75Var2, hj7 hj7Var, hj7 hj7Var2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.g75 r10) {
        /*
            r9 = this;
            e65 r9 = r9.a
            if (r9 == 0) goto Lb0
            androidx.recyclerview.widget.RecyclerView r9 = r9.A
            r0 = 1
            r10.n(r0)
            android.view.View r1 = r10.a
            g75 r2 = r10.h
            r3 = 0
            if (r2 == 0) goto L17
            g75 r2 = r10.i
            if (r2 != 0) goto L17
            r10.h = r3
        L17:
            r10.i = r3
            int r2 = r10.j
            r2 = r2 & 16
            if (r2 == 0) goto L21
            goto Lb0
        L21:
            w65 r2 = r9.L
            r9.l0()
            vh0 r3 = r9.d0
            java.lang.Object r4 = r3.e
            yj r4 = (defpackage.yj) r4
            java.lang.Object r5 = r3.d
            e65 r5 = (defpackage.e65) r5
            int r6 = r3.c
            r7 = 0
            if (r6 != r0) goto L43
            java.lang.Object r0 = r3.f
            android.view.View r0 = (android.view.View) r0
            if (r0 != r1) goto L3d
        L3b:
            r0 = r7
            goto L6c
        L3d:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            defpackage.i.n(r9)
            return
        L43:
            r8 = 2
            if (r6 == r8) goto Lab
            r3.c = r8     // Catch: java.lang.Throwable -> L57
            androidx.recyclerview.widget.RecyclerView r6 = r5.A     // Catch: java.lang.Throwable -> L57
            int r6 = r6.indexOfChild(r1)     // Catch: java.lang.Throwable -> L57
            r8 = -1
            if (r6 != r8) goto L59
            r3.w(r1)     // Catch: java.lang.Throwable -> L57
        L54:
            r3.c = r7
            goto L6c
        L57:
            r9 = move-exception
            goto La8
        L59:
            boolean r8 = r4.d(r6)     // Catch: java.lang.Throwable -> L57
            if (r8 == 0) goto L69
            r4.h(r6)     // Catch: java.lang.Throwable -> L57
            r3.w(r1)     // Catch: java.lang.Throwable -> L57
            r5.i(r6)     // Catch: java.lang.Throwable -> L57
            goto L54
        L69:
            r3.c = r7
            goto L3b
        L6c:
            if (r0 == 0) goto L97
            g75 r3 = androidx.recyclerview.widget.RecyclerView.N(r1)
            r2.p(r3)
            r2.m(r3)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.y1
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
            r3.c = r7
            throw r9
        Lab:
            java.lang.String r9 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            defpackage.i.n(r9)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m65.c(g75):void");
    }

    public abstract void d(g75 g75Var);

    public abstract void e();

    public abstract boolean f();
}
