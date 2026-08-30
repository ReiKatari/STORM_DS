package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oq3  reason: default package */
/* loaded from: classes.dex */
public final class oq3 {
    public final l94 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ pq3 d;

    public oq3(pq3 pq3Var, l94 l94Var) {
        this.d = pq3Var;
        this.a = l94Var;
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
            pq3 pq3Var = this.d;
            int i2 = pq3Var.c;
            pq3Var.c = i + i2;
            if (!pq3Var.d) {
                pq3Var.d = true;
                while (true) {
                    try {
                        int i3 = pq3Var.c;
                        if (i2 == i3) {
                            break;
                        }
                        i2 = i3;
                    } finally {
                        pq3Var.d = false;
                    }
                }
            }
            if (this.b) {
                pq3Var.b(this);
            }
        }
    }
}
