package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k47  reason: default package */
/* loaded from: classes.dex */
public final class k47 {
    public static final long b = jx2.f(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ k47(long j) {
        this.a = j;
    }

    public static boolean a(long j, Object obj) {
        if (!(obj instanceof k47) || j != ((k47) obj).a) {
            return false;
        }
        return true;
    }

    public static final boolean b(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final boolean c(long j) {
        if (((int) (j >> 32)) == ((int) (j & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static final int d(long j) {
        return e(j) - f(j);
    }

    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        if (((int) (j >> 32)) > ((int) (j & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static String h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return xg6.q(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return h(this.a);
    }
}
