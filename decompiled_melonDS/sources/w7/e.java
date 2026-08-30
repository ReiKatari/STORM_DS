package w7;

import a0.j;
import android.database.Cursor;
import java.util.Arrays;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends g {
    public int[] R;
    public long[] X;
    public double[] Y;
    public String[] Z;

    /* renamed from: b0  reason: collision with root package name */
    public byte[][] f14165b0;

    /* renamed from: c0  reason: collision with root package name */
    public Cursor f14166c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v7.b bVar, String str) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.R = new int[0];
        this.X = new long[0];
        this.Y = new double[0];
        this.Z = new String[0];
        this.f14165b0 = new byte[0];
    }

    public static void t(Cursor cursor, int i2) {
        if (i2 >= 0 && i2 < cursor.getColumnCount()) {
            return;
        }
        k.L(25, "column index out of range");
        throw null;
    }

    @Override // t7.c
    public final void C(int i2, String str) {
        str.getClass();
        d();
        i(3, i2);
        this.R[i2] = 3;
        this.Z[i2] = str;
    }

    @Override // t7.c
    public final boolean N() {
        d();
        m();
        Cursor cursor = this.f14166c0;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        j.p("Required value was null.");
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

    @Override // t7.c
    public final void e(int i2) {
        d();
        i(5, i2);
        this.R[i2] = 5;
    }

    @Override // t7.c
    public final void g(int i2, long j2) {
        d();
        i(1, i2);
        this.R[i2] = 1;
        this.X[i2] = j2;
    }

    @Override // t7.c
    public final byte[] getBlob(int i2) {
        d();
        Cursor v10 = v();
        t(v10, i2);
        byte[] blob = v10.getBlob(i2);
        blob.getClass();
        return blob;
    }

    @Override // t7.c
    public final int getColumnCount() {
        d();
        m();
        Cursor cursor = this.f14166c0;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // t7.c
    public final String getColumnName(int i2) {
        d();
        m();
        Cursor cursor = this.f14166c0;
        if (cursor != null) {
            t(cursor, i2);
            String columnName = cursor.getColumnName(i2);
            columnName.getClass();
            return columnName;
        }
        j.p("Required value was null.");
        return null;
    }

    @Override // t7.c
    public final long getLong(int i2) {
        d();
        Cursor v10 = v();
        t(v10, i2);
        return v10.getLong(i2);
    }

    @Override // w7.g, t7.c
    public final void h() {
        d();
        this.R = new int[0];
        this.X = new long[0];
        this.Y = new double[0];
        this.Z = new String[0];
        this.f14165b0 = new byte[0];
    }

    public final void i(int i2, int i10) {
        int i11 = i10 + 1;
        int[] iArr = this.R;
        if (iArr.length < i11) {
            this.R = Arrays.copyOf(iArr, i11);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        byte[][] bArr = this.f14165b0;
                        if (bArr.length < i11) {
                            this.f14165b0 = (byte[][]) Arrays.copyOf(bArr, i11);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] strArr = this.Z;
                if (strArr.length < i11) {
                    this.Z = (String[]) Arrays.copyOf(strArr, i11);
                    return;
                }
                return;
            }
            double[] dArr = this.Y;
            if (dArr.length < i11) {
                this.Y = Arrays.copyOf(dArr, i11);
                return;
            }
            return;
        }
        long[] jArr = this.X;
        if (jArr.length < i11) {
            this.X = Arrays.copyOf(jArr, i11);
        }
    }

    @Override // t7.c
    public final boolean isNull(int i2) {
        d();
        Cursor v10 = v();
        t(v10, i2);
        return v10.isNull(i2);
    }

    @Override // t7.c
    public final void j(int i2, byte[] bArr) {
        d();
        i(4, i2);
        this.R[i2] = 4;
        this.f14165b0[i2] = bArr;
    }

    public final void m() {
        if (this.f14166c0 == null) {
            this.f14166c0 = this.A.B(new rd.k(17, this));
        }
    }

    @Override // t7.c
    public final String n(int i2) {
        d();
        Cursor v10 = v();
        t(v10, i2);
        String string = v10.getString(i2);
        string.getClass();
        return string;
    }

    @Override // w7.g, t7.c
    public final void reset() {
        d();
        Cursor cursor = this.f14166c0;
        if (cursor != null) {
            cursor.close();
        }
        this.f14166c0 = null;
    }

    public final Cursor v() {
        Cursor cursor = this.f14166c0;
        if (cursor != null) {
            return cursor;
        }
        k.L(21, "no row");
        throw null;
    }
}
