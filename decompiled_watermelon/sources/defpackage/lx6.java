package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lx6  reason: default package */
/* loaded from: classes.dex */
public final class lx6 {
    public final p42 a;
    public final a86 b;
    public final jj0 c;
    public final boolean d;
    public final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [qp1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ lx6(defpackage.p42 r3, defpackage.a86 r4, defpackage.jj0 r5, defpackage.nl2 r6, java.util.LinkedHashMap r7, int r8) {
        /*
            r2 = this;
            r0 = r8 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r0 = r8 & 2
            if (r0 == 0) goto Lb
            r4 = r1
        Lb:
            r0 = r8 & 4
            if (r0 == 0) goto L10
            r5 = r1
        L10:
            r0 = r8 & 8
            if (r0 == 0) goto L15
            r6 = r1
        L15:
            r0 = r8 & 32
            if (r0 == 0) goto L1b
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            r8 = r8 & 64
            if (r8 == 0) goto L22
            qp1 r7 = defpackage.qp1.A
        L22:
            r8 = r7
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx6.<init>(p42, a86, jj0, nl2, java.util.LinkedHashMap, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx6)) {
            return false;
        }
        lx6 lx6Var = (lx6) obj;
        if (b53.x(this.a, lx6Var.a) && b53.x(this.b, lx6Var.b) && b53.x(this.c, lx6Var.c) && b53.x(null, null) && this.d == lx6Var.d && b53.x(this.e, lx6Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        p42 p42Var = this.a;
        if (p42Var == null) {
            hashCode = 0;
        } else {
            hashCode = p42Var.hashCode();
        }
        int i = hashCode * 31;
        a86 a86Var = this.b;
        if (a86Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a86Var.hashCode();
        }
        int i2 = (i + hashCode2) * 31;
        jj0 jj0Var = this.c;
        if (jj0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = jj0Var.hashCode();
        }
        return this.e.hashCode() + ej6.c((((i2 + hashCode3) * 31) + 0) * 961, this.d, 31);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=" + this.b + ", changeSize=" + this.c + ", scale=" + ((Object) null) + ", veil=null, hold=" + this.d + ", effectsMap=" + this.e + ')';
    }

    public lx6(p42 p42Var, a86 a86Var, jj0 jj0Var, nl2 nl2Var, boolean z, Map map) {
        this.a = p42Var;
        this.b = a86Var;
        this.c = jj0Var;
        this.d = z;
        this.e = map;
    }
}
