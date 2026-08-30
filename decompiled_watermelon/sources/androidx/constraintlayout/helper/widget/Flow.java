package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class Flow extends oc7 {
    public v92 h0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.oc7, defpackage.gy0
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.h0 = new v92();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tx4.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.h0.Y0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    v92 v92Var = this.h0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    v92Var.v0 = dimensionPixelSize;
                    v92Var.w0 = dimensionPixelSize;
                    v92Var.x0 = dimensionPixelSize;
                    v92Var.y0 = dimensionPixelSize;
                } else if (index == 18) {
                    v92 v92Var2 = this.h0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    v92Var2.x0 = dimensionPixelSize2;
                    v92Var2.z0 = dimensionPixelSize2;
                    v92Var2.A0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.h0.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.h0.z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.h0.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.h0.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.h0.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.h0.W0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.h0.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.h0.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.h0.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.h0.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.h0.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.h0.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.h0.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.h0.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.h0.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.h0.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.h0.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.h0.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.h0.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.h0.V0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.h0.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.h0.T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.h0.X0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.R = this.h0;
        k();
    }

    @Override // defpackage.gy0
    public final void i(py0 py0Var, fr2 fr2Var, jz0 jz0Var, SparseArray sparseArray) {
        super.i(py0Var, fr2Var, jz0Var, sparseArray);
        if (fr2Var instanceof v92) {
            v92 v92Var = (v92) fr2Var;
            int i = jz0Var.V;
            if (i != -1) {
                v92Var.Y0 = i;
            }
        }
    }

    @Override // defpackage.gy0
    public final void j(gz0 gz0Var, boolean z) {
        v92 v92Var = this.h0;
        int i = v92Var.x0;
        if (i <= 0 && v92Var.y0 <= 0) {
            return;
        }
        if (z) {
            v92Var.z0 = v92Var.y0;
            v92Var.A0 = i;
            return;
        }
        v92Var.z0 = i;
        v92Var.A0 = v92Var.y0;
    }

    @Override // defpackage.oc7
    public final void l(pc7 pc7Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (pc7Var != null) {
            pc7Var.V(mode, size, mode2, size2);
            setMeasuredDimension(pc7Var.C0, pc7Var.D0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // defpackage.gy0, android.view.View
    public final void onMeasure(int i, int i2) {
        l(this.h0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.h0.O0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.h0.I0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.h0.P0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.h0.J0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.h0.U0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.h0.M0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.h0.S0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.h0.G0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.h0.Q0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.h0.K0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.h0.R0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.h0.L0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.h0.X0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.h0.Y0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        v92 v92Var = this.h0;
        v92Var.v0 = i;
        v92Var.w0 = i;
        v92Var.x0 = i;
        v92Var.y0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.h0.w0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.h0.z0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.h0.A0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.h0.v0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.h0.V0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.h0.N0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.h0.T0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.h0.H0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.h0.W0 = i;
        requestLayout();
    }
}
