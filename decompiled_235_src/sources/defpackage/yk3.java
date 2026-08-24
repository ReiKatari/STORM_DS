package defpackage;

import me.magnum.melonds.ui.layouteditor.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yk3 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ b B;

    public /* synthetic */ yk3(b bVar, int i) {
        this.A = i;
        this.B = bVar;
    }

    @Override // defpackage.on2
    public final Object c() {
        yo7 yo7Var;
        j71 j71Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        b bVar = this.B;
        switch (i) {
            case 0:
                bp7 r = ln2.r(bVar);
                if (r != null) {
                    ap7 viewModelStore = r.getViewModelStore();
                    boolean z = r instanceof mw2;
                    if (z) {
                        yo7Var = ((mw2) r).getDefaultViewModelProviderFactory();
                    } else {
                        yo7Var = eg1.b;
                    }
                    if (z) {
                        j71Var = ((mw2) r).getDefaultViewModelCreationExtras();
                    } else {
                        j71Var = h71.b;
                    }
                    viewModelStore.getClass();
                    yo7Var.getClass();
                    j71Var.getClass();
                    eb ebVar = new eb(viewModelStore, yo7Var, j71Var);
                    ar0 a = gh5.a(yl3.class);
                    String b = a.b();
                    if (b != null) {
                        return (yl3) ebVar.G(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
                    }
                    i.h("Local and anonymous classes can not be ViewModels");
                    return null;
                }
                i.m("No view-model store owner found");
                return null;
            case 1:
                b.l(bVar);
                return jg7Var;
            case 2:
                b.d(bVar);
                return jg7Var;
            case 3:
                b.f(bVar);
                return jg7Var;
            case 4:
                b.c(bVar);
                return jg7Var;
            default:
                b.n(bVar);
                return jg7Var;
        }
    }
}
