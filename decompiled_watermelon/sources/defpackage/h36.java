package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h36  reason: default package */
/* loaded from: classes.dex */
public final class h36 extends i36 {
    public float b;
    public float c;

    @Override // defpackage.i36
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
