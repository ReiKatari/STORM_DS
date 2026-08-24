package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi1  reason: default package */
/* loaded from: classes.dex */
public final class xi1 implements android.content.DialogInterface.OnCancelListener {
    public final /* synthetic */ androidx.fragment.app.i A;

    public xi1(androidx.fragment.app.i r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            androidx.fragment.app.i r0 = r0.A
            android.app.Dialog r1 = androidx.fragment.app.i.access$000(r0)
            if (r1 == 0) goto Lf
            android.app.Dialog r1 = androidx.fragment.app.i.access$000(r0)
            r0.onCancel(r1)
        Lf:
            return
    }
}
