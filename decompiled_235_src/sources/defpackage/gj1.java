package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj1  reason: default package */
/* loaded from: classes.dex */
public final class gj1 extends p0 implements zk4 {
    public final Window i0;
    public final vs4 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;

    public gj1(Context context, Window window) {
        super(context, null);
        this.i0 = window;
        this.j0 = np2.Y(aw0.a);
        WeakHashMap weakHashMap = ao7.a;
        sn7.c(this, this);
        ao7.p(this, new fj1(this));
    }

    @Override // defpackage.zk4
    public final vu7 U(View view, vu7 vu7Var) {
        if (!this.l0) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return vu7Var.a.q(max, max2, max3, max4);
            }
        }
        return vu7Var;
    }

    @Override // defpackage.p0
    public final void a(px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1735448596);
        if (xq2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            ((eo2) this.j0.getValue()).o(xq2Var, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new o0(this, i, 5);
        }
    }

    @Override // defpackage.p0
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingBottom = (((i6 - measuredHeight) - (getPaddingBottom() + paddingTop)) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingBottom, measuredWidth + paddingLeft, measuredHeight + paddingBottom);
    }

    @Override // defpackage.p0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.n0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    @Override // defpackage.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int mode;
        int min;
        int i6 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        Window window = this.i0;
        if (mode2 == Integer.MIN_VALUE && !this.k0 && window.getAttributes().height == -2) {
            if (this.l0) {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 30) {
                    i3 = lp.a.a(window);
                } else if (i7 < 32) {
                    i3 = sp.a.a(window);
                }
            } else {
                i3 = size2 + 1;
            }
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            i4 = size - paddingRight;
            if (i4 < 0) {
                i4 = 0;
            }
            i5 = i3 - paddingBottom;
            if (i5 >= 0) {
                i6 = i5;
            }
            mode = View.MeasureSpec.getMode(i);
            if (mode != 0) {
                i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
            }
            if (mode2 != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            }
            childAt.measure(i, i2);
            if (mode == Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    size = childAt.getMeasuredWidth() + paddingRight;
                }
            } else {
                size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            }
            if (mode2 == Integer.MIN_VALUE) {
                if (mode2 != 1073741824) {
                    min = childAt.getMeasuredHeight() + paddingBottom;
                } else {
                    min = size2;
                }
            } else {
                min = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
            }
            setMeasuredDimension(size, min);
            if (this.l0 && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(Integer.MIN_VALUE);
                if (!this.k0) {
                    window.setLayout(-1, -1);
                    return;
                }
                return;
            }
            return;
        }
        i3 = size2;
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        i4 = size - paddingRight2;
        if (i4 < 0) {
        }
        i5 = i3 - paddingBottom2;
        if (i5 >= 0) {
        }
        mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i, i2);
        if (mode == Integer.MIN_VALUE) {
        }
        if (mode2 == Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, min);
        if (this.l0) {
        }
    }
}
