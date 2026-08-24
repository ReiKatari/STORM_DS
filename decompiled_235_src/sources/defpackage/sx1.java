package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx1  reason: default package */
/* loaded from: classes.dex */
public final class sx1 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public lb4 e;

    public final boolean a() {
        if (this.b && this.c) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.a && a()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        return this.a;
    }

    public final void d(dp2 dp2Var) {
        boolean z;
        dp2Var.getClass();
        if (dp2Var == dp2.ENABLED_FULL) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (!z) {
            this.d = false;
        }
    }

    public final void e(boolean z) {
        boolean z2;
        if (z && a()) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.d = z2;
    }

    public final ArrayList f(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (this.b != z) {
            if (z) {
                arrayList.add(ux1.a);
            } else {
                arrayList.add(tx1.a);
            }
            this.b = z;
        }
        if (z && this.a != z2) {
            arrayList.add(vx1.a);
        }
        return arrayList;
    }
}
