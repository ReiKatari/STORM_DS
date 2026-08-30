package defpackage;

import android.database.Cursor;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aj6  reason: default package */
/* loaded from: classes.dex */
public final class aj6 extends cj6 {
    public int[] R;
    public long[] X;
    public double[] Y;
    public String[] Z;
    public byte[][] c0;
    public Cursor d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj6(vh2 vh2Var, String str) {
        super(vh2Var, str);
        vh2Var.getClass();
        str.getClass();
        this.R = new int[0];
        this.X = new long[0];
        this.Y = new double[0];
        this.Z = new String[0];
        this.c0 = new byte[0];
    }

    public static void w(Cursor cursor, int i) {
        if (i >= 0 && i < cursor.getColumnCount()) {
            return;
        }
        yf2.T(25, "column index out of range");
        throw null;
    }

    @Override // defpackage.ns5
    public final void M(int i, String str) {
        str.getClass();
        d();
        i(3, i);
        this.R[i] = 3;
        this.Z[i] = str;
    }

    @Override // defpackage.ns5
    public final boolean a0() {
        d();
        p();
        Cursor cursor = this.d0;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        i.n("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.L) {
            h();
            reset();
        }
        this.L = true;
    }

    @Override // defpackage.ns5
    public final void e(int i) {
        d();
        i(5, i);
        this.R[i] = 5;
    }

    @Override // defpackage.ns5
    public final void g(int i, long j) {
        d();
        i(1, i);
        this.R[i] = 1;
        this.X[i] = j;
    }

    @Override // defpackage.ns5
    public final byte[] getBlob(int i) {
        d();
        Cursor x = x();
        w(x, i);
        byte[] blob = x.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.ns5
    public final int getColumnCount() {
        d();
        p();
        Cursor cursor = this.d0;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.ns5
    public final String getColumnName(int i) {
        d();
        p();
        Cursor cursor = this.d0;
        if (cursor != null) {
            w(cursor, i);
            String columnName = cursor.getColumnName(i);
            columnName.getClass();
            return columnName;
        }
        i.n("Required value was null.");
        return null;
    }

    @Override // defpackage.ns5
    public final long getLong(int i) {
        d();
        Cursor x = x();
        w(x, i);
        return x.getLong(i);
    }

    @Override // defpackage.cj6, defpackage.ns5
    public final void h() {
        d();
        this.R = new int[0];
        this.X = new long[0];
        this.Y = new double[0];
        this.Z = new String[0];
        this.c0 = new byte[0];
    }

    public final void i(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.R;
        if (iArr.length < i3) {
            this.R = Arrays.copyOf(iArr, i3);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        byte[][] bArr = this.c0;
                        if (bArr.length < i3) {
                            this.c0 = (byte[][]) Arrays.copyOf(bArr, i3);
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

    @Override // defpackage.ns5
    public final boolean isNull(int i) {
        d();
        Cursor x = x();
        w(x, i);
        return x.isNull(i);
    }

    @Override // defpackage.ns5
    public final void j(int i, byte[] bArr) {
        d();
        i(4, i);
        this.R[i] = 4;
        this.c0[i] = bArr;
    }

    public final void p() {
        if (this.d0 == null) {
            this.d0 = this.A.D(new dz4(this));
        }
    }

    @Override // defpackage.ns5
    public final String q(int i) {
        d();
        Cursor x = x();
        w(x, i);
        String string = x.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.cj6, defpackage.ns5
    public final void reset() {
        d();
        Cursor cursor = this.d0;
        if (cursor != null) {
            cursor.close();
        }
        this.d0 = null;
    }

    public final Cursor x() {
        Cursor cursor = this.d0;
        if (cursor != null) {
            return cursor;
        }
        yf2.T(21, "no row");
        throw null;
    }
}
