package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15018a;

    /* renamed from: b  reason: collision with root package name */
    public final f f15019b;

    /* renamed from: c  reason: collision with root package name */
    public final mc.q f15020c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15021d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f15022e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ n(java.lang.Object r9, zc.f r10, mc.q r11, java.lang.Throwable r12, int r13) {
        /*
            r8 = this;
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r10
        L8:
            r10 = r13 & 4
            if (r10 == 0) goto Le
            r5 = r1
            goto Lf
        Le:
            r5 = r11
        Lf:
            r10 = r13 & 16
            if (r10 == 0) goto L15
            r7 = r1
            goto L16
        L15:
            r7 = r12
        L16:
            r6 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.n.<init>(java.lang.Object, zc.f, mc.q, java.lang.Throwable, int):void");
    }

    public static n a(n nVar, f fVar, Throwable th2, int i2) {
        Object obj = nVar.f15018a;
        if ((i2 & 2) != 0) {
            fVar = nVar.f15019b;
        }
        f fVar2 = fVar;
        mc.q qVar = nVar.f15020c;
        Object obj2 = nVar.f15021d;
        if ((i2 & 16) != 0) {
            th2 = nVar.f15022e;
        }
        return new n(obj, fVar2, qVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nc.k.a(this.f15018a, nVar.f15018a) && nc.k.a(this.f15019b, nVar.f15019b) && nc.k.a(this.f15020c, nVar.f15020c) && nc.k.a(this.f15021d, nVar.f15021d) && nc.k.a(this.f15022e, nVar.f15022e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i2 = 0;
        Object obj = this.f15018a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        f fVar = this.f15019b;
        if (fVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fVar.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        mc.q qVar = this.f15020c;
        if (qVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = qVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Object obj2 = this.f15021d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Throwable th2 = this.f15022e;
        if (th2 != null) {
            i2 = th2.hashCode();
        }
        return i13 + i2;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f15018a + ", cancelHandler=" + this.f15019b + ", onCancellation=" + this.f15020c + ", idempotentResume=" + this.f15021d + ", cancelCause=" + this.f15022e + ')';
    }

    public n(Object obj, f fVar, mc.q qVar, Object obj2, Throwable th2) {
        this.f15018a = obj;
        this.f15019b = fVar;
        this.f15020c = qVar;
        this.f15021d = obj2;
        this.f15022e = th2;
    }
}
