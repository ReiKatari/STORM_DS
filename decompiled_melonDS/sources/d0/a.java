package d0;

import android.graphics.Matrix;
import android.media.Image;
import j0.h2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements y0 {
    public final Image A;
    public final a0.b[] B;
    public final g L;

    public a(Image image) {
        this.A = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.B = new a0.b[planes.length];
            for (int i2 = 0; i2 < planes.length; i2++) {
                this.B[i2] = new a0.b(21, planes[i2]);
            }
        } else {
            this.B = new a0.b[0];
        }
        this.L = new g(h2.f7211b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // d0.y0
    public final int a() {
        return this.A.getHeight();
    }

    @Override // d0.y0
    public final int c() {
        return this.A.getWidth();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // d0.y0
    public final int getFormat() {
        return this.A.getFormat();
    }

    @Override // d0.y0
    public final x0[] l() {
        return this.B;
    }

    @Override // d0.y0
    public final t0 q() {
        return this.L;
    }
}
