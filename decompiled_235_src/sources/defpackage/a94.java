package defpackage;

import android.content.DialogInterface;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a94  reason: default package */
/* loaded from: classes.dex */
public final class a94 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ b94 a;

    public a94(b94 b94Var) {
        this.a = b94Var;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        b94 b94Var = this.a;
        HashSet hashSet = b94Var.e0;
        boolean z2 = b94Var.f0;
        if (z) {
            b94Var.f0 = hashSet.add(b94Var.h0[i].toString()) | z2;
        } else {
            b94Var.f0 = hashSet.remove(b94Var.h0[i].toString()) | z2;
        }
    }
}
