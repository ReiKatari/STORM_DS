package androidx.graphics.path;

import android.graphics.Path;
import dalvik.annotation.optimization.FastNative;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
        System.loadLibrary("androidx.graphics.path");
    }

    private final native long createInternalPathIterator(Path path, int i2, float f8);

    private final native void destroyInternalPathIterator(long j2);

    @FastNative
    private final native boolean internalPathIteratorHasNext(long j2);

    @FastNative
    private final native int internalPathIteratorNext(long j2, float[] fArr, int i2);

    @FastNative
    private final native int internalPathIteratorPeek(long j2);

    @FastNative
    private final native int internalPathIteratorRawSize(long j2);

    @FastNative
    private final native int internalPathIteratorSize(long j2);

    public final void finalize() {
        destroyInternalPathIterator(0L);
    }
}
