package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu2  reason: default package */
/* loaded from: classes.dex */
public final class zu2 extends View {
    public boolean A;

    public zu2(Context context) {
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
        o11 o11Var = (o11) getLayoutParams();
        if (this.A && o11Var.a == i) {
            return;
        }
        o11Var.a = i;
        setLayoutParams(o11Var);
    }

    public void setGuidelineEnd(int i) {
        o11 o11Var = (o11) getLayoutParams();
        if (this.A && o11Var.b == i) {
            return;
        }
        o11Var.b = i;
        setLayoutParams(o11Var);
    }

    public void setGuidelinePercent(float f) {
        o11 o11Var = (o11) getLayoutParams();
        if (this.A && o11Var.c == f) {
            return;
        }
        o11Var.c = f;
        setLayoutParams(o11Var);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
