package aa;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import j7.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f680a;

    /* renamed from: b  reason: collision with root package name */
    public final List f681b;

    public c() {
        Paint paint = new Paint();
        this.f680a = paint;
        this.f681b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // j7.r0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int E;
        int i2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f680a;
        paint.setStrokeWidth(dimension);
        for (e eVar : this.f681b) {
            eVar.getClass();
            ThreadLocal threadLocal = q5.a.f12281a;
            float f8 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f8)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f8)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f8)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f8))));
            int i10 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).E0()) {
                d dVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3008q;
                switch (dVar.f683b) {
                    case 0:
                        break;
                    default:
                        i10 = dVar.f684c.F();
                        break;
                }
                float f10 = i10;
                d dVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3008q;
                switch (dVar2.f683b) {
                    case 0:
                        i2 = dVar2.f684c.f7721o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = dVar2.f684c;
                        i2 = carouselLayoutManager.f7721o - carouselLayoutManager.C();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f10, 0.0f, i2, paint);
            } else {
                canvas2 = canvas;
                d dVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3008q;
                switch (dVar3.f683b) {
                    case 0:
                        i10 = dVar3.f684c.D();
                        break;
                }
                float f11 = i10;
                d dVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3008q;
                switch (dVar4.f683b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = dVar4.f684c;
                        E = carouselLayoutManager2.f7720n - carouselLayoutManager2.E();
                        break;
                    default:
                        E = dVar4.f684c.f7720n;
                        break;
                }
                canvas2.drawLine(f11, 0.0f, E, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
