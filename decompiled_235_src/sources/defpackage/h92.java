package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h92  reason: default package */
/* loaded from: classes.dex */
public final class h92 extends ea7 {
    public static final String[] B0 = {"android:visibility:visibility", "android:visibility:parent"};
    public final int A0;

    public h92() {
        this.A0 = 3;
    }

    public static void Q(sa7 sa7Var) {
        View view = sa7Var.b;
        int visibility = view.getVisibility();
        HashMap hashMap = sa7Var.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float S(sa7 sa7Var, float f) {
        Float f2;
        if (sa7Var != null && (f2 = (Float) sa7Var.a.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uq7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static uq7 T(sa7 sa7Var, sa7 sa7Var2) {
        ?? obj = new Object();
        obj.a = false;
        obj.b = false;
        if (sa7Var != null) {
            HashMap hashMap = sa7Var.a;
            if (hashMap.containsKey("android:visibility:visibility")) {
                obj.c = ((Integer) hashMap.get("android:visibility:visibility")).intValue();
                obj.e = (ViewGroup) hashMap.get("android:visibility:parent");
                if (sa7Var2 != null) {
                    HashMap hashMap2 = sa7Var2.a;
                    if (hashMap2.containsKey("android:visibility:visibility")) {
                        obj.d = ((Integer) hashMap2.get("android:visibility:visibility")).intValue();
                        obj.f = (ViewGroup) hashMap2.get("android:visibility:parent");
                        if (sa7Var == null && sa7Var2 != null) {
                            int i = obj.c;
                            int i2 = obj.d;
                            if (i != i2 || obj.e != obj.f) {
                                if (i != i2) {
                                    if (i == 0) {
                                        obj.b = false;
                                        obj.a = true;
                                        return obj;
                                    } else if (i2 == 0) {
                                        obj.b = true;
                                        obj.a = true;
                                        return obj;
                                    }
                                } else if (obj.f == null) {
                                    obj.b = false;
                                    obj.a = true;
                                    return obj;
                                } else if (obj.e == null) {
                                    obj.b = true;
                                    obj.a = true;
                                    return obj;
                                }
                            }
                        } else if (sa7Var != null && obj.d == 0) {
                            obj.b = true;
                            obj.a = true;
                            return obj;
                        } else if (sa7Var2 == null && obj.c == 0) {
                            obj.b = false;
                            obj.a = true;
                        }
                        return obj;
                    }
                }
                obj.d = -1;
                obj.f = null;
                if (sa7Var == null) {
                }
                if (sa7Var != null) {
                }
                if (sa7Var2 == null) {
                    obj.b = false;
                    obj.a = true;
                }
                return obj;
            }
        }
        obj.c = -1;
        obj.e = null;
        if (sa7Var2 != null) {
        }
        obj.d = -1;
        obj.f = null;
        if (sa7Var == null) {
        }
        if (sa7Var != null) {
        }
        if (sa7Var2 == null) {
        }
        return obj;
    }

    public final ObjectAnimator R(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        dq7.a.Y(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, dq7.b, f2);
        g92 g92Var = new g92(view);
        ofFloat.addListener(g92Var);
        p().a(g92Var);
        return ofFloat;
    }

    @Override // defpackage.ea7
    public final void d(sa7 sa7Var) {
        Q(sa7Var);
    }

    @Override // defpackage.ea7
    public final void g(sa7 sa7Var) {
        Q(sa7Var);
        View view = sa7Var.b;
        Float f = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f == null) {
            if (view.getVisibility() == 0) {
                f = Float.valueOf(dq7.a.K(view));
            } else {
                f = Float.valueOf((float) RecyclerView.B1);
            }
        }
        sa7Var.a.put("android:fade:transitionAlpha", f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (T(o(r3, false), t(r3, false)).a != false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01dd  */
    @Override // defpackage.ea7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Animator l(ViewGroup viewGroup, sa7 sa7Var, sa7 sa7Var2) {
        View view;
        boolean z;
        View view2;
        int i;
        char c;
        int i2;
        View view3;
        Animator animator;
        View view4;
        boolean z2;
        boolean z3;
        ViewGroup viewGroup2;
        int i3;
        Bitmap bitmap;
        uq7 T = T(sa7Var, sa7Var2);
        if (T.a && (T.e != null || T.f != null)) {
            boolean z4 = T.b;
            int i4 = this.A0;
            int i5 = 1;
            if (z4) {
                if ((i4 & 1) == 1 && sa7Var2 != null) {
                    View view5 = sa7Var2.b;
                    if (sa7Var == null) {
                        View view6 = (View) view5.getParent();
                    }
                    dq7.a.getClass();
                    return R(view5, S(sa7Var, RecyclerView.B1), 1.0f);
                }
            } else {
                int i6 = T.d;
                if ((i4 & 2) == 2 && sa7Var != null) {
                    View view7 = sa7Var.b;
                    if (sa7Var2 != null) {
                        view = sa7Var2.b;
                    } else {
                        view = null;
                    }
                    View view8 = (View) view7.getTag(R.id.save_overlay_view);
                    if (view8 != null) {
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view4 = null;
                        animator = null;
                    } else {
                        if (view != null && view.getParent() != null) {
                            if (i6 == 4 || view7 == view) {
                                z = false;
                                view2 = view;
                                view = null;
                                if (z) {
                                }
                                i = i6;
                                c = 1;
                                i2 = 0;
                                view3 = view2;
                                animator = null;
                                view8 = view;
                                i5 = i2;
                                view4 = view3;
                            }
                        } else if (view != null) {
                            z = false;
                            view2 = null;
                            if (z) {
                                if (view7.getParent() == null) {
                                    i = i6;
                                    c = 1;
                                    i5 = 0;
                                    i2 = 0;
                                    view4 = view2;
                                    animator = null;
                                    view8 = view7;
                                } else if (view7.getParent() instanceof View) {
                                    View view9 = (View) view7.getParent();
                                    animator = null;
                                    i2 = 0;
                                    if (!T(t(view9, true), o(view9, true)).a) {
                                        boolean z5 = ra7.a;
                                        Matrix matrix = new Matrix();
                                        matrix.setTranslate(-view9.getScrollX(), -view9.getScrollY());
                                        gq7 gq7Var = dq7.a;
                                        gq7Var.d0(view7, matrix);
                                        gq7Var.e0(viewGroup, matrix);
                                        RectF rectF = new RectF(RecyclerView.B1, RecyclerView.B1, view7.getWidth(), view7.getHeight());
                                        matrix.mapRect(rectF);
                                        int round = Math.round(rectF.left);
                                        int round2 = Math.round(rectF.top);
                                        c = 1;
                                        int round3 = Math.round(rectF.right);
                                        int round4 = Math.round(rectF.bottom);
                                        ImageView imageView = new ImageView(view7.getContext());
                                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        boolean isAttachedToWindow = view7.isAttachedToWindow();
                                        if (viewGroup != null && viewGroup.isAttachedToWindow()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!isAttachedToWindow) {
                                            if (!z2) {
                                                i = i6;
                                                view3 = view2;
                                                bitmap = null;
                                                if (bitmap != null) {
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                                imageView.layout(round, round2, round3, round4);
                                                view8 = imageView;
                                                i5 = i2;
                                                view4 = view3;
                                            } else {
                                                viewGroup2 = (ViewGroup) view7.getParent();
                                                int indexOfChild = viewGroup2.indexOfChild(view7);
                                                ao7.a(view7, viewGroup);
                                                z3 = isAttachedToWindow;
                                                i3 = indexOfChild;
                                            }
                                        } else {
                                            z3 = isAttachedToWindow;
                                            viewGroup2 = null;
                                            i3 = 0;
                                        }
                                        view3 = view2;
                                        int round5 = Math.round(rectF.width());
                                        i = i6;
                                        int round6 = Math.round(rectF.height());
                                        if (round5 > 0 && round6 > 0) {
                                            float min = Math.min(1.0f, 1048576.0f / (round5 * round6));
                                            int round7 = Math.round(round5 * min);
                                            int round8 = Math.round(round6 * min);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(min, min);
                                            if (ra7.a) {
                                                Picture picture = new Picture();
                                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                                beginRecording.concat(matrix);
                                                view7.draw(beginRecording);
                                                picture.endRecording();
                                                bitmap = pp.c(picture);
                                            } else {
                                                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmap);
                                                canvas.concat(matrix);
                                                view7.draw(canvas);
                                            }
                                        } else {
                                            bitmap = null;
                                        }
                                        if (!z3) {
                                            viewGroup.getOverlay().remove(view7);
                                            viewGroup2.addView(view7, i3);
                                        }
                                        if (bitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
                                        imageView.layout(round, round2, round3, round4);
                                        view8 = imageView;
                                        i5 = i2;
                                        view4 = view3;
                                    } else {
                                        i = i6;
                                        c = 1;
                                        view3 = view2;
                                        int id = view9.getId();
                                        if (view9.getParent() == null && id != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                        view8 = view;
                                        i5 = i2;
                                        view4 = view3;
                                    }
                                }
                            }
                            i = i6;
                            c = 1;
                            i2 = 0;
                            view3 = view2;
                            animator = null;
                            view8 = view;
                            i5 = i2;
                            view4 = view3;
                        }
                        z = true;
                        view = null;
                        view2 = null;
                        if (z) {
                        }
                        i = i6;
                        c = 1;
                        i2 = 0;
                        view3 = view2;
                        animator = null;
                        view8 = view;
                        i5 = i2;
                        view4 = view3;
                    }
                    if (view8 != null) {
                        if (i5 == 0) {
                            int[] iArr = (int[]) sa7Var.a.get("android:visibility:screenLocation");
                            int i7 = iArr[i2];
                            int i8 = iArr[c];
                            int[] iArr2 = new int[2];
                            viewGroup.getLocationOnScreen(iArr2);
                            view8.offsetLeftAndRight((i7 - iArr2[i2]) - view8.getLeft());
                            view8.offsetTopAndBottom((i8 - iArr2[c]) - view8.getTop());
                            ao7.a(view8, viewGroup);
                        }
                        gq7 gq7Var2 = dq7.a;
                        gq7Var2.getClass();
                        ObjectAnimator R = R(view8, S(sa7Var, 1.0f), RecyclerView.B1);
                        if (R == null) {
                            gq7Var2.Y(view8, S(sa7Var2, 1.0f));
                        }
                        if (i5 == 0) {
                            if (R == null) {
                                viewGroup.getOverlay().remove(view8);
                                return R;
                            }
                            view7.setTag(R.id.save_overlay_view, view8);
                            tq7 tq7Var = new tq7(this, viewGroup, view8, view7);
                            R.addListener(tq7Var);
                            R.addPauseListener(tq7Var);
                            p().a(tq7Var);
                        }
                        return R;
                    } else if (view4 != null) {
                        int visibility = view4.getVisibility();
                        dq7.b(view4, i2);
                        gq7 gq7Var3 = dq7.a;
                        gq7Var3.getClass();
                        ObjectAnimator R2 = R(view4, S(sa7Var, 1.0f), RecyclerView.B1);
                        if (R2 == null) {
                            gq7Var3.Y(view4, S(sa7Var2, 1.0f));
                        }
                        if (R2 != null) {
                            sq7 sq7Var = new sq7(view4, i);
                            R2.addListener(sq7Var);
                            p().a(sq7Var);
                            return R2;
                        }
                        dq7.b(view4, visibility);
                        return R2;
                    } else {
                        return animator;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ea7
    public final String[] s() {
        return B0;
    }

    @Override // defpackage.ea7
    public final boolean v() {
        return true;
    }

    @Override // defpackage.ea7
    public final boolean w(sa7 sa7Var, sa7 sa7Var2) {
        if (sa7Var != null || sa7Var2 != null) {
            if (sa7Var == null || sa7Var2 == null || sa7Var2.a.containsKey("android:visibility:visibility") == sa7Var.a.containsKey("android:visibility:visibility")) {
                uq7 T = T(sa7Var, sa7Var2);
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

    public h92(int i) {
        this();
        this.A0 = i;
    }
}
