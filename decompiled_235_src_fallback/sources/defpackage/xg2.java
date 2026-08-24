package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xg2  reason: default package */
/* loaded from: classes.dex */
public final class xg2 {
    public final defpackage.eh2 a;
    public final defpackage.te b;
    public final defpackage.ka4 c;
    public final defpackage.ka4 d;
    public boolean e;

    public xg2(defpackage.eh2 r1, defpackage.te r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            ka4 r1 = defpackage.c66.a
            ka4 r1 = new ka4
            r1.<init>()
            r0.c = r1
            ka4 r1 = new ka4
            r1.<init>()
            r0.d = r1
            return
    }

    public final void a() {
            r10 = this;
            boolean r0 = r10.e
            if (r0 != 0) goto L25
            i4 r1 = new i4
            r8 = 0
            r9 = 4
            r2 = 0
            java.lang.Class<xg2> r4 = defpackage.xg2.class
            java.lang.String r5 = "invalidateNodes"
            java.lang.String r6 = "invalidateNodes()V"
            r7 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            te r10 = r3.b
            ca4 r10 = r10.u1
            int r0 = r10.g(r1)
            if (r0 < 0) goto L1f
            goto L22
        L1f:
            r10.a(r1)
        L22:
            r10 = 1
            r3.e = r10
        L25:
            return
    }
}
