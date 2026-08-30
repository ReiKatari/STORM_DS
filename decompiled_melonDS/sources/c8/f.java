package c8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends t {

    /* renamed from: y0  reason: collision with root package name */
    public static final String[] f2638y0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: z0  reason: collision with root package name */
    public static final b f2639z0 = new b(PointF.class, "topLeft", 0);
    public static final b A0 = new b(PointF.class, "bottomRight", 1);
    public static final b B0 = new b(PointF.class, "bottomRight", 2);
    public static final b C0 = new b(PointF.class, "topLeft", 3);
    public static final b D0 = new b(PointF.class, "position", 4);

    public static void Q(b0 b0Var) {
        View view = b0Var.f2621b;
        HashMap hashMap = b0Var.f2620a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // c8.t
    public final void e(b0 b0Var) {
        Q(b0Var);
    }

    @Override // c8.t
    public final void h(b0 b0Var) {
        Q(b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c8.t
    public final Animator n(ViewGroup viewGroup, b0 b0Var, b0 b0Var2) {
        int i2;
        f fVar;
        ObjectAnimator ofObject;
        if (b0Var != null) {
            HashMap hashMap = b0Var.f2620a;
            if (b0Var2 != null) {
                HashMap hashMap2 = b0Var2.f2620a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = b0Var2.f2621b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i10 = rect.left;
                    int i11 = rect2.left;
                    int i12 = rect.top;
                    int i13 = rect2.top;
                    int i14 = rect.right;
                    int i15 = rect2.right;
                    int i16 = rect.bottom;
                    int i17 = rect2.bottom;
                    int i18 = i14 - i10;
                    int i19 = i16 - i12;
                    int i20 = i15 - i11;
                    int i21 = i17 - i13;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i18 != 0 && i19 != 0) || (i20 != 0 && i21 != 0)) {
                        if (i10 == i11 && i12 == i13) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        if (i14 != i15 || i16 != i17) {
                            i2++;
                        }
                    } else {
                        i2 = 0;
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i2++;
                    }
                    int i22 = i2;
                    if (i22 > 0) {
                        e0.a(view, i10, i12, i14, i16);
                        if (i22 == 2) {
                            if (i18 == i20 && i19 == i21) {
                                fVar = this;
                                fVar.f2711q0.getClass();
                                ofObject = ObjectAnimator.ofObject(view, D0, (TypeConverter) null, na.f.i(i10, i12, i11, i13));
                            } else {
                                fVar = this;
                                e eVar = new e(view);
                                fVar.f2711q0.getClass();
                                ObjectAnimator ofObject2 = ObjectAnimator.ofObject(eVar, f2639z0, (TypeConverter) null, na.f.i(i10, i12, i11, i13));
                                fVar.f2711q0.getClass();
                                ObjectAnimator ofObject3 = ObjectAnimator.ofObject(eVar, A0, (TypeConverter) null, na.f.i(i14, i16, i15, i17));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(ofObject2, ofObject3);
                                animatorSet.addListener(new c(eVar));
                                ofObject = animatorSet;
                            }
                        } else {
                            fVar = this;
                            if (i10 == i11 && i12 == i13) {
                                fVar.f2711q0.getClass();
                                ofObject = ObjectAnimator.ofObject(view, B0, (TypeConverter) null, na.f.i(i14, i16, i15, i17));
                            } else {
                                fVar.f2711q0.getClass();
                                ofObject = ObjectAnimator.ofObject(view, C0, (TypeConverter) null, na.f.i(i10, i12, i11, i13));
                            }
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            k7.w.H(viewGroup4, true);
                            fVar.r().a(new d(viewGroup4));
                        }
                        return ofObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // c8.t
    public final String[] t() {
        return f2638y0;
    }

    @Override // c8.t
    public final boolean w() {
        return true;
    }
}
