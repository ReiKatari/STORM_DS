package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final s f10962a;

    /* renamed from: b  reason: collision with root package name */
    public final x f10963b;

    /* renamed from: c  reason: collision with root package name */
    public final x f10964c;

    public y(s sVar, x xVar, x xVar2) {
        sVar.getClass();
        xVar.getClass();
        this.f10962a = sVar;
        this.f10963b = xVar;
        this.f10964c = xVar2;
    }

    public final boolean a() {
        x xVar = this.f10963b;
        w wVar = w.f10961a;
        if (nc.k.a(xVar, wVar) && nc.k.a(this.f10964c, wVar)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f10962a == yVar.f10962a && nc.k.a(this.f10963b, yVar.f10963b) && nc.k.a(this.f10964c, yVar.f10964c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10963b.hashCode();
        return this.f10964c.hashCode() + ((hashCode + (this.f10962a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "InputConfig(input=" + this.f10962a + ", assignment=" + this.f10963b + ", altAssignment=" + this.f10964c + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ y(oe.s r2, oe.x r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            oe.w r0 = oe.w.f10961a
            if (r4 == 0) goto L7
            r3 = r0
        L7:
            r1.<init>(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.y.<init>(oe.s, oe.x, int):void");
    }
}
