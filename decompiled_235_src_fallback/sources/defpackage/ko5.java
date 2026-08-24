package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko5  reason: default package */
/* loaded from: classes.dex */
public final class ko5 implements java.util.Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.util.Map b;

    public /* synthetic */ ko5(int r1, java.util.Map r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.a
            java.util.Map r3 = r3.b
            switch(r0) {
                case 0: goto L34;
                default: goto L7;
            }
        L7:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r3.get(r4)
            dk4 r4 = (defpackage.dk4) r4
            if (r4 == 0) goto L1f
            java.lang.Long r4 = r4.c
            if (r4 == 0) goto L1f
            goto L20
        L1f:
            r4 = r0
        L20:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.get(r5)
            dk4 r3 = (defpackage.dk4) r3
            if (r3 == 0) goto L2f
            java.lang.Long r3 = r3.c
            if (r3 == 0) goto L2f
            r0 = r3
        L2f:
            int r3 = defpackage.g04.z(r4, r0)
            return r3
        L34:
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            c6 r4 = (defpackage.c6) r4
            long r1 = r4.a
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.Object r4 = r3.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L4c
            goto L4d
        L4c:
            r4 = r0
        L4d:
            c6 r5 = (defpackage.c6) r5
            long r1 = r5.a
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L5e
            r0 = r3
        L5e:
            int r3 = defpackage.g04.z(r4, r0)
            return r3
    }
}
