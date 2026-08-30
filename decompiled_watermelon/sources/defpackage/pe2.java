package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pe2  reason: default package */
/* loaded from: classes.dex */
public final class pe2 implements Comparable {
    public static final pe2 B;
    public static final pe2 L;
    public static final pe2 R;
    public static final pe2 X;
    public static final pe2 Y;
    public static final pe2 Z;
    public static final pe2 c0;
    public static final pe2 d0;
    public static final pe2 e0;
    public final int A;

    static {
        pe2 pe2Var = new pe2(100);
        pe2 pe2Var2 = new pe2(200);
        pe2 pe2Var3 = new pe2(300);
        pe2 pe2Var4 = new pe2(400);
        B = pe2Var4;
        pe2 pe2Var5 = new pe2(500);
        L = pe2Var5;
        pe2 pe2Var6 = new pe2(600);
        R = pe2Var6;
        pe2 pe2Var7 = new pe2(700);
        pe2 pe2Var8 = new pe2(800);
        pe2 pe2Var9 = new pe2(900);
        X = pe2Var3;
        Y = pe2Var4;
        Z = pe2Var5;
        c0 = pe2Var6;
        d0 = pe2Var7;
        e0 = pe2Var8;
        l07.c0(pe2Var, pe2Var2, pe2Var3, pe2Var4, pe2Var5, pe2Var6, pe2Var7, pe2Var8, pe2Var9);
    }

    public pe2(int i) {
        this.A = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (!z) {
            nz2.a("Font weight can be in range [1, 1000]. Current value: " + i);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(pe2 pe2Var) {
        return b53.E(this.A, pe2Var.A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe2)) {
            return false;
        }
        if (this.A == ((pe2) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A;
    }

    public final String toString() {
        return ej6.g(new StringBuilder("FontWeight(weight="), this.A, ')');
    }
}
