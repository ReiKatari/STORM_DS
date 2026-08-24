package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k87  reason: default package */
/* loaded from: classes.dex */
public final class k87 extends uj2 {
    public final /* synthetic */ int h;
    public boolean i;
    public int j;
    public final /* synthetic */ Object k;

    public k87(jp7 jp7Var) {
        this.h = 1;
        this.k = jp7Var;
        this.i = false;
        this.j = 0;
    }

    @Override // defpackage.uj2, defpackage.kp7
    public void a() {
        switch (this.h) {
            case 0:
                this.i = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.uj2, defpackage.kp7
    public final void b() {
        int i = this.h;
        Object obj = this.k;
        switch (i) {
            case 0:
                ((l87) obj).a.setVisibility(0);
                return;
            default:
                if (!this.i) {
                    this.i = true;
                    kp7 kp7Var = ((jp7) obj).d;
                    if (kp7Var != null) {
                        kp7Var.b();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.kp7
    public final void c() {
        int i = this.h;
        Object obj = this.k;
        switch (i) {
            case 0:
                if (!this.i) {
                    ((l87) obj).a.setVisibility(this.j);
                    return;
                }
                return;
            default:
                int i2 = this.j + 1;
                this.j = i2;
                jp7 jp7Var = (jp7) obj;
                if (i2 == jp7Var.a.size()) {
                    kp7 kp7Var = jp7Var.d;
                    if (kp7Var != null) {
                        kp7Var.c();
                    }
                    this.j = 0;
                    this.i = false;
                    jp7Var.e = false;
                    return;
                }
                return;
        }
    }

    public k87(l87 l87Var, int i) {
        this.h = 0;
        this.k = l87Var;
        this.j = i;
        this.i = false;
    }
}
