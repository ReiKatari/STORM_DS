package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class EntityBuffer<T> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private boolean zaa;
    private java.util.ArrayList zab;

    public EntityBuffer(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zaa = r1
            return
    }

    private final void zab() {
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zaa     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L83
            com.google.android.gms.common.data.DataHolder r0 = r7.mDataHolder     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.common.data.DataHolder r0 = (com.google.android.gms.common.data.DataHolder) r0     // Catch: java.lang.Throwable -> L55
            int r0 = r0.getCount()     // Catch: java.lang.Throwable -> L55
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            r7.zab = r1     // Catch: java.lang.Throwable -> L55
            r2 = 1
            if (r0 <= 0) goto L81
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L55
            r1.add(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r7.getPrimaryDataMarkerColumn()     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.common.data.DataHolder r4 = r7.mDataHolder     // Catch: java.lang.Throwable -> L55
            int r4 = r4.getWindowIndex(r3)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.common.data.DataHolder r5 = r7.mDataHolder     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = r5.getString(r1, r3, r4)     // Catch: java.lang.Throwable -> L55
            r4 = r2
        L34:
            if (r4 >= r0) goto L81
            com.google.android.gms.common.data.DataHolder r5 = r7.mDataHolder     // Catch: java.lang.Throwable -> L55
            int r5 = r5.getWindowIndex(r4)     // Catch: java.lang.Throwable -> L55
            com.google.android.gms.common.data.DataHolder r6 = r7.mDataHolder     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r6.getString(r1, r4, r5)     // Catch: java.lang.Throwable -> L55
            if (r6 == 0) goto L5a
            boolean r5 = r6.equals(r3)     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L57
            java.util.ArrayList r3 = r7.zab     // Catch: java.lang.Throwable -> L55
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L55
            r3.add(r5)     // Catch: java.lang.Throwable -> L55
            r3 = r6
            goto L57
        L55:
            r0 = move-exception
            goto L85
        L57:
            int r4 = r4 + 1
            goto L34
        L5a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "Missing value for markerColumn: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L55
            r2.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = ", at row: "
            r2.append(r1)     // Catch: java.lang.Throwable -> L55
            r2.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = ", for window: "
            r2.append(r1)     // Catch: java.lang.Throwable -> L55
            r2.append(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L55
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L81:
            r7.zaa = r2     // Catch: java.lang.Throwable -> L55
        L83:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L55
            return
        L85:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L55
            throw r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final T get(int r7) {
            r6 = this;
            r6.zab()
            int r0 = r6.zaa(r7)
            r1 = 0
            if (r7 < 0) goto L77
            java.util.ArrayList r2 = r6.zab
            int r2 = r2.size()
            if (r7 != r2) goto L13
            goto L77
        L13:
            java.util.ArrayList r2 = r6.zab
            int r2 = r2.size()
            int r2 = r2 + (-1)
            if (r7 != r2) goto L37
            com.google.android.gms.common.data.DataHolder r2 = r6.mDataHolder
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.data.DataHolder r2 = (com.google.android.gms.common.data.DataHolder) r2
            int r2 = r2.getCount()
            java.util.ArrayList r3 = r6.zab
            java.lang.Object r3 = r3.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
        L35:
            int r2 = r2 - r3
            goto L52
        L37:
            java.util.ArrayList r2 = r6.zab
            int r3 = r7 + 1
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList r3 = r6.zab
            java.lang.Object r3 = r3.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L35
        L52:
            r3 = 1
            if (r2 != r3) goto L76
            int r7 = r6.zaa(r7)
            com.google.android.gms.common.data.DataHolder r2 = r6.mDataHolder
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.data.DataHolder r2 = (com.google.android.gms.common.data.DataHolder) r2
            int r2 = r2.getWindowIndex(r7)
            java.lang.String r4 = r6.getChildDataMarkerColumn()
            if (r4 == 0) goto L74
            com.google.android.gms.common.data.DataHolder r5 = r6.mDataHolder
            java.lang.String r7 = r5.getString(r4, r7, r2)
            if (r7 != 0) goto L74
            goto L77
        L74:
            r1 = r3
            goto L77
        L76:
            r1 = r2
        L77:
            java.lang.Object r6 = r6.getEntry(r0, r1)
            return r6
    }

    public java.lang.String getChildDataMarkerColumn() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public int getCount() {
            r0 = this;
            r0.zab()
            java.util.ArrayList r0 = r0.zab
            int r0 = r0.size()
            return r0
    }

    public abstract T getEntry(int r1, int r2);

    public abstract java.lang.String getPrimaryDataMarkerColumn();

    public final int zaa(int r2) {
            r1 = this;
            if (r2 < 0) goto L17
            java.util.ArrayList r0 = r1.zab
            int r0 = r0.size()
            if (r2 >= r0) goto L17
            java.util.ArrayList r1 = r1.zab
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
        L17:
            java.lang.String r1 = "Position "
            java.lang.String r0 = " is out of bounds for this buffer"
            java.lang.String r1 = defpackage.lb1.k(r1, r2, r0)
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }
}
