package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DataBufferResponse<T, R extends com.google.android.gms.common.data.AbstractDataBuffer<T> & com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.Response<R> implements com.google.android.gms.common.data.DataBuffer<T> {
    public DataBufferResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Incorrect types in method signature: (TR;)V */
    public DataBufferResponse(com.google.android.gms.common.data.AbstractDataBuffer r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            r0.close()
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final T get(int r1) {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            int r0 = r0.getCount()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final android.os.Bundle getMetadata() {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            android.os.Bundle r0 = r0.getMetadata()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final boolean isClosed() {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            boolean r0 = r0.isClosed()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            r0.release()
            return
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final java.util.Iterator<T> singleRefIterator() {
            r0 = this;
            com.google.android.gms.common.api.Result r0 = r0.getResult()
            com.google.android.gms.common.data.AbstractDataBuffer r0 = (com.google.android.gms.common.data.AbstractDataBuffer) r0
            java.util.Iterator r0 = r0.singleRefIterator()
            return r0
    }
}
