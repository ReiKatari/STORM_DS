package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c11  reason: default package */
/* loaded from: classes.dex */
public final class c11 {
    public final xa6 a = new xa6();

    public static void b(c11 c11Var, aj2 aj2Var, et0 et0Var, ki2 ki2Var, int i) {
        if ((i & 8) != 0) {
            et0Var = null;
        }
        c11Var.a.add(new et0(-1789283891, true, new g61(aj2Var, c11Var, et0Var, ki2Var)));
    }

    public final void a(a11 a11Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-798501095);
        if (sk2Var.f(a11Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.f(this)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i5 & 1, z)) {
            xa6 xa6Var = this.a;
            int size = xa6Var.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((bj2) xa6Var.get(i6)).i(a11Var, sk2Var, Integer.valueOf(i5 & 14));
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, 7, this, a11Var);
        }
    }
}
