package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cl0  reason: default package */
/* loaded from: classes.dex */
public final class cl0 extends dg5 {
    public final Paint a;
    public final List b;

    public cl0() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.dg5
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int E;
        Canvas canvas2;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        for (di3 di3Var : this.b) {
            di3Var.getClass();
            ThreadLocal threadLocal = tt0.a;
            float f = 1.0f - RecyclerView.B1;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.B1) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * RecyclerView.B1) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * RecyclerView.B1) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * RecyclerView.B1) + (Color.blue(-65281) * f))));
            int i2 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).E0()) {
                dl0 dl0Var = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (dl0Var.b) {
                    case 0:
                        break;
                    default:
                        i2 = dl0Var.c.F();
                        break;
                }
                float f2 = i2;
                dl0 dl0Var2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (dl0Var2.b) {
                    case 0:
                        i = dl0Var2.c.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = dl0Var2.c;
                        i = carouselLayoutManager.o - carouselLayoutManager.C();
                        break;
                }
                float f3 = i;
                canvas2 = canvas;
                canvas2.drawLine(RecyclerView.B1, f2, RecyclerView.B1, f3, paint);
            } else {
                dl0 dl0Var3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (dl0Var3.b) {
                    case 0:
                        i2 = dl0Var3.c.D();
                        break;
                }
                float f4 = i2;
                dl0 dl0Var4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (dl0Var4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = dl0Var4.c;
                        E = carouselLayoutManager2.n - carouselLayoutManager2.E();
                        break;
                    default:
                        E = dl0Var4.c.n;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, RecyclerView.B1, E, RecyclerView.B1, paint);
            }
            canvas = canvas2;
        }
    }
}
