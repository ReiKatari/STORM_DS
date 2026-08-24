package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep  reason: default package */
/* loaded from: classes.dex */
public final class ep {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ep(Object obj, int i, int i2, String str) {
        boolean z;
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            q53.a("Reversed range is not supported");
        }
    }

    public static ep a(ep epVar, bp bpVar, int i, int i2) {
        Object obj = bpVar;
        if ((i2 & 1) != 0) {
            obj = epVar.a;
        }
        int i3 = epVar.b;
        if ((i2 & 4) != 0) {
            i = epVar.c;
        }
        String str = epVar.d;
        epVar.getClass();
        return new ep(obj, i3, i, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        if (nb3.k(this.a, epVar.a) && this.b == epVar.b && this.c == epVar.c && nb3.k(this.d, epVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.d.hashCode() + lb1.a(this.c, lb1.a(this.b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return lb1.q(sb, this.d, ')');
    }

    public ep(Object obj, int i, int i2) {
        this(obj, i, i2, "");
    }
}
