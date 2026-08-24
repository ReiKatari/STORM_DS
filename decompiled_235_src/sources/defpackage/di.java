package defpackage;

import android.media.ImageWriter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: di  reason: default package */
/* loaded from: classes.dex */
public final class di implements ImageWriter.OnImageReleasedListener, hh7, AutoCloseable {
    public final ImageWriter A;
    public final int B;
    public final xw L = g04.u(null);

    public di(ImageWriter imageWriter, int i) {
        this.A = imageWriter;
        this.B = i;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.A.close();
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(ImageWriter.class))) {
            return this.A;
        }
        return null;
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.L.a == null) {
            return;
        }
        u34.a();
    }

    public final String toString() {
        return "ImageWriter-" + fr6.a(this.A.getFormat()) + '-' + ((Object) ("Input-" + this.B));
    }
}
