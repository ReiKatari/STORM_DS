package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xv6  reason: default package */
/* loaded from: classes.dex */
public final class xv6 extends gk2 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public xv6(ib7 ib7Var) {
        this.a = 1;
        this.d = ib7Var;
        this.b = false;
        this.c = 0;
    }

    @Override // defpackage.jb7
    public final void a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((yv6) obj).a.setVisibility(this.c);
                    return;
                }
                return;
            default:
                int i2 = this.c + 1;
                this.c = i2;
                ib7 ib7Var = (ib7) obj;
                if (i2 == ib7Var.a.size()) {
                    jb7 jb7Var = ib7Var.d;
                    if (jb7Var != null) {
                        jb7Var.a();
                    }
                    this.c = 0;
                    this.b = false;
                    ib7Var.e = false;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.gk2, defpackage.jb7
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.gk2, defpackage.jb7
    public final void c() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((yv6) obj).a.setVisibility(0);
                return;
            default:
                if (!this.b) {
                    this.b = true;
                    jb7 jb7Var = ((ib7) obj).d;
                    if (jb7Var != null) {
                        jb7Var.c();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public xv6(yv6 yv6Var, int i) {
        this.a = 0;
        this.d = yv6Var;
        this.c = i;
        this.b = false;
    }
}
