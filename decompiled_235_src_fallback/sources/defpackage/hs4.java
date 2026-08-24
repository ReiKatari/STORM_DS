package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs4  reason: default package */
/* loaded from: classes.dex */
public final class hs4 extends defpackage.uj2 {
    public final /* synthetic */ int h;
    public final java.lang.String i;
    public final defpackage.d90 j;
    public final boolean k;

    public hs4(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            r1.h = r3
            java.lang.String r0 = "name == null"
            switch(r3) {
                case 1: goto L25;
                case 2: goto L16;
                default: goto L7;
            }
        L7:
            d90 r3 = defpackage.d90.B
            r1.<init>()
            java.util.Objects.requireNonNull(r2, r0)
            r1.i = r2
            r1.j = r3
            r1.k = r4
            return
        L16:
            d90 r3 = defpackage.d90.B
            r1.<init>()
            java.util.Objects.requireNonNull(r2, r0)
            r1.i = r2
            r1.j = r3
            r1.k = r4
            return
        L25:
            d90 r3 = defpackage.d90.B
            r1.<init>()
            java.util.Objects.requireNonNull(r2, r0)
            r1.i = r2
            r1.j = r3
            r1.k = r4
            return
    }

    @Override // defpackage.uj2
    public final void l(defpackage.ok5 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.h
            boolean r1 = r3.k
            java.lang.String r2 = r3.i
            d90 r3 = r3.j
            switch(r0) {
                case 0: goto L2d;
                case 1: goto L1c;
                default: goto Lb;
            }
        Lb:
            if (r5 != 0) goto Le
            goto L1b
        Le:
            r3.getClass()
            java.lang.String r3 = r5.toString()
            if (r3 != 0) goto L18
            goto L1b
        L18:
            r4.d(r2, r3, r1)
        L1b:
            return
        L1c:
            if (r5 != 0) goto L1f
            goto L2c
        L1f:
            r3.getClass()
            java.lang.String r3 = r5.toString()
            if (r3 != 0) goto L29
            goto L2c
        L29:
            r4.b(r2, r3, r1)
        L2c:
            return
        L2d:
            if (r5 != 0) goto L30
            goto L3d
        L30:
            r3.getClass()
            java.lang.String r3 = r5.toString()
            if (r3 != 0) goto L3a
            goto L3d
        L3a:
            r4.a(r2, r3, r1)
        L3d:
            return
    }
}
