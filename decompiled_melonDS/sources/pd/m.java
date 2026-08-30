package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends a0.l {
    public final boolean L;

    public m(n nVar, boolean z10) {
        super(nVar);
        this.L = z10;
    }

    @Override // a0.l
    public final void n(byte b10) {
        if (this.L) {
            s(String.valueOf(b10 & 255));
            return;
        }
        String valueOf = String.valueOf(b10 & 255);
        valueOf.getClass();
        ((n) this.B).d(valueOf);
    }

    @Override // a0.l
    public final void p(int i2) {
        if (this.L) {
            s(Long.toString(i2 & 4294967295L, 10));
            return;
        }
        String l10 = Long.toString(i2 & 4294967295L, 10);
        l10.getClass();
        ((n) this.B).d(l10);
    }

    @Override // a0.l
    public final void q(long j2) {
        int i2 = 63;
        String str = "0";
        if (this.L) {
            int i10 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i10 != 0) {
                if (i10 > 0) {
                    str = Long.toString(j2, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j2 >>> 1) / 5;
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j2 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i2--;
                        cArr[i2] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i2, 64 - i2);
                }
            }
            s(str);
            return;
        }
        int i11 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i11 != 0) {
            if (i11 > 0) {
                str = Long.toString(j2, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j2 >>> 1) / 5;
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j2 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i2--;
                    cArr2[i2] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i2, 64 - i2);
            }
        }
        str.getClass();
        ((n) this.B).d(str);
    }

    @Override // a0.l
    public final void r(short s10) {
        if (this.L) {
            s(String.valueOf(s10 & 65535));
            return;
        }
        String valueOf = String.valueOf(s10 & 65535);
        valueOf.getClass();
        ((n) this.B).d(valueOf);
    }
}
