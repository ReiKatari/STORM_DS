package androidx.preference;

import android.content.DialogInterface;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ h A;

    public g(h hVar) {
        this.A = hVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        h hVar = this.A;
        hVar.f1561s0 = i2;
        hVar.f1594r0 = -1;
        dialogInterface.dismiss();
    }
}
