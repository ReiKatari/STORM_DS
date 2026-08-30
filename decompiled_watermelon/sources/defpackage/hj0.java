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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hj0  reason: default package */
/* loaded from: classes.dex */
public final class hj0 extends ix6 {
    public static final String[] z0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final dj0 A0 = new dj0("topLeft", 0, PointF.class);
    public static final dj0 B0 = new dj0("bottomRight", 1, PointF.class);
    public static final dj0 C0 = new dj0("bottomRight", 2, PointF.class);
    public static final dj0 D0 = new dj0("topLeft", 3, PointF.class);
    public static final dj0 E0 = new dj0("position", 4, PointF.class);

    public static void Q(vx6 vx6Var) {
        View view = vx6Var.b;
        HashMap hashMap = vx6Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.ix6
    public final void e(vx6 vx6Var) {
        Q(vx6Var);
    }

    @Override // defpackage.ix6
    public final void h(vx6 vx6Var) {
        Q(vx6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ix6
    public final Animator m(ViewGroup viewGroup, vx6 vx6Var, vx6 vx6Var2) {
        int i;
        hj0 hj0Var;
        ObjectAnimator ofObject;
        if (vx6Var != null) {
            HashMap hashMap = vx6Var.a;
            if (vx6Var2 == null) {
                return null;
            }
            HashMap hashMap2 = vx6Var2.a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 == null || viewGroup3 == null) {
                return null;
            }
            View view = vx6Var2.b;
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
            cc7.a(view, i2, i4, i6, i8);
            if (i14 == 2) {
                if (i10 == i12 && i11 == i13) {
                    hj0Var = this;
                    hj0Var.r0.getClass();
                    ofObject = ObjectAnimator.ofObject(view, E0, (TypeConverter) null, so1.h(i2, i4, i3, i5));
                } else {
                    hj0Var = this;
                    gj0 gj0Var = new gj0(view);
                    hj0Var.r0.getClass();
                    ObjectAnimator ofObject2 = ObjectAnimator.ofObject(gj0Var, A0, (TypeConverter) null, so1.h(i2, i4, i3, i5));
                    hj0Var.r0.getClass();
                    ObjectAnimator ofObject3 = ObjectAnimator.ofObject(gj0Var, B0, (TypeConverter) null, so1.h(i6, i8, i7, i9));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ofObject2, ofObject3);
                    animatorSet.addListener(new ej0(gj0Var));
                    ofObject = animatorSet;
                }
            } else {
                hj0Var = this;
                if (i2 == i3 && i4 == i5) {
                    hj0Var.r0.getClass();
                    ofObject = ObjectAnimator.ofObject(view, C0, (TypeConverter) null, so1.h(i6, i8, i7, i9));
                } else {
                    hj0Var.r0.getClass();
                    ofObject = ObjectAnimator.ofObject(view, D0, (TypeConverter) null, so1.h(i2, i4, i3, i5));
                }
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                cg2.U(viewGroup4, true);
                hj0Var.r().a(new fj0(viewGroup4));
            }
            return ofObject;
        }
        return null;
    }

    @Override // defpackage.ix6
    public final String[] t() {
        return z0;
    }

    @Override // defpackage.ix6
    public final boolean w() {
        return true;
    }
}
