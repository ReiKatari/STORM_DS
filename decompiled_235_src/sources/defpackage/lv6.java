package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lv6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ pv6 B;

    public /* synthetic */ lv6(pv6 pv6Var, int i) {
        this.A = i;
        this.B = pv6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        pv6 pv6Var = this.B;
        switch (i) {
            case 0:
                pv6Var.a();
                return;
            case 1:
                pv6Var.b();
                return;
            default:
                wv6 wv6Var = pv6Var.q;
                if (wv6Var != null) {
                    wv6Var.k();
                }
                if (pv6Var.p == null) {
                    pv6Var.o.b();
                }
                pv6Var.p = null;
                return;
        }
    }
}
