package defpackage;

import android.content.DialogInterface;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u04  reason: default package */
/* loaded from: classes.dex */
public final class u04 implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ v04 a;

    public u04(v04 v04Var) {
        this.a = v04Var;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        v04 v04Var = this.a;
        HashSet hashSet = v04Var.t0;
        boolean z2 = v04Var.u0;
        if (z) {
            v04Var.u0 = hashSet.add(v04Var.w0[i].toString()) | z2;
        } else {
            v04Var.u0 = hashSet.remove(v04Var.w0[i].toString()) | z2;
        }
    }
}
