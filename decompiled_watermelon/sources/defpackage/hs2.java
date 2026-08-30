package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hs2  reason: default package */
/* loaded from: classes.dex */
public final class hs2 implements kf3 {
    public final up6 a;
    public final int b;
    public final uw6 c;
    public final ki2 d;

    public hs2(up6 up6Var, int i, uw6 uw6Var, ki2 ki2Var) {
        this.a = up6Var;
        this.b = i;
        this.c = uw6Var;
        this.d = ki2Var;
    }

    @Override // defpackage.kf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        long j2;
        if (mv3Var.e0(lz0.g(j)) < lz0.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = lz0.a(j2, 0, Preference.DEFAULT_ORDER, 0, 0, 13);
        }
        yn4 c = mv3Var.c(j);
        int min = Math.min(c.A, lz0.h(j2));
        return vv3Var.s0(min, c.B, qp1.A, new ce1(this, vv3Var, c, min, 1));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hs2) {
                hs2 hs2Var = (hs2) obj;
                if (this.a == hs2Var.a && this.b == hs2Var.b && this.c.equals(hs2Var.c) && b53.x(this.d, hs2Var.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = wh1.a(this.b, this.a.hashCode() * 31, 31);
        return this.d.hashCode() + ((this.c.hashCode() + a) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
