package i5;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends View {
    public boolean A;

    public t(Context context) {
        super(context);
        this.A = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.A = z10;
    }

    public void setGuidelineBegin(int i2) {
        f fVar = (f) getLayoutParams();
        if (this.A && fVar.f6827a == i2) {
            return;
        }
        fVar.f6827a = i2;
        setLayoutParams(fVar);
    }

    public void setGuidelineEnd(int i2) {
        f fVar = (f) getLayoutParams();
        if (this.A && fVar.f6829b == i2) {
            return;
        }
        fVar.f6829b = i2;
        setLayoutParams(fVar);
    }

    public void setGuidelinePercent(float f8) {
        f fVar = (f) getLayoutParams();
        if (this.A && fVar.f6831c == f8) {
            return;
        }
        fVar.f6831c = f8;
        setLayoutParams(fVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
    }
}
