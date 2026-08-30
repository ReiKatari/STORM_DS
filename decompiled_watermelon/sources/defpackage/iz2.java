package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: iz2  reason: default package */
/* loaded from: classes.dex */
public final class iz2 extends hp4 {
    public final boolean l;

    public iz2(String str, jz2 jz2Var) {
        super(str, jz2Var, 1);
        this.l = true;
    }

    @Override // defpackage.hp4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof iz2) {
                h06 h06Var = (h06) obj;
                if (this.a.equals(h06Var.b())) {
                    iz2 iz2Var = (iz2) obj;
                    if (iz2Var.l && Arrays.equals((h06[]) this.j.getValue(), (h06[]) iz2Var.j.getValue())) {
                        int d = h06Var.d();
                        int i = this.c;
                        if (i == d) {
                            for (int i2 = 0; i2 < i; i2++) {
                                if (b53.x(j(i2).b(), h06Var.j(i2).b()) && b53.x(j(i2).c(), h06Var.j(i2).c())) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.h06
    public final boolean f() {
        return this.l;
    }

    @Override // defpackage.hp4
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
