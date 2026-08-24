package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi1  reason: default package */
/* loaded from: classes.dex */
public final class mi1 implements defpackage.fl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.oi1 b;

    public /* synthetic */ mi1(defpackage.oi1 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.fl1
    public final void dispose() {
            r5 = this;
            int r0 = r5.a
            r1 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r2 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r3 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r4 = 0
            oi1 r5 = r5.b
            switch(r0) {
                case 0: goto L23;
                default: goto L11;
            }
        L11:
            r5.e()
            r5.setTag(r3, r4)
            r5.setTag(r2, r4)
            r5.setTag(r1, r4)
            android.view.WindowManager r0 = r5.j0
            r0.removeView(r5)
            return
        L23:
            r5.e()
            r5.setTag(r3, r4)
            r5.setTag(r2, r4)
            r5.setTag(r1, r4)
            android.view.WindowManager r0 = r5.j0
            r0.removeView(r5)
            return
    }
}
