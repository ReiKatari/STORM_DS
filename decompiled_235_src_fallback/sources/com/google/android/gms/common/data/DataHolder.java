package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DataHolder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.io.Closeable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.DataHolder> CREATOR = null;
    private static final com.google.android.gms.common.data.DataHolder.Builder zaf = null;
    final int zaa;
    android.os.Bundle zab;
    int[] zac;
    int zad;
    boolean zae;
    private final java.lang.String[] zag;
    private final android.database.CursorWindow[] zah;
    private final int zai;
    private final android.os.Bundle zaj;
    private boolean zak;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private final java.lang.String[] zaa;
        private final java.util.ArrayList zab;
        private final java.util.HashMap zac;

        public /* synthetic */ Builder(java.lang.String[] r1, java.lang.String r2, com.google.android.gms.common.data.zac r3) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                java.lang.String[] r1 = (java.lang.String[]) r1
                r0.zaa = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zab = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.zac = r1
                return
        }

        public static /* bridge */ /* synthetic */ java.util.ArrayList zab(com.google.android.gms.common.data.DataHolder.Builder r0) {
                java.util.ArrayList r0 = r0.zab
                return r0
        }

        public static /* bridge */ /* synthetic */ java.lang.String[] zac(com.google.android.gms.common.data.DataHolder.Builder r0) {
                java.lang.String[] r0 = r0.zaa
                return r0
        }

        public com.google.android.gms.common.data.DataHolder build(int r3) {
                r2 = this;
                com.google.android.gms.common.data.DataHolder r0 = new com.google.android.gms.common.data.DataHolder
                r1 = 0
                r0.<init>(r2, r3, r1, r1)
                return r0
        }

        public com.google.android.gms.common.data.DataHolder build(int r7, android.os.Bundle r8) {
                r6 = this;
                com.google.android.gms.common.data.DataHolder r0 = new com.google.android.gms.common.data.DataHolder
                r4 = -1
                r5 = 0
                r1 = r6
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public com.google.android.gms.common.data.DataHolder.Builder withRow(android.content.ContentValues r4) {
                r3 = this;
                com.google.android.gms.common.internal.Asserts.checkNotNull(r4)
                java.util.HashMap r0 = new java.util.HashMap
                int r1 = r4.size()
                r0.<init>(r1)
                java.util.Set r4 = r4.valueSet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r4.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r1 = r1.getValue()
                r0.put(r2, r1)
                goto L14
            L2e:
                com.google.android.gms.common.data.DataHolder$Builder r3 = r3.zaa(r0)
                return r3
        }

        public com.google.android.gms.common.data.DataHolder.Builder zaa(java.util.HashMap r2) {
                r1 = this;
                com.google.android.gms.common.internal.Asserts.checkNotNull(r2)
                java.util.ArrayList r0 = r1.zab
                r0.add(r2)
                return r1
        }
    }

    static {
            com.google.android.gms.common.data.zaf r0 = new com.google.android.gms.common.data.zaf
            r0.<init>()
            com.google.android.gms.common.data.DataHolder.CREATOR = r0
            com.google.android.gms.common.data.zab r0 = new com.google.android.gms.common.data.zab
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r0.<init>(r1, r2)
            com.google.android.gms.common.data.DataHolder.zaf = r0
            return
    }

    public DataHolder(int r2, java.lang.String[] r3, android.database.CursorWindow[] r4, int r5, android.os.Bundle r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zae = r0
            r0 = 1
            r1.zak = r0
            r1.zaa = r2
            r1.zag = r3
            r1.zah = r4
            r1.zai = r5
            r1.zaj = r6
            return
    }

    public DataHolder(android.database.Cursor r8, int r9, android.os.Bundle r10) {
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2e
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L30
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L30
            r3.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r7 = move-exception
            goto L78
        L30:
            r3 = r5
        L31:
            if (r3 >= r2) goto L65
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L65
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L46
            r6.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            goto L51
        L46:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L2e
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L2e
        L51:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L58
            goto L65
        L58:
            r1.add(r6)     // Catch: java.lang.Throwable -> L2e
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + r6
            goto L31
        L65:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L78:
            r0.close()
            throw r7
    }

    private DataHolder(com.google.android.gms.common.data.DataHolder.Builder r2, int r3, android.os.Bundle r4) {
            r1 = this;
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r2)
            r0 = -1
            android.database.CursorWindow[] r2 = zaf(r2, r0)
            r0 = 0
            r1.<init>(r4, r2, r3, r0)
            return
    }

    public /* synthetic */ DataHolder(com.google.android.gms.common.data.DataHolder.Builder r1, int r2, android.os.Bundle r3, int r4, com.google.android.gms.common.data.zae r5) {
            r0 = this;
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r1)
            r5 = -1
            android.database.CursorWindow[] r1 = zaf(r1, r5)
            r0.<init>(r4, r1, r2, r3)
            return
    }

    public /* synthetic */ DataHolder(com.google.android.gms.common.data.DataHolder.Builder r1, int r2, android.os.Bundle r3, com.google.android.gms.common.data.zae r4) {
            r0 = this;
            r3 = 0
            r0.<init>(r1, r2, r3)
            return
    }

    public DataHolder(java.lang.String[] r2, android.database.CursorWindow[] r3, int r4, android.os.Bundle r5) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zae = r0
            r0 = 1
            r1.zak = r0
            r1.zaa = r0
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r1.zag = r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            android.database.CursorWindow[] r2 = (android.database.CursorWindow[]) r2
            r1.zah = r2
            r1.zai = r4
            r1.zaj = r5
            r1.zad()
            return
    }

    public static com.google.android.gms.common.data.DataHolder.Builder builder(java.lang.String[] r2) {
            com.google.android.gms.common.data.DataHolder$Builder r0 = new com.google.android.gms.common.data.DataHolder$Builder
            r1 = 0
            r0.<init>(r2, r1, r1)
            return r0
    }

    public static com.google.android.gms.common.data.DataHolder empty(int r3) {
            com.google.android.gms.common.data.DataHolder r0 = new com.google.android.gms.common.data.DataHolder
            com.google.android.gms.common.data.DataHolder$Builder r1 = com.google.android.gms.common.data.DataHolder.zaf
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    private final void zae(java.lang.String r2, int r3) {
            r1 = this;
            android.os.Bundle r0 = r1.zab
            if (r0 == 0) goto L25
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L25
            boolean r2 = r1.isClosed()
            if (r2 != 0) goto L1f
            if (r3 < 0) goto L17
            int r2 = r1.zad
            if (r3 >= r2) goto L17
            return
        L17:
            android.database.CursorIndexOutOfBoundsException r2 = new android.database.CursorIndexOutOfBoundsException
            int r1 = r1.zad
            r2.<init>(r3, r1)
            throw r2
        L1f:
            java.lang.String r1 = "Buffer is closed."
            defpackage.i.h(r1)
            return
        L25:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "No such column: "
            java.lang.String r1 = r2.concat(r1)
            defpackage.i.h(r1)
            return
    }

    private static android.database.CursorWindow[] zaf(com.google.android.gms.common.data.DataHolder.Builder r13, int r14) {
            java.lang.String[] r14 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)
            int r14 = r14.length
            r0 = 0
            if (r14 != 0) goto Lb
            android.database.CursorWindow[] r13 = new android.database.CursorWindow[r0]
            return r13
        Lb:
            java.util.ArrayList r14 = com.google.android.gms.common.data.DataHolder.Builder.zab(r13)
            int r1 = r14.size()
            android.database.CursorWindow r2 = new android.database.CursorWindow
            r2.<init>(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r2)
            java.lang.String[] r4 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)
            int r4 = r4.length
            r2.setNumColumns(r4)
            r4 = r0
            r5 = r4
        L2a:
            if (r4 >= r1) goto L188
            boolean r6 = r2.allocRow()     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r7 = "DataHolder"
            if (r6 != 0) goto L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L7b
            r2.<init>()     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r6 = "Allocating additional cursor window for large data set (row "
            r2.append(r6)     // Catch: java.lang.RuntimeException -> L7b
            r2.append(r4)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r6 = ")"
            r2.append(r6)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.RuntimeException -> L7b
            android.util.Log.d(r7, r2)     // Catch: java.lang.RuntimeException -> L7b
            android.database.CursorWindow r2 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L7b
            r2.<init>(r0)     // Catch: java.lang.RuntimeException -> L7b
            r2.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String[] r6 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)     // Catch: java.lang.RuntimeException -> L7b
            int r6 = r6.length     // Catch: java.lang.RuntimeException -> L7b
            r2.setNumColumns(r6)     // Catch: java.lang.RuntimeException -> L7b
            r3.add(r2)     // Catch: java.lang.RuntimeException -> L7b
            boolean r6 = r2.allocRow()     // Catch: java.lang.RuntimeException -> L7b
            if (r6 != 0) goto L7e
            java.lang.String r13 = "Unable to allocate row to hold data."
            android.util.Log.e(r7, r13)     // Catch: java.lang.RuntimeException -> L7b
            r3.remove(r2)     // Catch: java.lang.RuntimeException -> L7b
            int r13 = r3.size()     // Catch: java.lang.RuntimeException -> L7b
            android.database.CursorWindow[] r13 = new android.database.CursorWindow[r13]     // Catch: java.lang.RuntimeException -> L7b
            java.lang.Object[] r13 = r3.toArray(r13)     // Catch: java.lang.RuntimeException -> L7b
            android.database.CursorWindow[] r13 = (android.database.CursorWindow[]) r13     // Catch: java.lang.RuntimeException -> L7b
            return r13
        L7b:
            r13 = move-exception
            goto L175
        L7e:
            java.lang.Object r6 = r14.get(r4)     // Catch: java.lang.RuntimeException -> L7b
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.RuntimeException -> L7b
            r8 = 1
            r9 = r0
            r10 = r8
        L87:
            java.lang.String[] r11 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)     // Catch: java.lang.RuntimeException -> L7b
            int r11 = r11.length     // Catch: java.lang.RuntimeException -> L7b
            if (r9 >= r11) goto L132
            if (r10 == 0) goto L136
            java.lang.String[] r10 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)     // Catch: java.lang.RuntimeException -> L7b
            r10 = r10[r9]     // Catch: java.lang.RuntimeException -> L7b
            java.lang.Object r11 = r6.get(r10)     // Catch: java.lang.RuntimeException -> L7b
            if (r11 != 0) goto La2
            boolean r10 = r2.putNull(r4, r9)     // Catch: java.lang.RuntimeException -> L7b
            goto L10b
        La2:
            boolean r12 = r11 instanceof java.lang.String     // Catch: java.lang.RuntimeException -> L7b
            if (r12 == 0) goto Lad
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.RuntimeException -> L7b
            boolean r10 = r2.putString(r11, r4, r9)     // Catch: java.lang.RuntimeException -> L7b
            goto L10b
        Lad:
            boolean r12 = r11 instanceof java.lang.Long     // Catch: java.lang.RuntimeException -> L7b
            if (r12 == 0) goto Lbc
            java.lang.Long r11 = (java.lang.Long) r11     // Catch: java.lang.RuntimeException -> L7b
            long r10 = r11.longValue()     // Catch: java.lang.RuntimeException -> L7b
            boolean r10 = r2.putLong(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L7b
            goto L10b
        Lbc:
            boolean r12 = r11 instanceof java.lang.Integer     // Catch: java.lang.RuntimeException -> L7b
            if (r12 == 0) goto Lcc
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch: java.lang.RuntimeException -> L7b
            int r10 = r11.intValue()     // Catch: java.lang.RuntimeException -> L7b
            long r10 = (long) r10     // Catch: java.lang.RuntimeException -> L7b
            boolean r10 = r2.putLong(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L7b
            goto L10b
        Lcc:
            boolean r12 = r11 instanceof java.lang.Boolean     // Catch: java.lang.RuntimeException -> L7b
            if (r12 == 0) goto Le2
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.RuntimeException -> L7b
            boolean r10 = r11.booleanValue()     // Catch: java.lang.RuntimeException -> L7b
            if (r8 == r10) goto Ldb
            r10 = 0
            goto Ldd
        Ldb:
            r10 = 1
        Ldd:
            boolean r10 = r2.putLong(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L7b
            goto L10b
        Le2:
            boolean r12 = r11 instanceof byte[]     // Catch: java.lang.RuntimeException -> L7b
            if (r12 == 0) goto Led
            byte[] r11 = (byte[]) r11     // Catch: java.lang.RuntimeException -> L7b
            boolean r10 = r2.putBlob(r11, r4, r9)     // Catch: java.lang.RuntimeException -> L7b
            goto L10b
        Led:
            boolean r12 = r11 instanceof java.lang.Double     // Catch: java.lang.RuntimeException -> L7b
            if (r12 == 0) goto Lfc
            java.lang.Double r11 = (java.lang.Double) r11     // Catch: java.lang.RuntimeException -> L7b
            double r10 = r11.doubleValue()     // Catch: java.lang.RuntimeException -> L7b
            boolean r10 = r2.putDouble(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L7b
            goto L10b
        Lfc:
            boolean r12 = r11 instanceof java.lang.Float     // Catch: java.lang.RuntimeException -> L7b
            if (r12 == 0) goto L10f
            java.lang.Float r11 = (java.lang.Float) r11     // Catch: java.lang.RuntimeException -> L7b
            float r10 = r11.floatValue()     // Catch: java.lang.RuntimeException -> L7b
            double r10 = (double) r10     // Catch: java.lang.RuntimeException -> L7b
            boolean r10 = r2.putDouble(r10, r4, r9)     // Catch: java.lang.RuntimeException -> L7b
        L10b:
            int r9 = r9 + 1
            goto L87
        L10f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r14 = r11.toString()     // Catch: java.lang.RuntimeException -> L7b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L7b
            r1.<init>()     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r2 = "Unsupported object for column "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L7b
            r1.append(r10)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r2 = ": "
            r1.append(r2)     // Catch: java.lang.RuntimeException -> L7b
            r1.append(r14)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r14 = r1.toString()     // Catch: java.lang.RuntimeException -> L7b
            r13.<init>(r14)     // Catch: java.lang.RuntimeException -> L7b
            throw r13     // Catch: java.lang.RuntimeException -> L7b
        L132:
            if (r10 == 0) goto L136
            r5 = r0
            goto L16a
        L136:
            if (r5 != 0) goto L16d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L7b
            r5.<init>()     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r6 = "Couldn't populate window data for row "
            r5.append(r6)     // Catch: java.lang.RuntimeException -> L7b
            r5.append(r4)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r6 = " - allocating new window."
            r5.append(r6)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.RuntimeException -> L7b
            android.util.Log.d(r7, r5)     // Catch: java.lang.RuntimeException -> L7b
            r2.freeLastRow()     // Catch: java.lang.RuntimeException -> L7b
            android.database.CursorWindow r2 = new android.database.CursorWindow     // Catch: java.lang.RuntimeException -> L7b
            r2.<init>(r0)     // Catch: java.lang.RuntimeException -> L7b
            r2.setStartPosition(r4)     // Catch: java.lang.RuntimeException -> L7b
            java.lang.String[] r5 = com.google.android.gms.common.data.DataHolder.Builder.zac(r13)     // Catch: java.lang.RuntimeException -> L7b
            int r5 = r5.length     // Catch: java.lang.RuntimeException -> L7b
            r2.setNumColumns(r5)     // Catch: java.lang.RuntimeException -> L7b
            r3.add(r2)     // Catch: java.lang.RuntimeException -> L7b
            int r4 = r4 + (-1)
            r5 = r8
        L16a:
            int r4 = r4 + r8
            goto L2a
        L16d:
            java.lang.String r13 = "Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle."
            com.google.android.gms.common.data.zad r14 = new com.google.android.gms.common.data.zad     // Catch: java.lang.RuntimeException -> L7b
            r14.<init>(r13)     // Catch: java.lang.RuntimeException -> L7b
            throw r14     // Catch: java.lang.RuntimeException -> L7b
        L175:
            int r14 = r3.size()
        L179:
            if (r0 >= r14) goto L187
            java.lang.Object r1 = r3.get(r0)
            android.database.CursorWindow r1 = (android.database.CursorWindow) r1
            r1.close()
            int r0 = r0 + 1
            goto L179
        L187:
            throw r13
        L188:
            int r13 = r3.size()
            android.database.CursorWindow[] r13 = new android.database.CursorWindow[r13]
            java.lang.Object[] r13 = r3.toArray(r13)
            android.database.CursorWindow[] r13 = (android.database.CursorWindow[]) r13
            return r13
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zae     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L18
            r0 = 1
            r3.zae = r0     // Catch: java.lang.Throwable -> L16
            r0 = 0
        L9:
            android.database.CursorWindow[] r1 = r3.zah     // Catch: java.lang.Throwable -> L16
            int r2 = r1.length     // Catch: java.lang.Throwable -> L16
            if (r0 >= r2) goto L18
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L16
            r1.close()     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + 1
            goto L9
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            return
        L1a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public final void finalize() {
            r4 = this;
            java.lang.String r0 = "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: "
            boolean r1 = r4.zak     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            android.database.CursorWindow[] r1 = r4.zah     // Catch: java.lang.Throwable -> L2f
            int r1 = r1.length     // Catch: java.lang.Throwable -> L2f
            if (r1 <= 0) goto L31
            boolean r1 = r4.isClosed()     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L31
            r4.close()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "DataBuffer"
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2f
            r3.append(r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = ")"
            r3.append(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            android.util.Log.e(r1, r0)     // Catch: java.lang.Throwable -> L2f
            goto L31
        L2f:
            r0 = move-exception
            goto L35
        L31:
            super.finalize()
            return
        L35:
            super.finalize()
            throw r0
    }

    public boolean getBoolean(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            long r1 = r4.getLong(r3, r1)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L19
            r1 = 1
            return r1
        L19:
            r1 = 0
            return r1
    }

    public byte[] getByteArray(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            byte[] r1 = r4.getBlob(r3, r1)
            return r1
    }

    public int getCount() {
            r0 = this;
            int r0 = r0.zad
            return r0
    }

    public int getInteger(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            int r1 = r4.getInt(r3, r1)
            return r1
    }

    public long getLong(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            long r1 = r4.getLong(r3, r1)
            return r1
    }

    public android.os.Bundle getMetadata() {
            r0 = this;
            android.os.Bundle r0 = r0.zaj
            return r0
    }

    public int getStatusCode() {
            r0 = this;
            int r0 = r0.zai
            return r0
    }

    public java.lang.String getString(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            java.lang.String r1 = r4.getString(r3, r1)
            return r1
    }

    public int getWindowIndex(int r4) {
            r3 = this;
            r0 = 0
            if (r4 < 0) goto L9
            int r1 = r3.zad
            if (r4 >= r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r0
        La:
            com.google.android.gms.common.internal.Preconditions.checkState(r1)
        Ld:
            int[] r1 = r3.zac
            int r2 = r1.length
            if (r0 >= r2) goto L1c
            r1 = r1[r0]
            if (r4 >= r1) goto L19
            int r0 = r0 + (-1)
            goto L1c
        L19:
            int r0 = r0 + 1
            goto Ld
        L1c:
            if (r0 != r2) goto L20
            int r0 = r0 + (-1)
        L20:
            return r0
    }

    public boolean hasColumn(java.lang.String r1) {
            r0 = this;
            android.os.Bundle r0 = r0.zab
            boolean r0 = r0.containsKey(r1)
            return r0
    }

    public boolean hasNull(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            boolean r1 = r4.isNull(r3, r1)
            return r1
    }

    public boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zae     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            java.lang.String[] r0 = r5.zag
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r6, r2, r0, r3)
            r0 = 2
            android.database.CursorWindow[] r4 = r5.zah
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r6, r0, r4, r7, r3)
            r0 = 3
            int r4 = r5.getStatusCode()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r4)
            r0 = 4
            android.os.Bundle r4 = r5.getMetadata()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r6, r0, r4, r3)
            r0 = 1000(0x3e8, float:1.401E-42)
            int r3 = r5.zaa
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r1)
            r6 = r7 & 1
            if (r6 == 0) goto L32
            r5.close()
        L32:
            return
    }

    public final double zaa(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            double r1 = r4.getDouble(r3, r1)
            return r1
    }

    public final float zab(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            float r1 = r4.getFloat(r3, r1)
            return r1
    }

    public final void zac(java.lang.String r2, int r3, int r4, android.database.CharArrayBuffer r5) {
            r1 = this;
            r1.zae(r2, r3)
            android.database.CursorWindow[] r0 = r1.zah
            r4 = r0[r4]
            android.os.Bundle r1 = r1.zab
            int r1 = r1.getInt(r2)
            r4.copyStringToBuffer(r3, r1, r5)
            return
    }

    public final void zad() {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r4.zab = r0
            r0 = 0
            r1 = r0
        L9:
            java.lang.String[] r2 = r4.zag
            int r3 = r2.length
            if (r1 >= r3) goto L18
            android.os.Bundle r3 = r4.zab
            r2 = r2[r1]
            r3.putInt(r2, r1)
            int r1 = r1 + 1
            goto L9
        L18:
            android.database.CursorWindow[] r1 = r4.zah
            int r1 = r1.length
            int[] r1 = new int[r1]
            r4.zac = r1
            r1 = r0
        L20:
            android.database.CursorWindow[] r2 = r4.zah
            int r3 = r2.length
            if (r0 >= r3) goto L3e
            int[] r3 = r4.zac
            r3[r0] = r1
            r2 = r2[r0]
            int r2 = r2.getStartPosition()
            int r2 = r1 - r2
            android.database.CursorWindow[] r3 = r4.zah
            r3 = r3[r0]
            int r3 = r3.getNumRows()
            int r3 = r3 - r2
            int r1 = r1 + r3
            int r0 = r0 + 1
            goto L20
        L3e:
            r4.zad = r1
            return
    }
}
