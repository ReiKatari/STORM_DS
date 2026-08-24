package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk  reason: default package */
/* loaded from: classes.dex */
public final class kk implements g36 {
    public final /* synthetic */ int A;
    public long B;
    public Object L;

    public kk(fe5 fe5Var) {
        this.A = 2;
        fe5Var.getClass();
        this.L = fe5Var;
        this.B = 262144L;
    }

    public void a(int i) {
        if (i >= 64) {
            kk kkVar = (kk) this.L;
            if (kkVar != null) {
                kkVar.a(i - 64);
                return;
            }
            return;
        }
        this.B &= ~(1 << i);
    }

    @Override // defpackage.g36
    public Object apply(Object obj) {
        long j = this.B;
        fz fzVar = (fz) this.L;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        c42 c42Var = i36.X;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        String str = fzVar.a;
        b35 b35Var = fzVar.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(d35.a(b35Var))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(d35.a(b35Var)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public int b(int i) {
        kk kkVar = (kk) this.L;
        if (kkVar == null) {
            long j = this.B;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(((1 << i) - 1) & j);
        } else if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.B);
        } else {
            return Long.bitCount(this.B) + kkVar.b(i - 64);
        }
    }

    public void c() {
        if (((kk) this.L) == null) {
            this.L = new kk();
        }
    }

    public boolean d(int i) {
        if (i >= 64) {
            c();
            return ((kk) this.L).d(i - 64);
        }
        if (((1 << i) & this.B) != 0) {
            return true;
        }
        return false;
    }

    public long e(float f, long j, boolean z) {
        long f2;
        float abs;
        long j2;
        long j3 = this.B;
        if (z) {
            f2 = jk4.f(j3, j);
            this.B = f2;
        } else {
            f2 = jk4.f(j3, j);
        }
        if (((lo4) this.L) == null) {
            abs = jk4.d(f2);
        } else {
            abs = Math.abs(g(f2));
        }
        if (abs >= f) {
            lo4 lo4Var = (lo4) this.L;
            long j4 = this.B;
            if (lo4Var == null) {
                return jk4.e(this.B, jk4.g(f, jk4.b(jk4.d(j4), j4)));
            }
            float g = g(j4) - (Math.signum(g(this.B)) * f);
            long j5 = this.B;
            lo4 lo4Var2 = (lo4) this.L;
            lo4 lo4Var3 = lo4.Horizontal;
            if (lo4Var2 == lo4Var3) {
                j2 = j5 & 4294967295L;
            } else {
                j2 = j5 >> 32;
            }
            float intBitsToFloat = Float.intBitsToFloat((int) j2);
            if (((lo4) this.L) == lo4Var3) {
                return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
            }
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(g) & 4294967295L);
        }
        return 9205357640488583168L;
    }

    public void f(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            c();
            ((kk) this.L).f(i - 64, z);
            return;
        }
        long j = this.B;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.B = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            j(i);
        } else {
            a(i);
        }
        if (!z2 && ((kk) this.L) == null) {
            return;
        }
        c();
        ((kk) this.L).f(0, z2);
    }

    public float g(long j) {
        long j2;
        if (((lo4) this.L) == lo4.Horizontal) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public boolean h(int i) {
        boolean z;
        if (i >= 64) {
            c();
            return ((kk) this.L).h(i - 64);
        }
        long j = 1 << i;
        long j2 = this.B;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.B = j3;
        long j4 = j - 1;
        this.B = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        kk kkVar = (kk) this.L;
        if (kkVar != null) {
            if (kkVar.d(0)) {
                j(63);
            }
            ((kk) this.L).h(0);
        }
        return z;
    }

    public void i() {
        this.B = 0L;
        kk kkVar = (kk) this.L;
        if (kkVar != null) {
            kkVar.i();
        }
    }

    public void j(int i) {
        if (i >= 64) {
            c();
            ((kk) this.L).j(i - 64);
            return;
        }
        this.B |= 1 << i;
    }

    public String toString() {
        switch (this.A) {
            case 1:
                if (((kk) this.L) == null) {
                    return Long.toBinaryString(this.B);
                }
                return ((kk) this.L).toString() + "xx" + Long.toBinaryString(this.B);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ kk(Object obj, long j, int i) {
        this.A = i;
        this.B = j;
        this.L = obj;
    }

    public kk() {
        this.A = 1;
        this.B = 0L;
    }

    public kk(long j, lo4 lo4Var) {
        this.A = 4;
        this.L = lo4Var;
        this.B = j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kk(lo4 lo4Var) {
        this(0L, lo4Var);
        this.A = 4;
    }
}
