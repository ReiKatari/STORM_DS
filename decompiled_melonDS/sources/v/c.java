package v;

import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements AutoCloseable {
    public final OutputConfiguration A;
    public final ImageReader B;

    public c(OutputConfiguration outputConfiguration, ImageReader imageReader) {
        this.A = outputConfiguration;
        this.B = imageReader;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ImageReader imageReader = this.B;
        if (imageReader != null) {
            imageReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!this.A.equals(cVar.A) || !k.a(this.B, cVar.B)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.A.hashCode() * 31;
        ImageReader imageReader = this.B;
        if (imageReader == null) {
            hashCode = 0;
        } else {
            hashCode = imageReader.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "CloseableOutputConfiguration(value=" + this.A + ", backingImageReader=" + this.B + ')';
    }
}
