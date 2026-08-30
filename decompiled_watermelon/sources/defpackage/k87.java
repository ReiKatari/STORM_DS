package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k87  reason: default package */
/* loaded from: classes.dex */
public final class k87 implements kf3 {
    public final up6 a;
    public final int b;
    public final uw6 c;
    public final ki2 d;

    public k87(up6 up6Var, int i, uw6 uw6Var, ki2 ki2Var) {
        this.a = up6Var;
        this.b = i;
        this.c = uw6Var;
        this.d = ki2Var;
    }

    @Override // defpackage.kf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(lz0.a(j, 0, 0, 0, Preference.DEFAULT_ORDER, 7));
        int min = Math.min(c.B, lz0.g(j));
        return vv3Var.s0(c.A, min, qp1.A, new lq1(this, c, min));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k87) {
                k87 k87Var = (k87) obj;
                if (this.a == k87Var.a && this.b == k87Var.b && this.c.equals(k87Var.c) && b53.x(this.d, k87Var.d)) {
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
