package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DataBufferObserverSet implements com.google.android.gms.common.data.DataBufferObserver, com.google.android.gms.common.data.DataBufferObserver.Observable {
    private final java.util.HashSet zaa;

    public DataBufferObserverSet() {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.zaa = r0
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void addObserver(com.google.android.gms.common.data.DataBufferObserver r1) {
            r0 = this;
            java.util.HashSet r0 = r0.zaa
            r0.add(r1)
            return
    }

    public void clear() {
            r0 = this;
            java.util.HashSet r0 = r0.zaa
            r0.clear()
            return
    }

    public boolean hasObservers() {
            r0 = this;
            java.util.HashSet r0 = r0.zaa
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
            r1 = this;
            java.util.HashSet r1 = r1.zaa
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.data.DataBufferObserver r0 = (com.google.android.gms.common.data.DataBufferObserver) r0
            r0.onDataChanged()
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int r2, int r3) {
            r1 = this;
            java.util.HashSet r1 = r1.zaa
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.data.DataBufferObserver r0 = (com.google.android.gms.common.data.DataBufferObserver) r0
            r0.onDataRangeChanged(r2, r3)
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int r2, int r3) {
            r1 = this;
            java.util.HashSet r1 = r1.zaa
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.data.DataBufferObserver r0 = (com.google.android.gms.common.data.DataBufferObserver) r0
            r0.onDataRangeInserted(r2, r3)
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int r2, int r3, int r4) {
            r1 = this;
            java.util.HashSet r1 = r1.zaa
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.data.DataBufferObserver r0 = (com.google.android.gms.common.data.DataBufferObserver) r0
            r0.onDataRangeMoved(r2, r3, r4)
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int r2, int r3) {
            r1 = this;
            java.util.HashSet r1 = r1.zaa
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.data.DataBufferObserver r0 = (com.google.android.gms.common.data.DataBufferObserver) r0
            r0.onDataRangeRemoved(r2, r3)
            goto L6
        L16:
            return
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void removeObserver(com.google.android.gms.common.data.DataBufferObserver r1) {
            r0 = this;
            java.util.HashSet r0 = r0.zaa
            r0.remove(r1)
            return
    }
}
