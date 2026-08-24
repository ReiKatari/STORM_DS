package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z46  reason: default package */
/* loaded from: classes.dex */
public final class z46 implements c56 {
    public final d56 a;
    public boolean b;
    public Bundle c;
    public final ex6 d;

    public z46(d56 d56Var, bp7 bp7Var) {
        d56Var.getClass();
        this.a = d56Var;
        this.d = new ex6(new t46(bp7Var, 1));
    }

    @Override // defpackage.c56
    public final Bundle a() {
        Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            l.putAll(bundle);
        }
        for (Map.Entry entry : ((a56) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((gv0) ((v46) entry.getValue()).b.e).a();
            if (!a.isEmpty()) {
                str.getClass();
                l.putBundle(str, a);
            }
        }
        this.b = false;
        return l;
    }

    public final void b() {
        if (!this.b) {
            Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
            Bundle bundle = this.c;
            if (bundle != null) {
                l.putAll(bundle);
            }
            if (a != null) {
                l.putAll(a);
            }
            this.c = l;
            this.b = true;
            a56 a56Var = (a56) this.d.getValue();
        }
    }
}
