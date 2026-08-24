package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu0  reason: default package */
/* loaded from: classes.dex */
public final class zu0 implements defpackage.r41 {
    public static final defpackage.zu0 B = null;
    public static final defpackage.zu0 L = null;
    public final /* synthetic */ int A;

    static {
            zu0 r0 = new zu0
            r1 = 0
            r0.<init>(r1)
            defpackage.zu0.B = r0
            zu0 r0 = new zu0
            r1 = 1
            r0.<init>(r1)
            defpackage.zu0.L = r0
            return
    }

    public /* synthetic */ zu0(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    private final void a(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r1 = this;
            int r1 = r1.A
            switch(r1) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            vt1 r1 = defpackage.vt1.A
            return r1
        L8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "This continuation is already complete"
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This continuation is already complete"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "This continuation is already complete"
            return r1
    }
}
