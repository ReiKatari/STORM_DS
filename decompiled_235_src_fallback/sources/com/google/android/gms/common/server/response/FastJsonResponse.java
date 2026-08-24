package com.google.android.gms.common.server.response;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class FastJsonResponse {

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Field<I, O> extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
        public static final com.google.android.gms.common.server.response.zaj CREATOR = null;
        protected final int zaa;
        protected final boolean zab;
        protected final int zac;
        protected final boolean zad;
        protected final java.lang.String zae;
        protected final int zaf;
        protected final java.lang.Class zag;
        protected final java.lang.String zah;
        private final int zai;
        private com.google.android.gms.common.server.response.zan zaj;
        private final com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zak;

        static {
                com.google.android.gms.common.server.response.zaj r0 = new com.google.android.gms.common.server.response.zaj
                r0.<init>()
                com.google.android.gms.common.server.response.FastJsonResponse.Field.CREATOR = r0
                return
        }

        public Field(int r1, int r2, boolean r3, int r4, boolean r5, java.lang.String r6, int r7, java.lang.String r8, com.google.android.gms.common.server.converter.zaa r9) {
                r0 = this;
                r0.<init>()
                r0.zai = r1
                r0.zaa = r2
                r0.zab = r3
                r0.zac = r4
                r0.zad = r5
                r0.zae = r6
                r0.zaf = r7
                r1 = 0
                if (r8 != 0) goto L19
                r0.zag = r1
                r0.zah = r1
                goto L1f
            L19:
                java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r2 = com.google.android.gms.common.server.response.SafeParcelResponse.class
                r0.zag = r2
                r0.zah = r8
            L1f:
                if (r9 != 0) goto L24
                r0.zak = r1
                return
            L24:
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r1 = r9.zab()
                r0.zak = r1
                return
        }

        public Field(int r2, boolean r3, int r4, boolean r5, java.lang.String r6, int r7, java.lang.Class r8, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter r9) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.zai = r0
                r1.zaa = r2
                r1.zab = r3
                r1.zac = r4
                r1.zad = r5
                r1.zae = r6
                r1.zaf = r7
                r1.zag = r8
                if (r8 != 0) goto L1a
                r2 = 0
                r1.zah = r2
                goto L20
            L1a:
                java.lang.String r2 = r8.getCanonicalName()
                r1.zah = r2
            L20:
                r1.zak = r9
                return
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<byte[], byte[]> forBase64(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 8
                r2 = 0
                r4 = 0
                r3 = r1
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Boolean, java.lang.Boolean> forBoolean(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 6
                r2 = 0
                r4 = 0
                r3 = r1
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<T, T> forConcreteType(java.lang.String r9, int r10, java.lang.Class<T> r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r4 = 0
                r8 = 0
                r1 = 11
                r2 = 0
                r3 = r1
                r5 = r9
                r6 = r10
                r7 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static <T extends com.google.android.gms.common.server.response.FastJsonResponse> com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<T>, java.util.ArrayList<T>> forConcreteTypeArray(java.lang.String r9, int r10, java.lang.Class<T> r11) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r4 = 1
                r8 = 0
                r1 = 11
                r2 = 1
                r3 = r1
                r5 = r9
                r6 = r10
                r7 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Double, java.lang.Double> forDouble(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 4
                r2 = 0
                r3 = 4
                r4 = 0
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Float, java.lang.Float> forFloat(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 3
                r2 = 0
                r3 = 3
                r4 = 0
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Integer, java.lang.Integer> forInteger(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.Long, java.lang.Long> forLong(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 2
                r2 = 0
                r3 = 2
                r4 = 0
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.lang.String, java.lang.String> forString(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 7
                r2 = 0
                r4 = 0
                r3 = r1
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.HashMap<java.lang.String, java.lang.String>, java.util.HashMap<java.lang.String, java.lang.String>> forStringMap(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 10
                r2 = 0
                r4 = 0
                r3 = r1
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field<java.util.ArrayList<java.lang.String>, java.util.ArrayList<java.lang.String>> forStrings(java.lang.String r9, int r10) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r7 = 0
                r8 = 0
                r1 = 7
                r2 = 1
                r4 = 1
                r3 = r1
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static com.google.android.gms.common.server.response.FastJsonResponse.Field withConverter(java.lang.String r9, int r10, com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<?, ?> r11, boolean r12) {
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                r11.zaa()
                r11.zab()
                r4 = 0
                r7 = 0
                r1 = 7
                r3 = 0
                r5 = r9
                r6 = r10
                r8 = r11
                r2 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zac(com.google.android.gms.common.server.response.FastJsonResponse.Field r0) {
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r0.zak
                return r0
        }

        public int getSafeParcelableFieldId() {
                r0 = this;
                int r0 = r0.zaf
                return r0
        }

        public final java.lang.String toString() {
                r3 = this;
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = com.google.android.gms.common.internal.Objects.toStringHelper(r3)
                int r1 = r3.zai
                java.lang.String r2 = "versionCode"
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                int r1 = r3.zaa
                java.lang.String r2 = "typeIn"
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                boolean r1 = r3.zab
                java.lang.String r2 = "typeInArray"
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                int r1 = r3.zac
                java.lang.String r2 = "typeOut"
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                boolean r1 = r3.zad
                java.lang.String r2 = "typeOutArray"
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r1 = "outputFieldName"
                java.lang.String r2 = r3.zae
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r1, r2)
                int r1 = r3.zaf
                java.lang.String r2 = "safeParcelFieldId"
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r2, r1)
                java.lang.String r1 = "concreteTypeName"
                java.lang.String r2 = r3.zag()
                com.google.android.gms.common.internal.Objects$ToStringHelper r0 = r0.add(r1, r2)
                java.lang.Class r1 = r3.zag
                if (r1 == 0) goto L6b
                java.lang.String r2 = "concreteType.class"
                java.lang.String r1 = r1.getCanonicalName()
                r0.add(r2, r1)
            L6b:
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r3 = r3.zak
                if (r3 == 0) goto L7c
                java.lang.Class r3 = r3.getClass()
                java.lang.String r3 = r3.getCanonicalName()
                java.lang.String r1 = "converterName"
                r0.add(r1, r3)
            L7c:
                java.lang.String r3 = r0.toString()
                return r3
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r5, int r6) {
                r4 = this;
                int r0 = r4.zai
                int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
                r2 = 1
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
                r0 = 2
                int r2 = r4.zaa
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r2)
                r0 = 3
                boolean r2 = r4.zab
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r2)
                r0 = 4
                int r2 = r4.zac
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r2)
                r0 = 5
                boolean r2 = r4.zad
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r0, r2)
                java.lang.String r0 = r4.zae
                r2 = 6
                r3 = 0
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
                r0 = 7
                int r2 = r4.getSafeParcelableFieldId()
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r2)
                r0 = 8
                java.lang.String r2 = r4.zag()
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r0, r2, r3)
                r0 = 9
                com.google.android.gms.common.server.converter.zaa r4 = r4.zaa()
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r4, r6, r3)
                com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
                return
        }

        public final com.google.android.gms.common.server.converter.zaa zaa() {
                r0 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r0.zak
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                com.google.android.gms.common.server.converter.zaa r0 = com.google.android.gms.common.server.converter.zaa.zaa(r0)
                return r0
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse.Field zab() {
                r10 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$Field r0 = new com.google.android.gms.common.server.response.FastJsonResponse$Field
                int r1 = r10.zai
                int r2 = r10.zaa
                boolean r3 = r10.zab
                int r4 = r10.zac
                boolean r5 = r10.zad
                java.lang.String r6 = r10.zae
                int r7 = r10.zaf
                java.lang.String r8 = r10.zah
                com.google.android.gms.common.server.converter.zaa r9 = r10.zaa()
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
        }

        public final com.google.android.gms.common.server.response.FastJsonResponse zad() {
                r2 = this;
                java.lang.Class r0 = r2.zag
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                java.lang.Class r0 = r2.zag
                java.lang.Class<com.google.android.gms.common.server.response.SafeParcelResponse> r1 = com.google.android.gms.common.server.response.SafeParcelResponse.class
                if (r0 != r1) goto L21
                java.lang.String r0 = r2.zah
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r2.zaj
                java.lang.String r1 = "The field mapping dictionary must be set if the concrete type is a SafeParcelResponse object."
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
                com.google.android.gms.common.server.response.SafeParcelResponse r0 = new com.google.android.gms.common.server.response.SafeParcelResponse
                com.google.android.gms.common.server.response.zan r1 = r2.zaj
                java.lang.String r2 = r2.zah
                r0.<init>(r1, r2)
                return r0
            L21:
                java.lang.Object r2 = r0.newInstance()
                com.google.android.gms.common.server.response.FastJsonResponse r2 = (com.google.android.gms.common.server.response.FastJsonResponse) r2
                return r2
        }

        public final java.lang.Object zae(java.lang.Object r2) {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r1.zak
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r1 = r1.zak
                java.lang.Object r1 = r1.zac(r2)
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                return r1
        }

        public final java.lang.Object zaf(java.lang.Object r2) {
                r1 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r1.zak
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r1 = r1.zak
                java.lang.Object r1 = r1.zad(r2)
                return r1
        }

        public final java.lang.String zag() {
                r0 = this;
                java.lang.String r0 = r0.zah
                if (r0 != 0) goto L5
                r0 = 0
            L5:
                return r0
        }

        public final java.util.Map zah() {
                r1 = this;
                java.lang.String r0 = r1.zah
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r1.zaj
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
                com.google.android.gms.common.server.response.zan r0 = r1.zaj
                java.lang.String r1 = r1.zah
                java.util.Map r1 = r0.zab(r1)
                java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                return r1
        }

        public final void zai(com.google.android.gms.common.server.response.zan r1) {
                r0 = this;
                r0.zaj = r1
                return
        }

        public final boolean zaj() {
                r0 = this;
                com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = r0.zak
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        java.lang.Object zac(java.lang.Object r1);

        java.lang.Object zad(java.lang.Object r1);
    }

    public FastJsonResponse() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.Object zaD(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.Object r2) {
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r1)
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.zaf(r2)
            return r1
        Lb:
            return r2
    }

    private final void zaE(com.google.android.gms.common.server.response.FastJsonResponse.Field r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r5.zac
            java.lang.Object r6 = r5.zae(r6)
            java.lang.String r1 = r5.zae
            switch(r0) {
                case 0: goto L63;
                case 1: goto L5d;
                case 2: goto L4d;
                case 3: goto Lb;
                case 4: goto L3d;
                case 5: goto L37;
                case 6: goto L27;
                case 7: goto L21;
                case 8: goto L15;
                case 9: goto L15;
                default: goto Lb;
            }
        Lb:
            java.lang.String r4 = "Unsupported type for conversion: "
            java.lang.String r4 = defpackage.lb1.g(r0, r4)
            defpackage.i.m(r4)
            return
        L15:
            if (r6 == 0) goto L1d
            byte[] r6 = (byte[]) r6
            r4.setDecodedBytesInternal(r5, r1, r6)
            return
        L1d:
            zaG(r1)
            return
        L21:
            java.lang.String r6 = (java.lang.String) r6
            r4.setStringInternal(r5, r1, r6)
            return
        L27:
            if (r6 == 0) goto L33
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4.setBooleanInternal(r5, r1, r6)
            return
        L33:
            zaG(r1)
            return
        L37:
            java.math.BigDecimal r6 = (java.math.BigDecimal) r6
            r4.zab(r5, r1, r6)
            return
        L3d:
            if (r6 == 0) goto L49
            java.lang.Double r6 = (java.lang.Double) r6
            double r2 = r6.doubleValue()
            r4.zan(r5, r1, r2)
            return
        L49:
            zaG(r1)
            return
        L4d:
            if (r6 == 0) goto L59
            java.lang.Long r6 = (java.lang.Long) r6
            long r2 = r6.longValue()
            r4.setLongInternal(r5, r1, r2)
            return
        L59:
            zaG(r1)
            return
        L5d:
            java.math.BigInteger r6 = (java.math.BigInteger) r6
            r4.zaf(r5, r1, r6)
            return
        L63:
            if (r6 == 0) goto L6f
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setIntegerInternal(r5, r1, r6)
            return
        L6f:
            zaG(r1)
            return
    }

    private static final void zaF(java.lang.StringBuilder r2, com.google.android.gms.common.server.response.FastJsonResponse.Field r3, java.lang.Object r4) {
            int r0 = r3.zaa
            r1 = 11
            if (r0 == r1) goto L1f
            r3 = 7
            if (r0 != r3) goto L1b
            java.lang.String r3 = "\""
            r2.append(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.google.android.gms.common.util.JsonUtils.escapeString(r4)
            r2.append(r4)
            r2.append(r3)
            return
        L1b:
            r2.append(r4)
            return
        L1f:
            java.lang.Class r3 = r3.zag
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            java.lang.Object r3 = r3.cast(r4)
            com.google.android.gms.common.server.response.FastJsonResponse r3 = (com.google.android.gms.common.server.response.FastJsonResponse) r3
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            return
    }

    private static final void zaG(java.lang.String r3) {
            r0 = 6
            java.lang.String r1 = "FastJsonResponse"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Output field ("
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r3 = ") has a null value, but expected a primitive"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            android.util.Log.e(r1, r3)
        L1f:
            return
    }

    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList<T> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Concrete type array not supported"
            r0.<init>(r1)
            throw r0
    }

    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, T r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Concrete type not supported"
            r0.<init>(r1)
            throw r0
    }

    public abstract java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings();

    public java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field r7) {
            r6 = this;
            java.lang.String r0 = "get"
            java.lang.String r1 = r7.zae
            java.lang.Class r2 = r7.zag
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r6.getValueObject(r1)
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            java.lang.String r7 = r7.zae
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r5 = "Concrete field shouldn't be value object: %s"
            com.google.android.gms.common.internal.Preconditions.checkState(r2, r5, r7)
            char r7 = r1.charAt(r3)     // Catch: java.lang.Exception -> L47
            char r7 = java.lang.Character.toUpperCase(r7)     // Catch: java.lang.Exception -> L47
            java.lang.String r1 = r1.substring(r4)     // Catch: java.lang.Exception -> L47
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47
            r2.<init>(r0)     // Catch: java.lang.Exception -> L47
            r2.append(r7)     // Catch: java.lang.Exception -> L47
            r2.append(r1)     // Catch: java.lang.Exception -> L47
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L47
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.Exception -> L47
            r1 = 0
            java.lang.reflect.Method r7 = r0.getMethod(r7, r1)     // Catch: java.lang.Exception -> L47
            java.lang.Object r6 = r7.invoke(r6, r1)     // Catch: java.lang.Exception -> L47
            return r6
        L47:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
        L4e:
            java.lang.Object r6 = r6.getValueObject(r1)
            return r6
    }

    public abstract java.lang.Object getValueObject(java.lang.String r1);

    public boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field r3) {
            r2 = this;
            int r0 = r3.zac
            r1 = 11
            if (r0 != r1) goto L17
            boolean r2 = r3.zad
            r3 = 0
            if (r2 == 0) goto L11
            java.lang.String r2 = "Concrete type arrays not supported"
            defpackage.fa6.h(r2)
            return r3
        L11:
            java.lang.String r2 = "Concrete types not supported"
            defpackage.fa6.h(r2)
            return r3
        L17:
            java.lang.String r3 = r3.zae
            boolean r2 = r2.isPrimitiveFieldSet(r3)
            return r2
    }

    public abstract boolean isPrimitiveFieldSet(java.lang.String r1);

    public void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, boolean r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Boolean not supported"
            r0.<init>(r1)
            throw r0
    }

    public void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, byte[] r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "byte[] not supported"
            r0.<init>(r1)
            throw r0
    }

    public void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Integer not supported"
            r0.<init>(r1)
            throw r0
    }

    public void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, long r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Long not supported"
            r0.<init>(r1)
            throw r0
    }

    public void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "String not supported"
            r0.<init>(r1)
            throw r0
    }

    public void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "String map not supported"
            r0.<init>(r1)
            throw r0
    }

    public void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> r1, java.lang.String r2, java.util.ArrayList<java.lang.String> r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "String list not supported"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.util.Map r0 = r9.getFieldMappings()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            boolean r5 = r9.isFieldSet(r4)
            if (r5 == 0) goto L13
            java.lang.Object r5 = r9.getFieldValue(r4)
            java.lang.Object r5 = zaD(r4, r5)
            int r6 = r1.length()
            java.lang.String r7 = ","
            if (r6 != 0) goto L41
            java.lang.String r6 = "{"
            r1.append(r6)
            goto L44
        L41:
            r1.append(r7)
        L44:
            java.lang.String r6 = "\""
            r1.append(r6)
            r1.append(r3)
            java.lang.String r3 = "\":"
            r1.append(r3)
            if (r5 != 0) goto L59
            java.lang.String r3 = "null"
            r1.append(r3)
            goto L13
        L59:
            int r3 = r4.zac
            switch(r3) {
                case 8: goto La2;
                case 9: goto L91;
                case 10: goto L8b;
                default: goto L5e;
            }
        L5e:
            boolean r3 = r4.zab
            if (r3 == 0) goto L87
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.String r3 = "["
            r1.append(r3)
            int r3 = r5.size()
            r6 = 0
        L6e:
            if (r6 >= r3) goto L81
            if (r6 <= 0) goto L75
            r1.append(r7)
        L75:
            java.lang.Object r8 = r5.get(r6)
            if (r8 == 0) goto L7e
            zaF(r1, r4, r8)
        L7e:
            int r6 = r6 + 1
            goto L6e
        L81:
            java.lang.String r3 = "]"
            r1.append(r3)
            goto L13
        L87:
            zaF(r1, r4, r5)
            goto L13
        L8b:
            java.util.HashMap r5 = (java.util.HashMap) r5
            com.google.android.gms.common.util.MapUtils.writeStringMapToJson(r1, r5)
            goto L13
        L91:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r5)
            r1.append(r3)
            r1.append(r6)
            goto L13
        La2:
            r1.append(r6)
            byte[] r5 = (byte[]) r5
            java.lang.String r3 = com.google.android.gms.common.util.Base64Utils.encode(r5)
            r1.append(r3)
            r1.append(r6)
            goto L13
        Lb3:
            int r9 = r1.length()
            if (r9 <= 0) goto Lbf
            java.lang.String r9 = "}"
            r1.append(r9)
            goto Lc4
        Lbf:
            java.lang.String r9 = "{}"
            r1.append(r9)
        Lc4:
            java.lang.String r9 = r1.toString()
            return r9
    }

    public final void zaA(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.lang.String r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.setStringInternal(r2, r0, r3)
            return
    }

    public final void zaB(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.Map r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.setStringMapInternal(r2, r0, r3)
            return
    }

    public final void zaC(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.setStringsInternal(r2, r0, r3)
            return
    }

    public final void zaa(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.math.BigDecimal r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zab(r2, r0, r3)
            return
    }

    public void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.math.BigDecimal r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "BigDecimal not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zac(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zad(r2, r0, r3)
            return
    }

    public void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "BigDecimal list not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zae(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.math.BigInteger r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zaf(r2, r0, r3)
            return
    }

    public void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.math.BigInteger r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "BigInteger not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zag(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zah(r2, r0, r3)
            return
    }

    public void zah(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "BigInteger list not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zai(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, boolean r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.setBooleanInternal(r2, r0, r3)
            return
    }

    public final void zaj(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zak(r2, r0, r3)
            return
    }

    public void zak(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Boolean list not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zal(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, byte[] r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.setDecodedBytesInternal(r2, r0, r3)
            return
    }

    public final void zam(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, double r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.zan(r2, r0, r3)
            return
    }

    public void zan(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, double r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Double not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zao(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zap(r2, r0, r3)
            return
    }

    public void zap(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Double list not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zaq(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, float r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.zar(r2, r0, r3)
            return
    }

    public void zar(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, float r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Float not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zas(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zat(r2, r0, r3)
            return
    }

    public void zat(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Float list not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zau(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, int r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.setIntegerInternal(r2, r0, r3)
            return
    }

    public final void zav(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zaw(r2, r0, r3)
            return
    }

    public void zaw(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Integer list not supported"
            r0.<init>(r1)
            throw r0
    }

    public final void zax(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, long r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto Le
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.zaE(r2, r3)
            return
        Le:
            java.lang.String r0 = r2.zae
            r1.setLongInternal(r2, r0, r3)
            return
    }

    public final void zay(com.google.android.gms.common.server.response.FastJsonResponse.Field r2, java.util.ArrayList r3) {
            r1 = this;
            com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter r0 = com.google.android.gms.common.server.response.FastJsonResponse.Field.zac(r2)
            if (r0 == 0) goto La
            r1.zaE(r2, r3)
            return
        La:
            java.lang.String r0 = r2.zae
            r1.zaz(r2, r0, r3)
            return
    }

    public void zaz(com.google.android.gms.common.server.response.FastJsonResponse.Field r1, java.lang.String r2, java.util.ArrayList r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Long list not supported"
            r0.<init>(r1)
            throw r0
    }
}
