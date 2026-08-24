package defpackage;

import android.database.Cursor;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu6  reason: default package */
/* loaded from: classes.dex */
public final class uu6 extends wu6 {
    public int[] R;
    public long[] X;
    public double[] Y;
    public String[] Z;
    public byte[][] d0;
    public Cursor e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu6(vm2 vm2Var, String str) {
        super(vm2Var, str);
        vm2Var.getClass();
        str.getClass();
        this.R = new int[0];
        this.X = new long[0];
        this.Y = new double[0];
        this.Z = new String[0];
        this.d0 = new byte[0];
    }

    public static void n(Cursor cursor, int i) {
        if (i >= 0 && i < cursor.getColumnCount()) {
            return;
        }
        ii2.T(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.j36
    public final String R(int i) {
        e();
        Cursor r = r();
        n(r, i);
        String string = r.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.j36
    public final void c(int i, long j) {
        e();
        h(1, i);
        this.R[i] = 1;
        this.X[i] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.L) {
            g();
            reset();
        }
        this.L = true;
    }

    @Override // defpackage.j36
    public final void d(byte[] bArr, int i) {
        e();
        h(4, i);
        this.R[i] = 4;
        this.d0[i] = bArr;
    }

    @Override // defpackage.j36
    public final void f(int i) {
        e();
        h(5, i);
        this.R[i] = 5;
    }

    @Override // defpackage.j36
    public final boolean f0() {
        e();
        k();
        Cursor cursor = this.e0;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        i.m("Required value was null.");
        return false;
    }

    @Override // defpackage.wu6, defpackage.j36
    public final void g() {
        e();
        this.R = new int[0];
        this.X = new long[0];
        this.Y = new double[0];
        this.Z = new String[0];
        this.d0 = new byte[0];
    }

    @Override // defpackage.j36
    public final byte[] getBlob(int i) {
        e();
        Cursor r = r();
        n(r, i);
        byte[] blob = r.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.j36
    public final int getColumnCount() {
        e();
        k();
        Cursor cursor = this.e0;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.j36
    public final String getColumnName(int i) {
        e();
        k();
        Cursor cursor = this.e0;
        if (cursor != null) {
            n(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }
        i.m("Required value was null.");
        return null;
    }

    @Override // defpackage.j36
    public final long getLong(int i) {
        e();
        Cursor r = r();
        n(r, i);
        return r.getLong(i);
    }

    public final void h(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.R;
        if (iArr.length < i3) {
            this.R = Arrays.copyOf(iArr, i3);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte[][] bArr = this.d0;
                        if (bArr.length < i3) {
                            this.d0 = (byte[][]) Arrays.copyOf(bArr, i3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] strArr = this.Z;
                if (strArr.length < i3) {
                    this.Z = (String[]) Arrays.copyOf(strArr, i3);
                    return;
                }
                return;
            }
            double[] dArr = this.Y;
            if (dArr.length < i3) {
                this.Y = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        long[] jArr = this.X;
        if (jArr.length < i3) {
            this.X = Arrays.copyOf(jArr, i3);
        }
    }

    @Override // defpackage.j36
    public final boolean isNull(int i) {
        e();
        Cursor r = r();
        n(r, i);
        return r.isNull(i);
    }

    public final void k() {
        if (this.e0 == null) {
            this.e0 = this.A.x(new s35(this));
        }
    }

    public final Cursor r() {
        Cursor cursor = this.e0;
        if (cursor != null) {
            return cursor;
        }
        ii2.T(21, "no row");
        throw null;
    }

    @Override // defpackage.wu6, defpackage.j36
    public final void reset() {
        e();
        Cursor cursor = this.e0;
        if (cursor != null) {
            cursor.close();
        }
        this.e0 = null;
    }

    @Override // defpackage.j36
    public final void w(int i, String str) {
        str.getClass();
        e();
        h(3, i);
        this.R[i] = 3;
        this.Z[i] = str;
    }
}
