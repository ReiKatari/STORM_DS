package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class DataBufferRef {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected int mDataRow;
    private int zaa;

    public DataBufferRef(com.google.android.gms.common.data.DataHolder r1, int r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.common.data.DataHolder r1 = (com.google.android.gms.common.data.DataHolder) r1
            r0.mDataHolder = r1
            r0.zaa(r2)
            return
    }

    public void copyToBuffer(java.lang.String r3, android.database.CharArrayBuffer r4) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            r2.zac(r3, r0, r1, r4)
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.common.data.DataBufferRef
            r1 = 0
            if (r0 == 0) goto L33
            com.google.android.gms.common.data.DataBufferRef r4 = (com.google.android.gms.common.data.DataBufferRef) r4
            int r0 = r4.mDataRow
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r3.mDataRow
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L33
            int r0 = r4.zaa
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r2 = r3.zaa
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r2)
            if (r0 == 0) goto L33
            com.google.android.gms.common.data.DataHolder r4 = r4.mDataHolder
            com.google.android.gms.common.data.DataHolder r3 = r3.mDataHolder
            if (r4 != r3) goto L33
            r3 = 1
            return r3
        L33:
            return r1
    }

    public boolean getBoolean(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            boolean r2 = r2.getBoolean(r3, r0, r1)
            return r2
    }

    public byte[] getByteArray(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            byte[] r2 = r2.getByteArray(r3, r0, r1)
            return r2
    }

    public int getDataRow() {
            r0 = this;
            int r0 = r0.mDataRow
            return r0
    }

    public double getDouble(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            double r2 = r2.zaa(r3, r0, r1)
            return r2
    }

    public float getFloat(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            float r2 = r2.zab(r3, r0, r1)
            return r2
    }

    public int getInteger(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            int r2 = r2.getInteger(r3, r0, r1)
            return r2
    }

    public long getLong(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            long r2 = r2.getLong(r3, r0, r1)
            return r2
    }

    public java.lang.String getString(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            java.lang.String r2 = r2.getString(r3, r0, r1)
            return r2
    }

    public boolean hasColumn(java.lang.String r1) {
            r0 = this;
            com.google.android.gms.common.data.DataHolder r0 = r0.mDataHolder
            boolean r0 = r0.hasColumn(r1)
            return r0
    }

    public boolean hasNull(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            boolean r2 = r2.hasNull(r3, r0, r1)
            return r2
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.mDataRow
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = r2.zaa
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r1, r2}
            int r2 = com.google.android.gms.common.internal.Objects.hashCode(r2)
            return r2
    }

    public boolean isDataValid() {
            r0 = this;
            com.google.android.gms.common.data.DataHolder r0 = r0.mDataHolder
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public android.net.Uri parseUri(java.lang.String r3) {
            r2 = this;
            int r0 = r2.mDataRow
            int r1 = r2.zaa
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            java.lang.String r2 = r2.getString(r3, r0, r1)
            if (r2 != 0) goto Le
            r2 = 0
            return r2
        Le:
            android.net.Uri r2 = android.net.Uri.parse(r2)
            return r2
    }

    public final void zaa(int r3) {
            r2 = this;
            r0 = 0
            if (r3 < 0) goto Lc
            com.google.android.gms.common.data.DataHolder r1 = r2.mDataHolder
            int r1 = r1.getCount()
            if (r3 >= r1) goto Lc
            r0 = 1
        Lc:
            com.google.android.gms.common.internal.Preconditions.checkState(r0)
            r2.mDataRow = r3
            com.google.android.gms.common.data.DataHolder r0 = r2.mDataHolder
            int r3 = r0.getWindowIndex(r3)
            r2.zaa = r3
            return
    }
}
