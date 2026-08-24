package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r90  reason: default package */
/* loaded from: classes.dex */
public final class r90 implements nt, mk4, kl7 {
    public int A;
    public int B;
    public final Object L;

    public r90(int i, int i2, hr1 hr1Var) {
        this.A = i;
        this.B = i2;
        this.L = new eb(new ee2(i, i2, hr1Var));
    }

    @Override // defpackage.nt
    public void c(int i, Object obj) {
        int i2;
        nt ntVar = (nt) this.L;
        if (this.B == 0) {
            i2 = this.A;
        } else {
            i2 = 0;
        }
        ntVar.c(i + i2, obj);
    }

    @Override // defpackage.nt
    public void d(Object obj) {
        this.B++;
        ((nt) this.L).d(obj);
    }

    @Override // defpackage.nt
    public void e() {
        ((nt) this.L).e();
    }

    @Override // defpackage.nt
    public void f(int i, int i2, int i3) {
        int i4;
        if (this.B == 0) {
            i4 = this.A;
        } else {
            i4 = 0;
        }
        ((nt) this.L).f(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.nt
    public void g(int i, int i2) {
        int i3;
        nt ntVar = (nt) this.L;
        if (this.B == 0) {
            i3 = this.A;
        } else {
            i3 = 0;
        }
        ntVar.g(i + i3, i2);
    }

    @Override // defpackage.il7
    public ap h(long j, ap apVar, ap apVar2, ap apVar3) {
        return ((eb) this.L).h(j, apVar, apVar2, apVar3);
    }

    @Override // defpackage.mk4
    public int i(int i) {
        int i2 = ((mk4) this.L).i(i);
        if (i >= 0 && i <= this.B) {
            jk7.c(i2, this.A, i);
        }
        return i2;
    }

    @Override // defpackage.nt
    public void j() {
        if (this.B <= 0) {
            tx0.a("OffsetApplier up called with no corresponding down");
        }
        this.B--;
        ((nt) this.L).j();
    }

    @Override // defpackage.nt
    public void k(int i, Object obj) {
        int i2;
        nt ntVar = (nt) this.L;
        if (this.B == 0) {
            i2 = this.A;
        } else {
            i2 = 0;
        }
        ntVar.k(i + i2, obj);
    }

    @Override // defpackage.nt
    public Object m() {
        return ((nt) this.L).m();
    }

    @Override // defpackage.nt
    public void n(eo2 eo2Var, Object obj) {
        ((nt) this.L).n(eo2Var, obj);
    }

    @Override // defpackage.kl7
    public int o() {
        return this.B;
    }

    @Override // defpackage.kl7
    public int p() {
        return this.A;
    }

    @Override // defpackage.il7
    public ap q(long j, ap apVar, ap apVar2, ap apVar3) {
        return ((eb) this.L).q(j, apVar, apVar2, apVar3);
    }

    @Override // defpackage.mk4
    public int s(int i) {
        int s = ((mk4) this.L).s(i);
        if (i >= 0 && i <= this.A) {
            jk7.b(s, this.B, i);
        }
        return s;
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

    public r90(View view) {
        this.L = view;
    }

    public r90(mk4 mk4Var, int i, int i2) {
        this.L = mk4Var;
        this.A = i;
        this.B = i2;
    }

    public r90(nt ntVar, int i) {
        this.L = ntVar;
        this.A = i;
    }

    public r90(int i, int i2, on2 on2Var) {
        this.A = i;
        this.B = i2;
        this.L = on2Var;
    }

    public r90() {
        this.L = new r90[256];
        this.A = 0;
        this.B = 0;
    }

    public r90(int i, int i2) {
        this.L = null;
        this.A = i;
        int i3 = i2 & 7;
        this.B = i3 == 0 ? 8 : i3;
    }

    public r90(byte[] bArr, int i) {
        bArr.getClass();
        this.L = bArr;
        this.A = i;
    }
}
