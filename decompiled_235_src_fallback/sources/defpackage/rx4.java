package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx4  reason: default package */
/* loaded from: classes.dex */
public final class rx4 implements defpackage.px4 {
    public static final defpackage.rx4 b = null;
    public static final defpackage.rx4 c = null;
    public final /* synthetic */ int a;

    static {
            rx4 r0 = new rx4
            r1 = 0
            r0.<init>(r1)
            defpackage.rx4.b = r0
            rx4 r0 = new rx4
            r1 = 1
            r0.<init>(r1)
            defpackage.rx4.c = r0
            return
    }

    public /* synthetic */ rx4(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.px4
    public final boolean a() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // defpackage.px4
    public final defpackage.ox4 b(android.view.View r1, defpackage.qh1 r2) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            sx4 r0 = new sx4
            android.widget.Magnifier r2 = new android.widget.Magnifier
            r2.<init>(r1)
            r0.<init>(r2)
            return r0
        L10:
            qx4 r0 = new qx4
            android.widget.Magnifier r2 = new android.widget.Magnifier
            r2.<init>(r1)
            r0.<init>(r2)
            return r0
    }
}
