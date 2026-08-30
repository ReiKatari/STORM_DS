package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import e5.a;
import e5.g;
import e5.h;
import e5.m;
import i5.c;
import i5.l;
import i5.r;
import i5.v;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class Barrier extends c {

    /* renamed from: e0  reason: collision with root package name */
    public int f1152e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1153f0;

    /* renamed from: g0  reason: collision with root package name */
    public a f1154g0;

    public Barrier(Context context) {
        super(context);
        this.A = new int[32];
        this.f6824d0 = new HashMap();
        this.L = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1154g0.f4259w0;
    }

    public int getMargin() {
        return this.f1154g0.f4260x0;
    }

    public int getType() {
        return this.f1152e0;
    }

    @Override // i5.c
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        this.f1154g0 = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f6994b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1154g0.f4259w0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1154g0.f4260x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.R = this.f1154g0;
        k();
    }

    @Override // i5.c
    public final void i(l lVar, m mVar, r rVar, SparseArray sparseArray) {
        super.i(lVar, mVar, rVar, sparseArray);
        i5.m mVar2 = lVar.f6906e;
        if (mVar instanceof a) {
            a aVar = (a) mVar;
            l(aVar, mVar2.f6924g0, ((h) mVar.U).f4336y0);
            aVar.f4259w0 = mVar2.f6939o0;
            aVar.f4260x0 = mVar2.f6926h0;
        }
    }

    @Override // i5.c
    public final void j(g gVar, boolean z10) {
        l(gVar, this.f1152e0, z10);
    }

    public final void l(g gVar, int i2, boolean z10) {
        this.f1153f0 = i2;
        int i10 = this.f1152e0;
        if (z10) {
            if (i10 == 5) {
                this.f1153f0 = 1;
            } else if (i10 == 6) {
                this.f1153f0 = 0;
            }
        } else if (i10 == 5) {
            this.f1153f0 = 0;
        } else if (i10 == 6) {
            this.f1153f0 = 1;
        }
        if (gVar instanceof a) {
            ((a) gVar).f4258v0 = this.f1153f0;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1154g0.f4259w0 = z10;
    }

    public void setDpMargin(int i2) {
        this.f1154g0.f4260x0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f1154g0.f4260x0 = i2;
    }

    public void setType(int i2) {
        this.f1152e0 = i2;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
