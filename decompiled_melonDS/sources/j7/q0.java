package j7;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q0 {

    /* renamed from: a  reason: collision with root package name */
    public i0 f7650a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f7651b;

    /* renamed from: c  reason: collision with root package name */
    public long f7652c;

    /* renamed from: d  reason: collision with root package name */
    public long f7653d;

    /* renamed from: e  reason: collision with root package name */
    public long f7654e;

    /* renamed from: f  reason: collision with root package name */
    public long f7655f;

    public static void b(j1 j1Var) {
        RecyclerView recyclerView;
        int i2 = j1Var.f7603j;
        if (!j1Var.f() && (i2 & 4) == 0 && (recyclerView = j1Var.f7610r) != null) {
            recyclerView.J(j1Var);
        }
    }

    public abstract boolean a(j1 j1Var, j1 j1Var2, a6.u uVar, a6.u uVar2);

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(j7.j1 r11) {
        /*
            r10 = this;
            j7.i0 r0 = r10.f7650a
            if (r0 == 0) goto Lb0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            r1 = 1
            r11.n(r1)
            android.view.View r2 = r11.f7594a
            j7.j1 r3 = r11.f7601h
            r4 = 0
            if (r3 == 0) goto L17
            j7.j1 r3 = r11.f7602i
            if (r3 != 0) goto L17
            r11.f7601h = r4
        L17:
            r11.f7602i = r4
            int r3 = r11.f7603j
            r3 = r3 & 16
            if (r3 == 0) goto L21
            goto Lb0
        L21:
            c1.h2 r3 = r0.L
            r0.l0()
            d5.j r4 = r0.f1624c0
            java.lang.Object r5 = r4.f3862d
            h1.c3 r5 = (h1.c3) r5
            java.lang.Object r6 = r4.f3861c
            j7.i0 r6 = (j7.i0) r6
            int r7 = r4.f3860b
            r8 = 0
            if (r7 != r1) goto L43
            java.lang.Object r1 = r4.f3864f
            android.view.View r1 = (android.view.View) r1
            if (r1 != r2) goto L3d
        L3b:
            r1 = r8
            goto L6c
        L3d:
            java.lang.String r11 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            a0.j.p(r11)
            return
        L43:
            r9 = 2
            if (r7 == r9) goto Lab
            r4.f3860b = r9     // Catch: java.lang.Throwable -> L57
            androidx.recyclerview.widget.RecyclerView r7 = r6.A     // Catch: java.lang.Throwable -> L57
            int r7 = r7.indexOfChild(r2)     // Catch: java.lang.Throwable -> L57
            r9 = -1
            if (r7 != r9) goto L59
            r4.s(r2)     // Catch: java.lang.Throwable -> L57
        L54:
            r4.f3860b = r8
            goto L6c
        L57:
            r11 = move-exception
            goto La8
        L59:
            boolean r9 = r5.e(r7)     // Catch: java.lang.Throwable -> L57
            if (r9 == 0) goto L69
            r5.h(r7)     // Catch: java.lang.Throwable -> L57
            r4.s(r2)     // Catch: java.lang.Throwable -> L57
            r6.h(r7)     // Catch: java.lang.Throwable -> L57
            goto L54
        L69:
            r4.f3860b = r8
            goto L3b
        L6c:
            if (r1 == 0) goto L97
            j7.j1 r4 = androidx.recyclerview.widget.RecyclerView.M(r2)
            r3.p(r4)
            r3.m(r4)
            boolean r3 = androidx.recyclerview.widget.RecyclerView.f1617w1
            if (r3 == 0) goto L97
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "after removing animated view: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "RecyclerView"
            android.util.Log.d(r4, r3)
        L97:
            r3 = r1 ^ 1
            r0.n0(r3)
            if (r1 != 0) goto Lb0
            boolean r11 = r11.j()
            if (r11 == 0) goto Lb0
            r0.removeDetachedView(r2, r8)
            return
        La8:
            r4.f3860b = r8
            throw r11
        Lab:
            java.lang.String r11 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            a0.j.p(r11)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.q0.c(j7.j1):void");
    }

    public abstract void d(j1 j1Var);

    public abstract void e();

    public abstract boolean f();
}
