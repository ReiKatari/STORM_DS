package oa;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p7.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f10861e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ k5.a f10862f;

    public /* synthetic */ c(k5.a aVar, int i2) {
        this.f10861e = i2;
        this.f10862f = aVar;
    }

    @Override // ij.a
    public final int B(View view, int i2) {
        switch (this.f10861e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10862f;
                return o.e(i2, sideSheetBehavior.f3079a.U(), sideSheetBehavior.f3079a.T());
            default:
                return view.getLeft();
        }
    }

    @Override // ij.a
    public final int C(View view, int i2) {
        switch (this.f10861e) {
            case 0:
                return view.getTop();
            default:
                return o.e(i2, ((BottomSheetBehavior) this.f10862f).x(), j0());
        }
    }

    @Override // ij.a
    public int i0(View view) {
        switch (this.f10861e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10862f;
                return sideSheetBehavior.f3090l + sideSheetBehavior.f3092o;
            default:
                return super.i0(view);
        }
    }

    @Override // ij.a
    public int j0() {
        switch (this.f10861e) {
            case DSiCameraSource.FrontCamera /* 1 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f10862f;
                if (bottomSheetBehavior.I) {
                    return bottomSheetBehavior.V;
                }
                return bottomSheetBehavior.G;
            default:
                return super.j0();
        }
    }

    @Override // ij.a
    public final void r0(int i2) {
        switch (this.f10861e) {
            case 0:
                if (i2 == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10862f;
                    if (sideSheetBehavior.f3085g) {
                        sideSheetBehavior.r(1);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i2 == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f10862f;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.C(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // ij.a
    public final void s0(View view, int i2, int i10) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f10861e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f10862f;
                WeakReference weakReference = sideSheetBehavior.f3094q;
                if (weakReference != null) {
                    view2 = (View) weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f3079a.A0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f3098u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.f3079a.z(i2);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw w.d.k(it);
                    }
                    return;
                }
                return;
            default:
                ((BottomSheetBehavior) this.f10862f).u(i10);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r7 > r2.E) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (java.lang.Math.abs(r6.getTop() - r2.x()) < java.lang.Math.abs(r6.getTop() - r2.E)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
        if (java.lang.Math.abs(r7 - r2.E) < java.lang.Math.abs(r7 - r2.G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
        if (java.lang.Math.abs(r7 - r2.D) < java.lang.Math.abs(r7 - r2.G)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
        if (r7 < java.lang.Math.abs(r7 - r2.G)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d9, code lost:
        if (java.lang.Math.abs(r7 - r8) < java.lang.Math.abs(r7 - r2.G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0103, code lost:
        if (r0.f3079a.n0(r6) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
        if (java.lang.Math.abs(r7 - r0.f3079a.R()) < java.lang.Math.abs(r7 - r0.f3079a.S())) goto L64;
     */
    @Override // ij.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.c.t0(android.view.View, float, float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
        if (r6.canScrollVertically(-1) != false) goto L24;
     */
    @Override // ij.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z0(android.view.View r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.f10861e
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            k5.a r0 = r4.f10862f
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            int r1 = r0.N
            r2 = 1
            if (r1 != r2) goto Lf
            goto L3f
        Lf:
            boolean r3 = r0.f2950c0
            if (r3 == 0) goto L14
            goto L3f
        L14:
            r3 = 3
            if (r1 != r3) goto L31
            int r1 = r0.f2946a0
            if (r1 != r6) goto L31
            java.lang.ref.WeakReference r6 = r0.X
            if (r6 == 0) goto L26
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L31
            r1 = -1
            boolean r6 = r6.canScrollVertically(r1)
            if (r6 == 0) goto L31
            goto L3f
        L31:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r6 = r0.W
            if (r6 == 0) goto L3f
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L3f
            goto L40
        L3f:
            r2 = 0
        L40:
            return r2
        L41:
            k5.a r6 = r4.f10862f
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            int r0 = r6.f3086h
            r1 = 1
            if (r0 != r1) goto L4b
            goto L56
        L4b:
            java.lang.ref.WeakReference r6 = r6.f3093p
            if (r6 == 0) goto L56
            java.lang.Object r6 = r6.get()
            if (r6 != r5) goto L56
            goto L57
        L56:
            r1 = 0
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.c.z0(android.view.View, int):boolean");
    }
}
