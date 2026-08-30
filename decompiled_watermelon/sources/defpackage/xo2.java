package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xo2  reason: default package */
/* loaded from: classes.dex */
public final class xo2 extends View {
    public boolean A;

    public xo2(Context context) {
        super(context);
        this.A = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.A = z;
    }

    public void setGuidelineBegin(int i) {
        jy0 jy0Var = (jy0) getLayoutParams();
        if (this.A && jy0Var.a == i) {
            return;
        }
        jy0Var.a = i;
        setLayoutParams(jy0Var);
    }

    public void setGuidelineEnd(int i) {
        jy0 jy0Var = (jy0) getLayoutParams();
        if (this.A && jy0Var.b == i) {
            return;
        }
        jy0Var.b = i;
        setLayoutParams(jy0Var);
    }

    public void setGuidelinePercent(float f) {
        jy0 jy0Var = (jy0) getLayoutParams();
        if (this.A && jy0Var.c == f) {
            return;
        }
        jy0Var.c = f;
        setLayoutParams(jy0Var);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
