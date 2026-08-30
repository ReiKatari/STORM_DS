package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ls0  reason: default package */
/* loaded from: classes.dex */
public final class ls0 {
    public final Object a;
    public final ch0 b;
    public final bj2 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ls0(java.lang.Object r3, defpackage.ch0 r4, defpackage.bj2 r5, java.lang.Throwable r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = r1
            goto L12
        L11:
            r7 = r6
        L12:
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls0.<init>(java.lang.Object, ch0, bj2, java.lang.Throwable, int):void");
    }

    public static ls0 a(ls0 ls0Var, ch0 ch0Var, Throwable th, int i) {
        Object obj = ls0Var.a;
        if ((i & 2) != 0) {
            ch0Var = ls0Var.b;
        }
        ch0 ch0Var2 = ch0Var;
        bj2 bj2Var = ls0Var.c;
        Object obj2 = ls0Var.d;
        if ((i & 16) != 0) {
            th = ls0Var.e;
        }
        return new ls0(obj, ch0Var2, bj2Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls0)) {
            return false;
        }
        ls0 ls0Var = (ls0) obj;
        if (b53.x(this.a, ls0Var.a) && b53.x(this.b, ls0Var.b) && b53.x(this.c, ls0Var.c) && b53.x(this.d, ls0Var.d) && b53.x(this.e, ls0Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        ch0 ch0Var = this.b;
        if (ch0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = ch0Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        bj2 bj2Var = this.c;
        if (bj2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bj2Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public ls0(Object obj, ch0 ch0Var, bj2 bj2Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = ch0Var;
        this.c = bj2Var;
        this.d = obj2;
        this.e = th;
    }
}
