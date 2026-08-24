package defpackage;

import android.content.DialogInterface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cx3  reason: default package */
/* loaded from: classes.dex */
public final class cx3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ dx3 A;

    public cx3(dx3 dx3Var) {
        this.A = dx3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dx3 dx3Var = this.A;
        dx3Var.e0 = i;
        dx3Var.d0 = -1;
        dialogInterface.dismiss();
    }
}
