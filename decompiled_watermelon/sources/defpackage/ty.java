package defpackage;

import java.lang.ref.WeakReference;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ty  reason: default package */
/* loaded from: classes.dex */
public final class ty extends ra7 {
    public final String b;
    public u57 c;

    public ty(pt5 pt5Var) {
        String str = (String) pt5Var.a("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = UUID.randomUUID().toString();
            pt5Var.c(str, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = str;
    }

    @Override // defpackage.ra7
    public final void d() {
        u57 u57Var = this.c;
        if (u57Var != null) {
            jt5 jt5Var = (jt5) ((WeakReference) u57Var.B).get();
            if (jt5Var != null) {
                jt5Var.f(this.b);
            }
            u57 u57Var2 = this.c;
            if (u57Var2 != null) {
                ((WeakReference) u57Var2.B).clear();
                return;
            } else {
                b53.g0("saveableStateHolderRef");
                throw null;
            }
        }
        b53.g0("saveableStateHolderRef");
        throw null;
    }
}
