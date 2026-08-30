package na;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: h  reason: collision with root package name */
    public static final RectF f10229h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final float f10230b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10231c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10232d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10233e;

    /* renamed from: f  reason: collision with root package name */
    public float f10234f;

    /* renamed from: g  reason: collision with root package name */
    public float f10235g;

    public t(float f8, float f10, float f11, float f12) {
        this.f10230b = f8;
        this.f10231c = f10;
        this.f10232d = f11;
        this.f10233e = f12;
    }

    @Override // na.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f10238a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f8 = this.f10232d;
        float f10 = this.f10233e;
        RectF rectF = f10229h;
        rectF.set(this.f10230b, this.f10231c, f8, f10);
        path.arcTo(rectF, this.f10234f, this.f10235g, false);
        path.transform(matrix);
    }
}
