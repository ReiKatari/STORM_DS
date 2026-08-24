package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx3  reason: default package */
/* loaded from: classes.dex */
public final class cx3 implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ defpackage.dx3 A;

    public cx3(defpackage.dx3 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r1, int r2) {
            r0 = this;
            dx3 r0 = r0.A
            r0.e0 = r2
            r2 = -1
            r0.d0 = r2
            r1.dismiss()
            return
    }
}
