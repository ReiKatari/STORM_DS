package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private Object zac;

    public SingleRefDataBufferIterator(DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        boolean hasNext = hasNext();
        int i = this.zab;
        if (hasNext) {
            int i2 = i + 1;
            this.zab = i2;
            if (i2 == 0) {
                Object checkNotNull = Preconditions.checkNotNull(this.zaa.get(0));
                this.zac = checkNotNull;
                if (!(checkNotNull instanceof DataBufferRef)) {
                    i.m(lb1.A("DataBuffer reference of type ", String.valueOf(checkNotNull.getClass()), " is not movable"));
                    return null;
                }
            } else {
                ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
            }
            return this.zac;
        }
        fa6.e(lb1.g(i, "Cannot advance the iterator beyond "));
        return null;
    }
}
