package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq  reason: default package */
/* loaded from: classes.dex */
public final class hq implements c56 {
    public final /* synthetic */ int a;
    public final Object b;

    public hq(d56 d56Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        d56Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.c56
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((jq) obj).v().getClass();
                return bundle;
            default:
                Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                bl2.N(l, "classes_to_restore", gt0.k1((LinkedHashSet) obj));
                return l;
        }
    }

    public hq(jq jqVar) {
        this.a = 0;
        this.b = jqVar;
    }
}
