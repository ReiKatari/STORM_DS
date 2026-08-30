package androidx.preference;

import android.content.DialogInterface;
import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f1570a;

    public j(k kVar) {
        this.f1570a = kVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i2, boolean z10) {
        k kVar = this.f1570a;
        HashSet hashSet = kVar.f1583s0;
        boolean z11 = kVar.f1584t0;
        if (z10) {
            kVar.f1584t0 = hashSet.add(kVar.f1586v0[i2].toString()) | z11;
        } else {
            kVar.f1584t0 = hashSet.remove(kVar.f1586v0[i2].toString()) | z11;
        }
    }
}
