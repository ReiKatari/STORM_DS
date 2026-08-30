package defpackage;

import android.graphics.Matrix;
import android.media.Image;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oh  reason: default package */
/* loaded from: classes.dex */
public final class oh implements ow2 {
    public final Image A;
    public final bq0[] B;
    public final dx L;

    public oh(Image image) {
        this.A = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.B = new bq0[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.B[i] = new bq0(9, planes[i]);
            }
        } else {
            this.B = new bq0[0];
        }
        this.L = new dx(im6.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // defpackage.ow2
    public final int a() {
        return this.A.getHeight();
    }

    @Override // defpackage.ow2
    public final int c() {
        return this.A.getWidth();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.ow2
    public final int getFormat() {
        return this.A.getFormat();
    }

    @Override // defpackage.ow2
    public final nw2[] m() {
        return this.B;
    }

    @Override // defpackage.ow2
    public final ew2 s() {
        return this.L;
    }
}
