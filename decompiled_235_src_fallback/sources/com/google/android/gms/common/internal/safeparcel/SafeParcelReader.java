package com.google.android.gms.common.internal.safeparcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SafeParcelReader {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class ParseException extends java.lang.RuntimeException {
        public ParseException(java.lang.String r3, android.os.Parcel r4) {
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
        }
    }

    private SafeParcelReader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.math.BigDecimal createBigDecimal(android.os.Parcel r3, int r4) {
            int r4 = readSize(r3, r4)
            int r0 = r3.dataPosition()
            if (r4 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            byte[] r1 = r3.createByteArray()
            int r2 = r3.readInt()
            int r0 = r0 + r4
            r3.setDataPosition(r0)
            java.math.BigDecimal r3 = new java.math.BigDecimal
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r1)
            r3.<init>(r4, r2)
            return r3
    }

    public static java.math.BigDecimal[] createBigDecimalArray(android.os.Parcel r8, int r9) {
            int r9 = readSize(r8, r9)
            int r0 = r8.dataPosition()
            if (r9 != 0) goto Lc
            r8 = 0
            return r8
        Lc:
            int r1 = r8.readInt()
            java.math.BigDecimal[] r2 = new java.math.BigDecimal[r1]
            r3 = 0
        L13:
            if (r3 >= r1) goto L2c
            byte[] r4 = r8.createByteArray()
            int r5 = r8.readInt()
            java.math.BigDecimal r6 = new java.math.BigDecimal
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r4)
            r6.<init>(r7, r5)
            r2[r3] = r6
            int r3 = r3 + 1
            goto L13
        L2c:
            int r0 = r0 + r9
            r8.setDataPosition(r0)
            return r2
    }

    public static java.math.BigInteger createBigInteger(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            byte[] r1 = r2.createByteArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            return r2
    }

    public static java.math.BigInteger[] createBigIntegerArray(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            int r1 = r6.readInt()
            java.math.BigInteger[] r2 = new java.math.BigInteger[r1]
            r3 = 0
        L13:
            if (r3 >= r1) goto L23
            java.math.BigInteger r4 = new java.math.BigInteger
            byte[] r5 = r6.createByteArray()
            r4.<init>(r5)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L13
        L23:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r2
    }

    public static boolean[] createBooleanArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            boolean[] r1 = r2.createBooleanArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static java.util.ArrayList<java.lang.Boolean> createBooleanList(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r6.readInt()
            r3 = 0
            r4 = r3
        L17:
            if (r4 >= r2) goto L2c
            int r5 = r6.readInt()
            if (r5 == 0) goto L21
            r5 = 1
            goto L22
        L21:
            r5 = r3
        L22:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1.add(r5)
            int r4 = r4 + 1
            goto L17
        L2c:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r1
    }

    public static android.os.Bundle createBundle(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.os.Bundle r1 = r2.readBundle()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static byte[] createByteArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            byte[] r1 = r2.createByteArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static byte[][] createByteArrayArray(android.os.Parcel r5, int r6) {
            int r6 = readSize(r5, r6)
            int r0 = r5.dataPosition()
            if (r6 != 0) goto Lc
            r5 = 0
            return r5
        Lc:
            int r1 = r5.readInt()
            byte[][] r2 = new byte[r1]
            r3 = 0
        L13:
            if (r3 >= r1) goto L1e
            byte[] r4 = r5.createByteArray()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L13
        L1e:
            int r0 = r0 + r6
            r5.setDataPosition(r0)
            return r2
    }

    public static android.util.SparseArray<byte[]> createByteArraySparseArray(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            int r1 = r6.readInt()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>(r1)
            r3 = 0
        L16:
            if (r3 >= r1) goto L26
            int r4 = r6.readInt()
            byte[] r5 = r6.createByteArray()
            r2.append(r4, r5)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r2
    }

    public static char[] createCharArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            char[] r1 = r2.createCharArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static double[] createDoubleArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            double[] r1 = r2.createDoubleArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static java.util.ArrayList<java.lang.Double> createDoubleList(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r6.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L26
            double r4 = r6.readDouble()
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r1
    }

    public static android.util.SparseArray<java.lang.Double> createDoubleSparseArray(android.os.Parcel r7, int r8) {
            int r8 = readSize(r7, r8)
            int r0 = r7.dataPosition()
            if (r8 != 0) goto Lc
            r7 = 0
            return r7
        Lc:
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r7.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L2a
            int r4 = r7.readInt()
            double r5 = r7.readDouble()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r1.append(r4, r5)
            int r3 = r3 + 1
            goto L16
        L2a:
            int r0 = r0 + r8
            r7.setDataPosition(r0)
            return r1
    }

    public static float[] createFloatArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            float[] r1 = r2.createFloatArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static java.util.ArrayList<java.lang.Float> createFloatList(android.os.Parcel r5, int r6) {
            int r6 = readSize(r5, r6)
            int r0 = r5.dataPosition()
            if (r6 != 0) goto Lc
            r5 = 0
            return r5
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r5.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L26
            float r4 = r5.readFloat()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r6
            r5.setDataPosition(r0)
            return r1
    }

    public static android.util.SparseArray<java.lang.Float> createFloatSparseArray(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r6.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L2a
            int r4 = r6.readInt()
            float r5 = r6.readFloat()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r1.append(r4, r5)
            int r3 = r3 + 1
            goto L16
        L2a:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r1
    }

    public static android.os.IBinder[] createIBinderArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.os.IBinder[] r1 = r2.createBinderArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static java.util.ArrayList<android.os.IBinder> createIBinderList(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.util.ArrayList r1 = r2.createBinderArrayList()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static android.util.SparseArray<android.os.IBinder> createIBinderSparseArray(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            int r1 = r6.readInt()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>(r1)
            r3 = 0
        L16:
            if (r3 >= r1) goto L26
            int r4 = r6.readInt()
            android.os.IBinder r5 = r6.readStrongBinder()
            r2.append(r4, r5)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r2
    }

    public static int[] createIntArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            int[] r1 = r2.createIntArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static java.util.ArrayList<java.lang.Integer> createIntegerList(android.os.Parcel r5, int r6) {
            int r6 = readSize(r5, r6)
            int r0 = r5.dataPosition()
            if (r6 != 0) goto Lc
            r5 = 0
            return r5
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r5.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L26
            int r4 = r5.readInt()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r6
            r5.setDataPosition(r0)
            return r1
    }

    public static long[] createLongArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            long[] r1 = r2.createLongArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static java.util.ArrayList<java.lang.Long> createLongList(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r6.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L26
            long r4 = r6.readLong()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r1
    }

    public static android.os.Parcel createParcel(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r1.appendFrom(r2, r0, r3)
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static android.os.Parcel[] createParcelArray(android.os.Parcel r8, int r9) {
            int r9 = readSize(r8, r9)
            int r0 = r8.dataPosition()
            r1 = 0
            if (r9 != 0) goto Lc
            return r1
        Lc:
            int r2 = r8.readInt()
            android.os.Parcel[] r3 = new android.os.Parcel[r2]
            r4 = 0
        L13:
            if (r4 >= r2) goto L32
            int r5 = r8.readInt()
            if (r5 == 0) goto L2d
            int r6 = r8.dataPosition()
            android.os.Parcel r7 = android.os.Parcel.obtain()
            r7.appendFrom(r8, r6, r5)
            r3[r4] = r7
            int r6 = r6 + r5
            r8.setDataPosition(r6)
            goto L2f
        L2d:
            r3[r4] = r1
        L2f:
            int r4 = r4 + 1
            goto L13
        L32:
            int r0 = r0 + r9
            r8.setDataPosition(r0)
            return r3
    }

    public static java.util.ArrayList<android.os.Parcel> createParcelList(android.os.Parcel r8, int r9) {
            int r9 = readSize(r8, r9)
            int r0 = r8.dataPosition()
            r1 = 0
            if (r9 != 0) goto Lc
            return r1
        Lc:
            int r2 = r8.readInt()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
        L16:
            if (r4 >= r2) goto L37
            int r5 = r8.readInt()
            if (r5 == 0) goto L31
            int r6 = r8.dataPosition()
            android.os.Parcel r7 = android.os.Parcel.obtain()
            r7.appendFrom(r8, r6, r5)
            r3.add(r7)
            int r6 = r6 + r5
            r8.setDataPosition(r6)
            goto L34
        L31:
            r3.add(r1)
        L34:
            int r4 = r4 + 1
            goto L16
        L37:
            int r0 = r0 + r9
            r8.setDataPosition(r0)
            return r3
    }

    public static android.util.SparseArray<android.os.Parcel> createParcelSparseArray(android.os.Parcel r9, int r10) {
            int r10 = readSize(r9, r10)
            int r0 = r9.dataPosition()
            r1 = 0
            if (r10 != 0) goto Lc
            return r1
        Lc:
            int r2 = r9.readInt()
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r4 = 0
        L16:
            if (r4 >= r2) goto L3b
            int r5 = r9.readInt()
            int r6 = r9.readInt()
            if (r6 == 0) goto L35
            int r7 = r9.dataPosition()
            android.os.Parcel r8 = android.os.Parcel.obtain()
            r8.appendFrom(r9, r7, r6)
            r3.append(r5, r8)
            int r7 = r7 + r6
            r9.setDataPosition(r7)
            goto L38
        L35:
            r3.append(r5, r1)
        L38:
            int r4 = r4 + 1
            goto L16
        L3b:
            int r0 = r0 + r10
            r9.setDataPosition(r0)
            return r3
    }

    public static <T extends android.os.Parcelable> T createParcelable(android.os.Parcel r1, int r2, android.os.Parcelable.Creator<T> r3) {
            int r2 = readSize(r1, r2)
            int r0 = r1.dataPosition()
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.Object r3 = r3.createFromParcel(r1)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return r3
    }

    public static android.util.SparseBooleanArray createSparseBooleanArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.util.SparseBooleanArray r1 = r2.readSparseBooleanArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static android.util.SparseIntArray createSparseIntArray(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            int r2 = r6.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L26
            int r4 = r6.readInt()
            int r5 = r6.readInt()
            r1.append(r4, r5)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r1
    }

    public static android.util.SparseLongArray createSparseLongArray(android.os.Parcel r7, int r8) {
            int r8 = readSize(r7, r8)
            int r0 = r7.dataPosition()
            if (r8 != 0) goto Lc
            r7 = 0
            return r7
        Lc:
            android.util.SparseLongArray r1 = new android.util.SparseLongArray
            r1.<init>()
            int r2 = r7.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L26
            int r4 = r7.readInt()
            long r5 = r7.readLong()
            r1.append(r4, r5)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r8
            r7.setDataPosition(r0)
            return r1
    }

    public static java.lang.String createString(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.String r1 = r2.readString()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static java.lang.String[] createStringArray(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.lang.String[] r1 = r2.createStringArray()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static java.util.ArrayList<java.lang.String> createStringList(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.util.ArrayList r1 = r2.createStringArrayList()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static android.util.SparseArray<java.lang.String> createStringSparseArray(android.os.Parcel r6, int r7) {
            int r7 = readSize(r6, r7)
            int r0 = r6.dataPosition()
            if (r7 != 0) goto Lc
            r6 = 0
            return r6
        Lc:
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r6.readInt()
            r3 = 0
        L16:
            if (r3 >= r2) goto L26
            int r4 = r6.readInt()
            java.lang.String r5 = r6.readString()
            r1.append(r4, r5)
            int r3 = r3 + 1
            goto L16
        L26:
            int r0 = r0 + r7
            r6.setDataPosition(r0)
            return r1
    }

    public static <T> T[] createTypedArray(android.os.Parcel r1, int r2, android.os.Parcelable.Creator<T> r3) {
            int r2 = readSize(r1, r2)
            int r0 = r1.dataPosition()
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.lang.Object[] r3 = r1.createTypedArray(r3)
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return r3
    }

    public static <T> java.util.ArrayList<T> createTypedList(android.os.Parcel r1, int r2, android.os.Parcelable.Creator<T> r3) {
            int r2 = readSize(r1, r2)
            int r0 = r1.dataPosition()
            if (r2 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            java.util.ArrayList r3 = r1.createTypedArrayList(r3)
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return r3
    }

    public static <T> android.util.SparseArray<T> createTypedSparseArray(android.os.Parcel r7, int r8, android.os.Parcelable.Creator<T> r9) {
            int r8 = readSize(r7, r8)
            int r0 = r7.dataPosition()
            r1 = 0
            if (r8 != 0) goto Lc
            return r1
        Lc:
            int r2 = r7.readInt()
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r4 = 0
        L16:
            if (r4 >= r2) goto L2e
            int r5 = r7.readInt()
            int r6 = r7.readInt()
            if (r6 == 0) goto L27
            java.lang.Object r6 = r9.createFromParcel(r7)
            goto L28
        L27:
            r6 = r1
        L28:
            r3.append(r5, r6)
            int r4 = r4 + 1
            goto L16
        L2e:
            int r0 = r0 + r8
            r7.setDataPosition(r0)
            return r3
    }

    public static void ensureAtEnd(android.os.Parcel r2, int r3) {
            int r0 = r2.dataPosition()
            if (r0 != r3) goto L7
            return
        L7:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r0 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.String r1 = "Overread allowed size end="
            java.lang.String r3 = defpackage.lb1.g(r3, r1)
            r0.<init>(r3, r2)
            throw r0
    }

    public static int getFieldId(int r0) {
            char r0 = (char) r0
            return r0
    }

    public static boolean readBoolean(android.os.Parcel r1, int r2) {
            r0 = 4
            zzb(r1, r2, r0)
            int r1 = r1.readInt()
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static java.lang.Boolean readBooleanObject(android.os.Parcel r2, int r3) {
            int r0 = readSize(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r1 = 4
            zza(r2, r3, r0, r1)
            int r2 = r2.readInt()
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    public static byte readByte(android.os.Parcel r1, int r2) {
            r0 = 4
            zzb(r1, r2, r0)
            int r1 = r1.readInt()
            byte r1 = (byte) r1
            return r1
    }

    public static char readChar(android.os.Parcel r1, int r2) {
            r0 = 4
            zzb(r1, r2, r0)
            int r1 = r1.readInt()
            char r1 = (char) r1
            return r1
    }

    public static double readDouble(android.os.Parcel r1, int r2) {
            r0 = 8
            zzb(r1, r2, r0)
            double r1 = r1.readDouble()
            return r1
    }

    public static java.lang.Double readDoubleObject(android.os.Parcel r2, int r3) {
            int r0 = readSize(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r1 = 8
            zza(r2, r3, r0, r1)
            double r2 = r2.readDouble()
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            return r2
    }

    public static float readFloat(android.os.Parcel r1, int r2) {
            r0 = 4
            zzb(r1, r2, r0)
            float r1 = r1.readFloat()
            return r1
    }

    public static java.lang.Float readFloatObject(android.os.Parcel r2, int r3) {
            int r0 = readSize(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r1 = 4
            zza(r2, r3, r0, r1)
            float r2 = r2.readFloat()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
    }

    public static int readHeader(android.os.Parcel r0) {
            int r0 = r0.readInt()
            return r0
    }

    public static android.os.IBinder readIBinder(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.os.IBinder r1 = r2.readStrongBinder()
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static int readInt(android.os.Parcel r1, int r2) {
            r0 = 4
            zzb(r1, r2, r0)
            int r1 = r1.readInt()
            return r1
    }

    public static java.lang.Integer readIntegerObject(android.os.Parcel r2, int r3) {
            int r0 = readSize(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r1 = 4
            zza(r2, r3, r0, r1)
            int r2 = r2.readInt()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    public static void readList(android.os.Parcel r1, int r2, java.util.List r3, java.lang.ClassLoader r4) {
            int r2 = readSize(r1, r2)
            int r0 = r1.dataPosition()
            if (r2 != 0) goto Lb
            return
        Lb:
            r1.readList(r3, r4)
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return
    }

    public static long readLong(android.os.Parcel r1, int r2) {
            r0 = 8
            zzb(r1, r2, r0)
            long r1 = r1.readLong()
            return r1
    }

    public static java.lang.Long readLongObject(android.os.Parcel r2, int r3) {
            int r0 = readSize(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r1 = 8
            zza(r2, r3, r0, r1)
            long r2 = r2.readLong()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            return r2
    }

    public static android.app.PendingIntent readPendingIntent(android.os.Parcel r2, int r3) {
            int r3 = readSize(r2, r3)
            int r0 = r2.dataPosition()
            if (r3 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            android.app.PendingIntent r1 = android.app.PendingIntent.readPendingIntentOrNullFromParcel(r2)
            int r0 = r0 + r3
            r2.setDataPosition(r0)
            return r1
    }

    public static short readShort(android.os.Parcel r1, int r2) {
            r0 = 4
            zzb(r1, r2, r0)
            int r1 = r1.readInt()
            short r1 = (short) r1
            return r1
    }

    public static int readSize(android.os.Parcel r2, int r3) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r3 & r0
            if (r1 == r0) goto La
            int r2 = r3 >> 16
            char r2 = (char) r2
            return r2
        La:
            int r2 = r2.readInt()
            return r2
    }

    public static void skipUnknownField(android.os.Parcel r1, int r2) {
            int r2 = readSize(r1, r2)
            int r0 = r1.dataPosition()
            int r0 = r0 + r2
            r1.setDataPosition(r0)
            return
    }

    public static int validateObjectHeader(android.os.Parcel r5) {
            int r0 = readHeader(r5)
            int r1 = readSize(r5, r0)
            int r2 = getFieldId(r0)
            int r3 = r5.dataPosition()
            r4 = 20293(0x4f45, float:2.8437E-41)
            if (r2 != r4) goto L2c
            int r1 = r1 + r3
            if (r1 < r3) goto L1e
            int r0 = r5.dataSize()
            if (r1 > r0) goto L1e
            return r1
        L1e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r0 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.String r2 = "Size read is invalid start="
            java.lang.String r4 = " end="
            java.lang.String r1 = defpackage.lb1.j(r2, r3, r1, r4)
            r0.<init>(r1, r5)
            throw r0
        L2c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r1 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Expected object header. Got 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0, r5)
            throw r1
    }

    private static void zza(android.os.Parcel r4, int r5, int r6, int r7) {
            if (r6 != r7) goto L3
            return
        L3:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r5 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.String r0 = java.lang.Integer.toHexString(r6)
            java.lang.String r1 = " got "
            java.lang.String r2 = " (0x"
            java.lang.String r3 = "Expected size "
            java.lang.StringBuilder r6 = defpackage.i61.q(r7, r6, r3, r1, r2)
            java.lang.String r7 = ")"
            java.lang.String r6 = defpackage.i61.n(r6, r0, r7)
            r5.<init>(r6, r4)
            throw r5
    }

    private static void zzb(android.os.Parcel r5, int r6, int r7) {
            int r6 = readSize(r5, r6)
            if (r6 != r7) goto L7
            return
        L7:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r0 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.String r1 = java.lang.Integer.toHexString(r6)
            java.lang.String r2 = " got "
            java.lang.String r3 = " (0x"
            java.lang.String r4 = "Expected size "
            java.lang.StringBuilder r6 = defpackage.i61.q(r7, r6, r4, r2, r3)
            java.lang.String r7 = ")"
            java.lang.String r6 = defpackage.i61.n(r6, r1, r7)
            r0.<init>(r6, r5)
            throw r0
    }
}
