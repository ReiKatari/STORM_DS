package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: up3  reason: default package */
/* loaded from: classes.dex */
public final class up3 implements defpackage.qn2 {
    public static final defpackage.up3 B = null;
    public static final defpackage.up3 L = null;
    public static final defpackage.up3 R = null;
    public static final defpackage.up3 X = null;
    public static final defpackage.up3 Y = null;
    public static final defpackage.up3 Z = null;
    public static final defpackage.up3 d0 = null;
    public final /* synthetic */ int A;

    static {
            up3 r0 = new up3
            r1 = 0
            r0.<init>(r1)
            defpackage.up3.B = r0
            up3 r0 = new up3
            r1 = 1
            r0.<init>(r1)
            defpackage.up3.L = r0
            up3 r0 = new up3
            r1 = 2
            r0.<init>(r1)
            defpackage.up3.R = r0
            up3 r0 = new up3
            r1 = 3
            r0.<init>(r1)
            defpackage.up3.X = r0
            up3 r0 = new up3
            r1 = 4
            r0.<init>(r1)
            defpackage.up3.Y = r0
            up3 r0 = new up3
            r1 = 5
            r0.<init>(r1)
            defpackage.up3.Z = r0
            up3 r0 = new up3
            r1 = 6
            r0.<init>(r1)
            defpackage.up3.d0 = r0
            return
    }

    public /* synthetic */ up3(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r3) {
            r2 = this;
            int r2 = r2.A
            r0 = 0
            java.lang.String r1 = "Unknown reason"
            switch(r2) {
                case 0: goto L87;
                case 1: goto L81;
                case 2: goto L75;
                case 3: goto L69;
                case 4: goto L43;
                case 5: goto L20;
                default: goto L8;
            }
        L8:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L1d
            boolean r2 = r3 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L1d
            boolean r2 = defpackage.kj2.G()
            if (r2 == 0) goto L1d
            java.lang.String r2 = "Surface setup error!"
            java.lang.String r0 = "CXCP"
            android.util.Log.e(r0, r2, r3)
        L1d:
            jg7 r2 = defpackage.jg7.a
            return r2
        L20:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = defpackage.nb3.k(r3, r2)
            if (r2 == 0) goto L30
            long r2 = defpackage.kt0.h
            kt0 r0 = new kt0
            r0.<init>(r2)
            goto L42
        L30:
            r3.getClass()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = r3.intValue()
            long r2 = defpackage.hv.b(r2)
            kt0 r0 = new kt0
            r0.<init>(r2)
        L42:
            return r0
        L43:
            wg3 r3 = (defpackage.wg3) r3
            android.view.KeyEvent r2 = r3.a
            r2.getClass()
            int r3 = defpackage.xk2.u(r2)
            r0 = 2
            if (r3 != r0) goto L63
            int r2 = r2.getKeyCode()
            long r2 = defpackage.qo2.e(r2)
            long r0 = defpackage.kg3.e
            boolean r2 = defpackage.kg3.a(r2, r0)
            if (r2 == 0) goto L63
            r2 = 1
            goto L64
        L63:
            r2 = 0
        L64:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L69:
            java.lang.String r3 = (java.lang.String) r3
            kh7 r2 = new kh7
            if (r3 != 0) goto L70
            goto L71
        L70:
            r1 = r3
        L71:
            r2.<init>(r1)
            throw r2
        L75:
            java.lang.String r3 = (java.lang.String) r3
            kh7 r2 = new kh7
            if (r3 != 0) goto L7c
            goto L7d
        L7c:
            r1 = r3
        L7d:
            r2.<init>(r1)
            throw r2
        L81:
            java.lang.Number r3 = (java.lang.Number) r3
            r3.intValue()
            return r0
        L87:
            java.lang.Number r3 = (java.lang.Number) r3
            r3.intValue()
            return r0
    }
}
