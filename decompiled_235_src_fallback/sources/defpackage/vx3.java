package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vx3  reason: default package */
/* loaded from: classes.dex */
public final class vx3 extends android.app.Dialog {
    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            r2 = 2131623992(0x7f0e0038, float:1.8875151E38)
            r1.setContentView(r2)
            r2 = 0
            r1.setCancelable(r2)
            r1.setCanceledOnTouchOutside(r2)
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L1e
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setBackgroundDrawable(r0)
        L1e:
            return
    }
}
