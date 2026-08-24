package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ka0  reason: default package */
/* loaded from: classes.dex */
public final class ka0 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public void a() {
        synchronized (((la0) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            yy7.b((ui6) this.c);
            try {
                ((bk1) this.b).a();
            } catch (IOException unused) {
            }
        }
    }

    public int b(ap3 ap3Var, te teVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        wx2 wx2Var = (wx2) this.c;
        zx2 zx2Var = (zx2) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            yc1 y = ((s63) this.d).y(ap3Var, teVar);
            hz3 hz3Var = (hz3) y.A;
            int i3 = hz3Var.i();
            for (int i4 = 0; i4 < i3; i4++) {
                vy4 vy4Var = (vy4) hz3Var.j(i4);
                if (!vy4Var.d && !vy4Var.h) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int i5 = hz3Var.i();
            for (int i6 = 0; i6 < i5; i6++) {
                vy4 vy4Var2 = (vy4) hz3Var.j(i6);
                if (z2 || ej2.n(vy4Var2)) {
                    ((sm3) this.b).A(vy4Var2.c, (zx2) this.e, vy4Var2.i, true);
                    if (!zx2Var.A.h()) {
                        wx2Var.a(vy4Var2.a, zx2Var, ej2.n(vy4Var2));
                        zx2Var.clear();
                    }
                }
            }
            boolean b = wx2Var.b(y, z);
            int i7 = hz3Var.i();
            int i8 = 0;
            while (true) {
                if (i8 < i7) {
                    vy4 vy4Var3 = (vy4) hz3Var.j(i8);
                    if (!jk4.c(ej2.R(vy4Var3, true), 0L) && vy4Var3.c()) {
                        i = 1;
                        break;
                    }
                    i8++;
                } else {
                    i = 0;
                    break;
                }
            }
            int i9 = hz3Var.i();
            int i10 = 0;
            while (true) {
                if (i10 < i9) {
                    if (((vy4) hz3Var.j(i10)).c()) {
                        i2 = 1;
                        break;
                    }
                    i10++;
                } else {
                    i2 = 0;
                    break;
                }
            }
            int i11 = b | (i << 1) | (i2 << 2);
            this.a = false;
            return i11;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }
}
