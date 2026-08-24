package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n10  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n10 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.rc4 B;

    public /* synthetic */ n10(defpackage.rc4 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            jg7 r1 = defpackage.jg7.a
            rc4 r3 = r3.B
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L1b;
                default: goto L9;
            }
        L9:
            zc4 r0 = new zc4
            android.content.Context r1 = r3.a
            zb4 r3 = r3.b
            rd4 r3 = r3.s
            r1.getClass()
            r3.getClass()
            r0.<init>()
            return r0
        L1b:
            d00 r0 = r3.f
            boolean r2 = r3.g
            if (r2 == 0) goto L29
            int r3 = r3.a()
            r2 = 1
            if (r3 <= r2) goto L29
            goto L2a
        L29:
            r2 = 0
        L2a:
            r0.f(r2)
            return r1
        L2e:
            int r0 = me.magnum.melonds.ui.backgrounds.BackgroundsActivity.B0
            r3.c()
            return r1
    }
}
