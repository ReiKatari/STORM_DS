package defpackage;

import android.media.ImageWriter;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rh  reason: default package */
/* loaded from: classes.dex */
public final class rh implements ImageWriter.OnImageReleasedListener, m37, AutoCloseable {
    public final ImageWriter A;
    public final int B;
    public final fw L = w81.g(null);

    public rh(ImageWriter imageWriter, int i) {
        this.A = imageWriter;
        this.B = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.L.a == null) {
            return;
        }
        c44.b();
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(ImageWriter.class))) {
            return this.A;
        }
        return null;
    }

    public final String toString() {
        return "ImageWriter-" + pf6.a(this.A.getFormat()) + '-' + ((Object) ("Input-" + this.B));
    }
}
