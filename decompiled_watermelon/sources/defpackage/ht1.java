package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ht1  reason: default package */
/* loaded from: classes.dex */
public final class ht1 {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public a53 e;

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

    public final void d(zj2 zj2Var) {
        boolean z;
        zj2Var.getClass();
        if (zj2Var == zj2.ENABLED_FULL) {
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
                arrayList.add(jt1.a);
            } else {
                arrayList.add(it1.a);
            }
            this.b = z;
        }
        if (z && this.a != z2) {
            arrayList.add(kt1.a);
        }
        return arrayList;
    }
}
