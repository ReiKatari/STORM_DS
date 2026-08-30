package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b52  reason: default package */
/* loaded from: classes.dex */
public final class b52 extends n65 {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final es4 B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public final RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public b52(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.A1, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        es4 es4Var = new es4(8, this);
        this.B = es4Var;
        z42 z42Var = new z42(this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new a52(this));
        ofFloat.addUpdateListener(new h40(1, this));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.n0;
            q65 q65Var = recyclerView2.l0;
            if (q65Var != null) {
                q65Var.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.S();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.o0.remove(this);
            if (recyclerView3.p0 == this) {
                recyclerView3.p0 = null;
            }
            ArrayList arrayList2 = this.s.e1;
            if (arrayList2 != null) {
                arrayList2.remove(z42Var);
            }
            this.s.removeCallbacks(es4Var);
        }
        this.s = recyclerView;
        recyclerView.i(this);
        this.s.o0.add(this);
        this.s.j(z42Var);
    }

    public static int f(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    @Override // defpackage.n65
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int i = this.q;
        RecyclerView recyclerView2 = this.s;
        if (i == recyclerView2.getWidth() && this.r == recyclerView2.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    int i2 = this.q;
                    int i3 = this.e;
                    int i4 = i2 - i3;
                    int i5 = this.l;
                    int i6 = this.k;
                    int i7 = i5 - (i6 / 2);
                    StateListDrawable stateListDrawable = this.c;
                    stateListDrawable.setBounds(0, 0, i3, i6);
                    int i8 = this.f;
                    int i9 = this.r;
                    Drawable drawable = this.d;
                    drawable.setBounds(0, 0, i8, i9);
                    if (recyclerView2.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i3, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i3, -i7);
                    } else {
                        canvas.translate(i4, RecyclerView.A1);
                        drawable.draw(canvas);
                        canvas.translate(RecyclerView.A1, i7);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i4, -i7);
                    }
                }
                if (this.u) {
                    int i10 = this.r;
                    int i11 = this.i;
                    int i12 = i10 - i11;
                    int i13 = this.o;
                    int i14 = this.n;
                    int i15 = i13 - (i14 / 2);
                    StateListDrawable stateListDrawable2 = this.g;
                    stateListDrawable2.setBounds(0, 0, i14, i11);
                    int i16 = this.q;
                    int i17 = this.j;
                    Drawable drawable2 = this.h;
                    drawable2.setBounds(0, 0, i16, i17);
                    canvas.translate(RecyclerView.A1, i12);
                    drawable2.draw(canvas);
                    canvas.translate(i15, RecyclerView.A1);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i15, -i12);
                    return;
                }
                return;
            }
            return;
        }
        this.q = recyclerView2.getWidth();
        this.r = recyclerView2.getHeight();
        g(0);
    }

    public final boolean d(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean e(float f, float f2) {
        int layoutDirection = this.s.getLayoutDirection();
        int i = this.e;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.q - i) {
            return false;
        }
        int i2 = this.l;
        int i3 = this.k / 2;
        if (f2 >= i2 - i3 && f2 <= i3 + i2) {
            return true;
        }
        return false;
    }

    public final void g(int i) {
        RecyclerView recyclerView = this.s;
        es4 es4Var = this.B;
        StateListDrawable stateListDrawable = this.c;
        if (i == 2 && this.v != 2) {
            stateListDrawable.setState(C);
            recyclerView.removeCallbacks(es4Var);
        }
        if (i == 0) {
            recyclerView.invalidate();
        } else {
            h();
        }
        if (this.v == 2 && i != 2) {
            stateListDrawable.setState(D);
            recyclerView.removeCallbacks(es4Var);
            recyclerView.postDelayed(es4Var, 1200L);
        } else if (i == 1) {
            recyclerView.removeCallbacks(es4Var);
            recyclerView.postDelayed(es4Var, 1500L);
        }
        this.v = i;
    }

    public final void h() {
        int i = this.A;
        ValueAnimator valueAnimator = this.z;
        if (i != 0) {
            if (i != 3) {
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
