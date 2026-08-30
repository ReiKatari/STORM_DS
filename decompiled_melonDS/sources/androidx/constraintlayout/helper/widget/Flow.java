package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import e5.g;
import e5.j;
import e5.m;
import e5.p;
import i5.l;
import i5.r;
import i5.v;
import i5.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class Flow extends z {

    /* renamed from: g0  reason: collision with root package name */
    public j f1073g0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // i5.z, i5.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f1073g0 = new j();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f6994b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f1073g0.Y0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    j jVar = this.f1073g0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    jVar.f4370v0 = dimensionPixelSize;
                    jVar.f4371w0 = dimensionPixelSize;
                    jVar.f4372x0 = dimensionPixelSize;
                    jVar.f4373y0 = dimensionPixelSize;
                } else if (index == 18) {
                    j jVar2 = this.f1073g0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    jVar2.f4372x0 = dimensionPixelSize2;
                    jVar2.f4374z0 = dimensionPixelSize2;
                    jVar2.A0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1073g0.f4373y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1073g0.f4374z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1073g0.f4370v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1073g0.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1073g0.f4371w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1073g0.W0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1073g0.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1073g0.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1073g0.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1073g0.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1073g0.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1073g0.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1073g0.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1073g0.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1073g0.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1073g0.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1073g0.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1073g0.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1073g0.U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1073g0.V0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1073g0.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1073g0.T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1073g0.X0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.R = this.f1073g0;
        k();
    }

    @Override // i5.c
    public final void i(l lVar, m mVar, r rVar, SparseArray sparseArray) {
        super.i(lVar, mVar, rVar, sparseArray);
        if (mVar instanceof j) {
            j jVar = (j) mVar;
            int i2 = rVar.V;
            if (i2 != -1) {
                jVar.Y0 = i2;
            }
        }
    }

    @Override // i5.c
    public final void j(g gVar, boolean z10) {
        j jVar = this.f1073g0;
        int i2 = jVar.f4372x0;
        if (i2 <= 0 && jVar.f4373y0 <= 0) {
            return;
        }
        if (z10) {
            jVar.f4374z0 = jVar.f4373y0;
            jVar.A0 = i2;
            return;
        }
        jVar.f4374z0 = i2;
        jVar.A0 = jVar.f4373y0;
    }

    @Override // i5.z
    public final void l(p pVar, int i2, int i10) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (pVar != null) {
            pVar.V(mode, size, mode2, size2);
            setMeasuredDimension(pVar.C0, pVar.D0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // i5.c, android.view.View
    public final void onMeasure(int i2, int i10) {
        l(this.f1073g0, i2, i10);
    }

    public void setFirstHorizontalBias(float f8) {
        this.f1073g0.O0 = f8;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f1073g0.I0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f8) {
        this.f1073g0.P0 = f8;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f1073g0.J0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f1073g0.U0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f8) {
        this.f1073g0.M0 = f8;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f1073g0.S0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f1073g0.G0 = i2;
        requestLayout();
    }

    public void setLastHorizontalBias(float f8) {
        this.f1073g0.Q0 = f8;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i2) {
        this.f1073g0.K0 = i2;
        requestLayout();
    }

    public void setLastVerticalBias(float f8) {
        this.f1073g0.R0 = f8;
        requestLayout();
    }

    public void setLastVerticalStyle(int i2) {
        this.f1073g0.L0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f1073g0.X0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f1073g0.Y0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        j jVar = this.f1073g0;
        jVar.f4370v0 = i2;
        jVar.f4371w0 = i2;
        jVar.f4372x0 = i2;
        jVar.f4373y0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f1073g0.f4371w0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f1073g0.f4374z0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f1073g0.A0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f1073g0.f4370v0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f1073g0.V0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f8) {
        this.f1073g0.N0 = f8;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f1073g0.T0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f1073g0.H0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f1073g0.W0 = i2;
        requestLayout();
    }
}
