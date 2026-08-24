package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ih0  reason: default package */
/* loaded from: classes.dex */
public final class ih0 implements defpackage.jp5 {
    public final /* synthetic */ int b;
    public final defpackage.jp5 c;

    public ih0(int r2, long r3) {
            r1 = this;
            r1.b = r2
            switch(r2) {
                case 1: goto L11;
                default: goto L5;
            }
        L5:
            r1.<init>()
            ih0 r2 = new ih0
            r0 = 1
            r2.<init>(r0, r3)
            r1.c = r2
            return
        L11:
            r1.<init>()
            f67 r2 = new f67
            hh0 r0 = new hh0
            r0.<init>(r3)
            r2.<init>(r3, r0)
            r1.c = r2
            return
    }

    @Override // defpackage.jp5
    public final long a() {
            r2 = this;
            int r0 = r2.b
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            jp5 r2 = r2.c
            f67 r2 = (defpackage.f67) r2
            long r0 = r2.b
            return r0
        Lc:
            jp5 r2 = r2.c
            ih0 r2 = (defpackage.ih0) r2
            jp5 r2 = r2.c
            f67 r2 = (defpackage.f67) r2
            long r0 = r2.b
            return r0
    }

    @Override // defpackage.jp5
    public final defpackage.ip5 b(defpackage.ou r2) {
            r1 = this;
            int r0 = r1.b
            jp5 r1 = r1.c
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            f67 r1 = (defpackage.f67) r1
            ip5 r1 = r1.b(r2)
            return r1
        Le:
            ih0 r1 = (defpackage.ih0) r1
            jp5 r1 = r1.c
            f67 r1 = (defpackage.f67) r1
            ip5 r1 = r1.b(r2)
            boolean r1 = r1.b
            if (r1 != 0) goto L37
            java.lang.Object r1 = r2.c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            boolean r2 = r1 instanceof defpackage.bj0
            if (r2 == 0) goto L34
            java.lang.String r2 = "CameraX"
            java.lang.String r0 = "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries."
            defpackage.kj2.v(r2, r0)
            bj0 r1 = (defpackage.bj0) r1
            int r1 = r1.A
            if (r1 <= 0) goto L34
            ip5 r1 = defpackage.ip5.f
            goto L39
        L34:
            ip5 r1 = defpackage.ip5.d
            goto L39
        L37:
            ip5 r1 = defpackage.ip5.e
        L39:
            return r1
    }
}
