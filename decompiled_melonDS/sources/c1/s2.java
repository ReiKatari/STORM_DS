package c1;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: a  reason: collision with root package name */
    public final e1 f2521a;

    /* renamed from: b  reason: collision with root package name */
    public final p2 f2522b;

    /* renamed from: c  reason: collision with root package name */
    public final k0 f2523c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2524d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f2525e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [zb.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ s2(c1.e1 r10, c1.p2 r11, c1.k0 r12, c1.e0 r13, java.util.LinkedHashMap r14, int r15) {
        /*
            r9 = this;
            r0 = r15 & 1
            r1 = 0
            if (r0 == 0) goto L7
            r3 = r1
            goto L8
        L7:
            r3 = r10
        L8:
            r10 = r15 & 2
            if (r10 == 0) goto Le
            r4 = r1
            goto Lf
        Le:
            r4 = r11
        Lf:
            r10 = r15 & 4
            if (r10 == 0) goto L15
            r5 = r1
            goto L16
        L15:
            r5 = r12
        L16:
            r10 = r15 & 8
            if (r10 == 0) goto L1c
            r6 = r1
            goto L1d
        L1c:
            r6 = r13
        L1d:
            r10 = r15 & 32
            if (r10 == 0) goto L24
            r10 = 0
        L22:
            r7 = r10
            goto L26
        L24:
            r10 = 1
            goto L22
        L26:
            r10 = r15 & 64
            if (r10 == 0) goto L2c
            zb.r r14 = zb.r.A
        L2c:
            r2 = r9
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.s2.<init>(c1.e1, c1.p2, c1.k0, c1.e0, java.util.LinkedHashMap, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        if (nc.k.a(this.f2521a, s2Var.f2521a) && nc.k.a(this.f2522b, s2Var.f2522b) && nc.k.a(this.f2523c, s2Var.f2523c) && nc.k.a(null, null) && this.f2524d == s2Var.f2524d && nc.k.a(this.f2525e, s2Var.f2525e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        e1 e1Var = this.f2521a;
        if (e1Var == null) {
            hashCode = 0;
        } else {
            hashCode = e1Var.hashCode();
        }
        int i2 = hashCode * 31;
        p2 p2Var = this.f2522b;
        if (p2Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = p2Var.hashCode();
        }
        int i10 = (i2 + hashCode2) * 31;
        k0 k0Var = this.f2523c;
        if (k0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = k0Var.hashCode();
        }
        return this.f2525e.hashCode() + w.d.e((((i10 + hashCode3) * 31) + 0) * 961, this.f2524d, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f2521a + ", slide=" + this.f2522b + ", changeSize=" + this.f2523c + ", scale=" + ((Object) null) + ", veil=null, hold=" + this.f2524d + ", effectsMap=" + this.f2525e + ')';
    }

    public s2(e1 e1Var, p2 p2Var, k0 k0Var, e0 e0Var, boolean z10, Map map) {
        this.f2521a = e1Var;
        this.f2522b = p2Var;
        this.f2523c = k0Var;
        this.f2524d = z10;
        this.f2525e = map;
    }
}
