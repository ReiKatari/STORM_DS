package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp  reason: default package */
/* loaded from: classes.dex */
public final class cp {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ cp(bp bpVar, int i, int i2, int i3) {
        this(bpVar, i, i2, r5);
        String str;
        i2 = (i3 & 4) != 0 ? Integer.MIN_VALUE : i2;
        if ((i3 & 8) != 0) {
            str = "";
        } else {
            str = "androidx.compose.foundation.text.inlineContent";
        }
    }

    public final ep a(int i) {
        boolean z;
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i != Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            q53.c("Item.end should be set first");
        }
        return new ep(this.a, this.b, i, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp)) {
            return false;
        }
        cp cpVar = (cp) obj;
        if (nb3.k(this.a, cpVar.a) && this.b == cpVar.b && this.c == cpVar.c && nb3.k(this.d, cpVar.d)) {
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
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return lb1.q(sb, this.d, ')');
    }

    public cp(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
