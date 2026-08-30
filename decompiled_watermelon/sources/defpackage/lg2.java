package defpackage;

import androidx.fragment.app.o;
import androidx.fragment.app.u;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lg2  reason: default package */
/* loaded from: classes.dex */
public final class lg2 implements kg2 {
    public final int a;
    public final /* synthetic */ u b;

    public lg2(u uVar, int i) {
        this.b = uVar;
        this.a = i;
    }

    @Override // defpackage.kg2
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
