package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ui0  reason: default package */
/* loaded from: classes.dex */
public final class ui0 extends n65 {
    public final Paint a;
    public final List b;

    public ui0() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.n65
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int E;
        Canvas canvas2;
        int i;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        for (lb3 lb3Var : this.b) {
            lb3Var.getClass();
            ThreadLocal threadLocal = gr0.a;
            float f = 1.0f - RecyclerView.A1;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * RecyclerView.A1) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * RecyclerView.A1) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * RecyclerView.A1) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * RecyclerView.A1) + (Color.blue(-65281) * f))));
            int i2 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).E0()) {
                vi0 vi0Var = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (vi0Var.b) {
                    case 0:
                        break;
                    default:
                        i2 = vi0Var.c.F();
                        break;
                }
                float f2 = i2;
                vi0 vi0Var2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (vi0Var2.b) {
                    case 0:
                        i = vi0Var2.c.o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = vi0Var2.c;
                        i = carouselLayoutManager.o - carouselLayoutManager.C();
                        break;
                }
                float f3 = i;
                canvas2 = canvas;
                canvas2.drawLine(RecyclerView.A1, f2, RecyclerView.A1, f3, paint);
            } else {
                vi0 vi0Var3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (vi0Var3.b) {
                    case 0:
                        i2 = vi0Var3.c.D();
                        break;
                }
                float f4 = i2;
                vi0 vi0Var4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q;
                switch (vi0Var4.b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = vi0Var4.c;
                        E = carouselLayoutManager2.n - carouselLayoutManager2.E();
                        break;
                    default:
                        E = vi0Var4.c.n;
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(f4, RecyclerView.A1, E, RecyclerView.A1, paint);
            }
            canvas = canvas2;
        }
    }
}
