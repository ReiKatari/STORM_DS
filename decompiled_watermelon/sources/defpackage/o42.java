package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o42  reason: default package */
/* loaded from: classes.dex */
public final class o42 extends ix6 {
    public static final String[] A0 = {"android:visibility:visibility", "android:visibility:parent"};
    public final int z0;

    public o42() {
        this.z0 = 3;
    }

    public static void Q(vx6 vx6Var) {
        View view = vx6Var.b;
        int visibility = view.getVisibility();
        HashMap hashMap = vx6Var.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float S(vx6 vx6Var, float f) {
        Float f2;
        if (vx6Var != null && (f2 = (Float) vx6Var.a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [sc7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.sc7 T(defpackage.vx6 r8, defpackage.vx6 r9) {
        /*
            sc7 r0 = new sc7
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o42.T(vx6, vx6):sc7");
    }

    public final ObjectAnimator R(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        cc7.a.O(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, cc7.b, f2);
        n42 n42Var = new n42(view);
        ofFloat.addListener(n42Var);
        r().a(n42Var);
        return ofFloat;
    }

    @Override // defpackage.ix6
    public final void e(vx6 vx6Var) {
        Q(vx6Var);
    }

    @Override // defpackage.ix6
    public final void h(vx6 vx6Var) {
        Q(vx6Var);
        View view = vx6Var.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            if (view.getVisibility() == 0) {
                f = Float.valueOf(cc7.a.C(view));
            } else {
                f = Float.valueOf((float) RecyclerView.A1);
            }
        }
        vx6Var.a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (T(q(r3, false), u(r3, false)).a != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    @Override // defpackage.ix6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator m(android.view.ViewGroup r25, defpackage.vx6 r26, defpackage.vx6 r27) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o42.m(android.view.ViewGroup, vx6, vx6):android.animation.Animator");
    }

    @Override // defpackage.ix6
    public final String[] t() {
        return A0;
    }

    @Override // defpackage.ix6
    public final boolean w() {
        return true;
    }

    @Override // defpackage.ix6
    public final boolean x(vx6 vx6Var, vx6 vx6Var2) {
        if (vx6Var != null || vx6Var2 != null) {
            if (vx6Var == null || vx6Var2 == null || vx6Var2.a.containsKey("android:visibility:visibility") == vx6Var.a.containsKey("android:visibility:visibility")) {
                sc7 T = T(vx6Var, vx6Var2);
                if (T.a) {
                    if (T.c == 0 || T.d == 0) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public o42(int i) {
        this();
        this.z0 = i;
    }
}
