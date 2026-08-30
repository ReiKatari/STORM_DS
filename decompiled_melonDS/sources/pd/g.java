package pd;

import a6.i2;
import a6.p1;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {
    public Object A;
    public int B;

    public g(int i2, boolean z10) {
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.A = new zb.j();
                return;
            default:
                this.A = new zb.j();
                return;
        }
    }

    public abstract i2 c(i2 i2Var, List list);

    public abstract a0.g d(p1 p1Var, a0.g gVar);

    public void e(byte[] bArr) {
        bArr.getClass();
        synchronized (this) {
            int i2 = this.B;
            if (bArr.length + i2 < d.f11569a) {
                this.B = i2 + (bArr.length / 2);
                ((zb.j) this.A).addLast(bArr);
            }
        }
    }

    public void f(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i2 = this.B;
            if (cArr.length + i2 < d.f11569a) {
                this.B = i2 + cArr.length;
                ((zb.j) this.A).addLast(cArr);
            }
        }
    }

    public byte[] g(int i2) {
        byte[] bArr;
        Object removeLast;
        synchronized (this) {
            zb.j jVar = (zb.j) this.A;
            bArr = null;
            if (jVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = jVar.removeLast();
            }
            byte[] bArr2 = (byte[]) removeLast;
            if (bArr2 != null) {
                this.B -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        if (bArr == null) {
            return new byte[i2];
        }
        return bArr;
    }

    public char[] h(int i2) {
        char[] cArr;
        Object removeLast;
        synchronized (this) {
            zb.j jVar = (zb.j) this.A;
            cArr = null;
            if (jVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = jVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                this.B -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            return new char[i2];
        }
        return cArr;
    }

    public g(int i2) {
        this.B = i2;
    }

    public void a(p1 p1Var) {
    }

    public void b(p1 p1Var) {
    }
}
