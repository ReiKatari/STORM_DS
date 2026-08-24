package defpackage;

import androidx.fragment.app.o;
import androidx.fragment.app.u;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl2  reason: default package */
/* loaded from: classes.dex */
public final class kl2 implements jl2 {
    public final int a;
    public final /* synthetic */ u b;

    public kl2(u uVar, int i) {
        this.b = uVar;
        this.a = i;
    }

    @Override // defpackage.jl2
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        u uVar = this.b;
        o oVar = uVar.z;
        int i = this.a;
        if (oVar != null && i < 0 && oVar.getChildFragmentManager().R(-1, 0)) {
            return false;
        }
        return uVar.S(i, 1, arrayList, arrayList2);
    }
}
