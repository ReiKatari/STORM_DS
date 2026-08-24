package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb4  reason: default package */
/* loaded from: classes.dex */
public final class jb4 {
    public final /* synthetic */ int a;
    public final sw b;
    public final Object c;

    public jb4(fb4 fb4Var) {
        this.a = 0;
        fb4Var.getClass();
        this.c = fb4Var;
        this.b = g04.s(false);
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                return this.b.b();
            default:
                return this.b.b();
        }
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                if (!this.b.a()) {
                    return false;
                }
                ((fb4) this.c).h(null);
                return true;
            default:
                if (!this.b.a()) {
                    return false;
                }
                ra4 ra4Var = (ra4) this.c;
                synchronized (ra4Var.c) {
                    int i = ra4Var.a - 1;
                    ra4Var.a = i;
                    if (i == 0 && !ra4Var.b) {
                        ra4Var.f = hv.L((w61) ra4Var.d, null, null, new ns3(ra4Var, null, 20), 3);
                    }
                }
                return true;
        }
    }

    public jb4(ra4 ra4Var) {
        this.a = 1;
        this.c = ra4Var;
        this.b = g04.s(false);
    }
}
