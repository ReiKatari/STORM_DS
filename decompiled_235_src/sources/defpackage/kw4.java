package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kw4  reason: default package */
/* loaded from: classes.dex */
public final class kw4 extends a1 {
    public final Object[] L;
    public final zb7 R;

    public kw4(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.L = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.R = new zb7(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            zb7 zb7Var = this.R;
            if (zb7Var.hasNext()) {
                this.A++;
                return zb7Var.next();
            }
            int i = this.A;
            this.A = i + 1;
            return this.L[i - zb7Var.B];
        }
        fa6.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A;
            zb7 zb7Var = this.R;
            int i2 = zb7Var.B;
            if (i > i2) {
                int i3 = i - 1;
                this.A = i3;
                return this.L[i3 - i2];
            }
            this.A = i - 1;
            return zb7Var.previous();
        }
        fa6.c();
        return null;
    }
}
