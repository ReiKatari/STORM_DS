package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca0  reason: default package */
/* loaded from: classes.dex */
public class ca0 extends ea0 {
    public final byte[] R;

    public ca0(byte[] bArr) {
        this.A = 0;
        bArr.getClass();
        this.R = bArr;
    }

    @Override // defpackage.ea0
    public byte a(int i) {
        return this.R[i];
    }

    @Override // defpackage.ea0
    public void d(byte[] bArr, int i) {
        System.arraycopy(this.R, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof ea0) && size() == ((ea0) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof ca0) {
                        ca0 ca0Var = (ca0) obj;
                        int i = this.A;
                        int i2 = ca0Var.A;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int size = size();
                            if (size <= ca0Var.size()) {
                                if (size <= ca0Var.size()) {
                                    byte[] bArr = ca0Var.R;
                                    int g = g() + size;
                                    int g2 = g();
                                    int g3 = ca0Var.g();
                                    while (g2 < g) {
                                        if (this.R[g2] != bArr[g3]) {
                                            return false;
                                        }
                                        g2++;
                                        g3++;
                                    }
                                    return true;
                                }
                                StringBuilder t = xg6.t("Ran off end of other: 0, ", size, ", ");
                                t.append(ca0Var.size());
                                throw new IllegalArgumentException(t.toString());
                            }
                            int size2 = size();
                            throw new IllegalArgumentException("Length too large: " + size + size2);
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ea0
    public byte f(int i) {
        return this.R[i];
    }

    public int g() {
        return 0;
    }

    @Override // defpackage.ea0
    public int size() {
        return this.R.length;
    }
}
