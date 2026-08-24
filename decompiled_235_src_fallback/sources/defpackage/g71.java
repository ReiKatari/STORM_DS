package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g71  reason: default package */
/* loaded from: classes.dex */
public final class g71 implements defpackage.f92 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public /* synthetic */ g71(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.n55
    public final java.lang.Object get() {
            r6 = this;
            int r0 = r6.a
            java.lang.Object r6 = r6.b
            switch(r0) {
                case 0: goto L35;
                case 1: goto L34;
                case 2: goto L1a;
                default: goto L7;
            }
        L7:
            n55 r6 = (defpackage.n55) r6
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            java.util.List r0 = defpackage.l66.L
            l66 r0 = new l66
            r1 = 4
            java.lang.String r2 = "com.google.android.datatransport.events"
            r0.<init>(r6, r1, r2)
            return r0
        L1a:
            vo7 r0 = new vo7
            r0.<init>()
            th7 r1 = new th7
            r1.<init>()
            g71 r6 = (defpackage.g71) r6
            java.lang.Object r6 = r6.get()
            i36 r2 = new i36
            l66 r6 = (defpackage.l66) r6
            iy r3 = defpackage.iy.f
            r2.<init>(r0, r1, r3, r6)
            return r2
        L34:
            return r6
        L35:
            g71 r6 = (defpackage.g71) r6
            java.lang.Object r6 = r6.b
            r2 = r6
            android.content.Context r2 = (android.content.Context) r2
            vo7 r3 = new vo7
            r3.<init>()
            th7 r4 = new th7
            r4.<init>()
            bt r0 = new bt
            r1 = 12
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }
}
