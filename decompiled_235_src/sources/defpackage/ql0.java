package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql0  reason: default package */
/* loaded from: classes.dex */
public final class ql0 extends ea7 {
    public static final String[] A0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final ml0 B0 = new ml0("topLeft", 0, PointF.class);
    public static final ml0 C0 = new ml0("bottomRight", 1, PointF.class);
    public static final ml0 D0 = new ml0("bottomRight", 2, PointF.class);
    public static final ml0 E0 = new ml0("topLeft", 3, PointF.class);
    public static final ml0 F0 = new ml0("position", 4, PointF.class);

    public static void Q(sa7 sa7Var) {
        View view = sa7Var.b;
        HashMap hashMap = sa7Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.ea7
    public final void d(sa7 sa7Var) {
        Q(sa7Var);
    }

    @Override // defpackage.ea7
    public final void g(sa7 sa7Var) {
        Q(sa7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea7
    public final Animator l(ViewGroup viewGroup, sa7 sa7Var, sa7 sa7Var2) {
        int i;
        ql0 ql0Var;
        ObjectAnimator ofObject;
        if (sa7Var != null) {
            HashMap hashMap = sa7Var.a;
            if (sa7Var2 == null) {
                return null;
            }
            HashMap hashMap2 = sa7Var2.a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 == null || viewGroup3 == null) {
                return null;
            }
            View view = sa7Var2.b;
            Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
            int i2 = rect.left;
            int i3 = rect2.left;
            int i4 = rect.top;
            int i5 = rect2.top;
            int i6 = rect.right;
            int i7 = rect2.right;
            int i8 = rect.bottom;
            int i9 = rect2.bottom;
            int i10 = i6 - i2;
            int i11 = i8 - i4;
            int i12 = i7 - i3;
            int i13 = i9 - i5;
            Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
            Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
            if ((i10 != 0 && i11 != 0) || (i12 != 0 && i13 != 0)) {
                if (i2 == i3 && i4 == i5) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i6 != i7 || i8 != i9) {
                    i++;
                }
            } else {
                i = 0;
            }
            if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i++;
            }
            int i14 = i;
            if (i14 <= 0) {
                return null;
            }
            dq7.a(view, i2, i4, i6, i8);
            if (i14 == 2) {
                if (i10 == i12 && i11 == i13) {
                    ql0Var = this;
                    ql0Var.s0.getClass();
                    ofObject = ObjectAnimator.ofObject(view, F0, (TypeConverter) null, x31.u(i2, i4, i3, i5));
                } else {
                    ql0Var = this;
                    pl0 pl0Var = new pl0(view);
                    ql0Var.s0.getClass();
                    ObjectAnimator ofObject2 = ObjectAnimator.ofObject(pl0Var, B0, (TypeConverter) null, x31.u(i2, i4, i3, i5));
                    ql0Var.s0.getClass();
                    ObjectAnimator ofObject3 = ObjectAnimator.ofObject(pl0Var, C0, (TypeConverter) null, x31.u(i6, i8, i7, i9));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofObject2, ofObject3);
                    animatorSet.addListener(new nl0(pl0Var));
                    ofObject = animatorSet;
                }
            } else {
                ql0Var = this;
                if (i2 == i3 && i4 == i5) {
                    ql0Var.s0.getClass();
                    ofObject = ObjectAnimator.ofObject(view, D0, (TypeConverter) null, x31.u(i6, i8, i7, i9));
                } else {
                    ql0Var.s0.getClass();
                    ofObject = ObjectAnimator.ofObject(view, E0, (TypeConverter) null, x31.u(i2, i4, i3, i5));
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                ej2.W(viewGroup4, true);
                ql0Var.p().a(new ol0(viewGroup4));
            }
            return ofObject;
        }
        return null;
    }

    @Override // defpackage.ea7
    public final String[] s() {
        return A0;
    }

    @Override // defpackage.ea7
    public final boolean v() {
        return true;
    }
}
