package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: so  reason: default package */
/* loaded from: classes.dex */
public final class so {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public so(int i, int i2, Object obj, String str) {
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
            nz2.a("Reversed range is not supported");
        }
    }

    public static so a(so soVar, po poVar, int i, int i2) {
        Object obj = poVar;
        if ((i2 & 1) != 0) {
            obj = soVar.a;
        }
        int i3 = soVar.b;
        if ((i2 & 4) != 0) {
            i = soVar.c;
        }
        String str = soVar.d;
        soVar.getClass();
        return new so(i3, i, obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so)) {
            return false;
        }
        so soVar = (so) obj;
        if (b53.x(this.a, soVar.a) && this.b == soVar.b && this.c == soVar.c && b53.x(this.d, soVar.d)) {
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
        return this.d.hashCode() + wh1.a(this.c, wh1.a(this.b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return wh1.o(sb, this.d, ')');
    }

    public so(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
