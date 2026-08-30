package defpackage;

import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gn4  reason: default package */
/* loaded from: classes.dex */
public final class gn4 extends z0 {
    public final en4 L;
    public int R;
    public ey6 X;
    public int Y;

    public gn4(en4 en4Var, int i) {
        super(i, en4Var.c0);
        this.L = en4Var;
        this.R = en4Var.j();
        this.Y = -1;
        b();
    }

    public final void a() {
        if (this.R == this.L.j()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // defpackage.z0, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.A;
        en4 en4Var = this.L;
        en4Var.add(i, obj);
        this.A++;
        this.B = en4Var.b();
        this.R = en4Var.j();
        this.Y = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        en4 en4Var = this.L;
        Object[] objArr = en4Var.Y;
        if (objArr == null) {
            this.X = null;
            return;
        }
        int i = (en4Var.c0 - 1) & (-32);
        int i2 = this.A;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (en4Var.R / 5) + 1;
        ey6 ey6Var = this.X;
        if (ey6Var == null) {
            this.X = new ey6(objArr, i2, i, i3);
            return;
        }
        ey6Var.A = i2;
        ey6Var.B = i;
        ey6Var.L = i3;
        if (ey6Var.R.length < i3) {
            ey6Var.R = new Object[i3];
        }
        ?? r0 = 0;
        ey6Var.R[0] = objArr;
        if (i2 == i) {
            r0 = 1;
        }
        ey6Var.X = r0;
        ey6Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.A;
            this.Y = i;
            ey6 ey6Var = this.X;
            en4 en4Var = this.L;
            if (ey6Var == null) {
                Object[] objArr = en4Var.Z;
                this.A = i + 1;
                return objArr[i];
            } else if (ey6Var.hasNext()) {
                this.A++;
                return ey6Var.next();
            } else {
                Object[] objArr2 = en4Var.Z;
                int i2 = this.A;
                this.A = i2 + 1;
                return objArr2[i2 - ey6Var.B];
            }
        }
        vd6.b();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i = this.A;
            this.Y = i - 1;
            ey6 ey6Var = this.X;
            en4 en4Var = this.L;
            if (ey6Var == null) {
                Object[] objArr = en4Var.Z;
                int i2 = i - 1;
                this.A = i2;
                return objArr[i2];
            }
            int i3 = ey6Var.B;
            if (i > i3) {
                Object[] objArr2 = en4Var.Z;
                int i4 = i - 1;
                this.A = i4;
                return objArr2[i4 - i3];
            }
            this.A = i - 1;
            return ey6Var.previous();
        }
        vd6.b();
        return null;
    }

    @Override // defpackage.z0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.Y;
        if (i != -1) {
            en4 en4Var = this.L;
            en4Var.c(i);
            int i2 = this.Y;
            if (i2 < this.A) {
                this.A = i2;
            }
            this.B = en4Var.b();
            this.R = en4Var.j();
            this.Y = -1;
            b();
            return;
        }
        f81.o();
    }

    @Override // defpackage.z0, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.Y;
        if (i != -1) {
            en4 en4Var = this.L;
            en4Var.set(i, obj);
            this.R = en4Var.j();
            b();
            return;
        }
        f81.o();
    }
}
