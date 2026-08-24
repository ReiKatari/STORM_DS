package defpackage;

import android.graphics.Matrix;
import android.media.Image;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai  reason: default package */
/* loaded from: classes.dex */
public final class ai implements s23 {
    public final Image A;
    public final os0[] B;
    public final ly L;

    public ai(Image image) {
        this.A = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.B = new os0[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.B[i] = new os0(planes[i], 9);
            }
        } else {
            this.B = new os0[0];
        }
        this.L = new ly(sy6.b, image.getTimestamp(), 0, new Matrix(), 0);
    }

    @Override // defpackage.s23
    public final i23 S() {
        return this.L;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.s23
    public final int getFormat() {
        return this.A.getFormat();
    }

    @Override // defpackage.s23
    public final int getHeight() {
        return this.A.getHeight();
    }

    @Override // defpackage.s23
    public final int getWidth() {
        return this.A.getWidth();
    }

    @Override // defpackage.s23
    public final r23[] j() {
        return this.B;
    }
}
