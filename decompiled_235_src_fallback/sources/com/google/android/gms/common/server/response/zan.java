package com.google.android.gms.common.server.response;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zan extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zan> CREATOR = null;
    final int zaa;
    private final java.util.HashMap zab;
    private final java.lang.String zac;

    static {
            com.google.android.gms.common.server.response.zao r0 = new com.google.android.gms.common.server.response.zao
            r0.<init>()
            com.google.android.gms.common.server.response.zan.CREATOR = r0
            return
    }

    public zan(int r11, java.util.ArrayList r12, java.lang.String r13) {
            r10 = this;
            r10.<init>()
            r10.zaa = r11
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            int r0 = r12.size()
            r1 = 0
            r2 = r1
        L10:
            if (r2 >= r0) goto L46
            java.lang.Object r3 = r12.get(r2)
            com.google.android.gms.common.server.response.zal r3 = (com.google.android.gms.common.server.response.zal) r3
            java.lang.String r4 = r3.zab
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.ArrayList r6 = r3.zac
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r6 = r6.size()
            r7 = r1
        L2c:
            if (r7 >= r6) goto L40
            java.util.ArrayList r8 = r3.zac
            java.lang.Object r8 = r8.get(r7)
            com.google.android.gms.common.server.response.zam r8 = (com.google.android.gms.common.server.response.zam) r8
            java.lang.String r9 = r8.zab
            com.google.android.gms.common.server.response.FastJsonResponse$Field r8 = r8.zac
            r5.put(r9, r8)
            int r7 = r7 + 1
            goto L2c
        L40:
            r11.put(r4, r5)
            int r2 = r2 + 1
            goto L10
        L46:
            r10.zab = r11
            java.lang.Object r11 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            java.lang.String r11 = (java.lang.String) r11
            r10.zac = r11
            r10.zad()
            return
    }

    public zan(java.lang.Class r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zab = r0
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.zac = r2
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.HashMap r1 = r6.zab
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r3 = ":\n"
            r0.append(r3)
            java.util.HashMap r3 = r6.zab
            java.lang.Object r2 = r3.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r3 = r2.keySet()
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lf
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "  "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r5 = ": "
            r0.append(r5)
            java.lang.Object r4 = r2.get(r4)
            r0.append(r4)
            goto L33
        L54:
            java.lang.String r6 = r0.toString()
            return r6
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r6)
            r0 = 1
            int r1 = r5.zaa
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r6, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap r1 = r5.zab
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.HashMap r3 = r5.zab
            com.google.android.gms.common.server.response.zal r4 = new com.google.android.gms.common.server.response.zal
            java.lang.Object r3 = r3.get(r2)
            java.util.Map r3 = (java.util.Map) r3
            r4.<init>(r2, r3)
            r0.add(r4)
            goto L19
        L36:
            r1 = 2
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r6, r1, r0, r2)
            r0 = 3
            java.lang.String r5 = r5.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r6, r0, r5, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r6, r7)
            return
    }

    public final java.lang.String zaa() {
            r0 = this;
            java.lang.String r0 = r0.zac
            return r0
    }

    public final java.util.Map zab(java.lang.String r1) {
            r0 = this;
            java.util.HashMap r0 = r0.zab
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public final void zac() {
            r7 = this;
            java.util.HashMap r0 = r7.zab
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap r2 = r7.zab
            java.lang.Object r2 = r2.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r4 = r2.keySet()
            java.util.Iterator r4 = r4.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L45
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.get(r5)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r6 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r6
            com.google.android.gms.common.server.response.FastJsonResponse$Field r6 = r6.zab()
            r3.put(r5, r6)
            goto L2b
        L45:
            java.util.HashMap r2 = r7.zab
            r2.put(r1, r3)
            goto La
        L4b:
            return
    }

    public final void zad() {
            r4 = this;
            java.util.HashMap r0 = r4.zab
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap r2 = r4.zab
            java.lang.Object r1 = r2.get(r1)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r1.get(r3)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r3 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r3
            r3.zai(r4)
            goto L26
        L3c:
            return
    }

    public final void zae(java.lang.Class r1, java.util.Map r2) {
            r0 = this;
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap r0 = r0.zab
            r0.put(r1, r2)
            return
    }

    public final boolean zaf(java.lang.Class r1) {
            r0 = this;
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.util.HashMap r0 = r0.zab
            boolean r0 = r0.containsKey(r1)
            return r0
    }
}
