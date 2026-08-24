package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng3  reason: default package */
/* loaded from: classes.dex */
public final class ng3 implements defpackage.g36 {
    public final java.util.HashMap A;

    public ng3(int r2) {
            r1 = this;
            switch(r2) {
                case 1: goto L25;
                case 2: goto L1a;
                case 3: goto Le;
                default: goto L3;
            }
        L3:
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.A = r2
            return
        Le:
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r0 = 3
            r2.<init>(r0)
            r1.A = r2
            return
        L1a:
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.A = r2
            return
        L25:
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r0 = 3
            r2.<init>(r0)
            r1.A = r2
            return
    }

    public ng3(java.util.HashMap r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public float a(android.view.View r2, java.lang.String r3) {
            r1 = this;
            java.util.HashMap r1 = r1.A
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L9
            goto L28
        L9:
            java.lang.Object r1 = r1.get(r2)
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r1 == 0) goto L28
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L18
            goto L28
        L18:
            java.lang.Object r1 = r1.get(r3)
            float[] r1 = (float[]) r1
            if (r1 != 0) goto L21
            goto L28
        L21:
            int r2 = r1.length
            if (r2 <= 0) goto L28
            r2 = 0
            r1 = r1[r2]
            return r1
        L28:
            r1 = 2143289344(0x7fc00000, float:NaN)
            return r1
    }

    @Override // defpackage.g36
    public java.lang.Object apply(java.lang.Object r5) {
            r4 = this;
            android.database.Cursor r5 = (android.database.Cursor) r5
            c42 r0 = defpackage.i36.X
        L4:
            boolean r0 = r5.moveToNext()
            if (r0 == 0) goto L3c
            r0 = 0
            long r0 = r5.getLong(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.util.HashMap r3 = r4.A
            java.lang.Object r2 = r3.get(r2)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L29
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.put(r0, r2)
        L29:
            h36 r0 = new h36
            r1 = 1
            java.lang.String r1 = r5.getString(r1)
            r3 = 2
            java.lang.String r3 = r5.getString(r3)
            r0.<init>(r1, r3)
            r2.add(r0)
            goto L4
        L3c:
            r4 = 0
            return r4
    }

    public void b(java.lang.Class r1, defpackage.g14 r2) {
            r0 = this;
            java.util.HashMap r0 = r0.A
            r0.put(r1, r2)
            return
    }

    public void c(java.lang.Class r1, defpackage.i50 r2) {
            r0 = this;
            java.util.HashMap r0 = r0.A
            r0.put(r1, r2)
            return
    }
}
