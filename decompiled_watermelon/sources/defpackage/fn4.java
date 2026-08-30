package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fn4  reason: default package */
/* loaded from: classes.dex */
public final class fn4 extends z0 {
    public final Object[] L;
    public final ey6 R;

    public fn4(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.L = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.R = new ey6(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            ey6 ey6Var = this.R;
            if (ey6Var.hasNext()) {
                this.A++;
                return ey6Var.next();
            }
            int i = this.A;
            this.A = i + 1;
            return this.L[i - ey6Var.B];
        }
        vd6.b();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A;
            ey6 ey6Var = this.R;
            int i2 = ey6Var.B;
            if (i > i2) {
                int i3 = i - 1;
                this.A = i3;
                return this.L[i3 - i2];
            }
            this.A = i - 1;
            return ey6Var.previous();
        }
        vd6.b();
        return null;
    }
}
