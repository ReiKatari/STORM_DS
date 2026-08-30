package nc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o extends c implements tc.c {
    public final boolean Z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.Z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.o.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o) {
                o oVar = (o) obj;
                if (e().equals(oVar.e()) && this.R.equals(oVar.R) && this.X.equals(oVar.X) && k.a(this.B, oVar.B)) {
                    return true;
                }
                return false;
            } else if (obj instanceof tc.c) {
                return obj.equals(f());
            } else {
                return false;
            }
        }
        return true;
    }

    public final tc.a f() {
        if (this.Z) {
            return this;
        }
        tc.a aVar = this.A;
        if (aVar == null) {
            tc.a a10 = a();
            this.A = a10;
            return a10;
        }
        return aVar;
    }

    public final int hashCode() {
        return this.X.hashCode() + w.d.d(e().hashCode() * 31, 31, this.R);
    }

    public final String toString() {
        tc.a f8 = f();
        if (f8 != this) {
            return f8.toString();
        }
        return w.d.s(new StringBuilder("property "), this.R, " (Kotlin reflection is not available)");
    }
}
