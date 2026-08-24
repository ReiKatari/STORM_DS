package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw4  reason: default package */
/* loaded from: classes.dex */
public final class lw4 extends a1 {
    public final jw4 L;
    public int R;
    public zb7 X;
    public int Y;

    public lw4(jw4 jw4Var, int i) {
        super(i, jw4Var.d0);
        this.L = jw4Var;
        this.R = jw4Var.f();
        this.Y = -1;
        b();
    }

    public final void a() {
        if (this.R == this.L.f()) {
            return;
        }
        i.l();
    }

    @Override // defpackage.a1, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.A;
        jw4 jw4Var = this.L;
        jw4Var.add(i, obj);
        this.A++;
        this.B = jw4Var.a();
        this.R = jw4Var.f();
        this.Y = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        jw4 jw4Var = this.L;
        Object[] objArr = jw4Var.Y;
        if (objArr == null) {
            this.X = null;
            return;
        }
        int i = (jw4Var.d0 - 1) & (-32);
        int i2 = this.A;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (jw4Var.R / 5) + 1;
        zb7 zb7Var = this.X;
        if (zb7Var == null) {
            this.X = new zb7(objArr, i2, i, i3);
            return;
        }
        zb7Var.A = i2;
        zb7Var.B = i;
        zb7Var.L = i3;
        if (zb7Var.R.length < i3) {
            zb7Var.R = new Object[i3];
        }
        ?? r0 = 0;
        zb7Var.R[0] = objArr;
        if (i2 == i) {
            r0 = 1;
        }
        zb7Var.X = r0;
        zb7Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.A;
            this.Y = i;
            zb7 zb7Var = this.X;
            jw4 jw4Var = this.L;
            if (zb7Var == null) {
                Object[] objArr = jw4Var.Z;
                this.A = i + 1;
                return objArr[i];
            } else if (zb7Var.hasNext()) {
                this.A++;
                return zb7Var.next();
            } else {
                Object[] objArr2 = jw4Var.Z;
                int i2 = this.A;
                this.A = i2 + 1;
                return objArr2[i2 - zb7Var.B];
            }
        }
        fa6.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i = this.A;
            this.Y = i - 1;
            zb7 zb7Var = this.X;
            jw4 jw4Var = this.L;
            if (zb7Var == null) {
                Object[] objArr = jw4Var.Z;
                int i2 = i - 1;
                this.A = i2;
                return objArr[i2];
            }
            int i3 = zb7Var.B;
            if (i > i3) {
                Object[] objArr2 = jw4Var.Z;
                int i4 = i - 1;
                this.A = i4;
                return objArr2[i4 - i3];
            }
            this.A = i - 1;
            return zb7Var.previous();
        }
        fa6.c();
        return null;
    }

    @Override // defpackage.a1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.Y;
        if (i != -1) {
            jw4 jw4Var = this.L;
            jw4Var.b(i);
            int i2 = this.Y;
            if (i2 < this.A) {
                this.A = i2;
            }
            this.B = jw4Var.a();
            this.R = jw4Var.f();
            this.Y = -1;
            b();
            return;
        }
        e41.m();
    }

    @Override // defpackage.a1, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.Y;
        if (i != -1) {
            jw4 jw4Var = this.L;
            jw4Var.set(i, obj);
            this.R = jw4Var.f();
            b();
            return;
        }
        e41.m();
    }
}
