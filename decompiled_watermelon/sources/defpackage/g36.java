package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g36  reason: default package */
/* loaded from: classes.dex */
public final class g36 extends i36 {
    public static final RectF h = new RectF();
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public float f;
    public float g;

    public g36(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // defpackage.i36
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f = this.d;
        float f2 = this.e;
        RectF rectF = h;
        rectF.set(this.b, this.c, f, f2);
        path.arcTo(rectF, this.f, this.g, false);
        path.transform(matrix);
    }
}
