package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j40  reason: default package */
/* loaded from: classes.dex */
public final class j40 extends yf2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ w11 f;

    public /* synthetic */ j40(w11 w11Var, int i) {
        this.e = i;
        this.f = w11Var;
    }

    @Override // defpackage.yf2
    public final void M(int i) {
        int i2 = this.e;
        w11 w11Var = this.f;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) w11Var;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) w11Var;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.yf2
    public final void N(View view, int i, int i2) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.e;
        w11 w11Var = this.f;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) w11Var).u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) w11Var;
                WeakReference weakReference = sideSheetBehavior.q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.u0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.a.i(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw b31.m(it);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r6.a.T(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        if (java.lang.Math.abs(r8 - r6.a.A()) < java.lang.Math.abs(r8 - r6.a.B())) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r8 > r6.E) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c9, code lost:
        if (java.lang.Math.abs(r7.getTop() - r6.x()) < java.lang.Math.abs(r7.getTop() - r6.E)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
        if (java.lang.Math.abs(r8 - r6.E) < java.lang.Math.abs(r8 - r6.G)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0115, code lost:
        if (java.lang.Math.abs(r8 - r6.D) < java.lang.Math.abs(r8 - r6.G)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0124, code lost:
        if (r8 < java.lang.Math.abs(r8 - r6.G)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0134, code lost:
        if (java.lang.Math.abs(r8 - r9) < java.lang.Math.abs(r8 - r6.G)) goto L27;
     */
    @Override // defpackage.yf2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(android.view.View r7, float r8, float r9) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j40.O(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0043, code lost:
        if (r6.canScrollVertically(-1) != false) goto L33;
     */
    @Override // defpackage.yf2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.e
            r1 = 1
            w11 r4 = r4.f
            r2 = 0
            switch(r0) {
                case 0: goto L1d;
                default: goto L9;
            }
        L9:
            com.google.android.material.sidesheet.SideSheetBehavior r4 = (com.google.android.material.sidesheet.SideSheetBehavior) r4
            int r6 = r4.h
            if (r6 != r1) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r4 = r4.p
            if (r4 == 0) goto L1b
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            int r0 = r4.N
            if (r0 != r1) goto L24
            goto L54
        L24:
            boolean r3 = r4.c0
            if (r3 == 0) goto L29
            goto L54
        L29:
            r3 = 3
            if (r0 != r3) goto L46
            int r0 = r4.a0
            if (r0 != r6) goto L46
            java.lang.ref.WeakReference r6 = r4.X
            if (r6 == 0) goto L3b
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3c
        L3b:
            r6 = 0
        L3c:
            if (r6 == 0) goto L46
            r0 = -1
            boolean r6 = r6.canScrollVertically(r0)
            if (r6 == 0) goto L46
            goto L54
        L46:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r4 = r4.W
            if (r4 == 0) goto L54
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L54
            goto L55
        L54:
            r1 = r2
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j40.W(android.view.View, int):boolean");
    }

    @Override // defpackage.yf2
    public final int k(View view, int i) {
        switch (this.e) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                return me2.k(i, sideSheetBehavior.a.E(), sideSheetBehavior.a.D());
        }
    }

    @Override // defpackage.yf2
    public final int l(View view, int i) {
        switch (this.e) {
            case 0:
                return me2.k(i, ((BottomSheetBehavior) this.f).x(), y());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.yf2
    public int x(View view) {
        switch (this.e) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.x(view);
        }
    }

    @Override // defpackage.yf2
    public int y() {
        switch (this.e) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f;
                if (bottomSheetBehavior.I) {
                    return bottomSheetBehavior.V;
                }
                return bottomSheetBehavior.G;
            default:
                return super.y();
        }
    }
}
