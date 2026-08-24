package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t04  reason: default package */
/* loaded from: classes.dex */
public class t04 implements java.util.Map.Entry, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final java.lang.Object L;

    public /* synthetic */ t04(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.equals(r3)
            return r2
        La:
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L11
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L12
        L11:
            r3 = 0
        L12:
            if (r3 == 0) goto L30
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r2.B
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L30
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r2 = r2.getValue()
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L30
            r2 = 1
            goto L31
        L30:
            r2 = 0
        L31:
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            return r1
        L8:
            java.lang.Object r1 = r1.B
            return r1
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.L
            return r1
        L8:
            java.lang.Object r1 = r1.L
            return r1
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r2 = super.hashCode()
            return r2
        La:
            r0 = 0
            java.lang.Object r1 = r2.B
            if (r1 == 0) goto L14
            int r1 = r1.hashCode()
            goto L15
        L14:
            r1 = r0
        L15:
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L1f
            int r0 = r2.hashCode()
        L1f:
            r2 = r1 ^ r0
            return r2
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.B
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
