package defpackage;

import androidx.appcompat.widget.Toolbar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b87  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b87 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Toolbar B;

    public /* synthetic */ b87(Toolbar toolbar, int i) {
        this.A = i;
        this.B = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o44 o44Var;
        int i = this.A;
        Toolbar toolbar = this.B;
        switch (i) {
            case 0:
                d87 d87Var = toolbar.L0;
                if (d87Var == null) {
                    o44Var = null;
                } else {
                    o44Var = d87Var.B;
                }
                if (o44Var != null) {
                    o44Var.collapseActionView();
                    return;
                }
                return;
            default:
                toolbar.o();
                return;
        }
    }
}
