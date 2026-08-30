package q4;

import l4.i0;
import l4.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d  reason: collision with root package name */
    public static final p1.a0 f12275d = new p1.a0(28, new mg.m(11, (byte) 0), new od.x(8));

    /* renamed from: a  reason: collision with root package name */
    public final l4.h f12276a;

    /* renamed from: b  reason: collision with root package name */
    public final long f12277b;

    /* renamed from: c  reason: collision with root package name */
    public final q0 f12278c;

    public x(l4.h hVar, long j2, q0 q0Var) {
        q0 q0Var2;
        this.f12276a = hVar;
        this.f12277b = i0.c(hVar.B.length(), j2);
        if (q0Var != null) {
            q0Var2 = new q0(i0.c(hVar.B.length(), q0Var.f8885a));
        } else {
            q0Var2 = null;
        }
        this.f12278c = q0Var2;
    }

    public static x a(x xVar, l4.h hVar, long j2, int i2) {
        q0 q0Var;
        if ((i2 & 1) != 0) {
            hVar = xVar.f12276a;
        }
        if ((i2 & 2) != 0) {
            j2 = xVar.f12277b;
        }
        if ((i2 & 4) != 0) {
            q0Var = xVar.f12278c;
        } else {
            q0Var = null;
        }
        xVar.getClass();
        return new x(hVar, j2, q0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (q0.b(this.f12277b, xVar.f12277b) && nc.k.a(this.f12278c, xVar.f12278c) && nc.k.a(this.f12276a, xVar.f12276a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i10 = q0.f8884c;
        int f8 = w.d.f(this.f12277b, this.f12276a.hashCode() * 31, 31);
        q0 q0Var = this.f12278c;
        if (q0Var != null) {
            i2 = Long.hashCode(q0Var.f8885a);
        } else {
            i2 = 0;
        }
        return f8 + i2;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f12276a) + "', selection=" + ((Object) q0.h(this.f12277b)) + ", composition=" + this.f12278c + ')';
    }

    public x(String str, int i2, long j2) {
        this(new l4.h((i2 & 1) != 0 ? "" : str), (i2 & 2) != 0 ? q0.f8883b : j2, (q0) null);
    }
}
