package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l04  reason: default package */
/* loaded from: classes.dex */
public final class l04 implements defpackage.h54 {
    public defpackage.h54[] a;

    @Override // defpackage.h54
    public final defpackage.wd5 a(java.lang.Class r5) {
            r4 = this;
            h54[] r4 = r4.a
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L16
            r2 = r4[r1]
            boolean r3 = r2.b(r5)
            if (r3 == 0) goto L13
            wd5 r4 = r2.a(r5)
            return r4
        L13:
            int r1 = r1 + 1
            goto L4
        L16:
            java.lang.String r4 = r5.getName()
            java.lang.String r5 = "No factory is available for message type: "
            java.lang.String r4 = r5.concat(r4)
            defpackage.fa6.h(r4)
            r4 = 0
            return r4
    }

    @Override // defpackage.h54
    public final boolean b(java.lang.Class r5) {
            r4 = this;
            h54[] r4 = r4.a
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L5:
            if (r2 >= r0) goto L14
            r3 = r4[r2]
            boolean r3 = r3.b(r5)
            if (r3 == 0) goto L11
            r4 = 1
            return r4
        L11:
            int r2 = r2 + 1
            goto L5
        L14:
            return r1
    }
}
