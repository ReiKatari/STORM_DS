package p4;

import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements Comparable {
    public static final j B;
    public static final j L;
    public static final j R;
    public static final j X;
    public static final j Y;
    public final int A;

    static {
        j jVar = new j(100);
        j jVar2 = new j(200);
        j jVar3 = new j(300);
        j jVar4 = new j(400);
        j jVar5 = new j(500);
        j jVar6 = new j(600);
        B = jVar6;
        j jVar7 = new j(700);
        j jVar8 = new j(800);
        j jVar9 = new j(900);
        L = jVar3;
        R = jVar4;
        X = jVar5;
        Y = jVar7;
        t.y(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9);
    }

    public j(int i2) {
        this.A = i2;
        boolean z10 = false;
        if (1 <= i2 && i2 < 1001) {
            z10 = true;
        }
        if (!z10) {
            r4.a.a("Font weight can be in range [1, 1000]. Current value: " + i2);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return nc.k.b(this.A, ((j) obj).A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        if (this.A == ((j) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A;
    }

    public final String toString() {
        return w.d.p(new StringBuilder("FontWeight(weight="), this.A, ')');
    }
}
