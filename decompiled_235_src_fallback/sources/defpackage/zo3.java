package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo3  reason: default package */
/* loaded from: classes.dex */
public final class zo3 {
    public final /* synthetic */ int a;
    public final defpackage.ss4 b;
    public final defpackage.ss4 c;
    public boolean d;
    public java.lang.Object e;
    public final defpackage.hq3 f;

    public zo3(int r2, int r3, int r4) {
            r1 = this;
            r1.a = r4
            switch(r4) {
                case 1: goto L22;
                default: goto L5;
            }
        L5:
            r1.<init>()
            ss4 r4 = new ss4
            r4.<init>(r2)
            r1.b = r4
            ss4 r4 = new ss4
            r4.<init>(r3)
            r1.c = r4
            hq3 r3 = new hq3
            r4 = 90
            r0 = 200(0xc8, float:2.8E-43)
            r3.<init>(r2, r4, r0)
            r1.f = r3
            return
        L22:
            r1.<init>()
            ss4 r4 = new ss4
            r4.<init>(r2)
            r1.b = r4
            ss4 r4 = new ss4
            r4.<init>(r3)
            r1.c = r4
            hq3 r3 = new hq3
            r4 = 30
            r0 = 100
            r3.<init>(r2, r4, r0)
            r1.f = r3
            return
    }

    public final void a(int r5, int r6) {
            r4 = this;
            int r0 = r4.a
            ss4 r1 = r4.c
            hq3 r2 = r4.f
            ss4 r4 = r4.b
            r3 = 0
            switch(r0) {
                case 0: goto L32;
                default: goto Lc;
            }
        Lc:
            float r0 = (float) r5
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L12
            goto L28
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Index should be non-negative ("
            r0.<init>(r3)
            r0.append(r5)
            r3 = 41
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            defpackage.s53.a(r0)
        L28:
            r4.i(r5)
            r2.a(r5)
            r1.i(r6)
            return
        L32:
            float r0 = (float) r5
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L38
            goto L3d
        L38:
            java.lang.String r0 = "Index should be non-negative"
            defpackage.s53.a(r0)
        L3d:
            r4.i(r5)
            r2.a(r5)
            r1.i(r6)
            return
    }
}
