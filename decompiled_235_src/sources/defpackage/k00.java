package defpackage;

import java.lang.ref.WeakReference;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k00  reason: default package */
/* loaded from: classes.dex */
public final class k00 extends qo7 {
    public final String b;
    public j97 c;

    public k00(v46 v46Var) {
        String str = (String) v46Var.a("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = UUID.randomUUID().toString();
            v46Var.c(str, "SaveableStateHolder_BackStackEntryKey");
        }
        this.b = str;
    }

    @Override // defpackage.qo7
    public final void d() {
        j97 j97Var = this.c;
        if (j97Var != null) {
            o46 o46Var = (o46) ((WeakReference) j97Var.B).get();
            if (o46Var != null) {
                o46Var.f(this.b);
            }
            j97 j97Var2 = this.c;
            if (j97Var2 != null) {
                ((WeakReference) j97Var2.B).clear();
                return;
            } else {
                nb3.a0("saveableStateHolderRef");
                throw null;
            }
        }
        nb3.a0("saveableStateHolderRef");
        throw null;
    }
}
