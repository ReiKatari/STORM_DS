package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zn0  reason: default package */
/* loaded from: classes.dex */
public final class zn0 {
    public final yn0 a;
    public final float b;
    public final String c;

    public zn0(yn0 yn0Var, float f, String str) {
        yn0Var.getClass();
        this.a = yn0Var;
        this.b = f;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0)) {
            return false;
        }
        zn0 zn0Var = (zn0) obj;
        if (this.a == zn0Var.a && Float.compare(this.b, zn0Var.b) == 0 && nb3.k(this.c, zn0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = xg6.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheatImportProgress(status=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", ongoingItemName=");
        return i61.n(sb, this.c, ")");
    }
}
