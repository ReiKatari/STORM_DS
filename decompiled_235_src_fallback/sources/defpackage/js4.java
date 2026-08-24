package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: js4  reason: default package */
/* loaded from: classes.dex */
public final class js4 extends defpackage.uj2 {
    public final /* synthetic */ int h;
    public final java.lang.reflect.Method i;
    public final int j;

    public /* synthetic */ js4(java.lang.reflect.Method r1, int r2, int r3) {
            r0 = this;
            r0.h = r3
            r0.i = r1
            r0.j = r2
            r0.<init>()
            return
    }

    @Override // defpackage.uj2
    public final void l(defpackage.ok5 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.h
            r1 = 0
            int r2 = r3.j
            java.lang.reflect.Method r3 = r3.i
            switch(r0) {
                case 0: goto L1c;
                default: goto La;
            }
        La:
            if (r5 == 0) goto L13
            java.lang.String r3 = r5.toString()
            r4.c = r3
            return
        L13:
            java.lang.String r4 = "@Url parameter is null."
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r3 = defpackage.ak7.v0(r3, r2, r4, r5)
            throw r3
        L1c:
            yw2 r5 = (defpackage.yw2) r5
            if (r5 == 0) goto L3a
            ww2 r3 = r4.f
            r3.getClass()
            int r4 = r5.size()
        L29:
            if (r1 >= r4) goto L39
            java.lang.String r0 = r5.b(r1)
            java.lang.String r2 = r5.d(r1)
            defpackage.ft7.a(r3, r0, r2)
            int r1 = r1 + 1
            goto L29
        L39:
            return
        L3a:
            java.lang.String r4 = "Headers parameter must not be null."
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.IllegalArgumentException r3 = defpackage.ak7.v0(r3, r2, r4, r5)
            throw r3
    }
}
