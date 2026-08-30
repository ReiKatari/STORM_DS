package na;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends w {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f10223c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f10224d;

    public q(ArrayList arrayList, Matrix matrix) {
        this.f10223c = arrayList;
        this.f10224d = matrix;
    }

    @Override // na.w
    public final void a(Matrix matrix, ma.a aVar, int i2, Canvas canvas) {
        ArrayList arrayList = this.f10223c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((w) obj).a(this.f10224d, aVar, i2, canvas);
        }
    }
}
