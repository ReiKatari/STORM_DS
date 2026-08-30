package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends z {

    /* renamed from: e  reason: collision with root package name */
    public final d0 f11883e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f11884f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f11885g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f11886h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11887i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11888j;

    public e0(d0 d0Var) {
        super(d0Var);
        this.f11885g = null;
        this.f11886h = null;
        this.f11887i = false;
        this.f11888j = false;
        this.f11883e = d0Var;
    }

    @Override // q.z
    public final void b(AttributeSet attributeSet, int i2) {
        super.b(attributeSet, R.attr.seekBarStyle);
        d0 d0Var = this.f11883e;
        Context context = d0Var.getContext();
        int[] iArr = k.a.f7917g;
        p1.c1 o5 = p1.c1.o(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) o5.B;
        a6.x0.n(d0Var, d0Var.getContext(), iArr, attributeSet, (TypedArray) o5.B, R.attr.seekBarStyle);
        Drawable i10 = o5.i(0);
        if (i10 != null) {
            d0Var.setThumb(i10);
        }
        Drawable h2 = o5.h(1);
        Drawable drawable = this.f11884f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f11884f = h2;
        if (h2 != null) {
            h2.setCallback(d0Var);
            h2.setLayoutDirection(d0Var.getLayoutDirection());
            if (h2.isStateful()) {
                h2.setState(d0Var.getDrawableState());
            }
            f();
        }
        d0Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.f11886h = l1.c(typedArray.getInt(3, -1), this.f11886h);
            this.f11888j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f11885g = o5.e(2);
            this.f11887i = true;
        }
        o5.p();
        f();
    }

    public final void f() {
        Drawable drawable = this.f11884f;
        if (drawable != null) {
            if (this.f11887i || this.f11888j) {
                Drawable mutate = drawable.mutate();
                this.f11884f = mutate;
                if (this.f11887i) {
                    mutate.setTintList(this.f11885g);
                }
                if (this.f11888j) {
                    this.f11884f.setTintMode(this.f11886h);
                }
                if (this.f11884f.isStateful()) {
                    this.f11884f.setState(this.f11883e.getDrawableState());
                }
            }
        }
    }

    public final void g(Canvas canvas) {
        d0 d0Var;
        int i2;
        if (this.f11884f != null) {
            int max = this.f11883e.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f11884f.getIntrinsicWidth();
                int intrinsicHeight = this.f11884f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i2 = intrinsicWidth / 2;
                } else {
                    i2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f11884f.setBounds(-i2, -i10, i2, i10);
                float width = ((d0Var.getWidth() - d0Var.getPaddingLeft()) - d0Var.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(d0Var.getPaddingLeft(), d0Var.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f11884f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
