package androidx.graphics.path;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class PathIteratorPreApi34Impl {
    static {
            java.lang.String r0 = "androidx.graphics.path"
            java.lang.System.loadLibrary(r0)
            return
    }

    private final native long createInternalPathIterator(android.graphics.Path r1, int r2, float r3);

    private final native void destroyInternalPathIterator(long r1);

    @dalvik.annotation.optimization.FastNative
    private final native boolean internalPathIteratorHasNext(long r1);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorNext(long r1, float[] r3, int r4);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorPeek(long r1);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorRawSize(long r1);

    @dalvik.annotation.optimization.FastNative
    private final native int internalPathIteratorSize(long r1);

    public final void finalize() {
            r2 = this;
            r0 = 0
            r2.destroyInternalPathIterator(r0)
            return
    }
}
