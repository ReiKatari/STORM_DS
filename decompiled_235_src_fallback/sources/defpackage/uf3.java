package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf3  reason: default package */
/* loaded from: classes.dex */
public final class uf3 implements defpackage.rh4, defpackage.mk7 {
    public final boolean a;
    public final android.util.JsonWriter b;
    public final java.util.Map c;
    public final java.util.Map d;
    public final defpackage.qh4 e;
    public final boolean f;

    public uf3(java.io.Writer r2, java.util.Map r3, java.util.Map r4, defpackage.qh4 r5, boolean r6) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            android.util.JsonWriter r0 = new android.util.JsonWriter
            r0.<init>(r2)
            r1.b = r0
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            return
    }

    public final defpackage.uf3 a(java.lang.Object r6) {
            r5 = this;
            android.util.JsonWriter r0 = r5.b
            if (r6 != 0) goto L8
            r0.nullValue()
            return r5
        L8:
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L12
            java.lang.Number r6 = (java.lang.Number) r6
            r0.value(r6)
            return r5
        L12:
            java.lang.Class r1 = r6.getClass()
            boolean r1 = r1.isArray()
            if (r1 == 0) goto L9c
            boolean r1 = r6 instanceof byte[]
            if (r1 == 0) goto L2e
            byte[] r6 = (byte[]) r6
            r5.c()
            r1 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r1)
            r0.value(r6)
            return r5
        L2e:
            r0.beginArray()
            boolean r1 = r6 instanceof int[]
            r2 = 0
            if (r1 == 0) goto L44
            int[] r6 = (int[]) r6
            int r1 = r6.length
        L39:
            if (r2 >= r1) goto L98
            r3 = r6[r2]
            long r3 = (long) r3
            r0.value(r3)
            int r2 = r2 + 1
            goto L39
        L44:
            boolean r1 = r6 instanceof long[]
            if (r1 == 0) goto L58
            long[] r6 = (long[]) r6
            int r1 = r6.length
        L4b:
            if (r2 >= r1) goto L98
            r3 = r6[r2]
            r5.c()
            r0.value(r3)
            int r2 = r2 + 1
            goto L4b
        L58:
            boolean r1 = r6 instanceof double[]
            if (r1 == 0) goto L69
            double[] r6 = (double[]) r6
            int r1 = r6.length
        L5f:
            if (r2 >= r1) goto L98
            r3 = r6[r2]
            r0.value(r3)
            int r2 = r2 + 1
            goto L5f
        L69:
            boolean r1 = r6 instanceof boolean[]
            if (r1 == 0) goto L7a
            boolean[] r6 = (boolean[]) r6
            int r1 = r6.length
        L70:
            if (r2 >= r1) goto L98
            boolean r3 = r6[r2]
            r0.value(r3)
            int r2 = r2 + 1
            goto L70
        L7a:
            boolean r1 = r6 instanceof java.lang.Number[]
            if (r1 == 0) goto L8b
            java.lang.Number[] r6 = (java.lang.Number[]) r6
            int r1 = r6.length
        L81:
            if (r2 >= r1) goto L98
            r3 = r6[r2]
            r5.a(r3)
            int r2 = r2 + 1
            goto L81
        L8b:
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r1 = r6.length
        L8e:
            if (r2 >= r1) goto L98
            r3 = r6[r2]
            r5.a(r3)
            int r2 = r2 + 1
            goto L8e
        L98:
            r0.endArray()
            return r5
        L9c:
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto Lbb
            java.util.Collection r6 = (java.util.Collection) r6
            r0.beginArray()
            java.util.Iterator r6 = r6.iterator()
        La9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r6.next()
            r5.a(r1)
            goto La9
        Lb7:
            r0.endArray()
            return r5
        Lbb:
            boolean r1 = r6 instanceof java.util.Map
            if (r1 == 0) goto L100
            java.util.Map r6 = (java.util.Map) r6
            r0.beginObject()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        Lcc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lfc
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.ClassCastException -> Le7
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.ClassCastException -> Le7
            r5.b(r1, r3)     // Catch: java.lang.ClassCastException -> Le7
            goto Lcc
        Le7:
            r5 = move-exception
            d42 r6 = new d42
            java.lang.Class r0 = r2.getClass()
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r1 = "Only String keys are currently supported in maps, got %s of type %s instead."
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>(r0, r5)
            throw r6
        Lfc:
            r0.endObject()
            return r5
        L100:
            java.util.Map r1 = r5.c
            java.lang.Class r2 = r6.getClass()
            java.lang.Object r1 = r1.get(r2)
            qh4 r1 = (defpackage.qh4) r1
            if (r1 == 0) goto L118
            r0.beginObject()
            r1.encode(r6, r5)
            r0.endObject()
            return r5
        L118:
            java.util.Map r1 = r5.d
            java.lang.Class r2 = r6.getClass()
            java.lang.Object r1 = r1.get(r2)
            lk7 r1 = (defpackage.lk7) r1
            if (r1 == 0) goto L12a
            r1.encode(r6, r5)
            return r5
        L12a:
            boolean r1 = r6 instanceof java.lang.Enum
            if (r1 == 0) goto L13b
            java.lang.Enum r6 = (java.lang.Enum) r6
            java.lang.String r6 = r6.name()
            r5.c()
            r0.value(r6)
            return r5
        L13b:
            r0.beginObject()
            qh4 r1 = r5.e
            r1.encode(r6, r5)
            r0.endObject()
            return r5
    }

    @Override // defpackage.mk7
    public final defpackage.mk7 add(java.lang.String r2) {
            r1 = this;
            r1.c()
            android.util.JsonWriter r0 = r1.b
            r0.value(r2)
            return r1
    }

    @Override // defpackage.mk7
    public final defpackage.mk7 add(boolean r2) {
            r1 = this;
            r1.c()
            android.util.JsonWriter r0 = r1.b
            r0.value(r2)
            return r1
    }

    @Override // defpackage.rh4
    public final defpackage.rh4 add(defpackage.na2 r2, long r3) {
            r1 = this;
            java.lang.String r2 = r2.a
            r1.c()
            android.util.JsonWriter r0 = r1.b
            r0.name(r2)
            r1.c()
            r0.value(r3)
            return r1
    }

    @Override // defpackage.rh4
    public final defpackage.rh4 add(defpackage.na2 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = r1.a
            r0.b(r2, r1)
            return r0
    }

    public final defpackage.uf3 b(java.lang.Object r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.f
            android.util.JsonWriter r1 = r2.b
            if (r0 == 0) goto L13
            if (r3 != 0) goto L9
            return r2
        L9:
            r2.c()
            r1.name(r4)
            r2.a(r3)
            return r2
        L13:
            r2.c()
            r1.name(r4)
            if (r3 != 0) goto L1f
            r1.nullValue()
            return r2
        L1f:
            r2.a(r3)
            return r2
    }

    public final void c() {
            r0 = this;
            boolean r0 = r0.a
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "Parent context used since this context was created. Cannot use this context anymore."
            defpackage.i.m(r0)
            return
    }
}
