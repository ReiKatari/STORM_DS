package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p70  reason: default package */
/* loaded from: classes.dex */
public abstract class p70 {
    public final xt a;
    public int b;

    public p70(int i) {
        switch (i) {
            case 1:
                this.a = new xt();
                return;
            default:
                this.a = new xt();
                return;
        }
    }

    public void a(byte[] bArr) {
        bArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (bArr.length + i < fu.a) {
                this.b = i + (bArr.length / 2);
                this.a.addLast(bArr);
            }
        }
    }

    public void b(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < fu.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public byte[] c(int i) {
        byte[] bArr;
        Object removeLast;
        synchronized (this) {
            xt xtVar = this.a;
            bArr = null;
            if (xtVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = xtVar.removeLast();
            }
            byte[] bArr2 = (byte[]) removeLast;
            if (bArr2 != null) {
                this.b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        if (bArr == null) {
            return new byte[i];
        }
        return bArr;
    }

    public char[] d(int i) {
        char[] cArr;
        Object removeLast;
        synchronized (this) {
            xt xtVar = this.a;
            cArr = null;
            if (xtVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = xtVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            return new char[i];
        }
        return cArr;
    }
}
