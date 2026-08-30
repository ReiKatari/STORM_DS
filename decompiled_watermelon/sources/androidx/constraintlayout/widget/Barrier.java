package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class Barrier extends gy0 {
    public int f0;
    public int g0;
    public j00 h0;

    public Barrier(Context context) {
        super(context);
        this.A = new int[32];
        this.e0 = new HashMap();
        this.L = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.h0.w0;
    }

    public int getMargin() {
        return this.h0.x0;
    }

    public int getType() {
        return this.f0;
    }

    @Override // defpackage.gy0
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.h0 = new j00();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tx4.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.h0.w0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.h0.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
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
        qy0 qy0Var = py0Var.e;
        if (fr2Var instanceof j00) {
            j00 j00Var = (j00) fr2Var;
            l(j00Var, qy0Var.g0, ((hz0) fr2Var.U).y0);
            j00Var.w0 = qy0Var.o0;
            j00Var.x0 = qy0Var.h0;
        }
    }

    @Override // defpackage.gy0
    public final void j(gz0 gz0Var, boolean z) {
        l(gz0Var, this.f0, z);
    }

    public final void l(gz0 gz0Var, int i, boolean z) {
        this.g0 = i;
        int i2 = this.f0;
        if (z) {
            if (i2 == 5) {
                this.g0 = 1;
            } else if (i2 == 6) {
                this.g0 = 0;
            }
        } else if (i2 == 5) {
            this.g0 = 0;
        } else if (i2 == 6) {
            this.g0 = 1;
        }
        if (gz0Var instanceof j00) {
            ((j00) gz0Var).v0 = this.g0;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.h0.w0 = z;
    }

    public void setDpMargin(int i) {
        this.h0.x0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.h0.x0 = i;
    }

    public void setType(int i) {
        this.f0 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
