package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te6  reason: default package */
/* loaded from: classes.dex */
public final class te6 extends ue6 {
    public float b;
    public float c;

    @Override // defpackage.ue6
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
