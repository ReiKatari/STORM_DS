package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface DataBufferObserver {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface Observable {
        void addObserver(com.google.android.gms.common.data.DataBufferObserver r1);

        void removeObserver(com.google.android.gms.common.data.DataBufferObserver r1);
    }

    void onDataChanged();

    void onDataRangeChanged(int r1, int r2);

    void onDataRangeInserted(int r1, int r2);

    void onDataRangeMoved(int r1, int r2, int r3);

    void onDataRangeRemoved(int r1, int r2);
}
