package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w90  reason: default package */
/* loaded from: classes.dex */
public abstract class w90 {
    public final pu a;
    public int b;

    public w90(int i) {
        switch (i) {
            case 1:
                this.a = new pu();
                return;
            default:
                this.a = new pu();
                return;
        }
    }

    public void a(byte[] bArr) {
        bArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (bArr.length + i < xu.a) {
                this.b = i + (bArr.length / 2);
                this.a.addLast(bArr);
            }
        }
    }

    public void b(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < xu.a) {
                this.b = i + cArr.length;
                this.a.addLast(cArr);
            }
        }
    }

    public byte[] c(int i) {
        byte[] bArr;
        Object removeLast;
        synchronized (this) {
            pu puVar = this.a;
            bArr = null;
            if (puVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = puVar.removeLast();
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
            pu puVar = this.a;
            cArr = null;
            if (puVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = puVar.removeLast();
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
