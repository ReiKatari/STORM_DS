package na;

import android.graphics.Matrix;
import android.graphics.Path;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends v {

    /* renamed from: b  reason: collision with root package name */
    public float f10236b;

    /* renamed from: c  reason: collision with root package name */
    public float f10237c;

    @Override // na.v
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f10238a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f10236b, this.f10237c);
        path.transform(matrix);
    }
}
