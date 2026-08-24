package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: px3  reason: default package */
/* loaded from: classes.dex */
public final class px3 {
    public final fi4 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ qx3 d;

    public px3(qx3 qx3Var, fi4 fi4Var) {
        this.d = qx3Var;
        this.a = fi4Var;
    }

    public final void a(boolean z) {
        int i;
        if (z != this.b) {
            this.b = z;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            qx3 qx3Var = this.d;
            int i2 = qx3Var.c;
            qx3Var.c = i + i2;
            if (!qx3Var.d) {
                qx3Var.d = true;
                while (true) {
                    try {
                        int i3 = qx3Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        i2 = i3;
                    } finally {
                        qx3Var.d = false;
                    }
                }
            }
            if (this.b) {
                qx3Var.b(this);
            }
        }
    }
}
