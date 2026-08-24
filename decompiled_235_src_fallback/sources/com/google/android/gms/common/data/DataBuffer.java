package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface DataBuffer<T> extends java.lang.Iterable<T>, com.google.android.gms.common.api.Releasable, java.io.Closeable {
    void close();

    T get(int r1);

    int getCount();

    android.os.Bundle getMetadata();

    @java.lang.Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    java.util.Iterator<T> iterator();

    void release();

    java.util.Iterator<T> singleRefIterator();
}
