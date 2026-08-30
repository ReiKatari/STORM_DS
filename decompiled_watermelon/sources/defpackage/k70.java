package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k70  reason: default package */
/* loaded from: classes.dex */
public final class k70 implements xs, pb4, l77 {
    public int A;
    public int B;
    public final Object L;

    public k70(int i, int i2, bn1 bn1Var) {
        this.A = i;
        this.B = i2;
        this.L = new q9(new m92(i, i2, bn1Var));
    }

    @Override // defpackage.xs
    public void c(int i, Object obj) {
        int i2;
        xs xsVar = (xs) this.L;
        if (this.B == 0) {
            i2 = this.A;
        } else {
            i2 = 0;
        }
        xsVar.c(i + i2, obj);
    }

    @Override // defpackage.xs
    public void d(Object obj) {
        this.B++;
        ((xs) this.L).d(obj);
    }

    @Override // defpackage.xs
    public void e() {
        ((xs) this.L).e();
    }

    @Override // defpackage.xs
    public void f(int i, Object obj) {
        int i2;
        xs xsVar = (xs) this.L;
        if (this.B == 0) {
            i2 = this.A;
        } else {
            i2 = 0;
        }
        xsVar.f(i + i2, obj);
    }

    @Override // defpackage.xs
    public void h(int i, int i2, int i3) {
        int i4;
        if (this.B == 0) {
            i4 = this.A;
        } else {
            i4 = 0;
        }
        ((xs) this.L).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.xs
    public Object i() {
        return ((xs) this.L).i();
    }

    @Override // defpackage.xs
    public void j(int i, int i2) {
        int i3;
        xs xsVar = (xs) this.L;
        if (this.B == 0) {
            i3 = this.A;
        } else {
            i3 = 0;
        }
        xsVar.j(i + i3, i2);
    }

    @Override // defpackage.l77
    public int k() {
        return this.B;
    }

    @Override // defpackage.j77
    public oo l(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        return ((q9) this.L).l(j, ooVar, ooVar2, ooVar3);
    }

    @Override // defpackage.xs
    public void m(aj2 aj2Var, Object obj) {
        ((xs) this.L).m(aj2Var, obj);
    }

    @Override // defpackage.pb4
    public int n(int i) {
        int n = ((pb4) this.L).n(i);
        if (i >= 0 && i <= this.B) {
            m67.c(n, this.A, i);
        }
        return n;
    }

    @Override // defpackage.l77
    public int o() {
        return this.A;
    }

    @Override // defpackage.j77
    public oo p(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        return ((q9) this.L).p(j, ooVar, ooVar2, ooVar3);
    }

    @Override // defpackage.pb4
    public int r(int i) {
        int r = ((pb4) this.L).r(i);
        if (i >= 0 && i <= this.A) {
            m67.b(r, this.B, i);
        }
        return r;
    }

    @Override // defpackage.xs
    public void s() {
        if (this.B <= 0) {
            xu0.a("OffsetApplier up called with no corresponding down");
        }
        this.B--;
        ((xs) this.L).s();
    }

    public void t(int i) {
        int i2 = this.A;
        if (i <= i2 - this.B) {
            return;
        }
        int i3 = i2 - this.B;
        throw new IllegalArgumentException("Unexpected EOF, available " + i3 + " bytes, requested: " + i);
    }

    public int u() {
        int i = this.B;
        if (i < this.A) {
            this.B = i + 1;
            return ((byte[]) this.L)[i] & 255;
        }
        return -1;
    }

    public long v(boolean z) {
        byte[] bArr;
        int u;
        int i = this.B;
        int i2 = this.A;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            throw new IllegalArgumentException("Unexpected EOF");
        }
        int i3 = i + 1;
        long j = ((byte[]) this.L)[i];
        long j2 = 0;
        if (j >= 0) {
            this.B = i3;
            return j;
        }
        if (i2 - i > 1) {
            int i4 = i + 2;
            long j3 = (bArr[i3] << 7) ^ j;
            if (j3 < 0) {
                this.B = i4;
                return (-128) ^ j3;
            }
        }
        for (int i5 = 0; i5 < 64; i5 += 7) {
            j2 |= (u & 127) << i5;
            if ((u() & 128) == 0) {
                return j2;
            }
        }
        throw new IllegalArgumentException("Input stream is malformed: Varint too long (exceeded 64 bits)");
    }

    public k70(View view) {
        this.L = view;
    }

    public k70(pb4 pb4Var, int i, int i2) {
        this.L = pb4Var;
        this.A = i;
        this.B = i2;
    }

    public k70(xs xsVar, int i) {
        this.L = xsVar;
        this.A = i;
    }

    public k70(int i, int i2, ki2 ki2Var) {
        this.A = i;
        this.B = i2;
        this.L = ki2Var;
    }

    public k70() {
        this.L = new k70[256];
        this.A = 0;
        this.B = 0;
    }

    public k70(int i, int i2) {
        this.L = null;
        this.A = i;
        int i3 = i2 & 7;
        this.B = i3 == 0 ? 8 : i3;
    }

    public k70(int i, byte[] bArr) {
        bArr.getClass();
        this.L = bArr;
        this.A = i;
    }
}
