package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v70  reason: default package */
/* loaded from: classes.dex */
public class v70 extends x70 {
    public final byte[] R;

    public v70(byte[] bArr) {
        this.A = 0;
        bArr.getClass();
        this.R = bArr;
    }

    @Override // defpackage.x70
    public byte b(int i) {
        return this.R[i];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof x70) && size() == ((x70) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof v70) {
                        v70 v70Var = (v70) obj;
                        int i = this.A;
                        int i2 = v70Var.A;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int size = size();
                            if (size <= v70Var.size()) {
                                if (size <= v70Var.size()) {
                                    byte[] bArr = v70Var.R;
                                    int k = k() + size;
                                    int k2 = k();
                                    int k3 = v70Var.k();
                                    while (k2 < k) {
                                        if (this.R[k2] != bArr[k3]) {
                                            return false;
                                        }
                                        k2++;
                                        k3++;
                                    }
                                    return true;
                                }
                                StringBuilder s = wh1.s("Ran off end of other: 0, ", size, ", ");
                                s.append(v70Var.size());
                                throw new IllegalArgumentException(s.toString());
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

    @Override // defpackage.x70
    public void i(int i, byte[] bArr) {
        System.arraycopy(this.R, 0, bArr, 0, i);
    }

    @Override // defpackage.x70
    public byte j(int i) {
        return this.R[i];
    }

    public int k() {
        return 0;
    }

    @Override // defpackage.x70
    public int size() {
        return this.R.length;
    }
}
