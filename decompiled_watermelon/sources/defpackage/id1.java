package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: id1  reason: default package */
/* loaded from: classes.dex */
public final class id1 implements Iterator, f93 {
    public int A = -1;
    public int B;
    public int L;
    public d33 R;
    public int X;
    public final /* synthetic */ jd1 Y;

    public id1(jd1 jd1Var) {
        this.Y = jd1Var;
        int m = io2.m(0, 0, jd1Var.a.length());
        this.B = m;
        this.L = m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r7 < r4) goto L13;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [b33, d33] */
    /* JADX WARN: Type inference failed for: r0v8, types: [b33, d33] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            jd1 r0 = r8.Y
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.L
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.A = r3
            r0 = 0
            r8.R = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.X
            int r7 = r7 + r6
            r8.X = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            d33 r0 = new d33
            int r2 = r8.B
            int r1 = defpackage.zg6.v0(r1)
            r0.<init>(r2, r1, r6)
            r8.R = r0
            r8.L = r5
            goto L73
        L32:
            aj2 r0 = r0.c
            int r2 = r8.L
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.j(r1, r2)
            ti4 r0 = (defpackage.ti4) r0
            if (r0 != 0) goto L52
            d33 r0 = new d33
            int r2 = r8.B
            int r1 = defpackage.zg6.v0(r1)
            r0.<init>(r2, r1, r6)
            r8.R = r0
            r8.L = r5
            goto L73
        L52:
            java.lang.Object r1 = r0.A
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.B
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.B
            d33 r2 = defpackage.io2.t0(r2, r1)
            r8.R = r2
            int r1 = r1 + r0
            r8.B = r1
            if (r0 != 0) goto L70
            r3 = r6
        L70:
            int r1 = r1 + r3
            r8.L = r1
        L73:
            r8.A = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id1.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A == -1) {
            a();
        }
        if (this.A == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.A == -1) {
            a();
        }
        if (this.A != 0) {
            d33 d33Var = this.R;
            d33Var.getClass();
            this.R = null;
            this.A = -1;
            return d33Var;
        }
        vd6.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
