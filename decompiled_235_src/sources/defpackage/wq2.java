package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq2  reason: default package */
/* loaded from: classes.dex */
public final class wq2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wq2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                xq2 xq2Var = (xq2) obj;
                xq2Var.A--;
                return;
            default:
                pm6 pm6Var = (pm6) obj;
                pm6Var.k--;
                return;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((xq2) obj).A++;
                return;
            default:
                ((pm6) obj).k++;
                return;
        }
    }
}
