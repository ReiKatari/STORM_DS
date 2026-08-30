package defpackage;

import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fe3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fe3 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ b B;

    public /* synthetic */ fe3(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override // defpackage.ki2
    public final Object c() {
        xa7 xa7Var;
        z31 z31Var;
        int i = this.A;
        o27 o27Var = o27.a;
        b bVar = this.B;
        switch (i) {
            case 0:
                ab7 L = nl2.L(bVar);
                if (L != null) {
                    za7 viewModelStore = L.getViewModelStore();
                    boolean z = L instanceof lq2;
                    if (z) {
                        xa7Var = ((lq2) L).getDefaultViewModelProviderFactory();
                    } else {
                        xa7Var = dc1.b;
                    }
                    if (z) {
                        z31Var = ((lq2) L).getDefaultViewModelCreationExtras();
                    } else {
                        z31Var = x31.b;
                    }
                    viewModelStore.getClass();
                    xa7Var.getClass();
                    z31Var.getClass();
                    q9 q9Var = new q9(viewModelStore, xa7Var, z31Var);
                    qo0 a = q75.a(bf3.class);
                    String b = a.b();
                    if (b != null) {
                        return (bf3) q9Var.F(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                    }
                    i.i("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                i.n("No view-model store owner found");
                return null;
            case 1:
                b.l(bVar);
                return o27Var;
            case 2:
                b.e(bVar);
                return o27Var;
            case 3:
                b.g(bVar);
                return o27Var;
            case 4:
                b.c(bVar);
                return o27Var;
            default:
                b.n(bVar);
                return o27Var;
        }
    }
}
