package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx0  reason: default package */
/* loaded from: classes.dex */
public final class sx0 extends g60 {
    public final boolean L;

    public sx0(ja3 ja3Var, boolean z) {
        super(ja3Var);
        this.L = z;
    }

    @Override // defpackage.g60
    public final void g(byte b) {
        if (this.L) {
            l(String.valueOf(b & 255));
            return;
        }
        String valueOf = String.valueOf(b & 255);
        valueOf.getClass();
        ((ja3) this.B).f(valueOf);
    }

    @Override // defpackage.g60
    public final void i(int i) {
        if (this.L) {
            l(Long.toString(i & 4294967295L, 10));
            return;
        }
        String l = Long.toString(i & 4294967295L, 10);
        l.getClass();
        ((ja3) this.B).f(l);
    }

    @Override // defpackage.g60
    public final void j(long j) {
        int i = 63;
        String str = "0";
        if (this.L) {
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i2 != 0) {
                if (i2 > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            l(str);
            return;
        }
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 != 0) {
            if (i3 > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        str.getClass();
        ((ja3) this.B).f(str);
    }

    @Override // defpackage.g60
    public final void k(short s) {
        if (this.L) {
            l(String.valueOf(s & 65535));
            return;
        }
        String valueOf = String.valueOf(s & 65535);
        valueOf.getClass();
        ((ja3) this.B).f(valueOf);
    }
}
