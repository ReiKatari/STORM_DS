package j7;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends r0 {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final ad.g B;

    /* renamed from: a  reason: collision with root package name */
    public final int f7674a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7675b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f7676c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f7677d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7678e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7679f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f7680g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f7681h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7682i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7683j;

    /* renamed from: k  reason: collision with root package name */
    public int f7684k;

    /* renamed from: l  reason: collision with root package name */
    public int f7685l;
    public float m;

    /* renamed from: n  reason: collision with root package name */
    public int f7686n;

    /* renamed from: o  reason: collision with root package name */
    public int f7687o;

    /* renamed from: p  reason: collision with root package name */
    public float f7688p;

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f7691s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f7698z;

    /* renamed from: q  reason: collision with root package name */
    public int f7689q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f7690r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7692t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7693u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f7694v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f7695w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f7696x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f7697y = new int[2];

    public t(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i10, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7698z = ofFloat;
        this.A = 0;
        ad.g gVar = new ad.g(5, this);
        this.B = gVar;
        q qVar = new q(this);
        this.f7676c = stateListDrawable;
        this.f7677d = drawable;
        this.f7680g = stateListDrawable2;
        this.f7681h = drawable2;
        this.f7678e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f7679f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f7682i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f7683j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f7674a = i10;
        this.f7675b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new r(this));
        ofFloat.addUpdateListener(new s(0, this));
        RecyclerView recyclerView2 = this.f7691s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f1644m0;
            u0 u0Var = recyclerView2.f1640k0;
            if (u0Var != null) {
                u0Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.S();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f7691s;
            recyclerView3.f1646n0.remove(this);
            if (recyclerView3.f1648o0 == this) {
                recyclerView3.f1648o0 = null;
            }
            ArrayList arrayList2 = this.f7691s.f1625c1;
            if (arrayList2 != null) {
                arrayList2.remove(qVar);
            }
            this.f7691s.removeCallbacks(gVar);
        }
        this.f7691s = recyclerView;
        recyclerView.i(this);
        this.f7691s.f1646n0.add(this);
        this.f7691s.j(qVar);
    }

    public static int f(float f8, float f10, int[] iArr, int i2, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i2 - i11;
            int i14 = (int) (((f10 - f8) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    @Override // j7.r0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.f7689q == this.f7691s.getWidth() && this.f7690r == this.f7691s.getHeight()) {
            if (this.A != 0) {
                if (this.f7692t) {
                    int i2 = this.f7689q;
                    int i10 = this.f7678e;
                    int i11 = i2 - i10;
                    int i12 = this.f7685l;
                    int i13 = this.f7684k;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable = this.f7676c;
                    stateListDrawable.setBounds(0, 0, i10, i13);
                    int i15 = this.f7679f;
                    int i16 = this.f7690r;
                    Drawable drawable = this.f7677d;
                    drawable.setBounds(0, 0, i15, i16);
                    if (this.f7691s.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i10, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i10, -i14);
                    } else {
                        canvas.translate(i11, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i11, -i14);
                    }
                }
                if (this.f7693u) {
                    int i17 = this.f7690r;
                    int i18 = this.f7682i;
                    int i19 = i17 - i18;
                    int i20 = this.f7687o;
                    int i21 = this.f7686n;
                    int i22 = i20 - (i21 / 2);
                    StateListDrawable stateListDrawable2 = this.f7680g;
                    stateListDrawable2.setBounds(0, 0, i21, i18);
                    int i23 = this.f7689q;
                    int i24 = this.f7683j;
                    Drawable drawable2 = this.f7681h;
                    drawable2.setBounds(0, 0, i23, i24);
                    canvas.translate(0.0f, i19);
                    drawable2.draw(canvas);
                    canvas.translate(i22, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i22, -i19);
                    return;
                }
                return;
            }
            return;
        }
        this.f7689q = this.f7691s.getWidth();
        this.f7690r = this.f7691s.getHeight();
        g(0);
    }

    public final boolean d(float f8, float f10) {
        if (f10 >= this.f7690r - this.f7682i) {
            int i2 = this.f7687o;
            int i10 = this.f7686n;
            if (f8 >= i2 - (i10 / 2) && f8 <= (i10 / 2) + i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e(float f8, float f10) {
        int layoutDirection = this.f7691s.getLayoutDirection();
        int i2 = this.f7678e;
        if (layoutDirection == 1) {
            if (f8 > i2) {
                return false;
            }
        } else if (f8 < this.f7689q - i2) {
            return false;
        }
        int i10 = this.f7685l;
        int i11 = this.f7684k / 2;
        if (f10 >= i10 - i11 && f10 <= i11 + i10) {
            return true;
        }
        return false;
    }

    public final void g(int i2) {
        ad.g gVar = this.B;
        StateListDrawable stateListDrawable = this.f7676c;
        if (i2 == 2 && this.f7694v != 2) {
            stateListDrawable.setState(C);
            this.f7691s.removeCallbacks(gVar);
        }
        if (i2 == 0) {
            this.f7691s.invalidate();
        } else {
            h();
        }
        if (this.f7694v == 2 && i2 != 2) {
            stateListDrawable.setState(D);
            this.f7691s.removeCallbacks(gVar);
            this.f7691s.postDelayed(gVar, 1200);
        } else if (i2 == 1) {
            this.f7691s.removeCallbacks(gVar);
            this.f7691s.postDelayed(gVar, 1500);
        }
        this.f7694v = i2;
    }

    public final void h() {
        int i2 = this.A;
        ValueAnimator valueAnimator = this.f7698z;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            }
            valueAnimator.cancel();
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
