package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Barrier extends l11 {
    public int g0;
    public int h0;
    public a20 i0;

    public Barrier(Context context) {
        super(context);
        this.A = new int[32];
        this.f0 = new HashMap();
        this.L = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.i0.w0;
    }

    public int getMargin() {
        return this.i0.x0;
    }

    public int getType() {
        return this.g0;
    }

    @Override // defpackage.l11
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.i0 = new a20();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e75.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.i0.w0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.i0.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
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
        v11 v11Var = u11Var.e;
        if (gx2Var instanceof a20) {
            a20 a20Var = (a20) gx2Var;
            l(a20Var, v11Var.g0, ((m21) gx2Var.U).y0);
            a20Var.w0 = v11Var.o0;
            a20Var.x0 = v11Var.h0;
        }
    }

    @Override // defpackage.l11
    public final void j(l21 l21Var, boolean z) {
        l(l21Var, this.g0, z);
    }

    public final void l(l21 l21Var, int i, boolean z) {
        this.h0 = i;
        int i2 = this.g0;
        if (z) {
            if (i2 == 5) {
                this.h0 = 1;
            } else if (i2 == 6) {
                this.h0 = 0;
            }
        } else if (i2 == 5) {
            this.h0 = 0;
        } else if (i2 == 6) {
            this.h0 = 1;
        }
        if (l21Var instanceof a20) {
            ((a20) l21Var).v0 = this.h0;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.i0.w0 = z;
    }

    public void setDpMargin(int i) {
        this.i0.x0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.i0.x0 = i;
    }

    public void setType(int i) {
        this.g0 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
