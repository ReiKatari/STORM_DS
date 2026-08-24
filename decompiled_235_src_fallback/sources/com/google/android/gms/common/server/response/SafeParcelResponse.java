package com.google.android.gms.common.server.response;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SafeParcelResponse extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.SafeParcelResponse> CREATOR = null;
    private final int zaa;
    private final android.os.Parcel zab;
    private final int zac;
    private final com.google.android.gms.common.server.response.zan zad;
    private final java.lang.String zae;
    private int zaf;
    private int zag;

    static {
            com.google.android.gms.common.server.response.zaq r0 = new com.google.android.gms.common.server.response.zaq
            r0.<init>()
            com.google.android.gms.common.server.response.SafeParcelResponse.CREATOR = r0
            return
    }

    public SafeParcelResponse(int r1, android.os.Parcel r2, com.google.android.gms.common.server.response.zan r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.os.Parcel r1 = (android.os.Parcel) r1
            r0.zab = r1
            r1 = 2
            r0.zac = r1
            r0.zad = r3
            if (r3 != 0) goto L18
            r2 = 0
        L15:
            r0.zae = r2
            goto L1d
        L18:
            java.lang.String r2 = r3.zaa()
            goto L15
        L1d:
            r0.zaf = r1
            return
    }

    private SafeParcelResponse(com.google.android.gms.common.internal.safeparcel.SafeParcelable r4, com.google.android.gms.common.server.response.zan r5, java.lang.String r6) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.zaa = r0
            android.os.Parcel r1 = android.os.Parcel.obtain()
            r3.zab = r1
            r2 = 0
            r4.writeToParcel(r1, r2)
            r3.zac = r0
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            com.google.android.gms.common.server.response.zan r4 = (com.google.android.gms.common.server.response.zan) r4
            r3.zad = r4
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.lang.String r4 = (java.lang.String) r4
            r3.zae = r4
            r4 = 2
            r3.zaf = r4
            return
    }

    public SafeParcelResponse(com.google.android.gms.common.server.response.zan r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1.zab = r0
            r0 = 0
            r1.zac = r0
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.server.response.zan r2 = (com.google.android.gms.common.server.response.zan) r2
            r1.zad = r2
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r2 = (java.lang.String) r2
            r1.zae = r2
            r1.zaf = r0
            return
    }

    public static <T extends com.google.android.gms.common.server.response.FastJsonResponse & com.google.android.gms.common.internal.safeparcel.SafeParcelable> com.google.android.gms.common.server.response.SafeParcelResponse from(T r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.google.android.gms.common.server.response.zan r1 = new com.google.android.gms.common.server.response.zan
            java.lang.Class r2 = r3.getClass()
            r1.<init>(r2)
            zaF(r1, r3)
            r1.zac()
            r1.zad()
            com.google.android.gms.common.server.response.SafeParcelResponse r2 = new com.google.android.gms.common.server.response.SafeParcelResponse
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r3
            r2.<init>(r3, r1, r0)
            return r2
    }

    private static void zaF(com.google.android.gms.common.server.response.zan r3, com.google.android.gms.common.server.response.FastJsonResponse r4) {
            java.lang.Class r0 = r4.getClass()
            boolean r1 = r3.zaf(r0)
            if (r1 != 0) goto L75
            java.util.Map r4 = r4.getFieldMappings()
            r3.zae(r0, r4)
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.get(r1)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r1 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r1
            java.lang.Class r2 = r1.zag
            if (r2 == 0) goto L19
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            com.google.android.gms.common.server.response.FastJsonResponse r2 = (com.google.android.gms.common.server.response.FastJsonResponse) r2     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            zaF(r3, r2)     // Catch: java.lang.IllegalAccessException -> L39 java.lang.InstantiationException -> L3b
            goto L19
        L39:
            r3 = move-exception
            goto L3d
        L3b:
            r3 = move-exception
            goto L59
        L3d:
            java.lang.Class r4 = r1.zag
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Could not access object of type "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4, r3)
            throw r0
        L59:
            java.lang.Class r4 = r1.zag
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Could not instantiate an object of type "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4, r3)
            throw r0
        L75:
            return
    }

    private final void zaG(com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r2 = this;
            int r3 = r3.zaf
            r0 = -1
            if (r3 == r0) goto L26
            android.os.Parcel r3 = r2.zab
            if (r3 == 0) goto L20
            int r0 = r2.zaf
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L11
            return
        L11:
            java.lang.String r2 = "Attempted to parse JSON with a SafeParcelResponse object that is already filled with data."
            defpackage.i.m(r2)
            return
        L17:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r2.zag = r3
            r2.zaf = r1
            return
        L20:
            java.lang.String r2 = "Internal Parcel object is null."
            defpackage.i.m(r2)
            return
        L26:
            java.lang.String r2 = "Field does not have a valid safe parcelable field id."
            defpackage.i.m(r2)
            return
    }

    private final void zaH(java.lang.StringBuilder r11, java.util.Map r12, android.os.Parcel r13) {
            r10 = this;
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r12 = r12.entrySet()
            java.util.Iterator r12 = r12.iterator()
        Ld:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r12.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.getSafeParcelableFieldId()
            r0.put(r2, r1)
            goto Ld
        L27:
            r12 = 123(0x7b, float:1.72E-43)
            r11.append(r12)
            int r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r13)
            r1 = 0
            r2 = r1
        L32:
            int r3 = r13.dataPosition()
            if (r3 >= r12) goto L290
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r13)
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r3)
            java.lang.Object r4 = r0.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L32
            java.lang.String r5 = ","
            if (r2 == 0) goto L4f
            r11.append(r5)
        L4f:
            java.lang.Object r2 = r4.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r4.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            java.lang.String r6 = "\""
            r11.append(r6)
            r11.append(r2)
            java.lang.String r2 = "\":"
            r11.append(r2)
            boolean r2 = r4.zaj()
            r7 = 1
            if (r2 == 0) goto L13a
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L129;
                case 1: goto L11d;
                case 2: goto L10d;
                case 3: goto Lfd;
                case 4: goto Led;
                case 5: goto Le1;
                case 6: goto Ld1;
                case 7: goto Lc5;
                case 8: goto Lb9;
                case 9: goto Lb9;
                case 10: goto L84;
                case 11: goto L7e;
                default: goto L74;
            }
        L74:
            java.lang.String r10 = "Unknown field out type = "
            java.lang.String r10 = defpackage.lb1.g(r2, r10)
            defpackage.i.h(r10)
            return
        L7e:
            java.lang.String r10 = "Method does not accept concrete type."
            defpackage.i.h(r10)
            return
        L84:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r13, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L95:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Laf
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r2.getString(r6)
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            java.lang.String r8 = (java.lang.String) r8
            r3.put(r6, r8)
            goto L95
        Laf:
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r3)
            zaJ(r11, r4, r2)
        Lb6:
            r2 = r7
            goto L32
        Lb9:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        Lc5:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        Ld1:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        Le1:
            java.math.BigDecimal r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        Led:
            double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r13, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        Lfd:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r13, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        L10d:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        L11d:
            java.math.BigInteger r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r13, r3)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        L129:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.zaD(r4, r2)
            zaJ(r11, r4, r2)
            goto Lb6
        L13a:
            boolean r2 = r4.zad
            if (r2 == 0) goto L1b8
            java.lang.String r2 = "["
            r11.append(r2)
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L1aa;
                case 1: goto L1a2;
                case 2: goto L19a;
                case 3: goto L192;
                case 4: goto L18a;
                case 5: goto L182;
                case 6: goto L17a;
                case 7: goto L172;
                case 8: goto L16c;
                case 9: goto L16c;
                case 10: goto L16c;
                case 11: goto L14e;
                default: goto L148;
            }
        L148:
            java.lang.String r10 = "Unknown field type out."
            defpackage.i.m(r10)
            return
        L14e:
            android.os.Parcel[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(r13, r3)
            int r3 = r2.length
            r6 = r1
        L154:
            if (r6 >= r3) goto L1b1
            if (r6 <= 0) goto L15b
            r11.append(r5)
        L15b:
            r8 = r2[r6]
            r8.setDataPosition(r1)
            java.util.Map r8 = r4.zah()
            r9 = r2[r6]
            r10.zaH(r11, r8, r9)
            int r6 = r6 + 1
            goto L154
        L16c:
            java.lang.String r10 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            defpackage.fa6.h(r10)
            return
        L172:
            java.lang.String[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeStringArray(r11, r2)
            goto L1b1
        L17a:
            boolean[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1b1
        L182:
            java.math.BigDecimal[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1b1
        L18a:
            double[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1b1
        L192:
            float[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1b1
        L19a:
            long[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1b1
        L1a2:
            java.math.BigInteger[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
            goto L1b1
        L1aa:
            int[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(r13, r3)
            com.google.android.gms.common.util.ArrayUtils.writeArray(r11, r2)
        L1b1:
            java.lang.String r2 = "]"
            r11.append(r2)
            goto Lb6
        L1b8:
            int r2 = r4.zac
            switch(r2) {
                case 0: goto L287;
                case 1: goto L27e;
                case 2: goto L275;
                case 3: goto L26c;
                case 4: goto L263;
                case 5: goto L25a;
                case 6: goto L251;
                case 7: goto L23e;
                case 8: goto L22b;
                case 9: goto L218;
                case 10: goto L1d3;
                case 11: goto L1c3;
                default: goto L1bd;
            }
        L1bd:
            java.lang.String r10 = "Unknown field type out"
            defpackage.i.m(r10)
            return
        L1c3:
            android.os.Parcel r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(r13, r3)
            r2.setDataPosition(r1)
            java.util.Map r3 = r4.zah()
            r10.zaH(r11, r3, r2)
            goto Lb6
        L1d3:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r13, r3)
            java.util.Set r3 = r2.keySet()
            java.lang.String r4 = "{"
            r11.append(r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = r7
        L1e5:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L211
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            if (r4 != 0) goto L1f6
            r11.append(r5)
        L1f6:
            r11.append(r6)
            r11.append(r8)
            java.lang.String r4 = "\":\""
            r11.append(r4)
            java.lang.String r4 = r2.getString(r8)
            java.lang.String r4 = com.google.android.gms.common.util.JsonUtils.escapeString(r4)
            r11.append(r4)
            r11.append(r6)
            r4 = r1
            goto L1e5
        L211:
            java.lang.String r2 = "}"
            r11.append(r2)
            goto Lb6
        L218:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r3)
            r11.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r2)
            r11.append(r2)
            r11.append(r6)
            goto Lb6
        L22b:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(r13, r3)
            r11.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encode(r2)
            r11.append(r2)
            r11.append(r6)
            goto Lb6
        L23e:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r13, r3)
            r11.append(r6)
            java.lang.String r2 = com.google.android.gms.common.util.JsonUtils.escapeString(r2)
            r11.append(r2)
            r11.append(r6)
            goto Lb6
        L251:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r13, r3)
            r11.append(r2)
            goto Lb6
        L25a:
            java.math.BigDecimal r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(r13, r3)
            r11.append(r2)
            goto Lb6
        L263:
            double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(r13, r3)
            r11.append(r2)
            goto Lb6
        L26c:
            float r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r13, r3)
            r11.append(r2)
            goto Lb6
        L275:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r13, r3)
            r11.append(r2)
            goto Lb6
        L27e:
            java.math.BigInteger r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(r13, r3)
            r11.append(r2)
            goto Lb6
        L287:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r13, r3)
            r11.append(r2)
            goto Lb6
        L290:
            int r10 = r13.dataPosition()
            if (r10 != r12) goto L29c
            r10 = 125(0x7d, float:1.75E-43)
            r11.append(r10)
            return
        L29c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r10 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.String r11 = "Overread allowed size end="
            java.lang.String r11 = defpackage.lb1.g(r12, r11)
            r10.<init>(r11, r13)
            throw r10
    }

    private static final void zaI(java.lang.StringBuilder r1, int r2, java.lang.Object r3) {
            java.lang.String r0 = "\""
            switch(r2) {
                case 0: goto L55;
                case 1: goto L55;
                case 2: goto L55;
                case 3: goto L55;
                case 4: goto L55;
                case 5: goto L55;
                case 6: goto L55;
                case 7: goto L3f;
                case 8: goto L2f;
                case 9: goto L1f;
                case 10: goto L15;
                case 11: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = "Unknown type = "
            java.lang.String r1 = defpackage.lb1.g(r2, r1)
            defpackage.i.h(r1)
            return
        Lf:
            java.lang.String r1 = "Method does not accept concrete type."
            defpackage.i.h(r1)
            return
        L15:
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.util.HashMap r2 = (java.util.HashMap) r2
            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(r1, r2)
            return
        L1f:
            r1.append(r0)
            byte[] r3 = (byte[]) r3
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r3)
            r1.append(r2)
            r1.append(r0)
            return
        L2f:
            r1.append(r0)
            byte[] r3 = (byte[]) r3
            java.lang.String r2 = com.google.android.gms.common.util.Base64Utils.encode(r3)
            r1.append(r2)
            r1.append(r0)
            return
        L3f:
            r1.append(r0)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.google.android.gms.common.util.JsonUtils.escapeString(r2)
            r1.append(r2)
            r1.append(r0)
            return
        L55:
            r1.append(r3)
            return
    }

    private static final void zaJ(java.lang.StringBuilder r4, com.google.android.gms.common.server.response.FastJsonResponse.Field r5, java.lang.Object r6) {
            boolean r0 = r5.zab
            if (r0 == 0) goto L2b
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.String r0 = "["
            r4.append(r0)
            int r0 = r6.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L25
            if (r1 == 0) goto L19
            java.lang.String r2 = ","
            r4.append(r2)
        L19:
            int r2 = r5.zaa
            java.lang.Object r3 = r6.get(r1)
            zaI(r4, r2, r3)
            int r1 = r1 + 1
            goto L10
        L25:
            java.lang.String r5 = "]"
            r4.append(r5)
            return
        L2b:
            int r5 = r5.zaa
            zaI(r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r4, java.lang.String r5, java.util.ArrayList<T> r6) {
            r3 = this;
            r3.zaG(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.size()
            int r0 = r6.size()
            r1 = 0
        L16:
            if (r1 >= r0) goto L2a
            java.lang.Object r2 = r6.get(r1)
            com.google.android.gms.common.server.response.FastJsonResponse r2 = (com.google.android.gms.common.server.response.FastJsonResponse) r2
            com.google.android.gms.common.server.response.SafeParcelResponse r2 = (com.google.android.gms.common.server.response.SafeParcelResponse) r2
            android.os.Parcel r2 = r2.zaE()
            r5.add(r2)
            int r1 = r1 + 1
            goto L16
        L2a:
            android.os.Parcel r3 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelList(r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, T r3) {
            r0 = this;
            r0.zaG(r1)
            com.google.android.gms.common.server.response.SafeParcelResponse r3 = (com.google.android.gms.common.server.response.SafeParcelResponse) r3
            android.os.Parcel r2 = r3.zaE()
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            r3 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(r0, r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings() {
            r1 = this;
            com.google.android.gms.common.server.response.zan r0 = r1.zad
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.String r1 = r1.zae
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map r1 = r0.zab(r1)
            return r1
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final java.lang.Object getValueObject(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Converting to JSON does not require this method."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(java.lang.String r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Converting to JSON does not require this method."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r0, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, byte[] r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(r0, r1, r3, r2)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r0, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r0, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r0, r1, r3, r2)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r3 = this;
            r3.zaG(r4)
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r5.putString(r1, r2)
            goto L16
        L2c:
            android.os.Parcel r3 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r4, java.lang.String r5, java.util.ArrayList<java.lang.String> r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            java.lang.String[] r0 = new java.lang.String[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L1d
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L1d:
            android.os.Parcel r3 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r5 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(r3, r4, r0, r5)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.lang.String toString() {
            r4 = this;
            com.google.android.gms.common.server.response.zan r0 = r4.zad
            java.lang.String r1 = "Cannot convert to JSON on client side."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            android.os.Parcel r0 = r4.zaE()
            r1 = 0
            r0.setDataPosition(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.lang.String r2 = r4.zae
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.common.server.response.zan r3 = r4.zad
            java.util.Map r2 = r3.zab(r2)
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.util.Map r2 = (java.util.Map) r2
            r4.zaH(r1, r2, r0)
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            android.os.Parcel r0 = r4.zaE()
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(r5, r2, r0, r3)
            int r0 = r4.zac
            if (r0 == 0) goto L1a
            com.google.android.gms.common.server.response.zan r4 = r4.zad
            goto L1b
        L1a:
            r4 = 0
        L1b:
            r0 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r4, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }

    public final android.os.Parcel zaE() {
            r3 = this;
            int r0 = r3.zaf
            r1 = 2
            if (r0 == 0) goto L13
            r2 = 1
            if (r0 == r2) goto L9
            goto L22
        L9:
            android.os.Parcel r0 = r3.zab
            int r2 = r3.zag
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r0, r2)
            r3.zaf = r1
            goto L22
        L13:
            android.os.Parcel r0 = r3.zab
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r0)
            r3.zag = r0
            android.os.Parcel r2 = r3.zab
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r2, r0)
            r3.zaf = r1
        L22:
            android.os.Parcel r3 = r3.zab
            return r3
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.math.BigDecimal r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimal(r0, r1, r3, r2)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field r4, java.lang.String r5, java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            java.math.BigDecimal[] r0 = new java.math.BigDecimal[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L1d
            java.lang.Object r2 = r6.get(r1)
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L1d:
            android.os.Parcel r3 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r5 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimalArray(r3, r4, r0, r5)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.math.BigInteger r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigInteger(r0, r1, r3, r2)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zah(com.google.android.gms.common.server.response.FastJsonResponse.Field r4, java.lang.String r5, java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            java.math.BigInteger[] r0 = new java.math.BigInteger[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L1d
            java.lang.Object r2 = r6.get(r1)
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L1d:
            android.os.Parcel r3 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r5 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigIntegerArray(r3, r4, r0, r5)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zak(com.google.android.gms.common.server.response.FastJsonResponse.Field r4, java.lang.String r5, java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            boolean[] r0 = new boolean[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L21
            java.lang.Object r2 = r6.get(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r3 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r5 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(r3, r4, r0, r5)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zan(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, double r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(r0, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zap(com.google.android.gms.common.server.response.FastJsonResponse.Field r5, java.lang.String r6, java.util.ArrayList r7) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            double[] r0 = new double[r6]
            r1 = 0
        L10:
            if (r1 >= r6) goto L21
            java.lang.Object r2 = r7.get(r1)
            java.lang.Double r2 = (java.lang.Double) r2
            double r2 = r2.doubleValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r4 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleArray(r4, r5, r0, r6)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zar(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, float r3) {
            r0 = this;
            r0.zaG(r1)
            android.os.Parcel r0 = r0.zab
            int r1 = r1.getSafeParcelableFieldId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r0, r1, r3)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zat(com.google.android.gms.common.server.response.FastJsonResponse.Field r4, java.lang.String r5, java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            float[] r0 = new float[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L21
            java.lang.Object r2 = r6.get(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r3 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r5 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(r3, r4, r0, r5)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaw(com.google.android.gms.common.server.response.FastJsonResponse.Field r4, java.lang.String r5, java.util.ArrayList r6) {
            r3 = this;
            r3.zaG(r4)
            java.lang.Object r5 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            int[] r0 = new int[r5]
            r1 = 0
        L10:
            if (r1 >= r5) goto L21
            java.lang.Object r2 = r6.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r3 = r3.zab
            int r4 = r4.getSafeParcelableFieldId()
            r5 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(r3, r4, r0, r5)
            return
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void zaz(com.google.android.gms.common.server.response.FastJsonResponse.Field r5, java.lang.String r6, java.util.ArrayList r7) {
            r4 = this;
            r4.zaG(r5)
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            long[] r0 = new long[r6]
            r1 = 0
        L10:
            if (r1 >= r6) goto L21
            java.lang.Object r2 = r7.get(r1)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L10
        L21:
            android.os.Parcel r4 = r4.zab
            int r5 = r5.getSafeParcelableFieldId()
            r6 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongArray(r4, r5, r0, r6)
            return
    }
}
