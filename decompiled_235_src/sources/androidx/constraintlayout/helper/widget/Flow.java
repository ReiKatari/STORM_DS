package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Flow extends qq7 {
    public me2 i0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.qq7, defpackage.l11
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.i0 = new me2();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e75.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.i0.Y0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    me2 me2Var = this.i0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    me2Var.v0 = dimensionPixelSize;
                    me2Var.w0 = dimensionPixelSize;
                    me2Var.x0 = dimensionPixelSize;
                    me2Var.y0 = dimensionPixelSize;
                } else if (index == 18) {
                    me2 me2Var2 = this.i0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    me2Var2.x0 = dimensionPixelSize2;
                    me2Var2.z0 = dimensionPixelSize2;
                    me2Var2.A0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.i0.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.i0.z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.i0.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.i0.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.i0.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.i0.W0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.i0.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.i0.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.i0.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.i0.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.i0.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.i0.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.i0.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.i0.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.i0.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.i0.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.i0.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.i0.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.i0.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.i0.V0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.i0.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.i0.T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.i0.X0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.R = this.i0;
        k();
    }

    @Override // defpackage.l11
    public final void i(u11 u11Var, gx2 gx2Var, o21 o21Var, SparseArray sparseArray) {
        super.i(u11Var, gx2Var, o21Var, sparseArray);
        if (gx2Var instanceof me2) {
            me2 me2Var = (me2) gx2Var;
            int i = o21Var.V;
            if (i != -1) {
                me2Var.Y0 = i;
            }
        }
    }

    @Override // defpackage.l11
    public final void j(l21 l21Var, boolean z) {
        me2 me2Var = this.i0;
        int i = me2Var.x0;
        if (i <= 0 && me2Var.y0 <= 0) {
            return;
        }
        if (z) {
            me2Var.z0 = me2Var.y0;
            me2Var.A0 = i;
            return;
        }
        me2Var.z0 = i;
        me2Var.A0 = me2Var.y0;
    }

    @Override // defpackage.qq7
    public final void l(rq7 rq7Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (rq7Var != null) {
            rq7Var.V(mode, size, mode2, size2);
            setMeasuredDimension(rq7Var.C0, rq7Var.D0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // defpackage.l11, android.view.View
    public final void onMeasure(int i, int i2) {
        l(this.i0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.i0.O0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.i0.I0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.i0.P0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.i0.J0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.i0.U0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.i0.M0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.i0.S0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.i0.G0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.i0.Q0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.i0.K0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.i0.R0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.i0.L0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.i0.X0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.i0.Y0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        me2 me2Var = this.i0;
        me2Var.v0 = i;
        me2Var.w0 = i;
        me2Var.x0 = i;
        me2Var.y0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.i0.w0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.i0.z0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.i0.A0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.i0.v0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.i0.V0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.i0.N0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.i0.T0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.i0.H0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.i0.W0 = i;
        requestLayout();
    }
}
