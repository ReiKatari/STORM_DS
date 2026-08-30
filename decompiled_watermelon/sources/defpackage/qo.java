package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qo  reason: default package */
/* loaded from: classes.dex */
public final class qo {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ qo(defpackage.po r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            r0 = r5 & 4
            if (r0 == 0) goto L6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            java.lang.String r5 = ""
            goto Lf
        Ld:
            java.lang.String r5 = "androidx.compose.foundation.text.inlineContent"
        Lf:
            r1.<init>(r3, r4, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.<init>(po, int, int, int):void");
    }

    public final so a(int i) {
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
            nz2.c("Item.end should be set first");
        }
        return new so(this.b, i, this.a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo)) {
            return false;
        }
        qo qoVar = (qo) obj;
        if (b53.x(this.a, qoVar.a) && this.b == qoVar.b && this.c == qoVar.c && b53.x(this.d, qoVar.d)) {
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
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(", tag=");
        return wh1.o(sb, this.d, ')');
    }

    public qo(int i, int i2, Object obj, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
