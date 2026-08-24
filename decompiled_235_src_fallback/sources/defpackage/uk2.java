package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uk2 implements defpackage.b31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ uk2(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.b31
    public final void accept(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.a
            java.lang.Object r4 = r4.b
            switch(r0) {
                case 0: goto L57;
                case 1: goto L4d;
                default: goto L7;
            }
        L7:
            java.util.Map r4 = (java.util.Map) r4
            cz r5 = (defpackage.cz) r5
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            int r1 = r5.b
            java.lang.Object r2 = r0.getKey()
            ry r2 = (defpackage.ry) r2
            int r2 = r2.f
            int r1 = r1 - r2
            java.lang.Object r2 = r0.getKey()
            ry r2 = (defpackage.ry) r2
            boolean r2 = r2.g
            if (r2 == 0) goto L35
            int r1 = -r1
        L35:
            int r1 = defpackage.k97.i(r1)
            java.lang.Object r0 = r0.getValue()
            qv6 r0 = (defpackage.qv6) r0
            r0.getClass()
            nv6 r2 = new nv6
            r3 = -1
            r2.<init>(r0, r1, r3)
            defpackage.nj2.D(r2)
            goto L13
        L4c:
            return
        L4d:
            jq r4 = (defpackage.jq) r4
            android.content.Intent r5 = (android.content.Intent) r5
            d51 r4 = r4.r0
            r4.l()
            return
        L57:
            jq r4 = (defpackage.jq) r4
            android.content.res.Configuration r5 = (android.content.res.Configuration) r5
            d51 r4 = r4.r0
            r4.l()
            return
    }
}
